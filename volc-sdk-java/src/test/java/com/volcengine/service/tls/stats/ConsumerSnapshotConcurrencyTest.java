package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsumerSnapshotConcurrencyTest {
    private static final StatsClock CLOCK = new StatsClock() {
        public long nanoTime() { return 1_000_000_000L; }
        public long currentTimeMillis() { return 1000L; }
    };

    @Test
    public void detailedSnapshotDoesNotHoldRuntimeWhileHistogramIsBlocked() throws Exception {
        ConsumerStatsState state = detailedRunning();
        ReentrantLock histogramLock = firstHistogramStripeLock(state, "fetchCallDuration");
        histogramLock.lock();
        AtomicReference<ConsumerStatsSnapshot> snapshot = new AtomicReference<>();
        AtomicReference<Throwable> failure = new AtomicReference<>();
        CountDownLatch snapshotDone = new CountDownLatch(1);
        Thread snapshotThread = new Thread(() -> {
            try {
                snapshot.set(state.snapshot(StatsOptions.debug()));
            } catch (Throwable error) {
                failure.set(error);
            } finally {
                snapshotDone.countDown();
            }
        }, "consumer-snapshot");
        Thread hotPath = null;
        try {
            snapshotThread.start();
            assertTrue("snapshot did not wait on the held histogram stripe",
                    awaitQueued(histogramLock, snapshotThread));

            CountDownLatch hotPathDone = new CountDownLatch(1);
            AtomicReference<Long> token = new AtomicReference<>();
            hotPath = new Thread(() -> {
                long fetchToken = state.beginFetch();
                token.set(fetchToken);
                state.onFetchEnd(fetchToken);
                hotPathDone.countDown();
            }, "consumer-fetch-hot-path");
            hotPath.start();
            assertTrue("fetch hot path was blocked by histogram capture",
                    hotPathDone.await(2, TimeUnit.SECONDS));
            assertTrue(token.get() > 0L);
        } finally {
            if (histogramLock.isHeldByCurrentThread()) {
                histogramLock.unlock();
            }
        }
        assertTrue("snapshot did not finish after releasing histogram lock",
                snapshotDone.await(2, TimeUnit.SECONDS));
        join(snapshotThread);
        join(hotPath);
        assertNull(failure.get());
        assertNotNull(snapshot.get());
        assertTrue(snapshot.get().getLatencyHistograms().isPresent());
    }

    @Test
    public void staleDetailedCaptureRetriesAfterOffAndDetailTransition() throws Exception {
        ConsumerStatsState state = detailedRunning();
        ReentrantLock histogramLock = firstHistogramStripeLock(state, "fetchCallDuration");
        histogramLock.lock();
        AtomicReference<ConsumerStatsSnapshot> snapshot = new AtomicReference<>();
        AtomicReference<Throwable> failure = new AtomicReference<>();
        AtomicReference<Throwable> transitionFailure = new AtomicReference<>();
        AtomicReference<Long> expectedGeneration = new AtomicReference<>();
        CountDownLatch snapshotDone = new CountDownLatch(1);
        CountDownLatch transitionStarted = new CountDownLatch(1);
        CountDownLatch transitionDone = new CountDownLatch(1);
        Thread snapshotThread = new Thread(() -> {
            try {
                snapshot.set(state.snapshot(StatsOptions.debug()));
            } catch (Throwable error) {
                failure.set(error);
            } finally {
                snapshotDone.countDown();
            }
        }, "consumer-generation-snapshot");
        Thread transitionThread = new Thread(() -> {
            transitionStarted.countDown();
            try {
                state.setMetricsLevel(MetricsLevel.OFF);
                state.setMetricsLevel(MetricsLevel.DETAILED);
                expectedGeneration.set(runtime(state).getGeneration());
            } catch (Throwable error) {
                transitionFailure.set(error);
            } finally {
                transitionDone.countDown();
            }
        }, "consumer-generation-transition");
        try {
            snapshotThread.start();
            assertTrue("snapshot did not wait on the held histogram stripe",
                    awaitQueued(histogramLock, snapshotThread));
            transitionThread.start();
            assertTrue(transitionStarted.await(2, TimeUnit.SECONDS));
            assertTrue("level transition was blocked by histogram capture",
                    transitionDone.await(2, TimeUnit.SECONDS));
        } finally {
            if (histogramLock.isHeldByCurrentThread()) {
                histogramLock.unlock();
            }
            join(snapshotThread);
            join(transitionThread);
        }
        assertTrue("snapshot did not finish after generation transition",
                snapshotDone.getCount() == 0L);
        assertNull(transitionFailure.get());
        assertNull(failure.get());
        ConsumerStatsSnapshot result = snapshot.get();
        assertNotNull(result);
        assertEquals(expectedGeneration.get().longValue(),
                result.getHeader().getCollectionGeneration());
        assertEquals(MetricsLevel.DETAILED, result.getHeader().getCollectedLevel());
        assertTrue(result.getLatencyHistograms().isPresent());
        assertTrue(result.getHealth().get().getCriticalFlags().isEmpty());
    }

    @Test
    public void offFetchFastPathDoesNotWaitForRuntimeMonitor() throws Exception {
        ConsumerStatsState state = new ConsumerStatsState(MetricsLevel.CORE, 2, "consumer-off", CLOCK);
        state.markStarted();
        state.setMetricsLevel(MetricsLevel.OFF);
        Object runtime = runtime(state);
        CountDownLatch monitorHeld = new CountDownLatch(1);
        CountDownLatch releaseMonitor = new CountDownLatch(1);
        AtomicReference<Throwable> holderFailure = new AtomicReference<>();
        Thread holder = new Thread(() -> {
            synchronized (runtime) {
                monitorHeld.countDown();
                try {
                    releaseMonitor.await();
                } catch (InterruptedException error) {
                    holderFailure.set(error);
                    Thread.currentThread().interrupt();
                }
            }
        }, "consumer-runtime-holder");
        Thread hotPath = null;
        AtomicReference<Long> fetchToken = new AtomicReference<>();
        AtomicReference<Long> detailToken = new AtomicReference<>();
        AtomicReference<Boolean> current = new AtomicReference<>();
        try {
            holder.start();
            assertTrue(monitorHeld.await(2, TimeUnit.SECONDS));
            CountDownLatch hotPathDone = new CountDownLatch(1);
            hotPath = new Thread(() -> {
                long token = state.beginFetch();
                fetchToken.set(token);
                detailToken.set(state.beginFetchDetail());
                current.set(state.isCollectionTokenCurrent(token));
                state.onFetchEnd(token);
                hotPathDone.countDown();
            }, "consumer-off-fetch-hot-path");
            hotPath.start();
            assertTrue("OFF fetch path waited for runtime monitor",
                    hotPathDone.await(2, TimeUnit.SECONDS));
        } finally {
            releaseMonitor.countDown();
            join(holder);
            join(hotPath);
        }
        assertNull(holderFailure.get());
        assertEquals(Long.valueOf(0L), fetchToken.get());
        assertEquals(Long.valueOf(0L), detailToken.get());
        assertEquals(Boolean.FALSE, current.get());

        state.setMetricsLevel(MetricsLevel.CORE);
        assertEquals(0, state.snapshot(StatsOptions.operational()).getOperational().get()
                .getFetchInFlight());
    }

    @Test
    public void checkpointBridgeKeepsCleanSlotAndAbandonRemovesItAcrossOff() throws Exception {
        ConsumerStatsState state = new ConsumerStatsState(MetricsLevel.CORE, 2,
                "consumer-checkpoint", CLOCK);
        state.markStarted();
        Object checkpointKey = new Object();
        state.onCheckpointDirty(checkpointKey);
        assertTrue(checkpointSlots(state).containsKey(checkpointKey));

        state.onCheckpointCleared(checkpointKey);
        assertTrue(checkpointSlots(state).containsKey(checkpointKey));
        assertEquals(0L, checkpointPending(state));

        state.setMetricsLevel(MetricsLevel.OFF);
        state.onCheckpointAbandoned(checkpointKey);
        assertFalse(checkpointSlots(state).containsKey(checkpointKey));
        state.setMetricsLevel(MetricsLevel.CORE);
        assertEquals(0L, checkpointPending(state));
    }

    private static ConsumerStatsState detailedRunning() {
        ConsumerStatsState state = new ConsumerStatsState(MetricsLevel.DETAILED, 2,
                "consumer-snapshot", CLOCK);
        state.markStarted();
        return state;
    }

    private static ReentrantLock firstHistogramStripeLock(ConsumerStatsState state,
                                                           String histogramName) throws Exception {
        Object histogram = field(field(state, "delegate"), histogramName);
        Object[] stripes = (Object[]) field(histogram, "stripes");
        return (ReentrantLock) field(stripes[0], "lock");
    }

    private static RuntimeCollection runtime(ConsumerStatsState state) throws Exception {
        return (RuntimeCollection) field(field(state, "delegate"), "runtime");
    }

    @SuppressWarnings("unchecked")
    private static Map<Object, ?> checkpointSlots(ConsumerStatsState state) throws Exception {
        return (Map<Object, ?>) field(field(state, "delegate"), "checkpointSlots");
    }

    private static long checkpointPending(ConsumerStatsState state) {
        return state.snapshot(StatsOptions.operational()).getOperational().get()
                .getCheckpointPending().getCurrentItems();
    }

    private static Object field(Object target, String name) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        return field.get(target);
    }

    private static boolean awaitQueued(ReentrantLock lock, Thread thread) {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(2);
        while (!lock.hasQueuedThread(thread) && System.nanoTime() < deadline) {
            Thread.yield();
        }
        return lock.hasQueuedThread(thread);
    }

    private static void join(Thread thread) throws InterruptedException {
        if (thread != null) {
            thread.join(2000L);
            assertFalse("worker thread did not finish", thread.isAlive());
        }
    }
}
