package com.volcengine.model.tls.consumer;

import java.util.List;

import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static com.volcengine.model.tls.Const.*;

@Getter
@ToString
public class ConsumerConfig {
    private static final Log log = LogFactory.getLog(ConsumerConfig.class);

    private static final String DEFAULT_CONSUME_FROM = "begin";
    private static final int DEFAULT_HEARTBEAT_INTERVAL_IN_SECOND = 20;
    private static final int DEFAULT_DATA_FETCH_INTERVAL_IN_MILLISECOND = 200;
    private static final int DEFAULT_FLUSH_CHECKPOINT_INTERVAL_IN_SECOND = 5;
    private static final int DEFAULT_MAX_FETCH_LOG_GROUP_COUNT = 100;
    private static final int DEFAULT_STOP_TIMEOUT = 15;

    private ClientConfig clientConfig;

    private String projectID;
    private String consumerGroupName;
    private List<String> topicIDList;
    private String consumerName;

    private String consumeFrom;
    private int heartbeatIntervalInSecond;
    private int dataFetchIntervalInMillisecond;
    private int flushCheckpointIntervalInSecond;
    private int maxFetchLogGroupCount;
    private boolean orderedConsume;
    private int stopTimeout;
    private boolean origin;
    private String compressType;

    public ConsumerConfig(String endpoint, String region, String accessKeyId, String accessKeySecret) {
        this(endpoint, region, accessKeyId, accessKeySecret, null);
    }

    public ConsumerConfig(String endpoint, String region, String accessKeyId, String accessKeySecret, String securityToken) {
        this.clientConfig = new ClientConfig(endpoint, region, accessKeyId, accessKeySecret, securityToken);
        this.consumeFrom = DEFAULT_CONSUME_FROM;
        this.heartbeatIntervalInSecond = DEFAULT_HEARTBEAT_INTERVAL_IN_SECOND;
        this.dataFetchIntervalInMillisecond = DEFAULT_DATA_FETCH_INTERVAL_IN_MILLISECOND;
        this.flushCheckpointIntervalInSecond = DEFAULT_FLUSH_CHECKPOINT_INTERVAL_IN_SECOND;
        this.maxFetchLogGroupCount = DEFAULT_MAX_FETCH_LOG_GROUP_COUNT;
        this.orderedConsume = false;
        this.stopTimeout = DEFAULT_STOP_TIMEOUT;
        this.origin = true;
        this.compressType = LZ4;
    }

    public void validateConsumerConfig() throws LogException {
        checkClientConfig(clientConfig);

        checkEmptyString(projectID, PROJECT_ID_UPPERCASE);
        checkEmptyString(consumerGroupName, CONSUMER_GROUP_NAME);
        checkEmptyString(consumerName, CONSUMER_NAME);
        if (topicIDList == null || topicIDList.isEmpty()) {
            throw new LogException(INVALID_ARGUMENT, "TopicIDList should not be empty.", null);
        }
        for (String topicID: topicIDList) {
            checkEmptyString(topicID, TOPIC_ID_UPPERCASE);
        }

        checkEmptyString(consumeFrom, CONSUME_FROM);
        checkIntValueRange(heartbeatIntervalInSecond, 1, 300, HEARTBEAT_INTERVAL_IN_SECOND);
        checkIntValueRange(dataFetchIntervalInMillisecond, 1, 300000, DATA_FETCH_INTERVAL_IN_MILLISECOND);
        checkIntValueRange(flushCheckpointIntervalInSecond, 1, 300, FLUSH_CHECKPOINT_INTERVAL_IN_SECOND);
        checkIntValueRange(maxFetchLogGroupCount, 1, 1000, MAX_FETCH_LOG_GROUP_COUNT);
        checkIntValueRange(stopTimeout, 1, 300, STOP_TIMEOUT);
    }

    public void setClientConfig(ClientConfig clientConfig) throws LogException {
        checkClientConfig(clientConfig);
        this.clientConfig = clientConfig;
    }

    private void checkClientConfig(ClientConfig clientConfig) throws LogException {
        if (clientConfig == null || StringUtils.isEmpty(clientConfig.getEndpoint()) || StringUtils.isEmpty(clientConfig.getRegion())
                || StringUtils.isEmpty(clientConfig.getAccessKeyId()) || StringUtils.isEmpty(clientConfig.getAccessKeySecret())) {
            throw new LogException(INVALID_ARGUMENT, String.valueOf(clientConfig), null);
        }
    }

    public void setProjectID(String projectID) throws LogException {
        checkEmptyString(projectID, PROJECT_ID_UPPERCASE);
        this.projectID = projectID;
    }

    public void setConsumerGroupName(String consumerGroupName) throws LogException {
        checkEmptyString(consumerGroupName, CONSUMER_GROUP_NAME);
        this.consumerGroupName = consumerGroupName;
    }

    public void setTopicIDList(List<String> topicIDList) throws LogException {
        if (topicIDList == null || topicIDList.isEmpty()) {
            throw new LogException(INVALID_ARGUMENT, "TopicIDList should not be empty.", null);
        }
        for (String topicID: topicIDList) {
            checkEmptyString(topicID, TOPIC_ID_UPPERCASE);
        }
        this.topicIDList = topicIDList;
    }

    public void setConsumerName(String consumerName) throws LogException {
        checkEmptyString(consumerName, CONSUMER_NAME);
        this.consumerName = consumerName;
    }

    public void setConsumeFrom(String consumeFrom) throws LogException {
        checkEmptyString(consumeFrom, CONSUME_FROM);
        this.consumeFrom = consumeFrom;
    }

    public void setHeartbeatIntervalInSecond(int heartbeatIntervalInSecond) throws LogException {
        checkIntValueRange(heartbeatIntervalInSecond, 1, 300, HEARTBEAT_INTERVAL_IN_SECOND);
        this.heartbeatIntervalInSecond = heartbeatIntervalInSecond;
    }

    public void setDataFetchIntervalInMillisecond(int dataFetchIntervalInMillisecond) throws LogException {
        checkIntValueRange(dataFetchIntervalInMillisecond, 1, 300000, DATA_FETCH_INTERVAL_IN_MILLISECOND);
        this.dataFetchIntervalInMillisecond = dataFetchIntervalInMillisecond;
    }

    public void setFlushCheckpointIntervalInSecond(int flushCheckpointIntervalInSecond) throws LogException {
        checkIntValueRange(flushCheckpointIntervalInSecond, 1, 300, FLUSH_CHECKPOINT_INTERVAL_IN_SECOND);
        this.flushCheckpointIntervalInSecond = flushCheckpointIntervalInSecond;
    }

    public void setMaxFetchLogGroupCount(int maxFetchLogGroupCount) throws LogException {
        checkIntValueRange(maxFetchLogGroupCount, 1, 1000, MAX_FETCH_LOG_GROUP_COUNT);
        this.maxFetchLogGroupCount = maxFetchLogGroupCount;
    }

    public void setOrderedConsume(boolean orderedConsume) {
        this.orderedConsume = orderedConsume;
    }

    public void setStopTimeout(int stopTimeout) {
        this.stopTimeout = stopTimeout;
    }

    public void setOrigin(boolean origin) {
        this.origin = origin;
    }

    public void setCompressType(String compressType) {
        this.compressType = compressType;
    }

    private void checkEmptyString(String str, String field) throws LogException {
        if (StringUtils.isEmpty(str)) {
            throw new LogException(INVALID_ARGUMENT, field + " should not be empty.", null);
        }
    }

    private void checkIntValueRange(int value, int lower, int upper, String field) throws LogException {
        if (value < lower || value > upper) {
            throw new LogException(INVALID_ARGUMENT, field + String.format(" value should between %d and %d", lower, upper), null);
        }
    }
}
