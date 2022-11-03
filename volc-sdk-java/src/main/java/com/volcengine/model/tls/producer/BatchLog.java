package com.volcengine.model.tls.producer;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Iterables;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.service.tls.LogDispatcher;
import com.volcengine.service.tls.SendBatchTask;
import com.volcengine.service.tls.RetryManager;
import com.volcengine.service.tls.TLSLogClient;
import lombok.Data;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class BatchLog implements Delayed {
    BatchKey batchKey;
    int currentBatchSize;
    int currentBatchCount;
    List<CallBack> callBackList = new ArrayList<>();
    PutLogRequest.LogGroupList logGroupList = PutLogRequest.LogGroupList.newBuilder().build();
    ProducerConfig producerConfig;
    EvictingQueue<Attempt> reservedAttempts;
    int attemptCount;
    long createMs;
    private static final Log LOG = LogFactory.getLog(BatchLog.class);

    private BatchLog() {
    }

    public BatchLog(BatchKey batchKey, ProducerConfig producerConfig) {
        this.batchKey = batchKey;
        this.currentBatchSize = 0;
        this.currentBatchCount = 0;
        this.producerConfig = producerConfig;
        this.attemptCount = 0;
        this.reservedAttempts = EvictingQueue.create(producerConfig.getMaxReservedAttempts());
        this.createMs = System.currentTimeMillis();
    }

    public boolean tryAdd(PutLogRequest.LogGroup logGroup, int batchSize, CallBack callBack) {
        // over threshold
        int currentBatchCount = getCurrentBatchCount();
        int currentBatchSize = getCurrentBatchSize();
        if (logGroup.getLogsList().size() + currentBatchCount > ProducerConfig.MAX_BATCH_COUNT
                || batchSize + currentBatchSize > ProducerConfig.MAX_BATCH_SIZE) {
            return false;
        }
        // add log group
        PutLogRequest.LogGroupList.Builder builder = PutLogRequest.LogGroupList.newBuilder().addLogGroups(logGroup);
        if (this.logGroupList.getLogGroupsList().size() > 0) {
            builder.addAllLogGroups(this.logGroupList.getLogGroupsList());
        }
        this.logGroupList = builder.build();
        if (callBack != null) {
            getCallBackList().add(callBack);
        }
        // update current
        setCurrentBatchCount(currentBatchCount + logGroup.getLogsList().size());
        setCurrentBatchSize(currentBatchSize + batchSize);
        return true;
    }

    public boolean fullAndSendBatchRequest() {
        return currentBatchCount >= producerConfig.getMaxBatchCount()
                || currentBatchSize >= producerConfig.getMaxBatchSizeBytes();
    }

    public synchronized void addAttempt(Attempt attempt) {
        reservedAttempts.add(attempt);
        attemptCount++;
    }

    public synchronized void fireCallbacks() {
        List<Attempt> attempts = new ArrayList<>(reservedAttempts);
        if (attempts.size() == 0) {
            LOG.error(String.format("batch log %s fire call back failed ", batchKey.toString()));
            return;
        }
        Attempt attempt = Iterables.getLast(attempts);
        Result result = new Result(attempt.isSuccess(), attempts, attemptCount);
        fireCallbacks(result);
    }

    private void fireCallbacks(Result result) {
        for (CallBack callBack : callBackList) {
            callBack.onComplete(result);
        }
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(producerConfig.getLingerMs(), TimeUnit.MILLISECONDS);
    }

    @Data
    public static class BatchKey {
        String shardHash;
        String topicId;
        String source;
        String fileName;

        public BatchKey(String shardHash, String topicId, String source, String fileName) {
            this.shardHash = shardHash;
            this.topicId = topicId;
            this.source = source;
            this.fileName = fileName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BatchKey batchKey = (BatchKey) o;
            return Objects.equals(shardHash, batchKey.shardHash) && Objects.equals(topicId, batchKey.topicId) && Objects.equals(source, batchKey.source) && Objects.equals(fileName, batchKey.fileName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(shardHash, topicId, source, fileName);
        }
    }

    @Data
    public static class BatchManager {
        BatchLog batchLog;

        public BatchManager() {
        }


        public boolean fullAndSendBatchRequest() {
            return batchLog.fullAndSendBatchRequest();
        }

        public void addNow(ProducerConfig config, ExecutorService executorService, TLSLogClient client,
                           BlockingQueue<BatchLog> successQueue, BlockingQueue<BatchLog> failureQueue,
                           AtomicInteger batchCount, RetryManager retryManager) {
            if (batchLog != null) {
                executorService.submit(
                        new SendBatchTask(batchLog, config, successQueue, failureQueue, client, retryManager));
                batchLog = null;
            }
        }

        public void removeBatch(List<BatchLog> batchLogs) {
            if (batchLog != null) {
                batchLogs.add(batchLog);
                batchLog = null;
            }
        }
    }


}
