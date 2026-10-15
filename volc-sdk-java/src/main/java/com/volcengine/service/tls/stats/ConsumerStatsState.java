package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.stats.Capability;
import com.volcengine.model.tls.stats.ComponentType;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.ConsumerHealthSignals;
import com.volcengine.model.tls.stats.ConsumerLatencyHistograms;
import com.volcengine.model.tls.stats.ConsumerOperationalStats;
import com.volcengine.model.tls.stats.ConsumerRetryDetails;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.HistogramSnapshot;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.QueueSummary;
import com.volcengine.model.tls.stats.SnapshotHeader;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.WorkerDetail;
import com.volcengine.model.tls.stats.WorkerDetails;
import com.volcengine.model.tls.stats.WorkerRole;
import com.volcengine.model.tls.stats.WorkerRoleStats;
import com.volcengine.model.tls.stats.WorkerSummary;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/** Consumer observability facade with lifecycle-aware collection levels. */
public final class ConsumerStatsState {
    /** One runtime-owned state for the whole instance; level changes never replace counters. */
    private final Enabled delegate;

    public ConsumerStatsState(MetricsLevel metricsLevel, int stripeCount, String instanceId, StatsClock clock) {
        SnapshotHeader.initializeSdkIdentity();
        MetricsLevel level = MetricsLevel.normalize(metricsLevel);
        this.delegate = new Enabled(level, stripeCount, instanceId, clock);
    }

    /** Stable logical batch slot for the precise, shard-owned instrumentation path. */
    public static final class BatchSlot {
        private final ConsumerOutcomeLedger.Slot ledgerSlot;
        private BatchState state = BatchState.EMPTY;
        /** Generation accepted when the batch was fetched/held. */
        private long collectionGeneration;
        private long batchGroups;
        private long batchLogs;
        /** Detail span for dispatch from batch handoff to handler admission. */
        private long dispatchDetailGeneration;
        private long dispatchStartNanos;
        /** Generation accepted when handler processing actually began. */
        private long processGeneration;
        /** Detail generation accepted for the current process span. */
        private long processDetailGeneration;
        private long processGroups;
        private long processLogs;
        private boolean processOwnsBatch;

        private BatchSlot(ConsumerOutcomeLedger.Slot ledgerSlot) {
            this.ledgerSlot = ledgerSlot;
        }
    }

    private enum BatchState {
        EMPTY,
        READY,
        IN_FLIGHT,
        POST_HANDLER,
        RELEASED_IN_FLIGHT
    }

    public boolean isMetricsEnabled() { return delegate.isEnabled(); }
    public boolean isDetailedEnabled() { return delegate.isDetailed(); }
    public MetricsLevel getMetricsLevel() { return delegate.getMetricsLevel(); }
    public void setMetricsLevel(MetricsLevel level) { delegate.setMetricsLevel(level); }
    /** Starts a new observation run after all prior workers have terminated. */
    public void restart() { delegate.restart(); }
    public void markStarted() { delegate.markStarted(); }
    public void markClosing() { delegate.markClosing(); }
    public void markClosedAndFreeze() { delegate.markClosedAndFreeze(); }
    public void markFailed() { delegate.markFailed(); }
    public void onMainLoopWorkerStarted() { delegate.onMainLoopWorkerStarted(); }
    public void onMainLoopWorkerStopped() { delegate.onMainLoopWorkerStopped(); }
    public void onHeartbeatWorkerStarted() { delegate.onHeartbeatWorkerStarted(); }
    public void onHeartbeatWorkerStopped() { delegate.onHeartbeatWorkerStopped(); }
    public void onCheckpointWorkerStarted() { delegate.onCheckpointWorkerStarted(); }
    public void onCheckpointWorkerStopped() { delegate.onCheckpointWorkerStopped(); }
    public void onShardWorkerStarted() { delegate.onShardWorkerStarted(); }
    public void onShardWorkerStopped() { delegate.onShardWorkerStopped(); }
    public void onShardExecutorTerminated() { delegate.onShardExecutorTerminated(); }
    public void onShardTaskStarted() { delegate.onShardTaskStarted(); }
    public void onShardTaskStopped() { delegate.onShardTaskStopped(); }
    public long beginHeartbeat() { return delegate.beginHeartbeat(); }
    public void onHeartbeatCall(long token, boolean success) {
        delegate.onHeartbeatCall(token, success);
    }
    public void onAssignment(int shardCount, boolean membershipChanged) {
        delegate.onAssignment(shardCount, membershipChanged);
    }
    public long beginFetch() { return delegate.beginFetch(); }
    public long beginFetchDetail() { return delegate.beginFetchDetail(); }
    public void onFetchEnd(long token) { delegate.onFetchEnd(token); }
    public void onFetchCall(long token, long detailToken, boolean success, long groups, long logs,
                            long durationNanos) {
        delegate.onFetchCall(token, detailToken, success, groups, logs, durationNanos);
    }
    public boolean isCollectionTokenCurrent(long token) {
        return delegate.isCollectionTokenCurrent(token);
    }
    public void onBackoff() { delegate.onBackoff(); }

    public BatchSlot newBatchSlot(int stableSlotIndex) { return delegate.newBatchSlot(stableSlotIndex); }
    public BatchSlot newBatchSlot() { return delegate.newBatchSlot(); }
    public boolean onBatchHeld(BatchSlot slot, long groups, long logs, long collectionToken) {
        return delegate.onBatchHeld(slot, groups, logs, collectionToken);
    }
    public boolean onBatchReleased(BatchSlot slot) { return delegate.onBatchReleased(slot); }
    public long beginProcessCollection() { return delegate.beginProcessCollection(); }
    public long beginProcessDetail() { return delegate.beginProcessDetail(); }
    public boolean onProcessStart(BatchSlot slot, long collectionToken, long detailToken,
                                  long groups, long logs) {
        return delegate.onProcessStart(slot, collectionToken, detailToken, groups, logs);
    }
    public long processDetailToken(BatchSlot slot) { return delegate.processDetailToken(slot); }
    public boolean onProcessEnd(BatchSlot slot, boolean normal, long detailToken,
                                long durationNanos) {
        return delegate.onProcessEnd(slot, normal, detailToken, durationNanos);
    }

    public void onCheckpointDirty(Object checkpointKey) { delegate.onCheckpointDirty(checkpointKey); }
    public long beginCheckpointCall() { return delegate.beginCheckpointCall(); }
    public long beginCheckpointDetail() { return delegate.beginCheckpointDetail(); }
    public void onCheckpointFlush(long token, long detailToken, boolean success, boolean cleared,
                                  Object checkpointKey, long durationNanos) {
        delegate.onCheckpointFlush(token, detailToken, success, cleared, checkpointKey,
                durationNanos);
    }
    public void onCheckpointAbandoned(Object checkpointKey) {
        delegate.onCheckpointAbandoned(checkpointKey);
    }
    /** Notifies stats that the checkpoint tracker cleared its pending marker. */
    public void onCheckpointCleared(Object checkpointKey) {
        delegate.onCheckpointCleared(checkpointKey);
    }
    public void onCheckpointFlushInFlight(long token, int delta) {
        delegate.onCheckpointFlushInFlight(token, delta);
    }
    public ConsumerStatsSnapshot snapshot(StatsOptions options) { return delegate.snapshot(options); }
    public boolean isSaturated() { return delegate.isSaturated(); }

    private abstract static class LifecycleDelegate {
        final String instanceId;
        final StatsClock clock;
        final AtomicLong startNanos = new AtomicLong();
        final AtomicBoolean startTimeSet = new AtomicBoolean();
        /** Uptime accumulated across completed start/stop runs. */
        final AtomicLong accumulatedUptimeMs = new AtomicLong();
        final AtomicLong sequence = new AtomicLong();
        final AtomicReference<LifecycleState> lifecycle =
                new AtomicReference<LifecycleState>(LifecycleState.NEW);
        final AtomicReference<Canonical> frozen = new AtomicReference<Canonical>();

        LifecycleDelegate(String instanceId, StatsClock clock) {
            this.instanceId = instanceId == null ? "" : instanceId;
            this.clock = clock == null ? StatsClock.SYSTEM : clock;
        }

        public void markStarted() {
            if (lifecycle.compareAndSet(LifecycleState.NEW, LifecycleState.RUNNING)) {
                startNanos.set(clock.nanoTime());
                startTimeSet.set(true);
            }
        }

        public void markClosing() {
            LifecycleState state = lifecycle.get();
            if (state == LifecycleState.NEW || state == LifecycleState.RUNNING) {
                lifecycle.compareAndSet(state, LifecycleState.CLOSING);
            }
        }

        public void markClosedAndFreeze() { freeze(LifecycleState.CLOSED); }
        public void markFailed() { freeze(LifecycleState.FAILED); }

        private synchronized void freeze(LifecycleState finalState) {
            if (frozen.get() != null) {
                return;
            }
            accumulateUptime(clock.nanoTime());
            lifecycle.set(finalState);
            Canonical canonical = capture(Consistency.FINAL, nextSequence());
            frozen.compareAndSet(null, canonical);
        }

        /** Re-opens a previously closed instance without replacing its cumulative counters. */
        synchronized void reopenForRestart() {
            if (lifecycle.get() != LifecycleState.CLOSED) {
                throw new IllegalStateException("consumer stats can only restart after workers are closed");
            }
            frozen.set(null);
            lifecycle.set(LifecycleState.NEW);
            startTimeSet.set(false);
            startNanos.set(0L);
        }

        final ConsumerStatsSnapshot project(Canonical canonical, StatsOptions options) {
            if (options == null || canonical == null) {
                throw new IllegalArgumentException("snapshot projection inputs must not be null");
            }
            return StatsProjector.consumer(canonical.anchor, canonical.health,
                    canonical.operational, canonical.workers, canonical.retry,
                    canonical.latency, options);
        }

        protected final long nextSequence() {
            while (true) {
                long current = sequence.get();
                if (current == Long.MAX_VALUE) {
                    return current;
                }
                if (sequence.compareAndSet(current, current + 1L)) {
                    return current + 1L;
                }
            }
        }

        final long uptimeMs(long nowNanos) {
            long total = accumulatedUptimeMs.get();
            if (!startTimeSet.get()) {
                return total;
            }
            long elapsed = nowNanos - startNanos.get();
            if (elapsed <= 0L) {
                return total;
            }
            long elapsedMs = elapsed / 1_000_000L;
            return total > Long.MAX_VALUE - elapsedMs ? Long.MAX_VALUE : total + elapsedMs;
        }

        private void accumulateUptime(long nowNanos) {
            if (!startTimeSet.compareAndSet(true, false)) {
                return;
            }
            long start = startNanos.get();
            long elapsed = nowNanos - start;
            long elapsedMs = elapsed <= 0L ? 0L : elapsed / 1_000_000L;
            while (true) {
                long current = accumulatedUptimeMs.get();
                long next = elapsedMs > Long.MAX_VALUE - current
                        ? Long.MAX_VALUE : current + elapsedMs;
                if (accumulatedUptimeMs.compareAndSet(current, next)) {
                    return;
                }
            }
        }

        abstract Canonical capture(Consistency consistency, long sequence);

    }

    private static final class Enabled extends LifecycleDelegate {
        private final RuntimeCollection runtime;
        private final int stripeCount;
        private final ConsumerOutcomeLedger outcomeLedger;
        private final ConsumerCheckpointLedger checkpointLedger;

        private final AtomicInteger assignedShards = new AtomicInteger();
        private final Object assignmentLock = new Object();
        private boolean assignmentObserved;

        private final AtomicInteger fetchInFlight = new AtomicInteger();
        private final AtomicInteger checkpointFlushInFlight = new AtomicInteger();
        private final AtomicInteger mainLoopRunning = new AtomicInteger();
        private final AtomicInteger heartbeatRunning = new AtomicInteger();
        private final AtomicInteger checkpointRunning = new AtomicInteger();
        private final AtomicInteger shardWorkersRunning = new AtomicInteger();
        private final AtomicInteger shardTasksInFlight = new AtomicInteger();
        private final Object shardWorkerLifecycleLock = new Object();
        private boolean shardExecutorTerminated;
        /** Four immutable projections for checkpoint/shard busy-bit combinations. */
        private volatile WorkerDetails[] workerDetailsByBusyMask;

        private final AtomicLong fetchSuccess = new AtomicLong();
        private final AtomicLong fetchFailure = new AtomicLong();
        private final AtomicLong fetchedGroups = new AtomicLong();
        private final AtomicLong fetchedLogs = new AtomicLong();
        private final AtomicLong heartbeatSuccess = new AtomicLong();
        private final AtomicLong heartbeatFailure = new AtomicLong();
        private final AtomicLong checkpointSuccess = new AtomicLong();
        private final AtomicLong checkpointFailure = new AtomicLong();
        private final AtomicLong backoff = new AtomicLong();
        private final AtomicLong rebalance = new AtomicLong();

        /** Component-wide health ages; guarded by the runtime monitor. */
        private boolean hasLastSuccess;
        private long lastSuccessNanos;
        private boolean hasLastError;
        private long lastErrorNanos;

        private final AtomicInteger nextBatchSlot = new AtomicInteger();

        private final Object checkpointSlotLock = new Object();
        private final Map<Object, ConsumerCheckpointLedger.TrackerSlot> checkpointSlots =
                new IdentityHashMap<Object, ConsumerCheckpointLedger.TrackerSlot>();
        private final AtomicInteger nextCheckpointSlot = new AtomicInteger();

        /** Detailed resources are allocated once and retained across level transitions. */
        private volatile FixedHistogram fetchCallDuration;
        private volatile FixedHistogram dispatchDelay;
        private volatile FixedHistogram handlerDuration;
        private volatile FixedHistogram checkpointCallDuration;

        private volatile boolean saturated;
        private volatile boolean accountingInvariantBroken;

        Enabled(MetricsLevel level, int stripeCount, String instanceId, StatsClock clock) {
            super(instanceId, clock);
            this.stripeCount = Math.max(1, stripeCount);
            this.runtime = new RuntimeCollection(level, clock == null
                    ? StatsClock.SYSTEM.currentTimeMillis() : clock.currentTimeMillis());
            this.outcomeLedger = new ConsumerOutcomeLedger(stripeCount);
            this.checkpointLedger = new ConsumerCheckpointLedger(stripeCount);
            if (level == MetricsLevel.DETAILED) {
                ensureDetailedResources();
                refreshWorkerDetails();
            }
        }

        public boolean isEnabled() { return runtime.isEnabled(); }
        public boolean isDetailed() { return runtime.isDetailed(); }
        MetricsLevel getMetricsLevel() { return runtime.getLevel(); }

        @Override
        public void markClosedAndFreeze() {
            synchronized (runtime) {
                super.markClosedAndFreeze();
            }
        }

        @Override
        public void markFailed() {
            synchronized (runtime) {
                super.markFailed();
            }
        }

        void setMetricsLevel(MetricsLevel next) {
            next = MetricsLevel.normalize(next);
            synchronized (runtime) {
                RuntimeCollection.validateChange(next, lifecycle.get());
                MetricsLevel previous = runtime.getLevel();
                if (previous == next) {
                    return;
                }
                if (next == MetricsLevel.DETAILED) {
                    // Allocate all optional state before publishing DETAILED to observers.
                    ensureDetailedResources();
                }
                runtime.changeLevel(next, lifecycle.get(), clock.currentTimeMillis());
                if ((previous == MetricsLevel.OFF) != (next == MetricsLevel.OFF)) {
                    resetLiveObservation(runtime.getGeneration());
                }
                if (next == MetricsLevel.DETAILED) {
                    refreshWorkerDetails();
                }
            }
        }

        void restart() {
            synchronized (runtime) {
                reopenForRestart();
                runtime.restart(clock.currentTimeMillis());
                resetLiveObservation(runtime.getGeneration());
                resetWorkerLifecycleForRestart();
            }
        }

        /**
         * Reopens fixed worker facts for a clean ConsumerImpl run.  This is intentionally separate
         * from resetLiveObservation: OFF/CORE transitions keep the same physical workers alive,
         * while restart follows a completed executor teardown and fences late old-run callbacks.
         */
        private void resetWorkerLifecycleForRestart() {
            mainLoopRunning.set(0);
            heartbeatRunning.set(0);
            checkpointRunning.set(0);
            shardTasksInFlight.set(0);
            synchronized (shardWorkerLifecycleLock) {
                shardExecutorTerminated = false;
                shardWorkersRunning.set(0);
            }
            refreshWorkerDetails();
        }

        private synchronized void ensureDetailedResources() {
            if (fetchCallDuration != null && dispatchDelay != null
                    && handlerDuration != null && checkpointCallDuration != null) {
                return;
            }
            // Allocate the complete optional profile before publishing any new member. If an
            // allocation fails, a later level transition can retry without observing a partial
            // detailed resource set.
            FixedHistogram nextFetchCallDuration = fetchCallDuration;
            FixedHistogram nextDispatchDelay = dispatchDelay;
            FixedHistogram nextHandlerDuration = handlerDuration;
            FixedHistogram nextCheckpointCallDuration = checkpointCallDuration;
            if (nextFetchCallDuration == null) {
                nextFetchCallDuration = new FixedHistogram(stripeCount);
            }
            if (nextDispatchDelay == null) {
                nextDispatchDelay = new FixedHistogram(stripeCount);
            }
            if (nextHandlerDuration == null) {
                nextHandlerDuration = new FixedHistogram(stripeCount);
            }
            if (nextCheckpointCallDuration == null) {
                nextCheckpointCallDuration = new FixedHistogram(stripeCount);
            }
            fetchCallDuration = nextFetchCallDuration;
            dispatchDelay = nextDispatchDelay;
            handlerDuration = nextHandlerDuration;
            checkpointCallDuration = nextCheckpointCallDuration;
        }

        private void resetLiveObservation(long generation) {
            outcomeLedger.resetObservation(generation);
            checkpointLedger.resetObservation(generation);
            assignedShards.set(0);
            fetchInFlight.set(0);
            checkpointFlushInFlight.set(0);
            synchronized (assignmentLock) {
                assignmentObserved = false;
            }
            hasLastSuccess = false;
            lastSuccessNanos = 0L;
            hasLastError = false;
            lastErrorNanos = 0L;
        }

        private boolean acceptsCollection(long token) {
            return runtime.acceptsCollection(token);
        }

        private boolean acceptsDetail(long token) {
            return runtime.acceptsDetail(token);
        }

        private long collectionToken() {
            return runtime.beginCollection();
        }

        private long detailToken() {
            return runtime.beginDetail();
        }

        private long capabilitiesFor(MetricsLevel level) {
            // Capabilities describe the component's stable contract, not the currently collected
            // level. Requested sections remain level-gated through missing_sections and projection.
            return Capability.HEALTH | Capability.OPERATIONAL | Capability.WORKER_DETAILS
                    | Capability.RETRY_DETAILS | Capability.LATENCY
                    | Capability.RUNTIME_LEVEL_CHANGE;
        }
        public boolean isSaturated() {
            long now = clock.nanoTime();
            return saturated || outcomeLedger.capture(now).isCounterSaturated()
                    || checkpointLedger.capture(now).isCounterSaturated();
        }
        public ConsumerStatsSnapshot snapshot(StatsOptions options) {
            if (options == null) {
                throw new IllegalArgumentException("options must not be null");
            }
            Canonical stable = frozen.get();
            if (stable != null) {
                return project(stable, options);
            }
            for (int attempt = 0; attempt < 3; attempt++) {
                RawCapture raw = null;
                synchronized (runtime) {
                    stable = frozen.get();
                    if (stable == null) {
                        raw = captureRaw(Consistency.WEAK, nextSequence());
                    }
                }
                if (stable != null) {
                    return project(stable, options);
                }
                HistogramCapture histograms = captureHistograms(raw);
                Canonical canonical = buildCanonical(raw, histograms);
                Canonical chosen = null;
                synchronized (runtime) {
                    stable = frozen.get();
                    if (stable == null && isCurrent(raw)) {
                        chosen = canonical;
                    }
                }
                if (stable != null) {
                    return project(stable, options);
                }
                if (chosen != null) {
                    return project(chosen, options);
                }
            }
            // A continuously changing level may invalidate every lock-free attempt. The final
            // bounded capture keeps the runtime monitor held while taking the fixed-size stripe
            // snapshots, so the returned header and detailed sections are one generation.
            RawCapture raw = null;
            HistogramCapture histograms = null;
            synchronized (runtime) {
                stable = frozen.get();
                if (stable == null) {
                    raw = captureRaw(Consistency.WEAK, nextSequence());
                    histograms = captureHistograms(raw);
                }
            }
            if (stable != null) {
                return project(stable, options);
            }
            return project(buildCanonical(raw, histograms), options);
        }

        public void onMainLoopWorkerStarted() {
            incrementGauge(mainLoopRunning);
            refreshWorkerDetails();
        }
        public void onMainLoopWorkerStopped() {
            decrementGauge(mainLoopRunning);
            refreshWorkerDetails();
        }
        public void onHeartbeatWorkerStarted() {
            incrementGauge(heartbeatRunning);
            refreshWorkerDetails();
        }
        public void onHeartbeatWorkerStopped() {
            decrementGauge(heartbeatRunning);
            refreshWorkerDetails();
        }
        public void onCheckpointWorkerStarted() {
            incrementGauge(checkpointRunning);
            refreshWorkerDetails();
        }
        public void onCheckpointWorkerStopped() {
            decrementGauge(checkpointRunning);
            refreshWorkerDetails();
        }
        public void onShardWorkerStarted() {
            synchronized (shardWorkerLifecycleLock) {
                if (shardExecutorTerminated) {
                    accountingInvariantBroken = true;
                    return;
                }
                incrementGauge(shardWorkersRunning);
                refreshWorkerDetails();
            }
        }
        public void onShardWorkerStopped() {
            synchronized (shardWorkerLifecycleLock) {
                // ThreadPoolExecutor publishes TERMINATED before a ThreadFactory wrapper's
                // outer finally runs. Once termination is the accepted lifecycle boundary,
                // those late wrapper callbacks must not underflow the cleared gauge.
                if (shardExecutorTerminated) {
                    return;
                }
                decrementGauge(shardWorkersRunning);
                refreshWorkerDetails();
            }
        }
        public void onShardExecutorTerminated() {
            synchronized (shardWorkerLifecycleLock) {
                shardExecutorTerminated = true;
                shardWorkersRunning.set(0);
                refreshWorkerDetails();
            }
        }
        public void onShardTaskStarted() { incrementGauge(shardTasksInFlight); }
        public void onShardTaskStopped() { decrementGauge(shardTasksInFlight); }

        public long beginHeartbeat() {
            return collectionToken();
        }

        public void onHeartbeatCall(long token, boolean success) {
            if (!acceptsCollection(token)) {
                return;
            }
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return;
                }
                long now = clock.nanoTime();
                if (success) {
                    increment(heartbeatSuccess);
                    recordHealthSuccess(now);
                } else {
                    increment(heartbeatFailure);
                    recordHealthError(now);
                }
            }
        }

        public void onAssignment(int shardCount, boolean membershipChanged) {
            synchronized (runtime) {
                if (!runtime.isEnabled()) {
                    return;
                }
            int normalized = Math.max(0, shardCount);
            synchronized (assignmentLock) {
                assignedShards.set(normalized);
                if (assignmentObserved && membershipChanged) {
                    increment(rebalance);
                }
                assignmentObserved = true;
            }
            refreshWorkerDetails();
            }
        }

        public long beginFetch() {
            long token = collectionToken();
            if (token == 0L) {
                return 0L;
            }
            synchronized (runtime) {
                if (acceptsCollection(token)) {
                    incrementGauge(fetchInFlight);
                }
            }
            return token;
        }

        public long beginFetchDetail() {
            return detailToken();
        }

        public boolean isCollectionTokenCurrent(long token) {
            return acceptsCollection(token);
        }

        public void onFetchEnd(long token) {
            if (!acceptsCollection(token)) {
                return;
            }
            synchronized (runtime) {
                if (acceptsCollection(token)) {
                    decrementGauge(fetchInFlight);
                }
            }
        }

        public void onFetchCall(long token, long detailToken, boolean success, long groups, long logs,
                                long durationNanos) {
            if (!acceptsCollection(token)) {
                return;
            }
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return;
                }
                long now = clock.nanoTime();
                if (success) {
                    increment(fetchSuccess);
                    add(fetchedGroups, Math.max(0L, groups));
                    add(fetchedLogs, Math.max(0L, logs));
                    recordHealthSuccess(now);
                } else {
                    increment(fetchFailure);
                    recordHealthError(now);
                }
            if (acceptsDetail(detailToken)) {
                fetchCallDuration.record(nanosToMillis(durationNanos), stripeHint());
            }
            }
        }

        public void onBackoff() {
            synchronized (runtime) {
                if (runtime.isEnabled()) {
                    increment(backoff);
                }
            }
        }

        public BatchSlot newBatchSlot(int stableSlotIndex) {
            return new BatchSlot(outcomeLedger.newSlot(stableSlotIndex));
        }

        public BatchSlot newBatchSlot() {
            return newBatchSlot(nextStableIndex(nextBatchSlot));
        }

        public boolean onBatchHeld(BatchSlot slot, long groups, long logs, long token) {
            requireEnabledSlot(slot);
            if (token == 0L) {
                return false;
            }
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return false;
                }
                long dispatchToken = detailToken();
                long dispatchStart = dispatchToken == 0L ? 0L : clock.nanoTime();
                synchronized (slot) {
                    if (slot.collectionGeneration != token) {
                        resetSlotForCollection(slot, token);
                    }
                    if (slot.state != BatchState.EMPTY || slot.processGeneration != 0L) {
                        accountingInvariantBroken = true;
                        return false;
                    }
                    if (!outcomeLedger.onBatchHeld(slot.ledgerSlot, groups, logs, clock.nanoTime(), token)) {
                        return false;
                    }
                    slot.collectionGeneration = token;
                    slot.batchGroups = Math.max(0L, groups);
                    slot.batchLogs = Math.max(0L, logs);
                    slot.dispatchDetailGeneration = dispatchToken;
                    slot.dispatchStartNanos = dispatchStart;
                    slot.state = BatchState.READY;
                    return true;
                }
            }
        }

        public long beginProcessCollection() {
            synchronized (runtime) {
                return collectionToken();
            }
        }

        public long beginProcessDetail() {
            synchronized (runtime) {
                return detailToken();
            }
        }

        public boolean onProcessStart(BatchSlot slot, long token, long detailToken,
                                      long groups, long logs) {
            requireEnabledSlot(slot);
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return false;
                }
                synchronized (slot) {
                    if (slot.processGeneration != 0L) {
                        accountingInvariantBroken = true;
                        return false;
                    }
                    boolean ownsBatch = slot.state == BatchState.READY
                            && slot.collectionGeneration == token;
                    if (!ownsBatch && slot.collectionGeneration != token) {
                        // OFF reset the ownership cohort. The payload is still real and may be
                        // handed to the user in this new collection, but it is not newly held.
                        resetSlotForCollection(slot, token);
                    } else if (!ownsBatch && slot.state != BatchState.EMPTY) {
                        accountingInvariantBroken = true;
                        return false;
                    }
                    long processGroups = ownsBatch ? slot.batchGroups : Math.max(0L, groups);
                    long processLogs = ownsBatch ? slot.batchLogs : Math.max(0L, logs);
                    if (!outcomeLedger.beginProcessAttempt(slot.ledgerSlot, token, ownsBatch)) {
                        return false;
                    }
                    slot.processGeneration = token;
                    slot.processDetailGeneration = acceptsDetail(detailToken) ? detailToken : 0L;
                    slot.processGroups = processGroups;
                    slot.processLogs = processLogs;
                    slot.processOwnsBatch = ownsBatch;
                    if (ownsBatch) {
                        slot.state = BatchState.IN_FLIGHT;
                    }
                    if (slot.dispatchStartNanos != 0L
                            && acceptsDetail(slot.dispatchDetailGeneration)) {
                        dispatchDelay.record(nanosToMillis(clock.nanoTime() - slot.dispatchStartNanos),
                                stripeHint());
                    }
                    slot.dispatchStartNanos = 0L;
                    slot.dispatchDetailGeneration = 0L;
                    return true;
                }
            }
        }

        public long processDetailToken(BatchSlot slot) {
            requireEnabledSlot(slot);
            synchronized (slot) {
                return slot.processDetailGeneration;
            }
        }

        public boolean onProcessEnd(BatchSlot slot, boolean normal, long detailToken,
                                    long durationNanos) {
            requireEnabledSlot(slot);
            synchronized (runtime) {
                synchronized (slot) {
                    long processToken = slot.processGeneration;
                    long processDetailToken = slot.processDetailGeneration;
                    if (processToken == 0L) {
                        accountingInvariantBroken = true;
                        return false;
                    }
                if (!acceptsCollection(processToken)) {
                        resetProcessAttempt(slot);
                    return false;
                }
                    boolean ownsBatch = slot.processOwnsBatch;
                    if (!outcomeLedger.finishProcessAttempt(slot.ledgerSlot, processToken, normal,
                            slot.processGroups, slot.processLogs, ownsBatch)) {
                        return false;
                    }
                    if (ownsBatch) {
                        if (slot.state == BatchState.RELEASED_IN_FLIGHT) {
                            slot.state = BatchState.EMPTY;
                        } else if (normal) {
                            slot.state = BatchState.POST_HANDLER;
                        } else {
                            slot.state = BatchState.READY;
                        }
                    }
                    resetProcessAttempt(slot);
                    long now = clock.nanoTime();
                    if (normal) {
                        recordHealthSuccess(now);
                    } else {
                        recordHealthError(now);
                    }
                    if (detailToken == processDetailToken && acceptsDetail(processDetailToken)) {
                        handlerDuration.record(nanosToMillis(durationNanos), stripeHint());
                    }
                    return true;
                }
            }
        }

        public boolean onBatchReleased(BatchSlot slot) {
            requireEnabledSlot(slot);
            synchronized (runtime) {
                synchronized (slot) {
                BatchState previous = slot.state;
                long token = slot.collectionGeneration;
                if (token == 0L) {
                    slot.state = BatchState.EMPTY;
                    return false;
                }
                boolean current = acceptsCollection(token);
                boolean released = outcomeLedger.releaseBatch(slot.ledgerSlot, token);
                if (!released && !current) {
                    // The ledger was reset at OFF/restart; this is the physical cleanup of an
                    // old cohort and must not affect the new live gauges. Keep an active old
                    // process token until its late completion rejects it, otherwise that normal
                    // cleanup would be misclassified as an accounting violation.
                    clearSlotOwnership(slot, 0L);
                    if (slot.processGeneration == 0L) {
                        resetProcessAttempt(slot);
                    }
                    return false;
                }
                if (!released) {
                    return false;
                }
                slot.state = previous == BatchState.IN_FLIGHT
                        ? BatchState.RELEASED_IN_FLIGHT : BatchState.EMPTY;
                if (slot.state == BatchState.EMPTY) {
                    slot.batchGroups = 0L;
                    slot.batchLogs = 0L;
                    slot.dispatchDetailGeneration = 0L;
                    slot.dispatchStartNanos = 0L;
                }
                return true;
                }
            }
        }

        public void onCheckpointDirty(Object checkpointKey) {
            long token = collectionToken();
            if (token == 0L) {
                return;
            }
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return;
                }
                synchronized (checkpointSlotLock) {
                    ConsumerCheckpointLedger.TrackerSlot slot = checkpointSlots.get(checkpointKey);
                    if (slot == null) {
                        slot = checkpointLedger.newTrackerSlot(nextStableIndex(nextCheckpointSlot));
                        checkpointSlots.put(checkpointKey, slot);
                    }
                    checkpointLedger.markDirty(slot, clock.nanoTime(), token);
                }
            }
        }

        public long beginCheckpointCall() {
            synchronized (runtime) {
                return collectionToken();
            }
        }

        public long beginCheckpointDetail() {
            synchronized (runtime) {
                return detailToken();
            }
        }

        public void onCheckpointFlush(long token, long detailToken, boolean success, boolean cleared,
                                      Object checkpointKey, long durationNanos) {
            if (!acceptsCollection(token)) {
                return;
            }
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return;
                }
                long now = clock.nanoTime();
                if (success) {
                    increment(checkpointSuccess);
                    recordHealthSuccess(now);
                    if (cleared) {
                        markCheckpointClean(checkpointKey, false, token);
                    }
                } else {
                    increment(checkpointFailure);
                    recordHealthError(now);
                }
                if (acceptsDetail(detailToken)) {
                    checkpointCallDuration.record(nanosToMillis(durationNanos), stripeHint());
                }
            }
        }

        public void onCheckpointAbandoned(Object checkpointKey) {
            synchronized (runtime) {
                markCheckpointClean(checkpointKey, true, runtime.getGeneration());
            }
        }

        public void onCheckpointCleared(Object checkpointKey) {
            synchronized (runtime) {
                markCheckpointClean(checkpointKey, false, runtime.getGeneration());
            }
        }

        private void markCheckpointClean(Object checkpointKey, boolean removeSlot, long generation) {
            synchronized (checkpointSlotLock) {
                ConsumerCheckpointLedger.TrackerSlot slot = checkpointSlots.get(checkpointKey);
                if (slot == null) {
                    return;
                }
                checkpointLedger.markClean(slot, generation);
                if (removeSlot) {
                    checkpointSlots.remove(checkpointKey);
                }
            }
        }

        public void onCheckpointFlushInFlight(long token, int delta) {
            if (!acceptsCollection(token)) {
                return;
            }
            synchronized (runtime) {
                if (!acceptsCollection(token)) {
                    return;
                }
            while (true) {
                int current = checkpointFlushInFlight.get();
                long requested = (long) current + delta;
                int next;
                if (requested > Integer.MAX_VALUE) {
                    saturated = true;
                    next = Integer.MAX_VALUE;
                } else if (requested < 0L) {
                    accountingInvariantBroken = true;
                    next = 0;
                } else {
                    next = (int) requested;
                }
                if (checkpointFlushInFlight.compareAndSet(current, next)) {
                    return;
                }
            }
            }
        }

        Canonical capture(Consistency consistency, long sequence) {
            RawCapture raw = captureRaw(consistency, sequence);
            return buildCanonical(raw, captureHistograms(raw));
        }

        /** Captures only fixed-size primitive/ledger state while the runtime monitor is held. */
        private RawCapture captureRaw(Consistency consistency, long sequence) {
            MetricsLevel currentLevel = runtime.getLevel();
            long nowNanos = clock.nanoTime();
            ConsumerOutcomeLedger.Capture outcome = currentLevel == MetricsLevel.OFF
                    ? null : outcomeLedger.capture(nowNanos);
            ConsumerCheckpointLedger.Capture checkpoint = currentLevel == MetricsLevel.OFF
                    ? null : checkpointLedger.capture(nowNanos);
            return new RawCapture(consistency, sequence, clock.currentTimeMillis(),
                    uptimeMs(nowNanos), nowNanos, lifecycle.get(), currentLevel,
                    capabilitiesFor(currentLevel), runtime.getGeneration(),
                    runtime.getStartedAtUnixMs(), currentLevel == MetricsLevel.DETAILED
                            ? detailToken() : 0L, outcome, checkpoint, assignedShards.get(),
                    fetchInFlight.get(), checkpointFlushInFlight.get(), mainLoopRunning.get(),
                    heartbeatRunning.get(), checkpointRunning.get(), shardWorkersRunning.get(),
                    shardTasksInFlight.get(), fetchSuccess.get(), fetchFailure.get(),
                    fetchedGroups.get(), fetchedLogs.get(), heartbeatSuccess.get(),
                    heartbeatFailure.get(), checkpointSuccess.get(), checkpointFailure.get(),
                    backoff.get(), rebalance.get(), hasLastSuccess, lastSuccessNanos,
                    hasLastError, lastErrorNanos, saturated, accountingInvariantBroken,
                    workerDetailsByBusyMask, fetchCallDuration, dispatchDelay, handlerDuration,
                    checkpointCallDuration);
        }

        private HistogramCapture captureHistograms(RawCapture raw) {
            if (raw.level != MetricsLevel.DETAILED) {
                return null;
            }
            return new HistogramCapture(raw.fetchCallDuration.snapshot(),
                    raw.dispatchDelay.snapshot(), raw.handlerDuration.snapshot(),
                    raw.checkpointCallDuration.snapshot());
        }

        private boolean isCurrent(RawCapture raw) {
            if (runtime.getGeneration() != raw.collectionGeneration
                    || runtime.getLevel() != raw.level
                    || lifecycle.get() != raw.lifecycleState) {
                return false;
            }
            return raw.level != MetricsLevel.DETAILED || detailToken() == raw.detailToken;
        }

        private Canonical buildCanonical(RawCapture raw, HistogramCapture histograms) {
            SnapshotAnchor anchor = new SnapshotAnchor(instanceId, ComponentType.CONSUMER,
                    raw.capturedAtUnixMs, raw.uptimeMs, raw.sequence, raw.lifecycleState,
                    raw.consistency, raw.level, raw.capabilities, raw.collectionGeneration,
                    raw.collectionStartedAtUnixMs);
            if (raw.level == MetricsLevel.OFF) {
                return new Canonical(anchor, null, null, null, null, null);
            }
            ConsumerOutcomeLedger.Capture outcome = raw.outcome;
            ConsumerCheckpointLedger.Capture checkpoint = raw.checkpoint;
            List<WorkerRoleStats> roles = workerRoles(raw);
            WorkerSummary workerSummary = workerSummary(roles);

            List<CriticalFlag> flags = new ArrayList<CriticalFlag>(3);
            if (raw.saturated || outcome.isCounterSaturated() || checkpoint.isCounterSaturated()) {
                flags.add(CriticalFlag.COUNTER_SATURATED);
            }
            if (raw.accountingInvariantBroken || outcome.isAccountingInvariantBroken()
                    || checkpoint.isAccountingInvariantBroken()) {
                flags.add(CriticalFlag.ACCOUNTING_INVARIANT_BROKEN);
            }
            if (raw.consistency == Consistency.FINAL
                    && finalizationIncomplete(outcome, checkpoint, roles,
                    raw.fetchInFlight, raw.checkpointFlushInFlight)) {
                flags.add(CriticalFlag.FINALIZATION_INCOMPLETE);
            }

            Long lastSuccessAgeMs = raw.hasLastSuccess
                    ? elapsedMillis(raw.lastSuccessNanos, raw.nowNanos) : null;
            Long lastErrorAgeMs = raw.hasLastError
                    ? elapsedMillis(raw.lastErrorNanos, raw.nowNanos) : null;
            ConsumerHealthSignals health = new ConsumerHealthSignals(
                    lastSuccessAgeMs, lastErrorAgeMs, workerSummary, flags);

            QueueSummary checkpointPending = new QueueSummary(
                    checkpoint.getPending(), null, checkpoint.getLifetimeHighWatermark(), false);
            ConsumerOperationalStats operational = ConsumerOperationalStats.builder()
                    .fetchSuccessTotal(raw.fetchSuccess)
                    .fetchFailureTotal(raw.fetchFailure)
                    .fetchedLogsTotal(raw.fetchedLogs)
                    .fetchedLogGroupsTotal(raw.fetchedGroups)
                    .handlerNormalReturnsTotal(outcome.getHandlerNormalReturns())
                    .handlerExceptionReturnsTotal(outcome.getHandlerExceptionReturns())
                    .handlerReturnedLogsTotal(outcome.getHandlerReturnedLogs())
                    .handlerReturnedGroupsTotal(outcome.getHandlerReturnedGroups())
                    .checkpointSuccessTotal(raw.checkpointSuccess)
                    .checkpointFailureTotal(raw.checkpointFailure)
                    .heartbeatSuccessTotal(raw.heartbeatSuccess)
                    .heartbeatFailureTotal(raw.heartbeatFailure)
                    .rebalanceTotal(raw.rebalance)
                    .assignedShards(raw.assignment)
                    .heldBatchReferences(outcome.getHeldBatchReferences())
                    .readyToProcess(outcome.getReadyToProcess())
                    .fetchInFlight(toInt(raw.fetchInFlight))
                    .processInFlight(toInt(outcome.getProcessInFlight()))
                    .checkpointPending(checkpointPending)
                    .workers(workerSummary)
                    .build();

            WorkerDetails workers = raw.level == MetricsLevel.DETAILED
                    ? currentWorkerDetails(raw.workerDetailsByBusyMask, roles) : null;
            ConsumerRetryDetails retry = raw.level == MetricsLevel.DETAILED
                    ? new ConsumerRetryDetails(raw.backoff) : null;
            ConsumerLatencyHistograms latency = raw.level == MetricsLevel.DETAILED
                    ? new ConsumerLatencyHistograms(histograms.fetchCallDuration,
                    histograms.dispatchDelay, histograms.handlerDuration,
                    histograms.checkpointCallDuration) : null;
            return new Canonical(anchor, health, operational, workers, retry, latency);
        }

        private static final class HistogramCapture {
            final HistogramSnapshot fetchCallDuration;
            final HistogramSnapshot dispatchDelay;
            final HistogramSnapshot handlerDuration;
            final HistogramSnapshot checkpointCallDuration;

            HistogramCapture(HistogramSnapshot fetchCallDuration, HistogramSnapshot dispatchDelay,
                             HistogramSnapshot handlerDuration,
                             HistogramSnapshot checkpointCallDuration) {
                this.fetchCallDuration = fetchCallDuration;
                this.dispatchDelay = dispatchDelay;
                this.handlerDuration = handlerDuration;
                this.checkpointCallDuration = checkpointCallDuration;
            }
        }

        private static final class RawCapture {
            final Consistency consistency;
            final long sequence;
            final long capturedAtUnixMs;
            final long uptimeMs;
            final long nowNanos;
            final LifecycleState lifecycleState;
            final MetricsLevel level;
            final long capabilities;
            final long collectionGeneration;
            final long collectionStartedAtUnixMs;
            final long detailToken;
            final ConsumerOutcomeLedger.Capture outcome;
            final ConsumerCheckpointLedger.Capture checkpoint;
            final int assignment;
            final long fetchInFlight;
            final long checkpointFlushInFlight;
            final long mainLoopRunning;
            final long heartbeatRunning;
            final long checkpointRunning;
            final long shardWorkersRunning;
            final long shardTasksInFlight;
            final long fetchSuccess;
            final long fetchFailure;
            final long fetchedGroups;
            final long fetchedLogs;
            final long heartbeatSuccess;
            final long heartbeatFailure;
            final long checkpointSuccess;
            final long checkpointFailure;
            final long backoff;
            final long rebalance;
            final boolean hasLastSuccess;
            final long lastSuccessNanos;
            final boolean hasLastError;
            final long lastErrorNanos;
            final boolean saturated;
            final boolean accountingInvariantBroken;
            final WorkerDetails[] workerDetailsByBusyMask;
            final FixedHistogram fetchCallDuration;
            final FixedHistogram dispatchDelay;
            final FixedHistogram handlerDuration;
            final FixedHistogram checkpointCallDuration;

            RawCapture(Consistency consistency, long sequence, long capturedAtUnixMs,
                       long uptimeMs, long nowNanos, LifecycleState lifecycleState,
                       MetricsLevel level, long capabilities, long collectionGeneration,
                       long collectionStartedAtUnixMs, long detailToken,
                       ConsumerOutcomeLedger.Capture outcome,
                       ConsumerCheckpointLedger.Capture checkpoint, int assignment,
                       long fetchInFlight, long checkpointFlushInFlight, long mainLoopRunning,
                       long heartbeatRunning, long checkpointRunning, long shardWorkersRunning,
                       long shardTasksInFlight, long fetchSuccess, long fetchFailure,
                       long fetchedGroups, long fetchedLogs, long heartbeatSuccess,
                       long heartbeatFailure, long checkpointSuccess, long checkpointFailure,
                       long backoff, long rebalance, boolean hasLastSuccess,
                       long lastSuccessNanos, boolean hasLastError, long lastErrorNanos,
                       boolean saturated, boolean accountingInvariantBroken,
                       WorkerDetails[] workerDetailsByBusyMask,
                       FixedHistogram fetchCallDuration, FixedHistogram dispatchDelay,
                       FixedHistogram handlerDuration, FixedHistogram checkpointCallDuration) {
                this.consistency = consistency;
                this.sequence = sequence;
                this.capturedAtUnixMs = capturedAtUnixMs;
                this.uptimeMs = uptimeMs;
                this.nowNanos = nowNanos;
                this.lifecycleState = lifecycleState;
                this.level = level;
                this.capabilities = capabilities;
                this.collectionGeneration = collectionGeneration;
                this.collectionStartedAtUnixMs = collectionStartedAtUnixMs;
                this.detailToken = detailToken;
                this.outcome = outcome;
                this.checkpoint = checkpoint;
                this.assignment = assignment;
                this.fetchInFlight = fetchInFlight;
                this.checkpointFlushInFlight = checkpointFlushInFlight;
                this.mainLoopRunning = mainLoopRunning;
                this.heartbeatRunning = heartbeatRunning;
                this.checkpointRunning = checkpointRunning;
                this.shardWorkersRunning = shardWorkersRunning;
                this.shardTasksInFlight = shardTasksInFlight;
                this.fetchSuccess = fetchSuccess;
                this.fetchFailure = fetchFailure;
                this.fetchedGroups = fetchedGroups;
                this.fetchedLogs = fetchedLogs;
                this.heartbeatSuccess = heartbeatSuccess;
                this.heartbeatFailure = heartbeatFailure;
                this.checkpointSuccess = checkpointSuccess;
                this.checkpointFailure = checkpointFailure;
                this.backoff = backoff;
                this.rebalance = rebalance;
                this.hasLastSuccess = hasLastSuccess;
                this.lastSuccessNanos = lastSuccessNanos;
                this.hasLastError = hasLastError;
                this.lastErrorNanos = lastErrorNanos;
                this.saturated = saturated;
                this.accountingInvariantBroken = accountingInvariantBroken;
                this.workerDetailsByBusyMask = workerDetailsByBusyMask;
                this.fetchCallDuration = fetchCallDuration;
                this.dispatchDelay = dispatchDelay;
                this.handlerDuration = handlerDuration;
                this.checkpointCallDuration = checkpointCallDuration;
            }
        }

        private List<WorkerRoleStats> workerRoles(RawCapture raw) {
            List<WorkerRoleStats> roles = new ArrayList<WorkerRoleStats>(4);
            roles.add(new WorkerRoleStats(WorkerRole.MAIN_LOOP, 1L, raw.mainLoopRunning, 0L));
            roles.add(new WorkerRoleStats(WorkerRole.HEARTBEAT, 1L, raw.heartbeatRunning, 0L));
            roles.add(new WorkerRoleStats(WorkerRole.CHECKPOINT,
                    Math.max((long) raw.assignment, raw.checkpointRunning),
                    raw.checkpointRunning, raw.checkpointFlushInFlight));
            roles.add(new WorkerRoleStats(WorkerRole.SHARD_WORKER,
                    Math.max((long) raw.assignment, raw.shardWorkersRunning),
                    raw.shardWorkersRunning,
                    Math.max(raw.outcome.getProcessInFlight(), raw.shardTasksInFlight)));
            return roles;
        }

        private static WorkerSummary workerSummary(List<WorkerRoleStats> roles) {
            long expected = 0L;
            long running = 0L;
            long inFlight = 0L;
            long missingCriticalRoles = 0L;
            for (WorkerRoleStats role : roles) {
                expected = safeSum(expected, role.getExpected());
                running = safeSum(running, role.getRunning());
                inFlight = safeSum(inFlight, role.getInFlight());
                if (role.getRunning() < role.getExpected()) missingCriticalRoles++;
            }
            return new WorkerSummary(expected, running, inFlight, missingCriticalRoles);
        }

        private WorkerDetails currentWorkerDetails(WorkerDetails[] cache,
                                                   List<WorkerRoleStats> roles) {
            int busyMask = 0;
            for (WorkerRoleStats role : roles) {
                if (role.getRole() == WorkerRole.CHECKPOINT && role.getInFlight() > 0L) {
                    busyMask |= 1;
                } else if (role.getRole() == WorkerRole.SHARD_WORKER
                        && role.getInFlight() > 0L) {
                    busyMask |= 2;
                }
            }
            return cache == null ? workerDetails(roles) : cache[busyMask];
        }

        private synchronized void refreshWorkerDetails() {
            if (!isDetailed()) {
                return;
            }
            int assignment = assignedShards.get();
            WorkerDetails[] refreshed = new WorkerDetails[4];
            for (int busyMask = 0; busyMask < refreshed.length; busyMask++) {
                refreshed[busyMask] = workerDetails(workerRolesForDetails(
                        assignment, (busyMask & 1) != 0, (busyMask & 2) != 0));
            }
            workerDetailsByBusyMask = refreshed;
        }

        private List<WorkerRoleStats> workerRolesForDetails(
                int assignment, boolean checkpointBusy, boolean shardBusy) {
            List<WorkerRoleStats> roles = new ArrayList<WorkerRoleStats>(4);
            roles.add(new WorkerRoleStats(WorkerRole.MAIN_LOOP,
                    1L, mainLoopRunning.get(), 0L));
            roles.add(new WorkerRoleStats(WorkerRole.HEARTBEAT,
                    1L, heartbeatRunning.get(), 0L));
            long checkpointWorkers = checkpointRunning.get();
            long shardWorkers = shardWorkersRunning.get();
            roles.add(new WorkerRoleStats(WorkerRole.CHECKPOINT,
                    Math.max((long) assignment, checkpointWorkers), checkpointWorkers,
                    checkpointBusy ? 1L : 0L));
            roles.add(new WorkerRoleStats(WorkerRole.SHARD_WORKER,
                    Math.max((long) assignment, shardWorkers), shardWorkers,
                    shardBusy ? 1L : 0L));
            return roles;
        }

        private static WorkerDetails workerDetails(List<WorkerRoleStats> roles) {
            return WorkerDetails.forRoles(roles);
        }

        private boolean finalizationIncomplete(ConsumerOutcomeLedger.Capture outcome,
                                               ConsumerCheckpointLedger.Capture checkpoint,
                                               List<WorkerRoleStats> roles,
                                               long fetchInFlight,
                                               long checkpointFlushInFlight) {
            if (outcome.getHeldBatchReferences() != 0L || outcome.getReadyToProcess() != 0L
                    || outcome.getProcessInFlight() != 0L || checkpoint.getPending() != 0L
                    || fetchInFlight != 0L || checkpointFlushInFlight != 0L) {
                return true;
            }
            for (WorkerRoleStats role : roles) {
                if (role.getRunning() != 0L || role.getInFlight() != 0L) {
                    return true;
                }
            }
            return false;
        }

        /** Must be called under runtime then slot; it never mutates the ledger's live gauges. */
        private void resetSlotForCollection(BatchSlot slot, long generation) {
            clearSlotOwnership(slot, generation);
            resetProcessAttempt(slot);
        }

        private void clearSlotOwnership(BatchSlot slot, long generation) {
            slot.state = BatchState.EMPTY;
            slot.collectionGeneration = generation;
            slot.batchGroups = 0L;
            slot.batchLogs = 0L;
            slot.dispatchDetailGeneration = 0L;
            slot.dispatchStartNanos = 0L;
        }

        /** Clears only per-operation facts; a completed owned batch remains releasable. */
        private void resetProcessAttempt(BatchSlot slot) {
            slot.processGeneration = 0L;
            slot.processDetailGeneration = 0L;
            slot.processGroups = 0L;
            slot.processLogs = 0L;
            slot.processOwnsBatch = false;
        }

        private void requireEnabledSlot(BatchSlot slot) {
            if (slot == null || slot.ledgerSlot == null) {
                throw new IllegalArgumentException("batch slot is not enabled");
            }
        }

        /** Called while holding the runtime monitor. Keep the newest event for min-age projection. */
        private void recordHealthSuccess(long nowNanos) {
            if (!hasLastSuccess || nowNanos > lastSuccessNanos) {
                hasLastSuccess = true;
                lastSuccessNanos = nowNanos;
            }
        }

        /** Called while holding the runtime monitor. Keep the newest event for min-age projection. */
        private void recordHealthError(long nowNanos) {
            if (!hasLastError || nowNanos > lastErrorNanos) {
                hasLastError = true;
                lastErrorNanos = nowNanos;
            }
        }

        private static long elapsedMillis(long startNanos, long endNanos) {
            long elapsed = endNanos - startNanos;
            return elapsed <= 0L ? 0L : elapsed / 1_000_000L;
        }

        private void increment(AtomicLong counter) { add(counter, 1L); }

        private void add(AtomicLong counter, long delta) {
            if (delta <= 0L) {
                return;
            }
            while (true) {
                long current = counter.get();
                if (current == Long.MAX_VALUE || delta > Long.MAX_VALUE - current) {
                    saturated = true;
                    if (counter.compareAndSet(current, Long.MAX_VALUE)) {
                        return;
                    }
                    continue;
                }
                if (counter.compareAndSet(current, current + delta)) {
                    return;
                }
            }
        }

        private void incrementGauge(AtomicInteger gauge) {
            while (true) {
                int current = gauge.get();
                if (current == Integer.MAX_VALUE) {
                    saturated = true;
                    return;
                }
                if (gauge.compareAndSet(current, current + 1)) {
                    return;
                }
            }
        }

        private void decrementGauge(AtomicInteger gauge) {
            while (true) {
                int current = gauge.get();
                if (current <= 0) {
                    accountingInvariantBroken = true;
                    return;
                }
                if (gauge.compareAndSet(current, current - 1)) {
                    return;
                }
            }
        }

        private static long safeSum(long left, long right) {
            return left > Long.MAX_VALUE - right ? Long.MAX_VALUE : left + right;
        }

        private static int toInt(long value) {
            return value > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) value;
        }

        private static double nanosToMillis(long durationNanos) {
            return Math.max(0L, durationNanos) / 1_000_000.0D;
        }

        private static int stripeHint() { return (int) Thread.currentThread().getId(); }

        private static int nextStableIndex(AtomicInteger sequence) {
            while (true) {
                int current = sequence.get();
                int next = current == Integer.MAX_VALUE ? 0 : current + 1;
                if (sequence.compareAndSet(current, next)) {
                    return current;
                }
            }
        }
    }

    private static final class Canonical {
        private final SnapshotAnchor anchor;
        private final ConsumerHealthSignals health;
        private final ConsumerOperationalStats operational;
        private final WorkerDetails workers;
        private final ConsumerRetryDetails retry;
        private final ConsumerLatencyHistograms latency;

        private Canonical(SnapshotAnchor anchor, ConsumerHealthSignals health,
                          ConsumerOperationalStats operational, WorkerDetails workers,
                          ConsumerRetryDetails retry, ConsumerLatencyHistograms latency) {
            this.anchor = anchor;
            this.health = health;
            this.operational = operational;
            this.workers = workers;
            this.retry = retry;
            this.latency = latency;
        }
    }
}
