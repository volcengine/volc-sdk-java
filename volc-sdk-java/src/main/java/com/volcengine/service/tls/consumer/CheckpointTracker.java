package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.CheckpointInfo;
import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.request.ModifyCheckpointRequest;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.stats.ConsumerStatsState;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class CheckpointTracker {
    private static final Log LOG = LogFactory.getLog(CheckpointTracker.class);

    interface ExecutorFactory {
        ScheduledExecutorService create(ThreadFactory threadFactory);
    }

    private enum Lifecycle {
        NEW,
        RUNNING,
        STOPPING,
        STOPPED
    }

    private final ConsumerConfig consumerConfig;
    private final TLSLogClient tlsClient;
    private final ConsumerImpl consumer;
    private final ExecutorFactory executorFactory;
    private final Object lifecycleLock = new Object();
    private Lifecycle lifecycle = Lifecycle.NEW;

    private String checkpoint;
    private String lastCheckpoint;

    private final ConsumeShard consumeShard;

    private ScheduledExecutorService executorService;

    private final ConsumerStatsState statsState;
    /** Per-shard clean/dirty marker so checkpoint_pending counts at most one per shard. */
    private final AtomicBoolean dirty = new AtomicBoolean(false);
    /** Serializes transport calls without blocking setCheckpoint() while network I/O is in flight. */
    private final Object uploadLock = new Object();


    public CheckpointTracker(ConsumerImpl consumer, ConsumeShard consumeShard) {
        this(consumer, consumeShard,
                threadFactory -> Executors.newSingleThreadScheduledExecutor(threadFactory));
    }

    CheckpointTracker(ConsumerImpl consumer, ConsumeShard consumeShard,
                      ExecutorFactory executorFactory) {
        this.consumer = consumer;
        this.consumerConfig = consumer.consumerConfig;
        this.tlsClient = consumer.tlsClient;
        this.consumeShard = consumeShard;
        this.lastCheckpoint = "";
        this.statsState = consumer.statsState;
        this.executorFactory = Objects.requireNonNull(executorFactory, "executorFactory");
    }

    void start() {
        synchronized (lifecycleLock) {
            if (lifecycle != Lifecycle.NEW) {
                return;
            }
            LOG.debug("CheckpointTracker starts to work, intervalSecond "+ this.consumerConfig.getFlushCheckpointIntervalInSecond());
            final ThreadFactory delegateThreadFactory = Executors.defaultThreadFactory();
            final long runEpoch = consumer.workerRunEpoch();
            ScheduledExecutorService service = executorFactory.create(runnable ->
                    delegateThreadFactory.newThread(() -> {
                        synchronized (consumer.workerLifecycleLock()) {
                            if (consumer.isWorkerRunEpochCurrent(runEpoch)) {
                                statsState.onCheckpointWorkerStarted();
                            }
                        }
                        try {
                            runnable.run();
                        } finally {
                            synchronized (consumer.workerLifecycleLock()) {
                                if (consumer.isWorkerRunEpochCurrent(runEpoch)) {
                                    statsState.onCheckpointWorkerStopped();
                                }
                            }
                        }
                    }));
            executorService = Objects.requireNonNull(service, "executorService");
            lifecycle = Lifecycle.RUNNING;
            try {
                service.scheduleWithFixedDelay(() -> {
                    try {
                        uploadCheckpoint();
                    } catch (Exception e) {
                        LOG.error("Upload checkpoint with fixed delay failed.", e);
                    }
                }, 0L, this.consumerConfig.getFlushCheckpointIntervalInSecond(), TimeUnit.SECONDS);
            } catch (RuntimeException | Error failure) {
                lifecycle = Lifecycle.STOPPING;
                service.shutdownNow();
                if (service.isTerminated()) {
                    lifecycle = Lifecycle.STOPPED;
                }
                throw failure;
            }
        }
    }

    public synchronized void setCheckpoint(CheckpointInfo checkpointInfo) {
        String newCheckpoint = checkpointInfo.getCheckpoint();
        this.checkpoint = newCheckpoint;
        if (newCheckpoint == null) {
            // Clearing the next cursor cancels pending work, not a transport call already in
            // flight. Its completion still records the call outcome but must not clear twice.
            if (dirty.compareAndSet(true, false)) {
                statsState.onCheckpointCleared(this);
            }
            return;
        }
        // Mark this shard's checkpoint dirty on the clean->dirty transition only, so checkpoint_pending
        // counts at most one per shard (a small bounded gauge) rather than growing per consumed batch.
        if (!newCheckpoint.equals(this.lastCheckpoint)
                && dirty.compareAndSet(false, true)) {
            statsState.onCheckpointDirty(this);
        }
    }

    public void uploadCheckpoint() throws Exception {
        synchronized (uploadLock) {
            uploadCheckpointSerially();
        }
    }

    private void uploadCheckpointSerially() throws Exception {
        String projectID = this.consumerConfig.getProjectID();
        String consumerGroupName = this.consumerConfig.getConsumerGroupName();
        String topicID = this.consumeShard.getTopicID();
        int shardID = this.consumeShard.getShardID();
        final String checkpoint;
        final String persistedCheckpoint;
        synchronized (this) {
            checkpoint = this.checkpoint;
            persistedCheckpoint = this.lastCheckpoint;
        }
        if (checkpoint != null && !Objects.equals(persistedCheckpoint, checkpoint)) {
            long checkpointToken = statsState.beginCheckpointCall();
            long checkpointDetailToken = statsState.beginCheckpointDetail();
            statsState.onCheckpointFlushInFlight(checkpointToken, 1);
            long startNanos = checkpointDetailToken != 0L ? System.nanoTime() : 0L;
            boolean ok = false;
            try {
                ModifyCheckpointRequest req = new ModifyCheckpointRequest(projectID, topicID, shardID, consumerGroupName, checkpoint);
                this.tlsClient.modifyCheckPoint(req);
                ok = true;
            } finally {
                synchronized (this) {
                    if (ok) {
                        this.lastCheckpoint = checkpoint;
                        // A newer cursor may arrive while the network call is in flight. In that
                        // case keep the marker dirty so the newer cursor remains pending.
                        if (Objects.equals(this.checkpoint, checkpoint)) {
                            // Physical marker cleanup belongs to the currently accepted
                            // generation, even when this transport call's token is stale after
                            // an OFF -> CORE transition. Keep it separate from call accounting.
                            if (dirty.compareAndSet(true, false)) {
                                statsState.onCheckpointCleared(this);
                            }
                        } else if (this.checkpoint != null && dirty.compareAndSet(false, true)) {
                            // The uploaded cursor was superseded after the call started. Publish
                            // the marker and its ledger dirty transition under the same lock so a
                            // newer setCheckpoint cannot be cleaned by this old completion.
                            statsState.onCheckpointDirty(this);
                        }
                    }
                    // Keep checkpoint marker state and its clean/dirty ledger publication
                    // linearized; setCheckpoint uses the same this -> runtime lock order.
                    statsState.onCheckpointFlush(checkpointToken, checkpointDetailToken, ok, false,
                            this, startNanos == 0L ? 0L : System.nanoTime() - startNanos);
                }
                statsState.onCheckpointFlushInFlight(checkpointToken, -1);
            }
        }
    }

    public boolean stop() {
        final ScheduledExecutorService service;
        final boolean initiateStop;
        synchronized (lifecycleLock) {
            if (lifecycle == Lifecycle.NEW) {
                lifecycle = Lifecycle.STOPPED;
                return true;
            }
            if (lifecycle == Lifecycle.STOPPED) {
                return true;
            }
            service = executorService;
            initiateStop = lifecycle == Lifecycle.RUNNING;
            lifecycle = Lifecycle.STOPPING;
            if (initiateStop) {
                // Serialize the final best-effort flush on the owned executor. A transport call
                // that ignores interruption is visible to the same bounded termination barrier.
                service.submit(() -> {
                    try {
                        uploadCheckpoint();
                    } catch (Exception e) {
                        LOG.error("Final checkpoint upload failed.", e);
                    }
                });
            }
            service.shutdown();
        }

        boolean interrupted = false;
        boolean terminated = false;
        try {
            terminated = service.awaitTermination(
                    this.consumerConfig.getStopTimeout(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            interrupted = true;
        }
        if (!terminated) {
            service.shutdownNow();
            try {
                terminated = service.awaitTermination(
                        this.consumerConfig.getStopTimeout(), TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                interrupted = true;
            }
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
        if (terminated) {
            synchronized (lifecycleLock) {
                lifecycle = Lifecycle.STOPPED;
            }
            LOG.debug("CheckpointTracker stops.");
        } else {
            LOG.warn("CheckpointTracker is still running after stop timeout.");
        }
        return terminated;
    }

    /**
     * Retires this tracker after its owner has made the final upload attempt. A normal active
     * failure deliberately stays pending for retry; retirement removes the no-longer-actionable
     * marker so rebalance churn cannot grow the health state without bound.
     */
    public void abandonPending() {
        dirty.set(false);
        statsState.onCheckpointAbandoned(this);
    }
}
