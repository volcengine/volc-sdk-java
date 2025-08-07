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
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.TLSUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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

    private volatile boolean isStop;

    public ConsumerImpl(ConsumerConfig consumerConfig, LogProcessor logProcessor) throws LogException {
        consumerConfig.validateConsumerConfig();

        this.consumerConfig = consumerConfig;
        this.tlsClient = ClientBuilder.newClient(consumerConfig.getClientConfig());
        this.tlsClient.setHttpClient(HttpClients.custom()
                .setConnectionManager(TLSUtil.createHttpClientConnectionManager())
                .disableContentCompression().build());
        this.logProcessor = logProcessor;

        this.heartbeatTracker = new HeartbeatTracker(this);

        LOG.info(String.format("TLS consumer %s is initialized.", this.consumerConfig.getConsumerName()));
    }

    @Override
    public void start() throws LogException {
        init();
        this.executor = Executors.newCachedThreadPool();
        this.runThread = new Thread(this::run);
        this.runThread.start();
    }

    @Override
    public void stop() {
        LOG.info(String.format("TLS consumer %s is ready to stop.", this.consumerConfig.getConsumerName()));

        this.isStop = true;
        try {
            this.runThread.join();
        } catch (InterruptedException e) {
            this.runThread.interrupt();
        }

        for (LogConsumer worker: workerMap.values()) {
            worker.stop();
        }
        this.executor.shutdown();
        try {
            executor.awaitTermination(this.consumerConfig.getStopTimeout(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LOG.info("TLS consumer executor stop failed.");
            executor.shutdownNow();
        }

        this.heartbeatTracker.stop();
        this.tlsClient.close();

        LOG.info(String.format("TLS consumer %s is stopped.", this.consumerConfig.getConsumerName()));
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

        heartbeatTracker.start();
        this.isStop= false;
        this.workerMap = new HashMap<>();
    }

    private void run() {
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
    }

    private void handleShards(List<ConsumeShard> shards) {
        if (shards == null) {
            return;
        }

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
            logConsumer.stop();
            this.workerMap.remove(shardName);
        }

        for (String key: shardMap.keySet()) {
            if (!this.workerMap.containsKey(key) || this.workerMap.get(key).loadStatus() == ConsumerStatus.WAIT_FOR_RESTART) {
                this.workerMap.put(key, new LogConsumer(this, shardMap.get(key)));
            }
        }

        for (LogConsumer worker: this.workerMap.values()) {
            worker.run();
        }
    }
}
