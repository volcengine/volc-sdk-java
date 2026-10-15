package com.volcengine.model.tls.producer;

import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.RetryPolicy;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.stats.MetricsLevel;
import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Getter
@ToString(exclude = "clientConfig")
public class ProducerConfig {
    public static final int DEFAULT_TOTAL_SIZE_IN_BYTES = 100 * 1024 * 1024;
    public static final int DEFAULT_MAX_THREAD_COUNT = 50;
    public static final int DEFAULT_MAX_BATCH_SIZE = 512 * 1024;
    public static final int MAX_BATCH_SIZE = 9 * 1024 * 1024 + 512 * 1024;
    public static final int DEFAULT_MAX_BATCH_COUNT = 4096;
    public static final int MAX_BATCH_COUNT = 32768;
    public static final int MAX_LOG_GROUP_COUNT = 10000;
    public static final int DEFAULT_LINGER_MS = 2000;
    public static final int TOO_MANY_REQUEST_ERROR = 429;
    public static final int EXTERNAL_ERROR = 500;
    public static final int MIN_WAIT_MS = 100;
    public static final int DEFAULT_RETRY_COUNT = 10;
    public static final int DEFAULT_RESERVED_ATTEMPTS = DEFAULT_RETRY_COUNT + 1;
    public static final int MAX_RETRY_COUNT = 4;
    public static final int MAX_RESERVED_ATTEMPTS = MAX_RETRY_COUNT + 1;
    public static final int AVAILABLE_PROCESSORS = Math.max(Runtime.getRuntime().availableProcessors(), 1);
    public static final int MAX_THREAD_COUNT = DEFAULT_MAX_THREAD_COUNT;
    public static final int DEFAULT_THREAD_COUNT = Math.min(AVAILABLE_PROCESSORS, DEFAULT_MAX_THREAD_COUNT);
    public static final int DEFAULT_SHARD_COUNT = 2;
    public static final long DEFAULT_BLOCK_MS = 60 * 1000L;
    public static final long DEFAULT_MAX_PRODUCER_MEMORY_BYTES = 2L * DEFAULT_TOTAL_SIZE_IN_BYTES;
    private int totalSizeInBytes = DEFAULT_TOTAL_SIZE_IN_BYTES;
    private long maxProducerMemoryBytes = DEFAULT_MAX_PRODUCER_MEMORY_BYTES;
    private boolean maxProducerMemoryBytesExplicit;
    private int maxThreadCount = DEFAULT_THREAD_COUNT;
    private int maxBatchSizeBytes = DEFAULT_MAX_BATCH_SIZE;
    private int maxBatchCount = DEFAULT_MAX_BATCH_COUNT;
    private int lingerMs = DEFAULT_LINGER_MS;
    private long maxBlockMs = DEFAULT_BLOCK_MS;
    private int retryCount = DEFAULT_RETRY_COUNT;
    private int maxReservedAttempts = DEFAULT_RESERVED_ATTEMPTS;
    private ClientConfig clientConfig;
    private int shardCount = DEFAULT_SHARD_COUNT;
    private boolean enableNanosecond = false;
    private RetryMode retryMode = RetryMode.PRODUCER_MANAGED;
    private FailurePolicy failurePolicy = FailurePolicy.RETRY_THEN_CALLBACK;
    private CircuitBreakerConfig circuitBreakerConfig = new CircuitBreakerConfig();
    // Local health observation (default OFF preserves historical behavior). Read once at start;
    // the running Producer treats these as immutable.
    private MetricsLevel metricsLevel = MetricsLevel.OFF;
    private final static Log log = LogFactory.getLog(ProducerConfig.class);

    public ProducerConfig(String endpoint, String region, String accessKey, String accessSecret, String token) {
        clientConfig = new ClientConfig(endpoint, region, accessKey, accessSecret, token);
    }
    public ProducerConfig(String endpoint, String region, String accessKey, String accessSecret) {
        this(endpoint, region, accessKey, accessSecret, null);
    }
    public ProducerConfig(String endpoint, String region, String apiKey) {
        clientConfig = new ClientConfig(endpoint, region, null, null);
        clientConfig.setApiKey(apiKey);
    }
    public ProducerConfig(String endpoint, String region, String apiKey,
                          String accessKey, String accessSecret, String token) {
        clientConfig = new ClientConfig(endpoint, region, accessKey, accessSecret, token);
        clientConfig.setApiKey(apiKey);
    }
    public static boolean needRetry(int httpCode) {
        return httpCode == TOO_MANY_REQUEST_ERROR || httpCode >= EXTERNAL_ERROR || httpCode == 0;
    }

    public void validConfig() throws LogException {
        totalSizeInBytes = (int) validNumber(totalSizeInBytes, 1, Integer.MAX_VALUE, DEFAULT_TOTAL_SIZE_IN_BYTES);
        if (!maxProducerMemoryBytesExplicit) {
            maxProducerMemoryBytes = 2L * totalSizeInBytes;
        } else {
            maxProducerMemoryBytes = validNumber(maxProducerMemoryBytes, totalSizeInBytes, Long.MAX_VALUE, 2L * totalSizeInBytes);
        }
        maxThreadCount = (int) validNumber(maxThreadCount, 1, MAX_THREAD_COUNT, DEFAULT_THREAD_COUNT);
        maxBatchSizeBytes = (int) validNumber(maxBatchSizeBytes, 1, MAX_BATCH_SIZE, DEFAULT_MAX_BATCH_SIZE);
        maxBatchCount = (int) validNumber(maxBatchCount, 1, MAX_BATCH_COUNT, DEFAULT_MAX_BATCH_COUNT);
        lingerMs = (int) validNumber(lingerMs, MIN_WAIT_MS, Integer.MAX_VALUE, DEFAULT_LINGER_MS);
        maxBlockMs = validNumber(maxBlockMs, 0, Integer.MAX_VALUE, DEFAULT_BLOCK_MS);
        retryCount = (int) validNumber(retryCount, 1, MAX_RETRY_COUNT, DEFAULT_RETRY_COUNT);
        maxReservedAttempts = (int) validNumber(maxReservedAttempts, 2, MAX_RESERVED_ATTEMPTS, DEFAULT_RESERVED_ATTEMPTS);
        shardCount = (int) validNumber(shardCount, 1, Integer.MAX_VALUE, DEFAULT_SHARD_COUNT);
        // Producer is the only retry owner. A single Producer attempt must map to one HTTP attempt;
        // otherwise client replay makes retry counters, reasons and terminal ownership ambiguous.
        if (retryMode == null) {
            retryMode = RetryMode.PRODUCER_MANAGED;
        } else if (retryMode != RetryMode.PRODUCER_MANAGED) {
            throw new LogException("InvalidArgument",
                    "only PRODUCER_MANAGED retry mode is supported", null);
        }
        if (failurePolicy == null) {
            failurePolicy = FailurePolicy.RETRY_THEN_CALLBACK;
        }
        if (circuitBreakerConfig == null) {
            circuitBreakerConfig = new CircuitBreakerConfig();
        }
        // Normalize possibly-null observation config to OFF so the running Producer never NPEs.
        metricsLevel = MetricsLevel.normalize(metricsLevel);
        if (!isValidClientConfig(clientConfig)) {
            throw invalidClientConfig();
        }
        normalizeProducerManagedRetry();
    }

    private void normalizeProducerManagedRetry() {
        RetryPolicy retryPolicy = clientConfig.getRetryPolicy();
        if (retryPolicy == null) {
            retryPolicy = RetryPolicy.defaultPolicy();
        }
        retryPolicy = retryPolicy.normalize();
        retryPolicy.setMaxAttempts(1);
        clientConfig.setRetryPolicy(retryPolicy);
    }

    private boolean isValidClientConfig(ClientConfig clientConfig) {
        if (clientConfig == null || StringUtils.isEmpty(clientConfig.getEndpoint()) || StringUtils.isEmpty(clientConfig.getRegion())) {
            return false;
        }
        boolean hasApiKey = StringUtils.isNotEmpty(clientConfig.getApiKey());
        boolean hasAkSk = StringUtils.isNotEmpty(clientConfig.getAccessKeyId()) && StringUtils.isNotEmpty(clientConfig.getAccessKeySecret());
        return hasApiKey || hasAkSk;
    }

    private long validNumber(Number field, Number min, Number max, Number originDefault) {
        long fieldValue = Long.parseLong(String.valueOf(field));
        long minValue = Long.parseLong(String.valueOf(min));
        long maxValue = Long.parseLong(String.valueOf(max));
        long defaultValue = Long.parseLong(String.valueOf(originDefault));
        if (fieldValue > maxValue || fieldValue < minValue) {
            return defaultValue;
        }
        return fieldValue;
    }

    public void setTotalSizeInBytes(int totalSizeInBytes) throws LogException {
        if (totalSizeInBytes <= 0) {
            throw new LogException("InvalidArgument", "totalSizeInBytes must be greater than zero,actual:" + totalSizeInBytes, null);
        }
        this.totalSizeInBytes = totalSizeInBytes;
        if (maxProducerMemoryBytes < totalSizeInBytes) {
            this.maxProducerMemoryBytes = 2L * totalSizeInBytes;
        }
    }

    public void setMaxProducerMemoryBytes(long maxProducerMemoryBytes) throws LogException {
        if (maxProducerMemoryBytes <= 0) {
            throw new LogException("InvalidArgument", "maxProducerMemoryBytes must be greater than zero,actual:" + maxProducerMemoryBytes, null);
        }
        this.maxProducerMemoryBytes = maxProducerMemoryBytes;
        this.maxProducerMemoryBytesExplicit = true;
    }

    public void setMaxThreadCount(int maxThreadCount) throws LogException {
        if (maxThreadCount <= 0 || maxThreadCount > MAX_THREAD_COUNT) {
            throw new LogException("InvalidArgument", String.format("maxThreadCount must between 1 to %d,actual:%d", MAX_THREAD_COUNT, maxThreadCount), null);
        }
        this.maxThreadCount = maxThreadCount;
    }

    public void setMaxBatchSizeBytes(int maxBatchSizeBytes) throws LogException {
        if (maxBatchSizeBytes <= 0 || maxBatchSizeBytes > MAX_BATCH_SIZE) {
            throw new LogException("InvalidArgument", String.format("maxBatchSizeBytes must between 1 to %d,actual:%d", MAX_BATCH_SIZE, maxBatchSizeBytes), null);
        }
        this.maxBatchSizeBytes = maxBatchSizeBytes;
    }

    public void setMaxBatchCount(int maxBatchCount) throws LogException {
        if (maxBatchCount <= 0 || maxBatchCount > MAX_BATCH_COUNT) {
            throw new LogException("InvalidArgument", String.format("maxBatchCount must between 1 to %d,actual:%d", MAX_BATCH_COUNT, maxBatchCount), null);
        }
        this.maxBatchCount = maxBatchCount;
    }

    public void setLingerMs(int lingerMs) throws LogException {
        if (lingerMs < MIN_WAIT_MS) {
            throw new LogException("InvalidArgument", String.format("maxWaitMs must be greater than %d,actual:%d", MIN_WAIT_MS, totalSizeInBytes), null);
        }
        this.lingerMs = lingerMs;
    }

    public void setRetryCount(int retryCount) throws LogException {
        if (retryCount <= 0 || retryCount > MAX_RETRY_COUNT) {
            throw new LogException("InvalidArgument", String.format("retryCount must between 1 to %d,actual:%d", MAX_RETRY_COUNT, retryCount), null);
        }
        this.retryCount = retryCount;
    }

    public void setMaxReservedAttempts(int maxReservedAttempts) throws LogException {
        if (maxReservedAttempts < 2 || maxReservedAttempts > MAX_RESERVED_ATTEMPTS) {
            throw new LogException("InvalidArgument", String.format("maxReservedAttempts must between 2 to %d,actual:%d", MAX_RESERVED_ATTEMPTS, maxReservedAttempts), null);
        }
        this.maxReservedAttempts = maxReservedAttempts;
    }


    public void setClientConfig(ClientConfig clientConfig) throws LogException {
        if (!isValidClientConfig(clientConfig)) {
            throw invalidClientConfig();
        }
        this.clientConfig = clientConfig;
    }

    private static LogException invalidClientConfig() {
        return new LogException("InvalidArgument",
                "client config must include endpoint, region, and API key or access key credentials", null);
    }

    public void setShardCount(int shardCount) throws LogException {
        if (shardCount <= 0) {
            throw new LogException("InvalidArgument", "shardCount must be greater than zero,actual:" + shardCount, null);
        }
        this.shardCount = shardCount;
    }

    public void setMaxBlockMs(long maxBlockMs) throws LogException {
        if (maxBlockMs < 0) {
            throw new LogException("InvalidArgument", "maxBlockMs must be greater or equal than zero,actual:" + maxBlockMs, null);
        }
        this.maxBlockMs = maxBlockMs;
    }

    /**
     * Selects the supported Producer-owned retry mode; null selects the default.
     * @throws IllegalArgumentException if legacy nested client retries are requested
     */
    public void setRetryMode(RetryMode retryMode) {
        if (retryMode == RetryMode.LEGACY_DOUBLE_RETRY) {
            throw new IllegalArgumentException("only PRODUCER_MANAGED retry mode is supported");
        }
        this.retryMode = retryMode == null ? RetryMode.PRODUCER_MANAGED : retryMode;
    }

    public void setFailurePolicy(FailurePolicy failurePolicy) {
        this.failurePolicy = failurePolicy == null ? FailurePolicy.RETRY_THEN_CALLBACK : failurePolicy;
    }

    public void setCircuitBreakerConfig(CircuitBreakerConfig circuitBreakerConfig) {
        this.circuitBreakerConfig = circuitBreakerConfig == null ? new CircuitBreakerConfig() : circuitBreakerConfig;
    }

    public void setEnableNanosecond(boolean enableNanosecond) {
        this.enableNanosecond = enableNanosecond;
    }

    /** Enables/adjusts local health metrics. Null normalizes to {@link MetricsLevel#OFF}. */
    public void setMetricsLevel(MetricsLevel metricsLevel) {
        this.metricsLevel = MetricsLevel.normalize(metricsLevel);
    }

    public void checkBatchSize(int batchSize) throws LogException {
        if (batchSize > MAX_BATCH_SIZE) {
            throw new LogException("Invalid Arguments", "log batch size " + batchSize + " is larger than MAX_BATCH_SIZE " + MAX_BATCH_SIZE, null);
        }
        if (batchSize > getTotalSizeInBytes()) {
            throw new LogException("Invalid Arguments", "log batch size " + batchSize + " is larger than DEFAULT_TOTAL_SIZE_IN_BYTES " + DEFAULT_TOTAL_SIZE_IN_BYTES, null);
        }
    }
}
