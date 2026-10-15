package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ProducerOffObservationLockTest {
    @Test
    public void offBatchCreationDoesNotWaitForAccountantGate() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(1024, 512, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.OFF, 1, limiter,
                "producer-off-lock", StatsClock.SYSTEM);
        BatchLog batch = batch(41L);
        CountDownLatch held = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        AtomicReference<Throwable> holderFailure = new AtomicReference<Throwable>();
        Thread holder = holdAccountant(limiter, held, release, holderFailure);
        CountDownLatch completed = new CountDownLatch(1);
        AtomicReference<Throwable> observationFailure = new AtomicReference<Throwable>();
        Thread observer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    state.onBatchCreated(batch);
                } catch (Throwable failure) {
                    observationFailure.set(failure);
                } finally {
                    completed.countDown();
                }
            }
        }, "producer-off-observer");

        holder.start();
        try {
            assertTrue("accountant holder did not acquire its monitor",
                    held.await(3, TimeUnit.SECONDS));
            observer.start();
            assertTrue("OFF batch observation must not wait for the accountant monitor",
                    completed.await(3, TimeUnit.SECONDS));
        } finally {
            release.countDown();
            holder.join(2000L);
            observer.join(2000L);
        }

        assertNull(holderFailure.get());
        assertNull(observationFailure.get());
        assertFalse(holder.isAlive());
        assertFalse(observer.isAlive());
        assertSame(state, batch.getStatsState());
        assertEquals(41L, batch.getCollectionGeneration());
    }

    @Test
    public void enabledBatchCreationCountsOnlyAfterGateRelease() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(1024, 512, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.CORE, 1, limiter,
                "producer-core-lock", StatsClock.SYSTEM);
        state.markStarted();
        long generation = state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration();
        BatchLog batch = batch(generation);
        CountDownLatch held = new CountDownLatch(1);
        CountDownLatch release = new CountDownLatch(1);
        AtomicReference<Throwable> holderFailure = new AtomicReference<Throwable>();
        Thread holder = holdAccountant(limiter, held, release, holderFailure);
        CountDownLatch completed = new CountDownLatch(1);
        AtomicReference<Throwable> observationFailure = new AtomicReference<Throwable>();
        Thread observer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    state.onBatchCreated(batch);
                } catch (Throwable failure) {
                    observationFailure.set(failure);
                } finally {
                    completed.countDown();
                }
            }
        }, "producer-core-observer");

        holder.start();
        try {
            assertTrue("accountant holder did not acquire its monitor",
                    held.await(3, TimeUnit.SECONDS));
            observer.start();
            waitForBlocked(observer);
            assertEquals("CORE aggregate must not bypass the accountant gate", 0L,
                    aggregateCount(state));
            assertEquals("enabled observation must still wait for the accountant gate",
                    1L, completed.getCount());
        } finally {
            release.countDown();
            holder.join(2000L);
            observer.join(2000L);
        }

        assertTrue(completed.getCount() == 0L);
        assertNull(holderFailure.get());
        assertNull(observationFailure.get());
        assertFalse(holder.isAlive());
        assertFalse(observer.isAlive());
        assertSame(state, batch.getStatsState());
        assertEquals(generation, batch.getCollectionGeneration());
        assertEquals("one batch creation must publish one aggregate count", 1L,
                aggregateCount(state));
    }

    @Test
    public void offBatchDoesNotJoinGenerationOpenedLater() throws Exception {
        MemoryLimiter limiter = new MemoryLimiter(1024, 512, true);
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.OFF, 1, limiter,
                "producer-generation-lock", StatsClock.SYSTEM);
        state.markStarted();
        long offGeneration = state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration();
        BatchLog offBatch = batch(offGeneration);
        state.onBatchCreated(offBatch);
        assertSame(state, offBatch.getStatsState());
        assertEquals(offGeneration, offBatch.getCollectionGeneration());
        assertEquals(0L, aggregateCount(state));

        state.setMetricsLevel(MetricsLevel.CORE);
        long newGeneration = state.snapshot(StatsOptions.health()).getHeader().getCollectionGeneration();
        assertTrue(newGeneration > offGeneration);
        state.onBatchCreated(offBatch);
        assertEquals("an OFF batch must not be counted in a later generation", 0L,
                aggregateCount(state));

        BatchLog currentBatch = batch(newGeneration);
        state.onBatchCreated(currentBatch);
        assertEquals(1L, aggregateCount(state));
        assertEquals(offGeneration, offBatch.getCollectionGeneration());
        assertEquals(newGeneration, currentBatch.getCollectionGeneration());
    }

    private static BatchLog batch(long generation) {
        ProducerConfig config = new ProducerConfig("https://example.invalid", "region",
                "ak", "sk", "token");
        return new BatchLog(new BatchLog.BatchKey("hash", "topic", "source", "file", generation), config);
    }

    private static Thread holdAccountant(final MemoryLimiter limiter,
                                         final CountDownLatch held,
                                         final CountDownLatch release,
                                         final AtomicReference<Throwable> failure) {
        return new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (limiter.getAccountant()) {
                    held.countDown();
                    try {
                        release.await();
                    } catch (InterruptedException e) {
                        failure.set(e);
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }, "producer-accountant-holder");
    }

    private static void waitForBlocked(Thread thread) {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(3);
        while (System.nanoTime() < deadline) {
            if (thread.getState() == Thread.State.BLOCKED) return;
            Thread.yield();
        }
        assertEquals("enabled observer did not wait for the accountant gate",
                Thread.State.BLOCKED, thread.getState());
    }

    private static long aggregateCount(ProducerStatsState state) throws Exception {
        Field delegateField = ProducerStatsState.class.getDeclaredField("delegate");
        delegateField.setAccessible(true);
        Object delegate = delegateField.get(state);
        Field aggregateField = delegate.getClass().getDeclaredField("aggregate");
        aggregateField.setAccessible(true);
        return ((AtomicLong) aggregateField.get(delegate)).get();
    }
}
