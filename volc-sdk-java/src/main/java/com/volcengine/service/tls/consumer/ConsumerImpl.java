package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ConsumerGroup;
import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.consumer.ConsumerStatus;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateConsumerGroupRequest;
import com.volcengine.model.tls.request.DescribeConsumerGroupsRequest;
import com.volcengine.model.tls.response.DescribeConsumerGroupsResponse;
import com.volcengine.model.tls.stats.ConsumerStatsSnapshot;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.TLSUtil;
import com.volcengine.service.tls.stats.ConsumerStatsState;
import com.volcengine.service.tls.stats.StatsClock;
import com.volcengine.service.tls.stats.StatsInstanceId;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static com.volcengine.model.tls.Const.ERROR_CONSUMER_GROUP_ALREADY_EXISTS;

public class ConsumerImpl implements Consumer {
    private static final Log LOG = LogFactory.getLog(ConsumerImpl.class);

    ConsumerConfig consumerConfig;
    TLSLogClient tlsClient;
    LogProcessor logProcessor;

    ExecutorService executor;
    private Thread runThread;

    private HeartbeatTracker heartbeatTracker;
    private Map<String, LogConsumer> workerMap;
    private final Object workerLifecycleLock = new Object();
    private final Object lifecycleLock = new Object();
    private Lifecycle lifecycle = Lifecycle.NEW;
    private boolean clientClosed;
    /** Monotonic identity captured by worker wrappers to fence late callbacks after restart. */
    private volatile long workerRunEpoch;

    private volatile boolean isStop;
    private volatile Throwable runFailure;

    final ConsumerStatsState statsState;

    public ConsumerImpl(ConsumerConfig consumerConfig, LogProcessor logProcessor) throws LogException {
        consumerConfig.validateConsumerConfig();

        this.consumerConfig = consumerConfig;
        this.tlsClient = ClientBuilder.newClient(consumerConfig.getClientConfig());
        this.tlsClient.setHttpClientConnectionManager(TLSUtil.createHttpClientConnectionManager(
                        consumerConfig.getClientConfig().isVerifySsl()),
                true);
        this.logProcessor = logProcessor;

        // Local health state (default OFF). Explicit-view snapshots are constant-time projections.
        this.statsState = new ConsumerStatsState(
                consumerConfig.getMetricsLevel(),
                Math.max(1, consumerConfig.getTopicIDList() == null ? 1 : consumerConfig.getTopicIDList().size()),
                StatsInstanceId.forConsumer(),
                StatsClock.SYSTEM);

        this.heartbeatTracker = new HeartbeatTracker(this);

        LOG.info(String.format("TLS consumer %s is initialized.", this.consumerConfig.getConsumerName()));
    }

    @Override
    public ConsumerStatsSnapshot getStats(StatsOptions options) {
        return statsState.snapshot(options);
    }

    @Override
    public void setMetricsLevel(MetricsLevel level) {
        synchronized (lifecycleLock) {
            if (lifecycle != Lifecycle.RUNNING) {
                throw new IllegalStateException("consumer metrics level change requires a running consumer");
            }
            statsState.setMetricsLevel(level);
        }
    }

    @Override
    public void start() throws LogException {
        synchronized (lifecycleLock) {
            if (lifecycle == Lifecycle.STARTING || lifecycle == Lifecycle.RUNNING
                    || lifecycle == Lifecycle.STOPPING) {
                throw new IllegalStateException("TLS consumer is already running or starting");
            }
            if (lifecycle == Lifecycle.TERMINATED && runFailure != null) {
                throw new IllegalStateException("TLS consumer cannot restart after a failed run",
                        runFailure);
            }
            final long runEpoch;
            synchronized (workerLifecycleLock) {
                if (lifecycle == Lifecycle.TERMINATED) {
                    // stop() has returned only after all owned workers terminated. The stats
                    // runtime and worker epoch advance as one lifecycle boundary.
                    statsState.restart();
                }
                runEpoch = ++workerRunEpoch;
                isStop = false;
                runFailure = null;
            }
            lifecycle = Lifecycle.STARTING;
            try {
                if (lifecycle == Lifecycle.STARTING && clientClosed) {
                    this.tlsClient = createClient();
                    this.clientClosed = false;
                }
                this.heartbeatTracker = new HeartbeatTracker(this);
                init();
                final ThreadFactory delegateThreadFactory = Executors.defaultThreadFactory();
                this.executor = Executors.newCachedThreadPool(runnable ->
                        delegateThreadFactory.newThread(() -> {
                            synchronized (workerLifecycleLock) {
                                if (isWorkerRunEpochCurrent(runEpoch)) {
                                    statsState.onShardWorkerStarted();
                                }
                            }
                            try {
                                runnable.run();
                            } finally {
                                synchronized (workerLifecycleLock) {
                                    if (isWorkerRunEpochCurrent(runEpoch)) {
                                        statsState.onShardWorkerStopped();
                                    }
                                }
                            }
                        }));
                this.runThread = new Thread(() -> run(runEpoch));
                statsState.markStarted();
                this.runThread.start();
                lifecycle = Lifecycle.RUNNING;
            } catch (Throwable failure) {
                failRun(runEpoch, failure);
                lifecycle = Lifecycle.STOPPING;
                try {
                    stopInternal();
                } catch (RuntimeException cleanupFailure) {
                    // stopInternal reports the startup root as its cause. Do not build an
                    // indirect cause/suppressed cycle around the same throwable.
                    if (cleanupFailure.getCause() != failure) {
                        failure.addSuppressed(cleanupFailure);
                    }
                }
                rethrowStartFailure(failure);
            }
        }
    }

    private TLSLogClient createClient() throws LogException {
        TLSLogClient client = ClientBuilder.newClient(consumerConfig.getClientConfig());
        client.setHttpClientConnectionManager(TLSUtil.createHttpClientConnectionManager(
                        consumerConfig.getClientConfig().isVerifySsl()),
                true);
        return client;
    }

    @Override
    public void stop() {
        synchronized (lifecycleLock) {
            if (lifecycle == Lifecycle.TERMINATED) {
                return;
            }
            lifecycle = Lifecycle.STOPPING;
            synchronized (workerLifecycleLock) {
                isStop = true;
            }
            stopInternal();
        }
    }

    private void stopInternal() {
        LOG.info(String.format("TLS consumer %s is ready to stop.", this.consumerConfig.getConsumerName()));

        statsState.markClosing();
        synchronized (workerLifecycleLock) {
            this.isStop = true;
        }
        List<String> liveComponents = new ArrayList<>();
        if (!stopRunThread()) {
            liveComponents.add("main loop");
        }

        RuntimeException workerStopFailure = null;
        List<LogConsumer> retryWorkers = new ArrayList<>();
        List<LogConsumer> workers = workerMap == null
                ? new ArrayList<>()
                : new ArrayList<>(workerMap.values());
        for (LogConsumer worker: workers) {
            try {
                if (!worker.stop()) {
                    retryWorkers.add(worker);
                }
            } catch (RuntimeException failure) {
                liveComponents.add("worker cleanup");
                if (workerStopFailure == null) {
                    workerStopFailure = failure;
                }
            }
        }

        if (!stopExecutor(this.executor)) {
            liveComponents.add("shard worker");
        } else {
            // ThreadPoolExecutor can signal TERMINATED before the ThreadFactory wrapper's
            // outer finally decrements the observability gauge. Termination itself is the
            // business-worker lifecycle boundary; publish it before freezing FINAL.
            synchronized (workerLifecycleLock) {
                statsState.onShardExecutorTerminated();
            }
        }
        // shutdownNow may have cooperatively terminated tasks that were still running at the
        // first worker barrier. Only a second real termination check may release held batches,
        // stop checkpoints and clear payload references.
        for (LogConsumer worker : retryWorkers) {
            try {
                if (!worker.stop()) {
                    liveComponents.add("shard/checkpoint worker");
                }
            } catch (RuntimeException failure) {
                liveComponents.add("worker cleanup");
                if (workerStopFailure == null) {
                    workerStopFailure = failure;
                }
            }
        }
        if (!this.heartbeatTracker.stop()) {
            liveComponents.add("heartbeat worker");
        }

        RuntimeException closeFailure = null;
        if (!clientClosed) {
            try {
                this.tlsClient.close();
                clientClosed = true;
            } catch (RuntimeException e) {
                closeFailure = e;
            }
        }

        Throwable backgroundFailure = runFailure;
        boolean teardownComplete = liveComponents.isEmpty() && closeFailure == null
                && workerStopFailure == null;
        if (teardownComplete) {
            if (workerMap != null) {
                workerMap.clear();
            }
            // Terminal cleanup is not a membership event: expose zero ownership without
            // manufacturing a rebalance counter increment.
            statsState.onAssignment(0, false);
        }
        if (teardownComplete && backgroundFailure == null) {
            statsState.markClosedAndFreeze();
            lifecycle = Lifecycle.TERMINATED;
            LOG.info(String.format("TLS consumer %s is stopped.",
                    this.consumerConfig.getConsumerName()));
            return;
        }

        statsState.markFailed();
        lifecycle = teardownComplete ? Lifecycle.TERMINATED : Lifecycle.STOPPING;
        String message;
        if (backgroundFailure != null) {
            message = "TLS consumer main loop/rebalance failed: "
                    + backgroundFailure.getMessage();
        } else if (!liveComponents.isEmpty()) {
            message = "TLS consumer workers are still running or failed cleanup: "
                    + String.join(", ", liveComponents);
        } else {
            message = "TLS consumer client failed to close";
        }
        Throwable cause = backgroundFailure != null ? backgroundFailure
                : workerStopFailure != null ? workerStopFailure : closeFailure;
        LOG.error(message, cause);
        throw cause == null
                ? new IllegalStateException(message)
                : new IllegalStateException(message, cause);
    }

    private void rethrowStartFailure(Throwable failure) throws LogException {
        if (failure instanceof LogException) {
            throw (LogException) failure;
        }
        if (failure instanceof RuntimeException) {
            throw (RuntimeException) failure;
        }
        if (failure instanceof Error) {
            throw (Error) failure;
        }
        throw new IllegalStateException("TLS consumer failed to start", failure);
    }

    private boolean stopRunThread() {
        if (runThread == null || !runThread.isAlive()) {
            return true;
        }
        boolean interrupted = false;
        long timeoutMillis = TimeUnit.SECONDS.toMillis(this.consumerConfig.getStopTimeout());
        try {
            runThread.join(timeoutMillis);
        } catch (InterruptedException e) {
            interrupted = true;
        }
        if (runThread.isAlive()) {
            runThread.interrupt();
            try {
                runThread.join(timeoutMillis);
            } catch (InterruptedException e) {
                interrupted = true;
            }
        }
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
        return !runThread.isAlive();
    }

    private boolean stopExecutor(ExecutorService service) {
        if (service == null) {
            return true;
        }
        service.shutdown();
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
        return terminated;
    }

    @Override
    public void resetAccessKeyToken(String accessKeyID, String accessKeySecret, String securityToken) {
        this.tlsClient.resetAccessKeyToken(accessKeyID, accessKeySecret, securityToken);
    }

    private void init() throws LogException {
        String projectID = this.consumerConfig.getProjectID();
        List<String> topicIDList = this.consumerConfig.getTopicIDList();
        String consumerGroupName = this.consumerConfig.getConsumerGroupName();
        int heartbeatTTL = 3 * this.consumerConfig.getHeartbeatIntervalInSecond();
        boolean orderedConsume = this.consumerConfig.isOrderedConsume();

        boolean consumerGroupExists = false;

        DescribeConsumerGroupsRequest describeConsumerGroupsRequest = new DescribeConsumerGroupsRequest();
        describeConsumerGroupsRequest.setProjectID(projectID);
        describeConsumerGroupsRequest.setConsumerGroupName(consumerGroupName);
        DescribeConsumerGroupsResponse describeConsumerGroupsResponse = this.tlsClient.describeConsumerGroups(describeConsumerGroupsRequest);

        if (describeConsumerGroupsResponse.getConsumerGroups() != null) {
            for (ConsumerGroup consumerGroup : describeConsumerGroupsResponse.getConsumerGroups()) {
                if (consumerGroup.getConsumerGroupName().equals(consumerGroupName)) {
                    consumerGroupExists = true;
                    break;
                }
            }
        }

        if (!consumerGroupExists) {
            CreateConsumerGroupRequest req = new CreateConsumerGroupRequest(projectID, topicIDList, consumerGroupName, heartbeatTTL, orderedConsume);

            try {
                this.tlsClient.createConsumerGroup(req);
            } catch (LogException e) {
                if (!e.getErrorMessage().contains(ERROR_CONSUMER_GROUP_ALREADY_EXISTS)) {
                    LOG.error("Calling CreateConsumerGroup failed.");
                    throw e;
                }
            }
        }

        this.workerMap = new ConcurrentHashMap<>();
        heartbeatTracker.start();
    }

    private void run() {
        run(workerRunEpoch);
    }

    private void run(long runEpoch) {
        synchronized (workerLifecycleLock) {
            if (!isWorkerRunEpochCurrent(runEpoch)) {
                return;
            }
            statsState.onMainLoopWorkerStarted();
        }
        try {
            LOG.info("Consumer starts to work.");
            int period = this.consumerConfig.getDataFetchIntervalInMillisecond();
            while (!isStop) {
                for (Map.Entry<String, LogConsumer> entry: this.workerMap.entrySet()) {
                    if (entry.getValue().loadStatus() == ConsumerStatus.WAIT_FOR_RESTART) {
                        try {
                            this.heartbeatTracker.uploadHeartbeat();
                            break;
                        } catch (Exception ex) {
                            LOG.error("Upload heartbeat failed when consumer expired.", ex);
                        }
                    }
                }

                List<ConsumeShard> shards = heartbeatTracker.getShards();
                handleShards(shards);
                ConsumerUtil.sleep(period);
            }
            LOG.info("Consumer ends to work.");
        } catch (Throwable failure) {
            failRun(runEpoch, failure);
            LOG.error("Consumer main loop failed.", failure);
        } finally {
            synchronized (workerLifecycleLock) {
                if (isWorkerRunEpochCurrent(runEpoch)) {
                    statsState.onMainLoopWorkerStopped();
                }
            }
        }
    }

    long workerRunEpoch() {
        return workerRunEpoch;
    }

    boolean isWorkerRunEpochCurrent(long runEpoch) {
        return workerRunEpoch == runEpoch;
    }

    /**
     * Records the first failure for the active run and requests cooperative shutdown. This is
     * deliberately package-private so worker and heartbeat wrappers share one failure boundary.
     * The epoch fence prevents callbacks from an older run from changing the current run.
     */
    void failRun(long runEpoch, Throwable failure) {
        HeartbeatTracker tracker;
        synchronized (workerLifecycleLock) {
            if (failure == null || !isWorkerRunEpochCurrent(runEpoch)) {
                return;
            }
            if (runFailure != null) {
                return;
            }
            runFailure = failure;
            isStop = true;
            tracker = heartbeatTracker;
        }
        // Do not wait while holding workerLifecycleLock: the heartbeat task may be the caller.
        statsState.markClosing();
        if (tracker != null) {
            tracker.requestStop();
        }
    }

    boolean heartbeatRequestAllowed(long runEpoch) {
        return isWorkerRunEpochCurrent(runEpoch) && !isStop && runFailure == null;
    }

    Object workerLifecycleLock() {
        return workerLifecycleLock;
    }

    private void handleShards(List<ConsumeShard> shards) {
        if (shards == null || isStop) {
            return;
        }

        boolean assignmentChanged = false;
        Map<String, ConsumeShard> shardMap = new HashMap<>();
        for (ConsumeShard shard: shards) {
            shardMap.put(shard.getTopicID() + shard.getShardID(), shard);
        }

        List<String> invalidShards = new ArrayList<>();
        for (String shardName: this.workerMap.keySet()) {
            if (!shardMap.containsKey(shardName)) {
                invalidShards.add(shardName);
            }
        }
        for (String shardName: invalidShards) {
            LogConsumer logConsumer = this.workerMap.get(shardName);
            if (logConsumer == null) {
                continue;
            }
            if (!logConsumer.stop()) {
                if (isStop) {
                    return;
                }
                throw new IllegalStateException(
                        "Shard task or checkpoint tracker did not stop while retiring shard "
                                + shardName + " during rebalance");
            }
            this.workerMap.remove(shardName, logConsumer);
            assignmentChanged = true;
        }

        for (String key: shardMap.keySet()) {
            LogConsumer current = this.workerMap.get(key);
            if (current != null && current.loadStatus() == ConsumerStatus.WAIT_FOR_RESTART) {
                if (!current.stop()) {
                    if (isStop) {
                        return;
                    }
                    throw new IllegalStateException(
                            "Shard task or checkpoint tracker did not stop while restarting shard "
                                    + key + " during rebalance");
                }
                this.workerMap.remove(key, current);
                current = null;
            }
            if (current == null) {
                synchronized (workerLifecycleLock) {
                    if (isStop) {
                        break;
                    }
                    this.workerMap.put(key, new LogConsumer(this, shardMap.get(key)));
                }
                assignmentChanged = true;
            }
        }

        for (LogConsumer worker: this.workerMap.values()) {
            worker.run();
        }
        statsState.onAssignment(this.workerMap.size(), assignmentChanged);
    }

    private enum Lifecycle {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED
    }
}
