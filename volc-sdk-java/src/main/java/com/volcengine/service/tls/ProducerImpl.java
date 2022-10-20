package com.volcengine.service.tls;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.util.MessageUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
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
        this.producerConfig = producerConfig;
        this.name = TLS + Const.SEPARATOR + INSTANCE_ID.incrementAndGet();
        BlockingQueue<BatchLog> successQueue = new LinkedBlockingQueue<BatchLog>();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<BatchLog>();
        this.memoryLock = new Semaphore(producerConfig.getTotalSizeInBytes());
        this.retryManager = new RetryManager();
        this.dispatcher = new LogDispatcher(producerConfig, name, successQueue, failureQueue, memoryLock, batchCount
                , retryManager);
        this.successHandler = new BatchHandler("success batch handler-" + name, memoryLock, successQueue, batchCount);
        this.failHandler = new BatchHandler("fail batch handler-" + name, memoryLock, failureQueue, batchCount);
        this.mover = new Mover(this.name + "-mover", producerConfig, this.dispatcher, this.retryManager,
                successQueue, failureQueue);
    }

    public static Producer defaultProducer(String endpoint, String region, String accessKey, String accessSecret, String token) throws LogException {
        return new ProducerImpl(new ProducerConfig(endpoint, region, accessKey, accessSecret, token));
    }

    @Override
    public void sendLog(String hashKey, String topicId, String source, String filename,
                        PutLogRequest.Log log, CallBack callBack) throws InterruptedException, LogException {
        if (topicId == null || log == null) {
            throw new LogException("InvalidArgument", String.format("topic id:%s,log:%s", topicId, log),
                    null);
        }
        PutLogRequest.LogGroup logGroup = PutLogRequest.LogGroup.newBuilder().setFileName(filename).setSource(source).
                addLogs(log).build();
        sendLogGroup(hashKey, topicId, source, filename, logGroup, callBack);
    }

    @Override
    public void sendLogGroup(String hashKey, String topicId, String source, String filename,
                             PutLogRequest.LogGroup logGroup, CallBack callBack)
            throws InterruptedException, LogException {
        // 1 check params
        if (topicId == null || logGroup == null || logGroup.getLogsList() == null
                || logGroup.getLogsList().size() == 0) {
            throw new LogException("InvalidArgument", String.format("topic id:%s,log group:%s", topicId, logGroup),
                    null);
        }

        // check batch count
        if (logGroup.getLogsList().size() > producerConfig.getMaxBatchCount()) {
            throw new LogException("InvalidArgument", String.format("log list size %d is  greater than threshold %d",
                    logGroup.getLogsList().size(), producerConfig.getMaxBatchCount()), null);
        }


        // 2 create batch log and add to dispatcher
        dispatcher.addBatch(hashKey, topicId, source, filename, logGroup, callBack);
    }


    @Override
    public void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) throws LogException {
        if (StringUtils.isEmpty(accessKey) || StringUtils.isEmpty(secretKey)) {
            throw new LogException("InvalidArgument",
                    String.format("reset producer %s access key failed,accessKey is %s,secretKey is %s, token is %s",
                            name, accessKey, secretKey, securityToken), null);
        }
        dispatcher.resetAccessKeyToken(accessKey, secretKey, securityToken);
    }

    @Override
    public void start() throws LogException {
        producerConfig.validConfig();
        dispatcher.start();
        successHandler.start();
        failHandler.start();
        mover.start();
        LOG.info(String.format("producer %s started", name));
    }

    @Override
    public void close() throws InterruptedException, LogException {
        dispatcher.close();
        successHandler.interrupt();
        failHandler.interrupt();
        mover.close();
        LOG.info(String.format("producer %s closed", name));
    }

    @Override
    public void closeNow() throws InterruptedException, LogException {
        dispatcher.closeNow();
        successHandler.close();
        failHandler.close();
        mover.close();
        LOG.info(String.format("producer %s closed now", name));
    }

    @Override
    public void config(ProducerConfig producerConfig) throws LogException {
        if (producerConfig != null) {
            this.producerConfig = producerConfig;
            producerConfig.validConfig();
            LOG.info(String.format("producer %s configured,config: %s", name, producerConfig));
        }
    }
}
