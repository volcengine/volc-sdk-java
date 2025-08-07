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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static com.volcengine.model.tls.Const.ERROR_CONSUMER_HEARTBEAT_EXPIRED;
import static com.volcengine.model.tls.Const.LZ4;

public class LogConsumer {
    private static final Log LOG = LogFactory.getLog(LogConsumer.class);
    public static final int BACK_OFF_CODE = 429;

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

    private volatile boolean isTaskFinished;

    public LogConsumer(ConsumerImpl consumer, ConsumeShard consumeShard) {
        this.consumerConfig = consumer.consumerConfig;
        this.tlsClient = consumer.tlsClient;
        this.logProcessor = consumer.logProcessor;

        this.executor = consumer.executor;

        this.status = ConsumerStatus.PENDING;
        this.shard = consumeShard;

        this.statusLock = new ReentrantReadWriteLock();

        this.checkpointTracker = new CheckpointTracker(consumer, consumeShard);
    }

    public void run() {
        switch (loadStatus()) {
            case PENDING:
                setStatus(ConsumerStatus.INITIALIZING);
                executor.execute(() -> {
                    this.isTaskFinished = false;
                    try {
                        init();
                        setStatus(ConsumerStatus.READY_TO_FETCH);
                    } catch (Exception e) {
                        LOG.error("Init log consumer failed!", e);
                        setStatus(ConsumerStatus.PENDING);
                    } finally {
                        this.isTaskFinished = true;
                    }
                });
                break;
            case READY_TO_FETCH:
                setStatus(ConsumerStatus.FETCHING);
                executor.execute(() -> {
                    this.isTaskFinished = false;
                    try {
                        fetchData();
                        setStatus(ConsumerStatus.READY_TO_CONSUME);
                    } catch (LogException e) {
                        if (e.getErrorMessage().contains(ERROR_CONSUMER_HEARTBEAT_EXPIRED)) {
                            try {
                                this.checkpointTracker.uploadCheckpoint();
                            } catch (Exception ex) {
                                LOG.error("Upload checkpoint failed when consumer expired.", ex);
                            }
                            this.checkpointTracker.stop();
                            setStatus(ConsumerStatus.WAIT_FOR_RESTART);
                        } else if (e.getHttpCode() == BACK_OFF_CODE) {
                            setStatus(ConsumerStatus.BACKOFF);
                        } else {
                            LOG.error("Fetch log data failed!", e);
                            setStatus(ConsumerStatus.READY_TO_FETCH);
                        }
                    } catch (Exception e) {
                        LOG.error("Fetch data failed!", e);
                        setStatus(ConsumerStatus.READY_TO_FETCH);
                    } finally {
                        this.isTaskFinished = true;
                    }
                });
                break;
            case READY_TO_CONSUME:
                setStatus(ConsumerStatus.CONSUMING);
                executor.execute(() -> {
                    this.isTaskFinished = false;
                    try {
                        consume();
                        setStatus(ConsumerStatus.READY_TO_FETCH);
                    } catch (Exception e) {
                        LOG.error("consume error.", e);
                        setStatus(ConsumerStatus.READY_TO_CONSUME);
                    } finally {
                        this.isTaskFinished = true;
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

    public void stop() {
        int times = 0;
        while (!this.isTaskFinished && times++ < this.consumerConfig.getStopTimeout()) {
            ConsumerUtil.sleep(1000);
            LOG.debug("LogConsumer stop failed " + this.status + " times: " + times);
        }
        this.checkpointTracker.stop();

        try {
            this.checkpointTracker.uploadCheckpoint();
        } catch (Exception ex) {
            LOG.error("Upload checkpoint failed when received stop signal.", ex);
        }
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
        ConsumeLogsResponse resp = this.tlsClient.consumeLogs(req);

        this.currLogGroupList = resp.getLogGroupList();
        this.nextCheckpoint = resp.getXTlsCursor();
    }

    private void consume() {
        if (this.currLogGroupList == null || this.currLogGroupList.getLogGroupsCount() == 0) {
            return;
        }
        this.logProcessor.process(this.shard.getTopicID(), this.shard.getShardID(), this.currLogGroupList);

        this.checkpointTracker.setCheckpoint(new CheckpointInfo(this.nextCheckpoint, this.shard));
    }

    private boolean backoff() {
        Duration duration = Duration.between(this.lastBackoffTime, LocalDateTime.now());

        return duration.compareTo(Duration.ofSeconds(5)) <= 0;
    }
}
