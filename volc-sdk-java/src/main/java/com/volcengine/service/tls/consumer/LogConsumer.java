package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.CheckpointInfo;
import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.consumer.ConsumerStatus;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.ConsumeLogsRequest;
import com.volcengine.model.tls.request.DescribeCheckpointRequest;
import com.volcengine.model.tls.request.DescribeCursorRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.response.DescribeCheckpointResponse;
import com.volcengine.model.tls.response.DescribeCursorResponse;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.stats.ConsumerStatsState;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static com.volcengine.model.tls.Const.ERROR_CONSUMER_HEARTBEAT_EXPIRED;
import static com.volcengine.model.tls.Const.LZ4;

public class LogConsumer {
    private static final Log LOG = LogFactory.getLog(LogConsumer.class);
    public static final int BACK_OFF_CODE = 429;

    private final ConsumerImpl consumer;
    private ConsumerConfig consumerConfig;
    private TLSLogClient tlsClient;
    private LogProcessor logProcessor;

    private ExecutorService executor;

    private ConsumerStatus status;
    private final ConsumeShard shard;

    private String nextCheckpoint;
    private PutLogRequest.LogGroupList currLogGroupList;
    private LocalDateTime lastBackoffTime;

    private ReentrantReadWriteLock statusLock;

    private CheckpointTracker checkpointTracker;

    /** Linearizes task admission with stop and tracks actual execution termination. */
    private final Object taskLifecycleLock = new Object();
    private TrackedTask activeTask;
    private boolean taskAdmissionClosed;

    private final ConsumerStatsState statsState;
    /** Run identity captured when this shard worker is created. */
    private final long workerRunEpoch;
    /** Frozen once per worker so OFF remains a predictable, allocation-free observation branch. */
    /** Initial level is retained for the v1 OFF fast-path contract; runtime checks are dynamic. */
    private final boolean metricsEnabled;
    private volatile ConsumerStatsState.BatchSlot batchSlot;
    /** Guards the held batch so it is released exactly once across consume/revoke/stop races. */
    private volatile AtomicBoolean held;
    /** Monotonic nanoTime when the current held batch was received; start of dispatch-delay. */
    private volatile long dispatchStartNanos;

    public LogConsumer(ConsumerImpl consumer, ConsumeShard consumeShard) {
        this.consumer = consumer;
        this.consumerConfig = consumer.consumerConfig;
        this.tlsClient = consumer.tlsClient;
        this.logProcessor = consumer.logProcessor;

        this.executor = consumer.executor;

        this.status = ConsumerStatus.PENDING;
        this.shard = consumeShard;

        this.statusLock = new ReentrantReadWriteLock();

        this.checkpointTracker = new CheckpointTracker(consumer, consumeShard);
        this.statsState = consumer.statsState;
        this.workerRunEpoch = consumer.workerRunEpoch();
        this.metricsEnabled = statsState.isMetricsEnabled();
        this.batchSlot = metricsEnabled ? statsState.newBatchSlot() : null;
        this.held = metricsEnabled ? new AtomicBoolean(false) : null;
    }

    private void ensureObservationSlot(long collectionToken) {
        if (collectionToken == 0L || !statsState.isCollectionTokenCurrent(collectionToken)
                || batchSlot != null) {
            return;
        }
        synchronized (this) {
            if (statsState.isCollectionTokenCurrent(collectionToken) && batchSlot == null) {
                batchSlot = statsState.newBatchSlot();
                held = new AtomicBoolean(false);
            }
        }
    }

    /** Releases the held batch exactly once (CAS true->false), updating held/ready gauges. */
    private void releaseHeldBatch() {
        AtomicBoolean currentHeld = held;
        ConsumerStatsState.BatchSlot currentSlot = batchSlot;
        if (currentHeld == null || currentSlot == null) {
            return;
        }
        if (currentHeld.compareAndSet(true, false)) {
            statsState.onBatchReleased(currentSlot);
        }
    }

    private void executeTracked(Runnable task) {
        executeTracked(null, () -> {
            task.run();
            return null;
        });
    }

    private void executeTracked(ConsumerStatus runningStatus, TrackedOperation operation) {
        synchronized (taskLifecycleLock) {
            if (taskAdmissionClosed) {
                return;
            }
            if (activeTask != null) {
                throw new IllegalStateException("A shard task is already active");
            }
            if (runningStatus != null) {
                setStatus(runningStatus);
            }
            TrackedTask tracked = new TrackedTask(operation);
            activeTask = tracked;
            try {
                // Keep submission inside the lifecycle critical section: stop either observes the
                // admitted task or closes admission before any new task can be submitted.
                executor.execute(tracked);
            } catch (RuntimeException | Error failure) {
                tracked.cancelBeforeStartLocked();
                throw failure;
            }
        }
    }

    public void run() {
        switch (loadStatus()) {
            case PENDING:
                executeTracked(ConsumerStatus.INITIALIZING, () -> {
                    try {
                        init();
                        return ConsumerStatus.READY_TO_FETCH;
                    } catch (Exception e) {
                        LOG.error("Init log consumer failed!", e);
                        return ConsumerStatus.PENDING;
                    }
                });
                break;
            case READY_TO_FETCH:
                executeTracked(ConsumerStatus.FETCHING, () -> {
                    try {
                        fetchData();
                        return ConsumerStatus.READY_TO_CONSUME;
                    } catch (LogException e) {
                        if (e.getErrorMessage().contains(ERROR_CONSUMER_HEARTBEAT_EXPIRED)) {
                            if (!this.checkpointTracker.stop()) {
                                LOG.error("Checkpoint tracker did not stop when consumer expired.");
                            }
                            this.checkpointTracker.abandonPending();
                            // Heartbeat expired: this worker is abandoning its held batch.
                            releaseHeldBatch();
                            return ConsumerStatus.WAIT_FOR_RESTART;
                        } else if (e.getHttpCode() == BACK_OFF_CODE) {
                            statsState.onBackoff();
                            return ConsumerStatus.BACKOFF;
                        } else {
                            LOG.error("Fetch log data failed!", e);
                            return ConsumerStatus.READY_TO_FETCH;
                        }
                    } catch (Exception e) {
                        LOG.error("Fetch data failed!", e);
                        return ConsumerStatus.READY_TO_FETCH;
                    } finally {
                    }
                });
                break;
            case READY_TO_CONSUME:
                executeTracked(ConsumerStatus.CONSUMING, () -> {
                    try {
                        consume();
                        return ConsumerStatus.READY_TO_FETCH;
                    } catch (Exception e) {
                        LOG.error("consume error.", e);
                        return ConsumerStatus.READY_TO_CONSUME;
                    }
                });
                break;
            case BACKOFF:
                if (backoff()) {
                    setStatus(ConsumerStatus.BACKOFF);
                } else {
                    setStatus(ConsumerStatus.READY_TO_FETCH);
                }
                break;
            case INITIALIZING:
            case FETCHING:
            case CONSUMING:
            case WAIT_FOR_RESTART:
        }
    }

    public void setStatus(ConsumerStatus status) {
        this.statusLock.writeLock().lock();
        this.status = status;
        this.statusLock.writeLock().unlock();
    }

    public ConsumerStatus loadStatus() {
        this.statusLock.readLock().lock();
        ConsumerStatus status = this.status;
        this.statusLock.readLock().unlock();

        return status;
    }

    public boolean stop() {
        boolean interrupted = false;
        boolean taskTerminated;
        long timeoutNanos = TimeUnit.SECONDS.toNanos(this.consumerConfig.getStopTimeout());
        long deadline = System.nanoTime() + timeoutNanos;
        synchronized (taskLifecycleLock) {
            taskAdmissionClosed = true;
            if (activeTask != null) {
                activeTask.cancelBeforeStartLocked();
            }
            while (activeTask != null) {
                long remaining = deadline - System.nanoTime();
                if (remaining <= 0L) {
                    break;
                }
                try {
                    TimeUnit.NANOSECONDS.timedWait(taskLifecycleLock, remaining);
                } catch (InterruptedException e) {
                    interrupted = true;
                    break;
                }
            }
            taskTerminated = activeTask == null;
        }
        if (!taskTerminated) {
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            return false;
        }
        // Release any batch still held by this worker exactly once on shutdown/revoke.
        releaseHeldBatch();
        boolean checkpointStopped = this.checkpointTracker.stop();
        if (taskTerminated && checkpointStopped) {
            this.checkpointTracker.abandonPending();
            clearPayloadReferences();
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
        return taskTerminated && checkpointStopped;
    }

    private void clearPayloadReferences() {
        this.currLogGroupList = null;
        this.nextCheckpoint = null;
        this.lastBackoffTime = null;
        this.dispatchStartNanos = 0L;
    }

    private final class TrackedTask implements Runnable {
        private final TrackedOperation delegate;
        private boolean started;
        private boolean cancelled;

        private TrackedTask(TrackedOperation delegate) {
            this.delegate = delegate;
        }

        @Override
        public void run() {
            synchronized (taskLifecycleLock) {
                if (cancelled) {
                    return;
                }
                started = true;
            }
            synchronized (consumer.workerLifecycleLock()) {
                if (consumer.isWorkerRunEpochCurrent(workerRunEpoch)) {
                    statsState.onShardTaskStarted();
                }
            }
            ConsumerStatus nextStatus = null;
            try {
                nextStatus = delegate.run();
            } catch (Error failure) {
                consumer.failRun(workerRunEpoch, failure);
                throw failure;
            } finally {
                synchronized (consumer.workerLifecycleLock()) {
                    if (consumer.isWorkerRunEpochCurrent(workerRunEpoch)) {
                        statsState.onShardTaskStopped();
                    }
                }
                synchronized (taskLifecycleLock) {
                    if (activeTask == this) {
                        try {
                            if (nextStatus != null) {
                                setStatus(nextStatus);
                            }
                        } finally {
                            activeTask = null;
                            taskLifecycleLock.notifyAll();
                        }
                    }
                }
            }
        }

        /** Must be called with taskLifecycleLock held. */
        private boolean cancelBeforeStartLocked() {
            if (started || cancelled) {
                return false;
            }
            cancelled = true;
            if (activeTask == this) {
                activeTask = null;
            }
            taskLifecycleLock.notifyAll();
            return true;
        }
    }

    private interface TrackedOperation {
        ConsumerStatus run();
    }

    private void init() throws LogException {
        this.checkpointTracker.start();

        String projectID = this.consumerConfig.getProjectID();
        String topicID = this.shard.getTopicID();
        int shardID = this.shard.getShardID();
        String consumerGroupName = this.consumerConfig.getConsumerGroupName();

        try {
            DescribeCheckpointRequest req = new DescribeCheckpointRequest(projectID, topicID, shardID, consumerGroupName);
            DescribeCheckpointResponse resp = this.tlsClient.describeCheckPoint(req);

            if (!resp.getCheckpoint().isEmpty()) {
                this.nextCheckpoint = resp.getCheckpoint();
                return;
            }
        } catch (LogException e) {
            LOG.error("Initializing log consumer failed in getting checkpoint.");
            throw e;
        }

        try {
            DescribeCursorRequest req = new DescribeCursorRequest(topicID, shardID, this.consumerConfig.getConsumeFrom());
            DescribeCursorResponse resp = this.tlsClient.describeCursor(req);

            this.nextCheckpoint = resp.getCursor();
        } catch (LogException e) {
            LOG.error("Initializing log consumer failed in getting cursor.");
            throw e;
        }
    }

    private void fetchData() throws LogException {
        long fetchToken = statsState.beginFetch();
        long fetchDetailToken = statsState.beginFetchDetail();
        try {
            fetchData(fetchToken, fetchDetailToken);
        } finally {
            statsState.onFetchEnd(fetchToken);
        }
    }

    private void fetchData(long fetchToken, long fetchDetailToken) throws LogException {
        this.lastBackoffTime = LocalDateTime.now();

        ConsumeLogsRequest req = new ConsumeLogsRequest();
        req.setTopicId(this.shard.getTopicID());
        req.setShardId(this.shard.getShardID());
        req.setCursor(this.nextCheckpoint);
        req.setLogGroupCount(this.consumerConfig.getMaxFetchLogGroupCount());
        req.setCompression(this.consumerConfig.getCompressType());
        req.setConsumerGroupName(this.consumerConfig.getConsumerGroupName());
        req.setConsumerName(this.consumerConfig.getConsumerName());
        req.setOrigin(this.consumerConfig.isOrigin());
        long startNanos = fetchDetailToken != 0L ? System.nanoTime() : 0L;
        ConsumeLogsResponse resp;
        try {
            resp = this.tlsClient.consumeLogs(req);
        } catch (LogException e) {
            statsState.onFetchCall(fetchToken, fetchDetailToken, false, 0, 0,
                    startNanos == 0L ? 0L : System.nanoTime() - startNanos);
            throw e;
        } catch (RuntimeException | Error e) {
            // The attempt began before the client call. Preserve the unchecked business failure,
            // but close its observation boundary exactly like a checked transport failure.
            statsState.onFetchCall(fetchToken, fetchDetailToken, false, 0, 0,
                    startNanos == 0L ? 0L : System.nanoTime() - startNanos);
            throw e;
        }

        this.currLogGroupList = resp.getLogGroupList();
        this.nextCheckpoint = resp.getXTlsCursor();
        int groups = this.currLogGroupList == null ? 0 : this.currLogGroupList.getLogGroupsCount();
        boolean observedFetch = statsState.isCollectionTokenCurrent(fetchToken);
        long logs = observedFetch ? countLogs(this.currLogGroupList) : 0L;
        statsState.onFetchCall(fetchToken, fetchDetailToken, true, groups, logs,
                startNanos == 0L ? 0L : System.nanoTime() - startNanos);

        // A non-empty batch is now held by this worker (once, until released on consume/revoke/stop).
        if (!observedFetch || groups <= 0) {
            return;
        }
        ensureObservationSlot(fetchToken);
        AtomicBoolean currentHeld = held;
        ConsumerStatsState.BatchSlot currentSlot = batchSlot;
        if (currentHeld != null && currentSlot != null
                && currentHeld.compareAndSet(false, true)) {
            if (!statsState.onBatchHeld(currentSlot, groups, logs, fetchToken)) {
                currentHeld.set(false);
            }
        }
    }

    private static long countLogs(PutLogRequest.LogGroupList list) {
        if (list == null) {
            return 0;
        }
        long total = 0;
        for (PutLogRequest.LogGroup group : list.getLogGroupsList()) {
            total += group.getLogsCount();
        }
        return total;
    }

    private void consume() {
        if (this.currLogGroupList == null || this.currLogGroupList.getLogGroupsCount() == 0) {
            return;
        }
        long processToken = statsState.beginProcessCollection();
        long processDetailToken = statsState.beginProcessDetail();
        ensureObservationSlot(processToken);
        ConsumerStatsState.BatchSlot currentSlot = batchSlot;
        int groups = processToken == 0L ? 0 : this.currLogGroupList.getLogGroupsCount();
        long logs = processToken == 0L ? 0L : countLogs(this.currLogGroupList);
        boolean observed = currentSlot != null && statsState.onProcessStart(
                currentSlot, processToken, processDetailToken, groups, logs);
        long acceptedProcessDetailToken = observed ? statsState.processDetailToken(currentSlot) : 0L;
        boolean ok = false;
        long startNanos = acceptedProcessDetailToken != 0L ? System.nanoTime() : 0L;
        try {
            this.logProcessor.process(this.shard.getTopicID(), this.shard.getShardID(), this.currLogGroupList);
            ok = true;
        } finally {
            if (observed) {
                statsState.onProcessEnd(currentSlot, ok, acceptedProcessDetailToken,
                        startNanos == 0L ? 0L : System.nanoTime() - startNanos);
            }
        }

        this.checkpointTracker.setCheckpoint(new CheckpointInfo(this.nextCheckpoint, this.shard));
        // The batch has been processed and its checkpoint recorded: release the hold exactly once.
        releaseHeldBatch();
    }

    private boolean backoff() {
        Duration duration = Duration.between(this.lastBackoffTime, LocalDateTime.now());

        return duration.compareTo(Duration.ofSeconds(5)) <= 0;
    }
}
