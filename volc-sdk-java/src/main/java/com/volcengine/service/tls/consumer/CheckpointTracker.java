package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.consumer.CheckpointInfo;
import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.request.ModifyCheckpointRequest;
import com.volcengine.service.tls.TLSLogClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CheckpointTracker {
    private static final Log LOG = LogFactory.getLog(CheckpointTracker.class);

    private final ConsumerConfig consumerConfig;
    private final TLSLogClient tlsClient;

    private String checkpoint;
    private String lastCheckpoint;

    private final ConsumeShard consumeShard;

    private ScheduledExecutorService executorService;


    public CheckpointTracker(ConsumerImpl consumer, ConsumeShard consumeShard) {
        this.consumerConfig = consumer.consumerConfig;
        this.tlsClient = consumer.tlsClient;
        this.consumeShard = consumeShard;
        this.lastCheckpoint = "";
    }

    void start() {
        LOG.debug("CheckpointTracker starts to work, intervalSecond "+ this.consumerConfig.getFlushCheckpointIntervalInSecond());
        executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleWithFixedDelay(() -> {
            try {
                uploadCheckpoint();
            } catch (Exception e) {
                LOG.error("Upload checkpoint with fixed delay failed.", e);
            }
        }, 0L, this.consumerConfig.getFlushCheckpointIntervalInSecond(), TimeUnit.SECONDS);
    }

    public synchronized void setCheckpoint(CheckpointInfo checkpointInfo) {
        this.checkpoint = checkpointInfo.getCheckpoint();
    }

    public synchronized void uploadCheckpoint() throws Exception {
        String projectID = this.consumerConfig.getProjectID();
        String consumerGroupName = this.consumerConfig.getConsumerGroupName();
        String topicID = this.consumeShard.getTopicID();
        int shardID = this.consumeShard.getShardID();
        if (this.checkpoint != null && !this.lastCheckpoint.equals(this.checkpoint)) {
            ModifyCheckpointRequest req = new ModifyCheckpointRequest(projectID, topicID, shardID, consumerGroupName, checkpoint);
            this.tlsClient.modifyCheckPoint(req);
            this.lastCheckpoint = checkpoint;
        }
    }

    public void stop() {
        executorService.shutdown();
        try {
            executorService.awaitTermination(this.consumerConfig.getStopTimeout(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
        LOG.debug("CheckpointTracker stops.");
    }
}
