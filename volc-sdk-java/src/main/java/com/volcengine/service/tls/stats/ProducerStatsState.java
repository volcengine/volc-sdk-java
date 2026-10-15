package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.stats.ComponentType;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.ManagedMemoryBreakdown;
import com.volcengine.model.tls.stats.ManagedMemorySummary;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.ProducerHealthSignals;
import com.volcengine.model.tls.stats.ProducerLatencyHistograms;
import com.volcengine.model.tls.stats.ProducerOperationalStats;
import com.volcengine.model.tls.stats.ProducerRetryDetails;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.QueueSummary;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.model.tls.stats.WorkerDetails;
import com.volcengine.model.tls.stats.WorkerRole;
import com.volcengine.model.tls.stats.WorkerRoleStats;
import com.volcengine.model.tls.stats.WorkerSummary;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/** Producer observability facade with a truly lightweight OFF implementation. */
public final class ProducerStatsState {
    private final Delegate delegate;
    private final RuntimeCollection runtime;
    private final Object gate;
    private final StatsClock clock;
    private final MemoryLimiter memoryLimiter;
    private java.util.function.LongSupplier sendDepth, retryDepth, callbackDepth;

    public ProducerStatsState(MetricsLevel metricsLevel, int senderThreads, MemoryLimiter memoryLimiter,
                              String instanceId, StatsClock clock) {
        com.volcengine.model.tls.stats.SnapshotHeader.initializeSdkIdentity();
        MetricsLevel level = MetricsLevel.normalize(metricsLevel);
        if (level != MetricsLevel.OFF && memoryLimiter == null) {
            throw new IllegalArgumentException("enabled producer stats require a memory owner");
        }
        this.clock = clock == null ? StatsClock.SYSTEM : clock;
        this.memoryLimiter = memoryLimiter;
        this.gate = memoryLimiter == null ? new Object() : memoryLimiter.getAccountant();
        this.runtime = new RuntimeCollection(level, this.clock.currentTimeMillis());
        if (memoryLimiter != null) memoryLimiter.getAccountant().setObservationEnabled(level != MetricsLevel.OFF);
        this.delegate = memoryLimiter == null
                ? new Disabled(level, instanceId, clock, runtime)
                : new Enabled(this, level, senderThreads, memoryLimiter, instanceId, clock);
    }

    public static ProducerStatsState disabled() {
        return new ProducerStatsState(MetricsLevel.OFF, 0, null,
                StatsInstanceId.forProducer(), StatsClock.SYSTEM);
    }

    public boolean isMetricsEnabled() { return runtime.isEnabled(); }
    public boolean isDetailedEnabled() { return runtime.isDetailed(); }
    public long beginDetail() { return runtime.beginDetail(); }
    public void markStarted() { synchronized (gate) { delegate.markStarted(); } }
    public void markClosing() { synchronized (gate) { delegate.markClosing(); } }
    public void markFinalizationIncomplete() { synchronized (gate) { delegate.markFinalizationIncomplete(); } }
    public void markClosedAndFreeze() { synchronized (gate) { delegate.markClosedAndFreeze(); } }
    public void markFailed() { synchronized (gate) { delegate.markFailed(); } }
    // Fixed worker lifecycle facts remain maintained even while business collection is disabled.
    public void onMoverWorkerStarted() { synchronized (gate) { delegate.onMoverWorkerStarted(); } }
    public void onMoverWorkerStopped() { synchronized (gate) { delegate.onMoverWorkerStopped(); } }
    public void onSenderWorkerStarted() { synchronized (gate) { delegate.onSenderWorkerStarted(); } }
    public void onSenderWorkerStopped() { synchronized (gate) { delegate.onSenderWorkerStopped(); } }
    public void onCallbackWorkerStarted() { synchronized (gate) { delegate.onCallbackWorkerStarted(); } }
    public void onCallbackWorkerStopped() { synchronized (gate) { delegate.onCallbackWorkerStopped(); } }
    public void onBatchCreated(BatchLog batch) {
        batch.setStatsState(this);
        batch.setCollectionGeneration(batch.getBatchKey().getCollectionGeneration());
        if (!runtime.isEnabled()) return;
        synchronized (gate) {
            if (runtime.acceptsCollection(batch.getCollectionGeneration())) delegate.onBatchCreated(batch);
        }
    }
    public void onGroupAggregated(BatchLog batch) {
        if (!runtime.isEnabled()) return;
        synchronized (gate) {
            if (runtime.acceptsCollection(batch.getCollectionGeneration())) {
                Enabled state = (Enabled) delegate;
                state.inc(state.aggregateGroupCount);
            }
        }
    }

    /** Uses the existing accountant lock order; never holds an observation lock during admission wait. */
    public void setMetricsLevel(MetricsLevel next) {
        synchronized (gate) {
            LifecycleDelegate lifecycle = (LifecycleDelegate) delegate;
            RuntimeCollection.validateChange(next, lifecycle.lifecycle.get());
            MetricsLevel old = runtime.getLevel();
            if (old == next) return;
            if (!(delegate instanceof Enabled)) throw new IllegalStateException("no producer memory owner");
            Enabled enabled = (Enabled) delegate;
            if (next == MetricsLevel.DETAILED) enabled.initDetailed();
            if (old == MetricsLevel.OFF || next == MetricsLevel.OFF) {
                enabled.resetLiveGauges();
                memoryLimiter.getAccountant().setObservationEnabled(next != MetricsLevel.OFF);
            }
            lifecycle.level = next;
            runtime.changeLevel(next, lifecycle.lifecycle.get(), clock.currentTimeMillis());
            if (next != MetricsLevel.OFF) observePhysicalQueues();
        }
    }

    /** Bind constant-time queue depth reads once; no payload or topic/shard traversal is permitted. */
    public void bindQueueDepths(java.util.function.LongSupplier send,
                                java.util.function.LongSupplier retry,
                                java.util.function.LongSupplier callback) {
        if (send == null || retry == null || callback == null) throw new NullPointerException("queue depth");
        synchronized (gate) {
            if (((LifecycleDelegate) delegate).lifecycle.get() != LifecycleState.NEW) {
                throw new IllegalStateException("queue depths must be bound before start");
            }
            sendDepth = send; retryDepth = retry; callbackDepth = callback;
            if (runtime.isEnabled()) observePhysicalQueues();
        }
    }

    public void onQueueDepthChanged() {
        if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) observePhysicalQueues(); }
    }

    private void observePhysicalQueues() {
        if (sendDepth == null || !(delegate instanceof Enabled)) return;
        Enabled state = (Enabled) delegate;
        state.observeDepth(state.sendQueue, state.sendHwm, sendDepth.getAsLong());
        state.observeDepth(state.retryQueue, state.retryHwm, retryDepth.getAsLong());
        state.callbackQueue.set(Math.max(0L, callbackDepth.getAsLong()));
    }
    /** Atomically establishes payload and log/group ownership at one observable boundary. */
    public boolean acquirePayloadAndAccept(MemoryLimiter limiter, long bytes, long timeoutMs, int logs)
            throws InterruptedException {
        if (limiter == null) throw new NullPointerException("limiter");
        return acquirePayloadAndAcceptGeneration(limiter, bytes, timeoutMs, logs) >= 0;
    }
    /** -1 means admission failed, 0 means accepted while OFF, positive values identify the cohort. */
    public long acquirePayloadAndAcceptGeneration(MemoryLimiter limiter, long bytes, long timeoutMs, int logs)
            throws InterruptedException {
        if (limiter == null) throw new NullPointerException("limiter");
        synchronized (limiter.getAccountant()) {
            if (!limiter.acquirePayload(bytes, timeoutMs)) return -1;
            synchronized (gate) {
                long generation = runtime.beginCollection();
                if (generation != 0) delegate.onGroupAccepted(logs);
                return generation;
            }
        }
    }
    /** Compensates a post-accept buffering failure without exposing a half-released capture. */
    public void rollbackAcceptedAndRelease(MemoryLimiter limiter, long bytes, int logs) {
        rollbackAcceptedAndRelease(limiter, bytes, logs, runtime.beginCollection());
    }
    public void rollbackAcceptedAndRelease(MemoryLimiter limiter, long bytes, int logs, long generation) {
        if (limiter == null) throw new NullPointerException("limiter");
        synchronized (limiter.getAccountant()) {
            synchronized (gate) {
                if (runtime.acceptsCollection(generation)) delegate.onGroupAcceptRolledBack(logs);
            }
            limiter.releasePayload(bytes);
        }
    }
    public void onRejectedInvalidArgument() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onRejectedInvalidArgument(); } }
    public void onRejectedMemoryFull() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onRejectedMemoryFull(); } }
    public void onRejectedClosed() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onRejectedClosed(); } }
    public void onRejectedCircuitOpen() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onRejectedCircuitOpen(); } }
    public void onRejectedInternal() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onRejectedInternal(); } }
    public void onBatchSubmittedFromIngress(BatchLog batch) {
        if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onBatchSubmittedFromIngress(batch); }
    }
    public void onBatchResubmittedFromRetry(BatchLog batch) { onBatchResubmittedFromRetry(batch, 0); }
    public void onBatchResubmittedFromRetry(BatchLog batch, long retryHeadEnqueueNanos) {
        if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onBatchResubmittedFromRetry(batch, retryHeadEnqueueNanos); }
    }
    public void onSubmitRejected() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onSubmitRejected(); } }
    public void onSendStart(BatchLog batch) {
        if (!runtime.isEnabled()) {
            batch.setSendAttemptStarted(true);
            return;
        }
        synchronized (gate) {
            boolean firstAttempt = !batch.isSendAttemptStarted();
            batch.setSendAttemptStarted(true);
            if (runtime.isEnabled()) delegate.onSendStart(batch, firstAttempt);
        }
    }
    public long onSendCallStart(BatchLog batch) {
        if (!runtime.isEnabled()) return 0;
        synchronized (gate) {
            long generation = runtime.beginCollection();
            if (generation != 0) {
                Enabled enabled = (Enabled) delegate;
                enabled.sendInFlight.incrementAndGet();
            }
            return generation;
        }
    }
    public void onSendCallEnd(long generation, long detailGeneration, boolean success,
                              long logs, long groups, long nanos) {
        if (!runtime.acceptsCollection(generation)) return;
        synchronized (gate) {
            if (!runtime.acceptsCollection(generation)) return;
            delegate.onSendEnd();
            long observedNanos = runtime.acceptsDetail(detailGeneration) ? nanos : -1;
            if (success) delegate.onSendCallSuccess(logs, groups, observedNanos);
            else delegate.onSendCallFailure(logs, groups, observedNanos);
        }
    }
    public void onRetryScheduled() { onRetryScheduled(0); }
    public void onRetryScheduled(long retryHeadEnqueueNanos) {
        if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onRetryScheduled(retryHeadEnqueueNanos); }
    }
    public void onTerminalEnqueued() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onTerminalEnqueued(); } }
    /** Publishes the physical callback item and its ledger entry at one observable boundary. */
    public void publishTerminal(BlockingQueue<BatchLog> queue, BatchLog batch) {
        if (queue == null || batch == null) throw new NullPointerException("queue/batch");
        synchronized (gate) {
            if (runtime.isEnabled()) delegate.publishTerminal(queue, batch);
            else queue.add(batch);
        }
    }
    public boolean settleTerminal(BatchLog batch, int outcome) { synchronized (gate) { return delegate.settleTerminal(batch, outcome); } }
    /** Performs the once terminal counter settlement and payload release in one capture boundary. */
    public boolean settleTerminalAndRelease(BatchLog batch, int outcome, MemoryLimiter limiter) {
        if (batch == null || limiter == null) throw new NullPointerException("batch/limiter");
        synchronized (limiter.getAccountant()) {
            if (!settleTerminal(batch, outcome)) return false;
            batch.releasePayload(limiter);
            return true;
        }
    }
    public void onTerminalDequeued() { if (runtime.isEnabled()) synchronized (gate) { if (runtime.isEnabled()) delegate.onTerminalDequeued(); } }
    public long beginCallback() {
        if (!runtime.isEnabled()) return 0;
        synchronized (gate) {
            long generation = runtime.beginCollection();
            if (generation != 0) delegate.onCallbackStart();
            return generation;
        }
    }
    public void endCallback(long generation, long detailGeneration, boolean normal, long nanos) {
        if (!runtime.acceptsCollection(generation)) return;
        synchronized (gate) {
            if (runtime.acceptsCollection(generation)) delegate.onCallbackEnd(normal,
                    runtime.acceptsDetail(detailGeneration) ? nanos : -1);
        }
    }
    public ProducerStatsSnapshot snapshot(StatsOptions options) { synchronized (gate) { return delegate.snapshot(options); } }
    public boolean isSaturated() { return delegate.isSaturated(); }

    private interface Delegate {
        boolean isEnabled(); boolean isDetailed();
        void markStarted(); void markClosing(); void markFinalizationIncomplete();
        void markClosedAndFreeze(); void markFailed();
        void onMoverWorkerStarted(); void onMoverWorkerStopped();
        void onSenderWorkerStarted(); void onSenderWorkerStopped();
        void onCallbackWorkerStarted(); void onCallbackWorkerStopped();
        void onBatchCreated(BatchLog batch); void onGroupAccepted(int logs);
        void onGroupAcceptRolledBack(int logs);
        void onRejectedInvalidArgument(); void onRejectedMemoryFull(); void onRejectedClosed();
        void onRejectedCircuitOpen(); void onRejectedInternal();
        void onBatchSubmittedFromIngress(BatchLog batch); void onBatchResubmittedFromRetry(BatchLog batch);
        void onBatchResubmittedFromRetry(BatchLog batch, long retryHeadEnqueueNanos);
        void onSubmitRejected(); void onSendStart(BatchLog batch, boolean firstAttempt); void onSendEnd();
        void onSendCallSuccess(long logs, long groups, long nanos);
        void onSendCallFailure(long logs, long groups, long nanos);
        void onRetryScheduled(long retryHeadEnqueueNanos); void onTerminalEnqueued();
        void publishTerminal(BlockingQueue<BatchLog> queue, BatchLog batch);
        boolean settleTerminal(BatchLog batch, int outcome);
        void onTerminalDequeued(); void onCallbackStart(); void onCallbackEnd(boolean normal, long nanos);
        ProducerStatsSnapshot snapshot(StatsOptions options); boolean isSaturated();
    }

    private abstract static class LifecycleDelegate implements Delegate {
        volatile MetricsLevel level;
        final String instanceId;
        final StatsClock clock;
        final AtomicLong startNanos = new AtomicLong(Long.MIN_VALUE);
        final AtomicLong sequence = new AtomicLong();
        final AtomicReference<LifecycleState> lifecycle = new AtomicReference<>(LifecycleState.NEW);
        final AtomicReference<Canonical> frozen = new AtomicReference<>();
        private LifecycleState requestedFinalState;

        LifecycleDelegate(MetricsLevel level, String instanceId, StatsClock clock) {
            this.level = level;
            this.instanceId = instanceId == null ? "" : instanceId;
            this.clock = clock == null ? StatsClock.SYSTEM : clock;
        }

        public void markStarted() {
            if (lifecycle.compareAndSet(LifecycleState.NEW, LifecycleState.RUNNING)) {
                startNanos.set(clock.nanoTime());
            }
        }

        public void markClosing() {
            LifecycleState state = lifecycle.get();
            if (state == LifecycleState.NEW || state == LifecycleState.RUNNING) {
                lifecycle.compareAndSet(state, LifecycleState.CLOSING);
            }
        }

        public void markFinalizationIncomplete() {}

        public void markClosedAndFreeze() { freeze(LifecycleState.CLOSED); }
        public void markFailed() { freeze(LifecycleState.FAILED); }

        private synchronized void freeze(LifecycleState finalState) {
            if (frozen.get() != null) return;
            requestedFinalState = finalState;
            if (!canFinalize()) {
                lifecycle.set(finalState == LifecycleState.FAILED ? LifecycleState.FAILED : LifecycleState.CLOSING);
                return;
            }
            lifecycle.set(finalState);
            Canonical canonical = capture(Consistency.FINAL, sequence.incrementAndGet());
            frozen.compareAndSet(null, canonical);
        }

        boolean canFinalize() { return true; }
        final void finishCloseIfDrained() {
            if (requestedFinalState != null && canFinalize()) freeze(requestedFinalState);
        }

        final ProducerStatsSnapshot project(StatsOptions options) {
            if (options == null) throw new IllegalArgumentException("options must not be null");
            Canonical canonical = frozen.get();
            if (canonical == null) canonical = capture(Consistency.WEAK, sequence.incrementAndGet());
            return StatsProjector.producer(canonical.anchor, canonical.health, canonical.operational,
                    canonical.memory, canonical.workers, canonical.retry, canonical.latency,
                    canonical.memoryBreakdown, options);
        }

        long uptimeMs() {
            long start = startNanos.get();
            return start == Long.MIN_VALUE ? 0L : Math.max(0L, (clock.nanoTime() - start) / 1_000_000L);
        }

        abstract Canonical capture(Consistency consistency, long sequence);

        public void onMoverWorkerStarted() {} public void onMoverWorkerStopped() {}
        public void onSenderWorkerStarted() {} public void onSenderWorkerStopped() {}
        public void onCallbackWorkerStarted() {} public void onCallbackWorkerStopped() {}
        public void onBatchCreated(BatchLog batch) {} public void onGroupAccepted(int logs) {}
        public void onGroupAcceptRolledBack(int logs) {}
        public void onRejectedInvalidArgument() {} public void onRejectedMemoryFull() {}
        public void onRejectedClosed() {} public void onRejectedCircuitOpen() {} public void onRejectedInternal() {}
        public void onBatchSubmittedFromIngress(BatchLog batch) {}
        public void onBatchResubmittedFromRetry(BatchLog batch) {}
        public void onBatchResubmittedFromRetry(BatchLog batch, long retryHeadEnqueueNanos) {}
        public void onSubmitRejected() {}
        public void onSendStart(BatchLog batch, boolean firstAttempt) {} public void onSendEnd() {}
        public void onSendCallSuccess(long logs, long groups, long nanos) {}
        public void onSendCallFailure(long logs, long groups, long nanos) {}
        public void onRetryScheduled(long retryHeadEnqueueNanos) {}
        public void onTerminalEnqueued() {}
        public void publishTerminal(BlockingQueue<BatchLog> queue, BatchLog batch) { queue.add(batch); }
        public boolean settleTerminal(BatchLog batch, int outcome) {
            LifecycleState state = lifecycle.get();
            if (state == LifecycleState.CLOSED || state == LifecycleState.FAILED) return false;
            return batch == null || batch.getTerminalSettled().compareAndSet(false, true);
        }
        public void onTerminalDequeued() {} public void onCallbackStart() {}
        public void onCallbackEnd(boolean normal, long nanos) {}
        public boolean isSaturated() { return false; }
    }

    private static final class Disabled extends LifecycleDelegate {
        private final RuntimeCollection runtime;
        Disabled(MetricsLevel level, String instanceId, StatsClock clock, RuntimeCollection runtime) {
            super(level, instanceId, clock);
            this.runtime = runtime;
        }
        public boolean isEnabled() { return false; }
        public boolean isDetailed() { return false; }
        public ProducerStatsSnapshot snapshot(StatsOptions options) { return project(options); }
        Canonical capture(Consistency consistency, long seq) {
            SnapshotAnchor anchor = new SnapshotAnchor(instanceId, ComponentType.PRODUCER,
                    clock.currentTimeMillis(), uptimeMs(), seq, lifecycle.get(), consistency, level, 0L,
                    runtime.getGeneration(), runtime.getStartedAtUnixMs());
            return new Canonical(anchor, null, null, null, null, null, null, null);
        }
    }

    private static final class Enabled extends LifecycleDelegate {
        private final ProducerStatsState owner;
        private final int senderThreads;
        private final MemoryLimiter memoryLimiter;
        private final long capabilities;
        private final Object outcomeLock = new Object();
        private long acceptedLogs, acceptedGroups;
        private long terminalSuccessLogs, terminalSuccessGroups;
        private long terminalFailureLogs, terminalFailureGroups;
        private long terminalDroppedLogs, terminalDroppedGroups;
        private long ownedLogs, ownedGroups;
        private volatile boolean saturated;
        private final AtomicBoolean forcedFinalizationIncomplete = new AtomicBoolean();

        private final AtomicLong rejectedInvalid = new AtomicLong(), rejectedMemory = new AtomicLong();
        private final AtomicLong rejectedClosed = new AtomicLong(), rejectedCircuit = new AtomicLong();
        private final AtomicLong ingress = new AtomicLong();
        private final AtomicLong aggregate = new AtomicLong();
        private final AtomicLong aggregateGroupCount = new AtomicLong();
        private final AtomicLong sendQueue = new AtomicLong(), sendHwm = new AtomicLong();
        private final AtomicLong retryQueue = new AtomicLong(), retryHwm = new AtomicLong();
        private final AtomicLong retryHeadEnqueueNanos = new AtomicLong();
        private final AtomicLong callbackQueue = new AtomicLong();
        private final AtomicInteger sendInFlight = new AtomicInteger(), callbacksInFlight = new AtomicInteger();
        private final AtomicInteger moverRunning = new AtomicInteger(), senderRunning = new AtomicInteger();
        private final AtomicInteger callbackRunning = new AtomicInteger();
        private final AtomicLong sendSuccess = new AtomicLong(), sendFailure = new AtomicLong();
        private final AtomicLong sendPayloadLogs = new AtomicLong(), sendPayloadGroups = new AtomicLong();
        private final AtomicLong retriesScheduled = new AtomicLong();
        private final AtomicLong lastSuccessNanos = new AtomicLong(), lastErrorNanos = new AtomicLong();
        private FixedHistogram queueDelay, sendDuration, deliveryDuration, callbackDuration;

        Enabled(ProducerStatsState owner, MetricsLevel level, int senderThreads, MemoryLimiter memoryLimiter,
                String instanceId, StatsClock clock) {
            super(level, instanceId, clock);
            if (memoryLimiter == null) throw new IllegalArgumentException("enabled stats require memory limiter");
            this.owner = owner;
            this.senderThreads = Math.max(0, senderThreads);
            this.memoryLimiter = memoryLimiter;
            // Support is independent of which subset is being collected right now.
            this.capabilities = (1L << 8) - 1;
            if (level == MetricsLevel.DETAILED) initDetailed();
        }

        private void initDetailed() {
            if (queueDelay != null) return;
            FixedHistogram nextQueue = new FixedHistogram(senderThreads);
            FixedHistogram nextSend = new FixedHistogram(senderThreads);
            FixedHistogram nextDelivery = new FixedHistogram(senderThreads, FixedHistogram.Profile.SLOW);
            FixedHistogram nextCallback = new FixedHistogram(2, FixedHistogram.Profile.SLOW);
            // Do not expose a half-initialized retained profile if an allocation fails.
            sendDuration = nextSend;
            deliveryDuration = nextDelivery;
            callbackDuration = nextCallback;
            queueDelay = nextQueue;
        }

        private void resetLiveGauges() {
            ownedLogs = ownedGroups = 0;
            ingress.set(0);
            aggregate.set(0); aggregateGroupCount.set(0);
            sendQueue.set(0); sendHwm.set(0);
            retryQueue.set(0); retryHwm.set(0); retryHeadEnqueueNanos.set(0);
            callbackQueue.set(0);
            sendInFlight.set(0); callbacksInFlight.set(0);
            lastSuccessNanos.set(0); lastErrorNanos.set(0);
        }

        public boolean isEnabled() { return owner.runtime.isEnabled(); }
        public boolean isDetailed() { return owner.runtime.isDetailed(); }
        public ProducerStatsSnapshot snapshot(StatsOptions options) { return project(options); }
        public boolean isSaturated() { return saturated; }
        public void markFinalizationIncomplete() { forcedFinalizationIncomplete.set(true); }

        public void onMoverWorkerStarted() { incInt(moverRunning); }
        public void onMoverWorkerStopped() { decInt(moverRunning); finishCloseIfDrained(); }
        public void onSenderWorkerStarted() { incInt(senderRunning); }
        public void onSenderWorkerStopped() { decInt(senderRunning); finishCloseIfDrained(); }
        public void onCallbackWorkerStarted() { incInt(callbackRunning); }
        public void onCallbackWorkerStopped() { decInt(callbackRunning); finishCloseIfDrained(); }

        @Override boolean canFinalize() {
            return moverRunning.get() == 0 && senderRunning.get() == 0 && callbackRunning.get() == 0;
        }

        public void onBatchCreated(BatchLog batch) {
            batch.setStatsState(owner);
            inc(aggregate);
        }

        public void onGroupAccepted(int logs) {
            synchronized (outcomeLock) {
                acceptedLogs = add(acceptedLogs, Math.max(0, logs));
                acceptedGroups = add(acceptedGroups, 1L);
                ownedLogs = add(ownedLogs, Math.max(0, logs));
                ownedGroups = add(ownedGroups, 1L);
            }
            inc(ingress);
        }

        public void onGroupAcceptRolledBack(int logs) {
            dec(ingress, 1L);
            synchronized (outcomeLock) {
                terminalDroppedLogs = add(terminalDroppedLogs, Math.max(0, logs));
                terminalDroppedGroups = add(terminalDroppedGroups, 1L);
                ownedLogs = Math.max(0, ownedLogs - Math.max(0, logs));
                ownedGroups = Math.max(0, ownedGroups - 1);
            }
            recordError();
        }

        public void onRejectedInvalidArgument() { inc(rejectedInvalid); recordError(); }
        public void onRejectedMemoryFull() { inc(rejectedMemory); recordError(); }
        public void onRejectedClosed() { inc(rejectedClosed); recordError(); }
        public void onRejectedCircuitOpen() { inc(rejectedCircuit); recordError(); }
        public void onRejectedInternal() { recordError(); }

        public void onBatchSubmittedFromIngress(BatchLog batch) {
            batch.setQueueDetailGeneration(owner.runtime.beginDetail());
            batch.setQueueEnterNanos(isDetailed() ? clock.nanoTime() : 0);
            int groups = groupCount(batch);
            if (owner.runtime.acceptsCollection(batch.getCollectionGeneration())) {
                dec(ingress, groups); dec(aggregate, 1L); dec(aggregateGroupCount, groups);
            }
            if (owner.sendDepth == null) bump(sendQueue, sendHwm, 1L);
        }

        public void onBatchResubmittedFromRetry(BatchLog batch) {
            onBatchResubmittedFromRetry(batch, 0L);
        }

        public void onBatchResubmittedFromRetry(BatchLog batch, long retryHeadNanos) {
            batch.setQueueDetailGeneration(owner.runtime.beginDetail());
            batch.setQueueEnterNanos(isDetailed() ? clock.nanoTime() : 0);
            if (owner.sendDepth == null) { dec(retryQueue, 1L); bump(sendQueue, sendHwm, 1L); }
            else owner.observePhysicalQueues();
            retryHeadEnqueueNanos.set(Math.max(0L, retryHeadNanos));
        }

        public void onSubmitRejected() {
            if (owner.sendDepth == null) dec(sendQueue, 1L); else owner.observePhysicalQueues();
        }

        public void onSendStart(BatchLog batch, boolean firstAttempt) {
            if (owner.sendDepth == null) dec(sendQueue, 1L); else owner.observePhysicalQueues();
            if (firstAttempt && owner.runtime.acceptsCollection(batch.getCollectionGeneration())
                    && owner.runtime.acceptsDetail(batch.getQueueDetailGeneration()) && batch.getQueueEnterNanos() != 0) {
                long firstAttemptNanos = clock.nanoTime();
                queueDelay.record((firstAttemptNanos - batch.getQueueEnterNanos()) / 1_000_000D, stripe());
                // Delivery includes request preparation and managed-buffer admission, not just HTTP.
                batch.setDeliveryDetailGeneration(batch.getQueueDetailGeneration());
                batch.setDeliveryStartNanos(firstAttemptNanos);
            }
        }

        public void onSendEnd() { decInt(sendInFlight); }

        public void onSendCallSuccess(long logs, long groups, long nanos) {
            inc(sendSuccess); add(sendPayloadLogs, logs); add(sendPayloadGroups, groups);
            if (isDetailed() && nanos >= 0) sendDuration.record(nanos / 1_000_000D, stripe());
        }

        public void onSendCallFailure(long logs, long groups, long nanos) {
            // A failed transport attempt may still retry and later succeed. Health error age is a
            // delivery boundary fact, so it is updated only by terminal/reject/drop/callback paths.
            inc(sendFailure);
            add(sendPayloadLogs, logs); add(sendPayloadGroups, groups);
            if (isDetailed() && nanos >= 0) sendDuration.record(nanos / 1_000_000D, stripe());
        }

        public void onRetryScheduled(long retryHeadNanos) {
            inc(retriesScheduled);
            if (owner.retryDepth == null) bump(retryQueue, retryHwm, 1L); else owner.observePhysicalQueues();
            retryHeadEnqueueNanos.set(Math.max(0L, retryHeadNanos));
        }
        public void onTerminalEnqueued() {
            synchronized (memoryLimiter.getAccountant()) {
                if (owner.callbackDepth == null) inc(callbackQueue); else owner.observePhysicalQueues();
            }
        }

        public void publishTerminal(BlockingQueue<BatchLog> queue, BatchLog batch) {
            synchronized (memoryLimiter.getAccountant()) {
                // Producer callback queues are unbounded. add() therefore cannot block while the
                // accountant gate is held, and a handler's ledger removal cannot overtake this bump.
                queue.add(batch);
                if (owner.callbackDepth == null) inc(callbackQueue); else owner.observePhysicalQueues();
            }
        }

        public boolean settleTerminal(BatchLog batch, int outcome) {
            LifecycleState state = lifecycle.get();
            if (state == LifecycleState.CLOSED || state == LifecycleState.FAILED) return false;
            if (!batch.getTerminalSettled().compareAndSet(false, true)) return false;
            if (!owner.runtime.acceptsCollection(batch.getCollectionGeneration())) return true;
            if (owner.runtime.acceptsDetail(batch.getDeliveryDetailGeneration()) && batch.getDeliveryStartNanos() != 0) {
                deliveryDuration.record((clock.nanoTime() - batch.getDeliveryStartNanos()) / 1_000_000D, stripe());
            }
            long logs = Math.max(0, batch.getCurrentBatchCount());
            long groups = groupCount(batch);
            synchronized (outcomeLock) {
                ownedLogs = Math.max(0, ownedLogs - logs);
                ownedGroups = Math.max(0, ownedGroups - groups);
                if (outcome == 0) {
                    terminalSuccessLogs = add(terminalSuccessLogs, logs);
                    terminalSuccessGroups = add(terminalSuccessGroups, groups);
                    lastSuccessNanos.set(clock.nanoTime());
                } else {
                    terminalFailureLogs = add(terminalFailureLogs, logs);
                    terminalFailureGroups = add(terminalFailureGroups, groups);
                    lastErrorNanos.set(clock.nanoTime());
                }
            }
            return true;
        }

        public void onTerminalDequeued() {
            synchronized (memoryLimiter.getAccountant()) {
                if (owner.callbackDepth == null) dec(callbackQueue, 1L); else owner.observePhysicalQueues();
            }
        }
        public void onCallbackStart() { incInt(callbacksInFlight); }
        public void onCallbackEnd(boolean normal, long nanos) {
            decInt(callbacksInFlight);
            if (!normal) recordError();
            if (isDetailed() && nanos >= 0) callbackDuration.record(nanos / 1_000_000D, stripe());
        }

        Canonical capture(Consistency consistency, long seq) {
            if (!isEnabled()) {
                if (consistency == Consistency.FINAL) memoryLimiter.forceReleaseAll();
                SnapshotAnchor anchor = new SnapshotAnchor(instanceId, ComponentType.PRODUCER,
                        clock.currentTimeMillis(), uptimeMs(), seq, lifecycle.get(), consistency, level,
                        capabilities, owner.runtime.getGeneration(), owner.runtime.getStartedAtUnixMs());
                return new Canonical(anchor, null, null, null, null, null, null, null);
            }
            Outcome outcome;
            ManagedMemoryAccountant.Capture memory;
            QueueCapture queues;
            boolean finalizationIncomplete = forcedFinalizationIncomplete.get();
            synchronized (memoryLimiter.getAccountant()) {
                ManagedMemoryAccountant.Capture beforeFinal = memoryLimiter.getAccountant().capture();
                synchronized (outcomeLock) {
                    if (consistency == Consistency.FINAL) {
                        finalizationIncomplete = finalizationIncomplete || hasFinalizationResidue(beforeFinal);
                        long ownedLogs = ownedLogsLocked(), ownedGroups = ownedGroupsLocked();
                        terminalDroppedLogs = add(terminalDroppedLogs, ownedLogs);
                        terminalDroppedGroups = add(terminalDroppedGroups, ownedGroups);
                        this.ownedLogs = this.ownedGroups = 0;
                        if (ownedLogs > 0 || ownedGroups > 0) recordError();
                        memoryLimiter.forceReleaseAll();
                    }
                    outcome = new Outcome(acceptedLogs, acceptedGroups, terminalSuccessLogs,
                            terminalSuccessGroups, terminalFailureLogs, terminalFailureGroups,
                            terminalDroppedLogs, terminalDroppedGroups);
                }
                memory = memoryLimiter.getAccountant().capture();
                queues = captureQueues();
            }
            List<CriticalFlag> flags = new ArrayList<>(2);
            if (saturated) flags.add(CriticalFlag.COUNTER_SATURATED);
            if (finalizationIncomplete) flags.add(CriticalFlag.FINALIZATION_INCOMPLETE);
            List<WorkerRoleStats> workers = workers();
            WorkerSummary workerSummary = workerSummary(workers);
            Long oldestPendingAge = queues.retry == 0L || queues.retryHeadEnqueueNanos == 0L
                    ? null : age(queues.retryHeadEnqueueNanos);
            ManagedMemorySummary memorySummary = new ManagedMemorySummary(memory.getLimitBytes(),
                    memory.getPayloadLimitBytes(), memory.getUsedBytes(), memory.getPayloadOwnedBytes(),
                    memory.getBoundedRuntimeBufferBytes(), memory.getHighWatermarkBytes(),
                    memory.getRejectedTotal(), memory.getPayloadAdmissionRejectedTotal(),
                    memory.getRuntimeBufferRejectedTotal());
            ProducerHealthSignals health = new ProducerHealthSignals(ageOptional(lastSuccessNanos.get()),
                    ageOptional(lastErrorNanos.get()), null, memorySummary.getPressure(),
                    memorySummary.getPayloadAdmissionPressure(), oldestPendingAge, workerSummary, flags);
            QueueSummary sendSummary = new QueueSummary(queues.send, null, queues.sendHwm, false);
            QueueSummary retrySummary = new QueueSummary(queues.retry, null, queues.retryHwm, false);
            ProducerOperationalStats operational = ProducerOperationalStats.builder()
                    .acceptedLogsTotal(outcome.acceptedLogs).terminalSuccessLogsTotal(outcome.successLogs)
                    .terminalFailureLogsTotal(outcome.failureLogs).terminalDroppedLogsTotal(outcome.droppedLogs)
                    .acceptedGroupsTotal(outcome.acceptedGroups).terminalSuccessGroupsTotal(outcome.successGroups)
                    .terminalFailureGroupsTotal(outcome.failureGroups).terminalDroppedGroupsTotal(outcome.droppedGroups)
                    .rejectedInvalidArgumentTotal(rejectedInvalid.get())
                    .rejectedMemoryFullTotal(rejectedMemory.get()).rejectedManagedAdmissionTotal(rejectedMemory.get())
                    .rejectedClosedTotal(rejectedClosed.get())
                    .rejectedCircuitOpenTotal(rejectedCircuit.get())
                    .sendCallsSuccessTotal(sendSuccess.get()).sendCallsFailureTotal(sendFailure.get())
                    .sendCallPayloadLogsTotal(sendPayloadLogs.get()).sendCallPayloadGroupsTotal(sendPayloadGroups.get())
                    .retriesScheduledTotal(retriesScheduled.get()).sendQueue(sendSummary).retryQueue(retrySummary)
                    .workers(workerSummary)
                    .aggregateBatches(queues.aggregate).aggregateGroups(aggregateGroupCount.get())
                    .sendCallsInFlight(sendInFlight.get()).callbacksPending(queues.callback)
                    .callbacksInFlight(callbacksInFlight.get()).build();
            SnapshotAnchor anchor = new SnapshotAnchor(instanceId, ComponentType.PRODUCER,
                    clock.currentTimeMillis(), uptimeMs(), seq, lifecycle.get(), consistency, level, capabilities,
                    owner.runtime.getGeneration(), owner.runtime.getStartedAtUnixMs());
            return new Canonical(anchor, health, operational, memorySummary,
                    isDetailed() ? WorkerDetails.forRoles(workers) : null,
                    isDetailed() ? new ProducerRetryDetails(retrySummary, retriesScheduled.get()) : null,
                    isDetailed() ? new ProducerLatencyHistograms(queueDelay.snapshot(), sendDuration.snapshot(),
                            deliveryDuration.snapshot(), callbackDuration.snapshot()) : null,
                    isDetailed() ? new ManagedMemoryBreakdown(memory.getIngressOwnedBytes(),
                            memory.getAggregateOwnedBytes(), memory.getSendOwnedBytes(),
                            memory.getRetryOwnedBytes(), memory.getBoundedRuntimeBufferBytes()) : null);
        }

        private boolean hasFinalizationResidue(ManagedMemoryAccountant.Capture memory) {
            return memory.getUsedBytes() != 0 || ingress.get() != 0 || aggregate.get() != 0
                    || sendQueue.get() != 0 || retryQueue.get() != 0 || callbackQueue.get() != 0
                    || sendInFlight.get() != 0 || callbacksInFlight.get() != 0
                    || moverRunning.get() != 0 || senderRunning.get() != 0
                    || callbackRunning.get() != 0;
        }

        private QueueCapture captureQueues() {
            long sendNow = owner.sendDepth == null ? sendQueue.get() : owner.sendDepth.getAsLong();
            long retryNow = owner.retryDepth == null ? retryQueue.get() : owner.retryDepth.getAsLong();
            long callbackNow = owner.callbackDepth == null ? callbackQueue.get() : owner.callbackDepth.getAsLong();
            return new QueueCapture(aggregate.get(), sendNow, retryNow, callbackNow,
                    Math.max(sendHwm.get(), sendNow), Math.max(retryHwm.get(), retryNow),
                    retryHeadEnqueueNanos.get());
        }

        private void observeDepth(AtomicLong depth, AtomicLong hwm, long current) {
            depth.set(Math.max(0, current));
            hwm.set(Math.max(hwm.get(), Math.max(0, current)));
        }

        private List<WorkerRoleStats> workers() {
            List<WorkerRoleStats> result = new ArrayList<>(4);
            result.add(new WorkerRoleStats(WorkerRole.DISPATCHER, 0, 0, 0));
            result.add(new WorkerRoleStats(WorkerRole.MOVER, 1, moverRunning.get(), 0));
            result.add(new WorkerRoleStats(WorkerRole.SENDER, senderThreads, senderRunning.get(), sendInFlight.get()));
            result.add(new WorkerRoleStats(WorkerRole.CALLBACK_DISPATCHER, 2, callbackRunning.get(), callbacksInFlight.get()));
            return result;
        }

        private static WorkerSummary workerSummary(List<WorkerRoleStats> roles) {
            long expected = 0, running = 0, inFlight = 0, missingCriticalRoles = 0;
            for (WorkerRoleStats role : roles) {
                inFlight += role.getInFlight();
                // The sender pool creates threads on demand; an idle sender is not a dead worker.
                if (role.getRole() == WorkerRole.SENDER) continue;
                expected += role.getExpected(); running += role.getRunning();
                if (role.getRunning() < role.getExpected()) missingCriticalRoles++;
            }
            return new WorkerSummary(expected, running, inFlight, missingCriticalRoles);
        }

        private long ownedLogsLocked() { return ownedLogs; }
        private long ownedGroupsLocked() { return ownedGroups; }
        private Long ageOptional(long nanos) { return nanos == 0 ? null : age(nanos); }
        private long age(long nanos) { return Math.max(0L, (clock.nanoTime() - nanos) / 1_000_000L); }
        private void recordError() {
            lastErrorNanos.set(clock.nanoTime());
        }
        private int stripe() { return (int) Thread.currentThread().getId(); }
        private static int groupCount(BatchLog batch) {
            return batch.getLogGroupList() == null ? 0 : batch.getLogGroupList().getLogGroupsCount();
        }
        private long add(long current, long delta) {
            if (delta <= 0) return current;
            if (current == Long.MAX_VALUE || delta > Long.MAX_VALUE - current) { saturated = true; return Long.MAX_VALUE; }
            return current + delta;
        }
        private void inc(AtomicLong value) { add(value, 1L); }
        private void add(AtomicLong value, long delta) {
            if (delta <= 0) return;
            while (true) {
                long current = value.get(); long next = add(current, delta);
                if (value.compareAndSet(current, next)) return;
            }
        }
        private void bump(AtomicLong value, AtomicLong hwm, long delta) {
            add(value, delta); long now = value.get();
            while (true) { long old = hwm.get(); if (old >= now || hwm.compareAndSet(old, now)) return; }
        }
        private static void dec(AtomicLong value, long delta) {
            while (true) { long current = value.get(); long next = Math.max(0L, current - Math.max(0L, delta));
                if (value.compareAndSet(current, next)) return; }
        }
        private static void incInt(AtomicInteger value) { value.incrementAndGet(); }
        private static void decInt(AtomicInteger value) { while (true) { int c = value.get(); if (c <= 0 || value.compareAndSet(c, c - 1)) return; } }
    }

    private static final class Canonical {
        final SnapshotAnchor anchor;
        final ProducerHealthSignals health;
        final ProducerOperationalStats operational;
        final ManagedMemorySummary memory;
        final WorkerDetails workers;
        final ProducerRetryDetails retry;
        final ProducerLatencyHistograms latency;
        final ManagedMemoryBreakdown memoryBreakdown;
        Canonical(SnapshotAnchor anchor, ProducerHealthSignals health,
                  ProducerOperationalStats operational, ManagedMemorySummary memory,
                  WorkerDetails workers, ProducerRetryDetails retry, ProducerLatencyHistograms latency,
                  ManagedMemoryBreakdown memoryBreakdown) {
            this.anchor = anchor; this.health = health; this.operational = operational;
            this.memory = memory; this.workers = workers; this.retry = retry;
            this.latency = latency; this.memoryBreakdown = memoryBreakdown;
        }
    }

    private static final class Outcome {
        final long acceptedLogs, acceptedGroups, successLogs, successGroups, failureLogs, failureGroups;
        final long droppedLogs, droppedGroups;
        Outcome(long acceptedLogs, long acceptedGroups, long successLogs, long successGroups,
                long failureLogs, long failureGroups, long droppedLogs, long droppedGroups) {
            this.acceptedLogs = acceptedLogs; this.acceptedGroups = acceptedGroups;
            this.successLogs = successLogs; this.successGroups = successGroups;
            this.failureLogs = failureLogs; this.failureGroups = failureGroups;
            this.droppedLogs = droppedLogs; this.droppedGroups = droppedGroups;
        }
    }

    private static final class QueueCapture {
        final long aggregate, send, retry, callback;
        final long sendHwm, retryHwm;
        final long retryHeadEnqueueNanos;

        QueueCapture(long aggregate, long send, long retry, long callback,
                     long sendHwm, long retryHwm, long retryHeadEnqueueNanos) {
            this.aggregate = Math.max(0L, aggregate);
            this.send = Math.max(0L, send);
            this.retry = Math.max(0L, retry);
            this.callback = Math.max(0L, callback);
            this.sendHwm = Math.max(this.send, sendHwm);
            this.retryHwm = Math.max(this.retry, retryHwm);
            this.retryHeadEnqueueNanos = Math.max(0L, retryHeadEnqueueNanos);
        }

    }
}
