package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.request.ConsumerHeartbeatRequest;
import com.volcengine.model.tls.response.ConsumerHeartbeatResponse;
import com.volcengine.service.tls.TLSLogClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HeartbeatTracker {
    private static final Log LOG = LogFactory.getLog(HeartbeatTracker.class);

    private final ConsumerConfig consumerConfig;
    private final TLSLogClient tlsClient;

    private List<ConsumeShard> shards;

    private ScheduledExecutorService executorService;
    private ReentrantReadWriteLock lock;

    private final int intervalSecs;

    public HeartbeatTracker(ConsumerImpl consumer) {
        this.consumerConfig = consumer.consumerConfig;
        this.tlsClient = consumer.tlsClient;
        this.lock = new ReentrantReadWriteLock();
        this.intervalSecs = consumer.consumerConfig.getHeartbeatIntervalInSecond();
    }

    public void start() {
        executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleWithFixedDelay(new HeartbeatTask(), 0L,
                this.intervalSecs, TimeUnit.SECONDS);
        LOG.info("HeartbeatTracker starts to work, interval " + this.intervalSecs);
    }

    public void stop() {
        executorService.shutdown();
        try {
            executorService.awaitTermination(this.consumerConfig.getStopTimeout(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
        LOG.info("HeartbeatTracker stops.");
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
        String projectID = this.consumerConfig.getProjectID();
        String consumerGroupName = this.consumerConfig.getConsumerGroupName();
        String consumerName = this.consumerConfig.getConsumerName();
        ConsumerHeartbeatRequest req = new ConsumerHeartbeatRequest(projectID, consumerGroupName, consumerName);
        try {
            ConsumerHeartbeatResponse resp = this.tlsClient.consumerHeartbeat(req);
            setShards(resp.getShards());
        } catch (Exception e) {
            LOG.error(String.format("Error upload heartbeat, project %s, consumerGroupName %s, consumerName %s",
                    projectID,
                    consumerGroupName,
                    consumerName),
                    e);
        }
    }

    private class HeartbeatTask implements Runnable {
        @Override
        public void run() {
            uploadHeartbeat();
        }
    }
}
