package com.volcengine.service.tls;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.util.AdaptorUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.TLS;

public class ProducerImpl implements Producer {
    private static final Log LOG = LogFactory.getLog(ProducerImpl.class);
    private ProducerConfig producerConfig;
    private final LogDispatcher dispatcher;
    private static final AtomicInteger INSTANCE_ID = new AtomicInteger(0);
    private final String name;
    private final Semaphore memoryLock;
    private final BatchHandler successHandler;
    private final BatchHandler failHandler;
    private final RetryManager retryManager;
    private final AtomicInteger batchCount = new AtomicInteger(0);
    private final Mover mover;

    public ProducerImpl(ProducerConfig producerConfig) throws LogException {
        producerConfig.validConfig();
        this.producerConfig = producerConfig;
        this.name = TLS + Const.SEPARATOR + INSTANCE_ID.incrementAndGet();
        BlockingQueue<BatchLog> successQueue = new LinkedBlockingQueue<BatchLog>();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<BatchLog>();
        this.memoryLock = new Semaphore(producerConfig.getTotalSizeInBytes());
        this.retryManager = new RetryManager();
        this.dispatcher = new LogDispatcher(producerConfig, name, successQueue, failureQueue, memoryLock, batchCount, retryManager);
        this.successHandler = new BatchHandler("success batch handler-" + name, memoryLock, successQueue, batchCount);
        this.failHandler = new BatchHandler("fail batch handler-" + name, memoryLock, failureQueue, batchCount);
        this.mover = new Mover(name + "-mover", producerConfig, dispatcher, retryManager, successQueue, failureQueue);
    }

    public static Producer defaultProducer(String endpoint, String region, String accessKey, String accessSecret, String token) throws LogException {
        return new ProducerImpl(new ProducerConfig(endpoint, region, accessKey, accessSecret, token));
    }

    @Deprecated
    /*
     * Please use sendLogV2 instead.
     */
    @Override
    public void sendLog(String hashKey, String topicId, String source, String filename, PutLogRequest.Log log, CallBack callBack)
            throws InterruptedException, LogException {
        if (topicId == null || log == null) {
            throw new LogException("InvalidArgument", String.format("topic id: %s, log: %s", topicId, log), null);
        }
        PutLogRequest.LogGroup logGroup = PutLogRequest.LogGroup.newBuilder().setFileName(filename).setSource(source).addLogs(log).build();
        sendLogGroup(hashKey, topicId, source, filename, logGroup, callBack);
    }

    @Deprecated
    /*
     * Please use sendLogsV2 instead.
     */
    @Override
    public void sendLogGroup(String hashKey, String topicId, String source, String filename, PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws InterruptedException, LogException {
        // 1 check params
        if (topicId == null || logGroup == null || logGroup.getLogsList() == null || logGroup.getLogsList().size() == 0) {
            throw new LogException("InvalidArgument", String.format("topic id: %s, log group is empty", topicId), null);
        }

        // check batch count
        if (logGroup.getLogsList().size() > ProducerConfig.MAX_LOG_GROUP_COUNT) {
            throw new LogException("InvalidArgument", String.format("log list size %d is greater than threshold %d",
                    logGroup.getLogsList().size(), ProducerConfig.MAX_LOG_GROUP_COUNT), null);
        }

        // 2 create batch log and add to dispatcher
        dispatcher.addBatch(hashKey, topicId, source, filename, logGroup, callBack);
    }

    @Override
    public void sendLogV2(String hashKey, String topicId, String source, String filename, LogItem log, CallBack callBack)
            throws InterruptedException, LogException {
        if (log == null) {
            return;
        }
        List<LogItem> items = new ArrayList<>();
        items.add(log);
        this.sendLogsV2(hashKey, topicId, source, filename, items, callBack);
    }

    @Override
    public void sendLogsV2(String hashKey, String topicId, String source, String filename, List<LogItem> logs, CallBack callBack)
            throws InterruptedException, LogException {
        // 1 check params
        if (topicId == null || logs == null || logs.size() == 0) {
            throw new LogException("InvalidArgument", String.format("topic id: %s, log group: %s", topicId, logs), null);
        }

        // check batch count
        if (logs.size() > ProducerConfig.MAX_LOG_GROUP_COUNT) {
            throw new LogException("InvalidArgument", String.format("log list size %d is greater than threshold %d",
                    logs.size(), ProducerConfig.MAX_LOG_GROUP_COUNT), null);
        }

        // 2 create batch log and add to dispatcher
        dispatcher.addBatch(hashKey, topicId, source, filename, AdaptorUtil.logItems2PbGroup(filename, source, logs), callBack);
    }

    @Override
    public void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException {
        if (StringUtils.isEmpty(accessKey) || StringUtils.isEmpty(secretKey)) {
            throw new LogException("InvalidArgument",
                    String.format("reset producer %s access key failed, accessKey is %s, secretKey is %s, token is %s",
                            name, accessKey, secretKey, securityToken), null);
        }
        dispatcher.resetAccessKeyToken(accessKey, secretKey, securityToken);
    }

    @Override
    public void start() throws LogException {
        dispatcher.start();
        retryManager.start();
        successHandler.start();
        failHandler.start();
        mover.start();
        LOG.info(String.format("producer %s started", name));
    }

    @Override
    public void close() throws InterruptedException, LogException {
        close(30000);
    }

    @Override
    public void close(long timeoutMs) throws InterruptedException, LogException {
        LogException feedbackException = null;
        try {
            timeoutMs = closeMover(timeoutMs);
        } catch (LogException e) {
            feedbackException = e;
        }
        try {
            timeoutMs = closeExecutorService(timeoutMs);
        } catch (LogException e) {
            if (feedbackException == null) {
                feedbackException = e;
            }
        }
        try {
            timeoutMs = closeSuccessHandler(timeoutMs);
        } catch (LogException e) {
            if (feedbackException == null) {
                feedbackException = e;
            }
        }
        try {
            timeoutMs = closeFailureHandler(timeoutMs);
        } catch (LogException e) {
            if (feedbackException == null) {
                feedbackException = e;
            }
        }

        if (feedbackException != null) {
            throw feedbackException;
        }
        LOG.info(String.format("producer %s closed", name));
    }

    private long closeMover(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        dispatcher.close();
        retryManager.close();
        mover.close();
        mover.join(timeoutMs);
        if (mover.isAlive()) {
            LOG.warn("producer mover thread is still alive");
            throw new LogException("Producer Error", "producer mover thread is still alive", null);
        }
        LOG.info("producer mover is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    private long closeExecutorService(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        ExecutorService executorService = dispatcher.getExecutorService();
        executorService.shutdown();
        if (!executorService.awaitTermination(timeoutMs, TimeUnit.MILLISECONDS)) {
            LOG.warn("producer executor is not terminated normally");
            executorService.shutdownNow();
            throw new LogException("Producer Error", "producer executor is not terminated normally", null);
        }
        LOG.info("producer executor service is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    private long closeSuccessHandler(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        successHandler.close();
        boolean invokedFromCallback = Thread.currentThread() == this.successHandler;
        if (invokedFromCallback) {
            LOG.warn("Skip join success batch handler since you have incorrectly invoked close from the producer callback");
            return timeoutMs;
        }
        successHandler.join(timeoutMs);
        if (successHandler.isAlive()) {
            LOG.warn("producer success handler thread is still alive");
            throw new LogException("Producer Error", "producer success handler thread is still alive", null);
        }
        LOG.info("producer success handler is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    private long closeFailureHandler(long timeoutMs) throws InterruptedException, LogException {
        long startMs = System.currentTimeMillis();

        failHandler.close();
        boolean invokedFromCallback = Thread.currentThread() == this.successHandler || Thread.currentThread() == this.failHandler;
        if (invokedFromCallback) {
            LOG.warn("Skip join failure batch handler since you have incorrectly invoked close from the producer callback");
            return timeoutMs;
        }
        failHandler.join(timeoutMs);
        if (failHandler.isAlive()) {
            LOG.warn("producer failure handler thread is still alive");
            throw new LogException("Producer Error", "producer failure handler thread is still alive", null);
        }
        LOG.info("producer failure handler is closed");

        long nowMs = System.currentTimeMillis();
        return Math.max(0, timeoutMs - nowMs + startMs);
    }

    @Override
    public void closeNow() throws InterruptedException, LogException {
        dispatcher.closeNow();
        retryManager.close();
        mover.close();
        successHandler.close();
        failHandler.close();
        LOG.info(String.format("producer %s closed now", name));
    }

    @Override
    public void config(ProducerConfig producerConfig) throws LogException {
        if (producerConfig != null) {
            this.producerConfig = producerConfig;
            producerConfig.validConfig();
            LOG.info(String.format("producer %s configured, config: %s", name, producerConfig));
        }
    }
}