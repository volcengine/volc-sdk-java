package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.request.ConsumerHeartbeatRequest;
import com.volcengine.model.tls.response.ConsumerHeartbeatResponse;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.stats.ConsumerStatsState;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HeartbeatTracker {
    private static final Log LOG = LogFactory.getLog(HeartbeatTracker.class);

    private final ConsumerImpl consumer;
    private final ConsumerConfig consumerConfig;
    private final TLSLogClient tlsClient;

    private List<ConsumeShard> shards;

    private ScheduledExecutorService executorService;
    private final Object lifecycleLock = new Object();
    private Lifecycle lifecycle = Lifecycle.NEW;
    private ReentrantReadWriteLock lock;
    /** Run identity used to fence late timer callbacks after a consumer restart. */
    private long workerRunEpoch;

    private final int intervalSecs;
    private final ConsumerStatsState statsState;

    public HeartbeatTracker(ConsumerImpl consumer) {
        this.consumer = consumer;
        this.consumerConfig = consumer.consumerConfig;
        this.tlsClient = consumer.tlsClient;
        this.lock = new ReentrantReadWriteLock();
        this.intervalSecs = consumer.consumerConfig.getHeartbeatIntervalInSecond();
        this.statsState = consumer.statsState;
        this.workerRunEpoch = consumer.workerRunEpoch();
    }

    public void start() {
        synchronized (lifecycleLock) {
            if (lifecycle == Lifecycle.RUNNING) {
                return;
            }
            if (lifecycle != Lifecycle.NEW) {
                throw new IllegalStateException("HeartbeatTracker is already stopped");
            }
            final ThreadFactory delegateThreadFactory = Executors.defaultThreadFactory();
            final long runEpoch = consumer.workerRunEpoch();
            this.workerRunEpoch = runEpoch;
            ScheduledExecutorService service = Executors.newScheduledThreadPool(1, runnable ->
                    delegateThreadFactory.newThread(() -> {
                        synchronized (consumer.workerLifecycleLock()) {
                            if (consumer.isWorkerRunEpochCurrent(runEpoch)) {
                                statsState.onHeartbeatWorkerStarted();
                            }
                        }
                        try {
                            runnable.run();
                        } finally {
                            synchronized (consumer.workerLifecycleLock()) {
                                if (consumer.isWorkerRunEpochCurrent(runEpoch)) {
                                    statsState.onHeartbeatWorkerStopped();
                                }
                            }
                        }
                    }));
            executorService = service;
            try {
                service.scheduleWithFixedDelay(new HeartbeatTask(), 0L,
                        this.intervalSecs, TimeUnit.SECONDS);
                lifecycle = Lifecycle.RUNNING;
                LOG.info("HeartbeatTracker starts to work, interval " + this.intervalSecs);
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

    public boolean stop() {
        final ScheduledExecutorService service;
        synchronized (lifecycleLock) {
            if (lifecycle == Lifecycle.NEW) {
                lifecycle = Lifecycle.STOPPED;
                return true;
            }
            if (lifecycle == Lifecycle.STOPPED) {
                return true;
            }
            lifecycle = Lifecycle.STOPPING;
            service = executorService;
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
            LOG.info("HeartbeatTracker stops.");
        } else {
            LOG.warn("HeartbeatTracker is still running after stop timeout.");
        }
        return terminated;
    }

    /**
     * Requests timer shutdown without waiting for the timer task. This path is used by a worker
     * failure and may itself be called from the heartbeat thread, so it must never join it.
     */
    void requestStop() {
        synchronized (lifecycleLock) {
            if (lifecycle == Lifecycle.NEW) {
                lifecycle = Lifecycle.STOPPED;
                return;
            }
            if (lifecycle == Lifecycle.STOPPED) {
                return;
            }
            lifecycle = Lifecycle.STOPPING;
            if (executorService != null) {
                executorService.shutdownNow();
            }
        }
    }

    private enum Lifecycle {
        NEW,
        RUNNING,
        STOPPING,
        STOPPED
    }

    List<ConsumeShard> getShards() {
        this.lock.readLock().lock();
        List<ConsumeShard> shards = this.shards;
        this.lock.readLock().unlock();

        return shards;
    }

    private void setShards(List<ConsumeShard> shards) {
        this.lock.writeLock().lock();
        this.shards = shards;
        this.lock.writeLock().unlock();
    }

    public synchronized void uploadHeartbeat() {
        final long runEpoch = workerRunEpoch;
        synchronized (lifecycleLock) {
            if ((lifecycle != Lifecycle.NEW && lifecycle != Lifecycle.RUNNING)
                    || !consumer.heartbeatRequestAllowed(runEpoch)) {
                return;
            }
        }
        long heartbeatToken = statsState.beginHeartbeat();
        String projectID = this.consumerConfig.getProjectID();
        String consumerGroupName = this.consumerConfig.getConsumerGroupName();
        String consumerName = this.consumerConfig.getConsumerName();
        ConsumerHeartbeatRequest req = new ConsumerHeartbeatRequest(projectID, consumerGroupName, consumerName);
        try {
            ConsumerHeartbeatResponse resp = this.tlsClient.consumerHeartbeat(req);
            setShards(resp.getShards());
            statsState.onHeartbeatCall(heartbeatToken, true);
        } catch (Exception e) {
            statsState.onHeartbeatCall(heartbeatToken, false);
            LOG.error(String.format("Error upload heartbeat, project %s, consumerGroupName %s, consumerName %s",
                    projectID,
                    consumerGroupName,
                    consumerName),
                    e);
        } catch (Error e) {
            // Fatal unchecked failures still close the metrics attempt, then remain visible to
            // the executor/caller instead of being swallowed as a recoverable heartbeat error.
            statsState.onHeartbeatCall(heartbeatToken, false);
            consumer.failRun(runEpoch, e);
            throw e;
        }
    }

    private class HeartbeatTask implements Runnable {
        @Override
        public void run() {
            uploadHeartbeat();
        }
    }
}
