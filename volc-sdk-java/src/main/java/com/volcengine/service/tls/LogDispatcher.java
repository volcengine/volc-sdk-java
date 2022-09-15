package com.volcengine.service.tls;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.SEPARATOR;

public class LogDispatcher {
    public static final String TLS_THREAD_POOL_FORMAT = "dispatcher-thread-%d";
    private final ProducerConfig producerConfig;
    private final ExecutorService executorService;
    private TLSLogClient client;
    private final String producerName;
    private final BlockingQueue<BatchLog> successQueue;
    private final BlockingQueue<BatchLog> failureQueue;
    private static final Log LOG = LogFactory.getLog(LogDispatcher.class);
    private final AtomicInteger addLogLock = new AtomicInteger(0);
    private volatile boolean closed = true;
    private final Semaphore memoryLock;
    private final AtomicInteger batchCount;
    private final RetryManager retryManager;
    private final ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches;

    public LogDispatcher(ProducerConfig producerConfig, String producerName, BlockingQueue<BatchLog> successQueue,
                         BlockingQueue<BatchLog> failureQueue, Semaphore memoryLock, AtomicInteger batchCount
            , RetryManager retryManager) throws LogException {
        this.producerConfig = producerConfig;
        this.producerName = producerName;
        this.executorService = Executors.newFixedThreadPool(
                producerConfig.getMaxThreadCount(),
                new ThreadFactoryBuilder()
                        .setNameFormat(producerName + SEPARATOR + TLS_THREAD_POOL_FORMAT)
                        .setDaemon(true)
                        .build());
        this.memoryLock = memoryLock;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.batches = new ConcurrentHashMap<>();
        this.batchCount = batchCount;
        this.retryManager = retryManager;
        this.client = ClientBuilder.newClient(producerConfig.getClientConfig());
        this.closed = false;
    }

    public TLSLogClient getClient() {
        return client;
    }

    public ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> getBatches() {
        return batches;
    }

    public void start() {
        LOG.info(String.format("log dispatcher %s started and client init success", producerName));
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public void close() throws InterruptedException, LogException {
        executorService.shutdown();
        this.closed = true;
    }

    public void closeNow() throws InterruptedException, LogException {
        executorService.shutdownNow();
        this.closed = true;
    }

    private BatchLog.BatchManager getOrCreateBatchManager(BatchLog.BatchKey batchKey) {
        BatchLog.BatchManager batchManager = batches.get(batchKey);
        if (batchManager != null) {
            return batchManager;
        }
        batchManager = new BatchLog.BatchManager();
        BatchLog.BatchManager original = batches.putIfAbsent(batchKey, batchManager);
        return original != null ? original : batchManager;
    }

    public void resetAccessKeyToken(String accessKey, String secretKey, String securityToken) {
        ClientConfig clientConfig = producerConfig.getClientConfig();
        clientConfig.resetAccessKeyToken(accessKey, secretKey, securityToken);
        client.resetAccessKeyToken(accessKey, secretKey, securityToken);
        LOG.info(String.format("log dispatcher %s update client config %s success", producerName, clientConfig));
    }


    public void addBatch(String hashKey, String topicId, String source, String filename,
                         PutLogRequest.LogGroup logGroup, CallBack callBack) throws InterruptedException, LogException {
        addLogLock.incrementAndGet();
        doAdd(hashKey, topicId, source, filename, logGroup, callBack);
        addLogLock.decrementAndGet();
    }

    private void doAdd(String hashKey, String topicId, String source, String filename,
                       PutLogRequest.LogGroup logGroup, CallBack callBack) throws LogException, InterruptedException {
        // check status and batch size
        if (closed) {
            throw new LogException("Producer Error", "dispatcher closed can't add batch anymore", null);
        }
        int batchSize = calculateSize(logGroup);
        producerConfig.checkBatchSize(batchSize);
        // wait add lock
        long maxBlockMs = producerConfig.getMaxBlockMs();
        LOG.info(String.format("dispatcher %s try acquire memory lock ", producerName));

        if (maxBlockMs == 0) {
            memoryLock.acquire();
        } else {
            boolean acquired = memoryLock.tryAcquire(batchSize, maxBlockMs, TimeUnit.MILLISECONDS);
            if (!acquired) {
                throw new LogException("Producer Error", "dispatcher %s try acquire memory lock failed", null);
            }
        }
        // add batch
        try {
            BatchLog.BatchKey batchKey = new BatchLog.BatchKey(hashKey, topicId, source, filename);
            BatchLog.BatchManager batchManager = getOrCreateBatchManager(batchKey);
            synchronized (batchManager) {
                addToBatchManager(batchKey, logGroup, callBack, batchSize, batchManager);
            }
        } catch (Exception e) {
            throw new LogException("Producer Error", "dispatcher add batch concurrent error", null);
        } finally {
            memoryLock.release(batchSize);
        }
    }

    private int calculateSize(PutLogRequest.LogGroup logGroup) {
        if (logGroup == null) {
            return 0;
        }
        return logGroup.getSerializedSize();
    }

    private void addToBatchManager(BatchLog.BatchKey batchKey, PutLogRequest.LogGroup logGroup, CallBack callBack,
                                   int batchSize, BatchLog.BatchManager batchManager) {
        // add to exist batch
        BatchLog batchLog = batchManager.getBatchLog();
        if (batchLog != null) {
            boolean success = batchLog.tryAdd(logGroup, batchSize, callBack);
            if (success) {
                if (batchManager.fullAndSendBatchRequest()) {
                    batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue,
                            batchCount, retryManager);
                    return;
                }
            } else
                batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue,
                        batchCount, retryManager);
        }
        // no batch create new and try send
        batchLog = new BatchLog(batchKey, producerConfig);
        batchManager.setBatchLog(batchLog);
        batchLog.tryAdd(logGroup, batchSize, callBack);
        if (batchManager.fullAndSendBatchRequest()) {
            batchManager.addNow(producerConfig, executorService, client, successQueue, failureQueue, batchCount,
                    retryManager);
        }
    }


}
