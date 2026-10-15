package com.volcengine.service.tls.stats;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ConsumerCheckpointLedgerTest {

    @Test
    public void dirtyCleanMaintainsExactPendingOldestAndHighWatermark() {
        ConsumerCheckpointLedger ledger = new ConsumerCheckpointLedger(4);
        ConsumerCheckpointLedger.TrackerSlot first = ledger.newTrackerSlot(0);
        ConsumerCheckpointLedger.TrackerSlot second = ledger.newTrackerSlot(1);

        assertTrue(ledger.markDirty(first, ms(10L)));
        assertFalse("replacing a dirty cursor does not add another pending item",
                ledger.markDirty(first, ms(12L)));
        assertTrue(ledger.markDirty(second, ms(15L)));

        ConsumerCheckpointLedger.Capture both = ledger.capture(ms(20L));
        assertEquals(2L, both.getPending());
        assertEquals(2L, both.getLifetimeHighWatermark());
        assertEquals(Long.valueOf(10L), both.getOldestAgeMs());

        assertTrue(ledger.markClean(first));
        ConsumerCheckpointLedger.Capture secondOnly = ledger.capture(ms(20L));
        assertEquals(1L, secondOnly.getPending());
        assertEquals(2L, secondOnly.getLifetimeHighWatermark());
        assertEquals(Long.valueOf(5L), secondOnly.getOldestAgeMs());

        assertTrue(ledger.markClean(second));
        assertFalse("clean is idempotent", ledger.markClean(second));
        ConsumerCheckpointLedger.Capture clean = ledger.capture(ms(30L));
        assertEquals(0L, clean.getPending());
        assertEquals(2L, clean.getLifetimeHighWatermark());
        assertNull(clean.getOldestAgeMs());
        assertFalse(clean.isAccountingInvariantBroken());

        assertTrue(ledger.markDirty(second, ms(40L)));
        ConsumerCheckpointLedger.Capture newEpoch = ledger.capture(ms(43L));
        assertEquals(Long.valueOf(3L), newEpoch.getOldestAgeMs());
        assertEquals("HWM is lifetime, not the current pending count", 2L,
                newEpoch.getLifetimeHighWatermark());
    }

    @Test
    public void equalDirtyTimestampsUseAMultiset() {
        ConsumerCheckpointLedger ledger = new ConsumerCheckpointLedger(1);
        ConsumerCheckpointLedger.TrackerSlot first = ledger.newTrackerSlot(0);
        ConsumerCheckpointLedger.TrackerSlot second = ledger.newTrackerSlot(1);

        assertTrue(ledger.markDirty(first, ms(5L)));
        assertTrue(ledger.markDirty(second, ms(5L)));
        assertTrue(ledger.markClean(first));
        ConsumerCheckpointLedger.Capture oneRemains = ledger.capture(ms(9L));
        assertEquals(1L, oneRemains.getPending());
        assertEquals(Long.valueOf(4L), oneRemains.getOldestAgeMs());

        assertTrue(ledger.markClean(second));
        assertNull(ledger.capture(ms(10L)).getOldestAgeMs());
    }

    @Test
    public void pendingCounterSaturatesInsteadOfWrapping() throws Exception {
        ConsumerCheckpointLedger ledger = new ConsumerCheckpointLedger(1);
        Field pending = ConsumerCheckpointLedger.class.getDeclaredField("pending");
        pending.setAccessible(true);
        pending.setLong(ledger, Long.MAX_VALUE);

        ConsumerCheckpointLedger.TrackerSlot slot = ledger.newTrackerSlot(0);
        assertTrue(ledger.markDirty(slot, 0L));
        ConsumerCheckpointLedger.Capture capture = ledger.capture(1L);
        assertEquals(Long.MAX_VALUE, capture.getPending());
        assertEquals(Long.MAX_VALUE, capture.getLifetimeHighWatermark());
        assertTrue(capture.isCounterSaturated());
    }

    @Test
    public void longMinNanoTimeIsAValidDirtyTimestamp() {
        ConsumerCheckpointLedger ledger = new ConsumerCheckpointLedger(1);
        ConsumerCheckpointLedger.TrackerSlot slot = ledger.newTrackerSlot(0);
        assertTrue(ledger.markDirty(slot, Long.MIN_VALUE));

        ConsumerCheckpointLedger.Capture capture = ledger.capture(Long.MIN_VALUE + ms(9L));
        assertEquals(1L, capture.getPending());
        assertEquals(Long.valueOf(9L), capture.getOldestAgeMs());
        assertFalse(capture.isAccountingInvariantBroken());
    }

    @Test
    public void concurrentCaptureNeverTearsPendingAndOldest() throws Exception {
        final ConsumerCheckpointLedger ledger = new ConsumerCheckpointLedger(8);
        final ConsumerCheckpointLedger.TrackerSlot[] slots =
                new ConsumerCheckpointLedger.TrackerSlot[64];
        for (int i = 0; i < slots.length; i++) {
            slots[i] = ledger.newTrackerSlot(i);
        }

        final AtomicBoolean done = new AtomicBoolean();
        final AtomicReference<Throwable> failure = new AtomicReference<>();
        Thread writer = new Thread(() -> {
            try {
                for (int round = 0; round < 2_000; round++) {
                    for (int i = 0; i < slots.length; i++) {
                        ledger.markDirty(slots[i], ms(round) + i);
                    }
                    for (int i = 0; i < slots.length; i++) {
                        ledger.markClean(slots[i]);
                    }
                }
            } catch (Throwable t) {
                failure.compareAndSet(null, t);
            } finally {
                done.set(true);
            }
        });
        Thread reader = new Thread(() -> {
            try {
                while (!done.get()) {
                    ConsumerCheckpointLedger.Capture capture = ledger.capture(System.nanoTime());
                    assertTrue(capture.getPending() >= 0L);
                    assertTrue(capture.getPending() <= capture.getLifetimeHighWatermark());
                    if (capture.getPending() == 0L) {
                        assertNull(capture.getOldestAgeMs());
                    } else {
                        assertTrue(capture.getOldestAgeMs() != null);
                    }
                }
            } catch (Throwable t) {
                failure.compareAndSet(null, t);
            }
        });
        writer.start();
        reader.start();
        writer.join(10_000L);
        reader.join(10_000L);

        assertFalse(writer.isAlive());
        assertFalse(reader.isAlive());
        if (failure.get() != null) {
            throw new AssertionError(failure.get());
        }
        ConsumerCheckpointLedger.Capture capture = ledger.capture(System.nanoTime());
        assertEquals(0L, capture.getPending());
        assertEquals(64L, capture.getLifetimeHighWatermark());
        assertNull(capture.getOldestAgeMs());
        assertFalse(capture.isAccountingInvariantBroken());
    }

    private static long ms(long value) {
        return value * 1_000_000L;
    }
}
