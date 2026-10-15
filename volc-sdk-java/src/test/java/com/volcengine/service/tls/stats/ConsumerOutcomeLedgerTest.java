package com.volcengine.service.tls.stats;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ConsumerOutcomeLedgerTest {

    @Test
    public void outcomeCapturePreservesAttemptEquationAndReturnedPayloadFacts() {
        ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(4);
        ConsumerOutcomeLedger.Slot slot = ledger.newSlot(7);

        assertTrue(ledger.onBatchHeld(slot, 2L, 5L, 0L, 1L));
        ConsumerOutcomeLedger.Capture ready = ledger.capture(10_000_000L);
        assertEquals(1L, ready.getHeldBatchReferences());
        assertEquals(1L, ready.getReadyToProcess());
        assertEquals(Long.valueOf(10L), ready.getBacklogNonzeroAgeMs());

        assertTrue(ledger.beginProcessAttempt(slot, 1L, true));
        ConsumerOutcomeLedger.Capture inFlight = ledger.capture(11_000_000L);
        assertEquals(0L, inFlight.getReadyToProcess());
        assertEquals(1L, inFlight.getProcessInFlight());
        assertAttemptEquation(inFlight);

        assertTrue(ledger.finishProcessAttempt(slot, 1L, false, 0L, 0L, true));
        ConsumerOutcomeLedger.Capture failed = ledger.capture(12_000_000L);
        assertEquals(1L, failed.getReadyToProcess());
        assertEquals(0L, failed.getProcessInFlight());
        assertEquals(0L, failed.getHandlerNormalReturns());
        assertEquals(1L, failed.getHandlerExceptionReturns());
        assertEquals(0L, failed.getHandlerReturnedGroups());
        assertEquals(0L, failed.getHandlerReturnedLogs());
        assertAttemptEquation(failed);

        assertTrue(ledger.beginProcessAttempt(slot, 1L, true));
        assertTrue(ledger.finishProcessAttempt(slot, 1L, true, 2L, 5L, true));
        ConsumerOutcomeLedger.Capture succeeded = ledger.capture(13_000_000L);
        assertEquals(1L, succeeded.getHeldBatchReferences());
        assertEquals(0L, succeeded.getReadyToProcess());
        assertEquals(1L, succeeded.getHandlerNormalReturns());
        assertEquals(1L, succeeded.getHandlerExceptionReturns());
        assertEquals(2L, succeeded.getHandlerReturnedGroups());
        assertEquals(5L, succeeded.getHandlerReturnedLogs());
        assertAttemptEquation(succeeded);

        assertTrue(ledger.releaseBatch(slot, 1L));
        assertFalse("release is once-only", ledger.releaseBatch(slot, 1L));
        ConsumerOutcomeLedger.Capture released = ledger.capture(14_000_000L);
        assertEquals(0L, released.getHeldBatchReferences());
        assertEquals(0L, released.getReadyToProcess());
        assertNull(released.getBacklogNonzeroAgeMs());
        assertFalse(released.isAccountingInvariantBroken());
    }

    @Test
    public void releaseRacingHandlerExceptionNeverRequeuesReleasedBatch() throws Exception {
        final int iterations = 200;
        ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(8);
        for (int i = 0; i < iterations; i++) {
            final ConsumerOutcomeLedger.Slot slot = ledger.newSlot(i);
            assertTrue(ledger.onBatchHeld(slot, 1L, 3L, i, 1L));
            assertTrue(ledger.beginProcessAttempt(slot, 1L, true));

            final CountDownLatch start = new CountDownLatch(1);
            final AtomicBoolean released = new AtomicBoolean();
            final AtomicBoolean ended = new AtomicBoolean();
            Thread releaseThread = new Thread(() -> {
                await(start);
                released.set(ledger.releaseBatch(slot, 1L));
            });
            Thread handlerThread = new Thread(() -> {
                await(start);
                ended.set(ledger.finishProcessAttempt(slot, 1L, false, 0L, 0L, true));
            });
            releaseThread.start();
            handlerThread.start();
            start.countDown();
            releaseThread.join(2_000L);
            handlerThread.join(2_000L);

            assertFalse(releaseThread.isAlive());
            assertFalse(handlerThread.isAlive());
            assertTrue(released.get());
            assertTrue(ended.get());
            ConsumerOutcomeLedger.Capture capture = ledger.capture(i + 1_000_000L);
            assertEquals(0L, capture.getHeldBatchReferences());
            assertEquals(0L, capture.getReadyToProcess());
            assertEquals(0L, capture.getProcessInFlight());
            assertNull(capture.getBacklogNonzeroAgeMs());
            assertAttemptEquation(capture);
            assertFalse(capture.isAccountingInvariantBroken());
        }
        ConsumerOutcomeLedger.Capture finalCapture = ledger.capture(1_000_000_000L);
        assertEquals(iterations, finalCapture.getHandlerExceptionReturns());
        assertEquals(iterations, finalCapture.getProcessAttempts());
    }

    @Test
    public void backlogEpochStartsAtZeroToPositiveAndSurvivesShortSampleCycles() {
        ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(2);
        ConsumerOutcomeLedger.Slot first = ledger.newSlot(0);
        ConsumerOutcomeLedger.Slot second = ledger.newSlot(1);

        assertTrue(ledger.onBatchHeld(first, 1L, 1L, 0L, 1L));
        assertEquals(Long.valueOf(30_000L),
                ledger.capture(ms(30_000L)).getBacklogNonzeroAgeMs());

        // A second hold and READY -> IN_FLIGHT -> READY retry must not reset the global epoch.
        assertTrue(ledger.onBatchHeld(second, 1L, 1L, ms(30_000L), 1L));
        assertTrue(ledger.beginProcessAttempt(first, 1L, true));
        assertTrue(ledger.finishProcessAttempt(first, 1L, false, 0L, 0L, true));
        assertEquals(Long.valueOf(300_000L),
                ledger.capture(ms(300_000L)).getBacklogNonzeroAgeMs());

        assertTrue(ledger.releaseBatch(first, 1L));
        assertEquals("remaining ownership keeps the original epoch",
                Long.valueOf(310_000L), ledger.capture(ms(310_000L)).getBacklogNonzeroAgeMs());
        assertTrue(ledger.releaseBatch(second, 1L));
        assertNull(ledger.capture(ms(320_000L)).getBacklogNonzeroAgeMs());

        // A later 0 -> positive transition starts a fresh epoch rather than inheriting idle time.
        assertTrue(ledger.onBatchHeld(first, 1L, 1L, ms(400_000L), 1L));
        assertEquals(Long.valueOf(10L), ledger.capture(ms(400_010L)).getBacklogNonzeroAgeMs());
    }

    @Test
    public void staleInFlightSlotReusedAfterOffBoundaryDoesNotBreakInvariant() {
        // Regression: a slot left process-active in one collection generation must be
        // fully discarded when it is re-held in a later generation. resetObservation
        // only clears stripe-level counters, so onBatchHeld must clear the slot's
        // processActive/processGeneration too; otherwise the next beginProcessAttempt
        // trips accountingInvariantBroken and the new-generation batch can never start.
        ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(2);
        ConsumerOutcomeLedger.Slot slot = ledger.newSlot(0);

        // Generation 1: hold and begin processing, then leave it in-flight.
        assertTrue(ledger.onBatchHeld(slot, 1L, 2L, 0L, 1L));
        assertTrue(ledger.beginProcessAttempt(slot, 1L, true));
        ConsumerOutcomeLedger.Capture inFlight = ledger.capture(1_000_000L);
        assertEquals(1L, inFlight.getProcessInFlight());
        assertFalse(inFlight.isAccountingInvariantBroken());

        // OFF boundary: the collection generation advances and the aggregate is reset,
        // but the individual slot keeps its stale processActive/processGeneration.
        ledger.resetObservation(2L);
        ConsumerOutcomeLedger.Capture afterReset = ledger.capture(2_000_000L);
        assertEquals(0L, afterReset.getProcessInFlight());
        assertEquals(0L, afterReset.getHeldBatchReferences());

        // Generation 2: the same slot object is re-held and re-processed. Both must
        // succeed and the accounting invariant must stay intact.
        assertTrue(ledger.onBatchHeld(slot, 1L, 2L, 3_000_000L, 2L));
        assertTrue("re-processing a reused slot must not trip the invariant",
                ledger.beginProcessAttempt(slot, 2L, true));
        assertTrue(ledger.finishProcessAttempt(slot, 2L, true, 1L, 2L, true));
        assertTrue(ledger.releaseBatch(slot, 2L));

        ConsumerOutcomeLedger.Capture done = ledger.capture(4_000_000L);
        assertEquals(0L, done.getHeldBatchReferences());
        assertEquals(0L, done.getReadyToProcess());
        assertEquals(0L, done.getProcessInFlight());
        assertFalse("invariant must remain intact after reusing a stale in-flight slot",
                done.isAccountingInvariantBroken());
        assertAttemptEquation(done);
    }

    @Test
    public void cumulativePayloadCountersSaturateInsteadOfWrapping() {
        ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(1);
        ConsumerOutcomeLedger.Slot slot = ledger.newSlot(0);

        assertTrue(ledger.onBatchHeld(slot, Long.MAX_VALUE, Long.MAX_VALUE, 0L, 1L));
        assertTrue(ledger.beginProcessAttempt(slot, 1L, true));
        assertTrue(ledger.finishProcessAttempt(slot, 1L, true,
                Long.MAX_VALUE, Long.MAX_VALUE, true));
        assertTrue(ledger.releaseBatch(slot, 1L));

        assertTrue(ledger.onBatchHeld(slot, 1L, 1L, 1L, 1L));
        assertTrue(ledger.beginProcessAttempt(slot, 1L, true));
        assertTrue(ledger.finishProcessAttempt(slot, 1L, true, 1L, 1L, true));
        assertTrue(ledger.releaseBatch(slot, 1L));

        ConsumerOutcomeLedger.Capture capture = ledger.capture(2L);
        assertEquals(Long.MAX_VALUE, capture.getHandlerReturnedGroups());
        assertEquals(Long.MAX_VALUE, capture.getHandlerReturnedLogs());
        assertTrue(capture.isCounterSaturated());
        assertAttemptEquation(capture);
    }

    @Test
    public void longMinNanoTimeIsAValidBacklogEpoch() {
        ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(1);
        ConsumerOutcomeLedger.Slot slot = ledger.newSlot(0);
        assertTrue(ledger.onBatchHeld(slot, 1L, 1L, Long.MIN_VALUE, 1L));

        ConsumerOutcomeLedger.Capture capture = ledger.capture(Long.MIN_VALUE + ms(7L));
        assertEquals(Long.valueOf(7L), capture.getBacklogNonzeroAgeMs());
        assertFalse(capture.isAccountingInvariantBroken());
    }

    @Test
    public void concurrentCaptureNeverObservesTornOutcome() throws Exception {
        final ConsumerOutcomeLedger ledger = new ConsumerOutcomeLedger(4);
        final ConsumerOutcomeLedger.Slot slot = ledger.newSlot(3);
        final AtomicBoolean done = new AtomicBoolean();
        final AtomicReference<Throwable> failure = new AtomicReference<>();

        Thread writer = new Thread(() -> {
            try {
                for (int i = 0; i < 20_000; i++) {
                    if (!ledger.onBatchHeld(slot, 1L, 2L, i, 1L)) {
                        throw new AssertionError("hold failed at " + i);
                    }
                    if (!ledger.beginProcessAttempt(slot, 1L, true)) {
                        throw new AssertionError("start failed at " + i);
                    }
                    if ((i & 1) == 0) {
                        ledger.finishProcessAttempt(slot, 1L, true, 1L, 2L, true);
                    } else {
                        ledger.finishProcessAttempt(slot, 1L, false, 0L, 0L, true);
                    }
                    ledger.releaseBatch(slot, 1L);
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
                    ConsumerOutcomeLedger.Capture capture = ledger.capture(System.nanoTime());
                    assertAttemptEquation(capture);
                    assertTrue(capture.getHeldBatchReferences() >= 0L);
                    assertTrue(capture.getReadyToProcess() >= 0L);
                    assertTrue(capture.getReadyToProcess() <= capture.getHeldBatchReferences());
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
        ConsumerOutcomeLedger.Capture capture = ledger.capture(System.nanoTime());
        assertEquals(0L, capture.getHeldBatchReferences());
        assertEquals(0L, capture.getReadyToProcess());
        assertEquals(0L, capture.getProcessInFlight());
        assertEquals(10_000L, capture.getHandlerNormalReturns());
        assertEquals(10_000L, capture.getHandlerExceptionReturns());
        assertAttemptEquation(capture);
        assertFalse(capture.isAccountingInvariantBroken());
    }

    private static void assertAttemptEquation(ConsumerOutcomeLedger.Capture capture) {
        assertEquals(capture.getProcessAttempts(),
                capture.getHandlerNormalReturns()
                        + capture.getHandlerExceptionReturns()
                        + capture.getProcessInFlight());
    }

    private static long ms(long value) {
        return value * 1_000_000L;
    }

    private static void await(CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
    }
}
