package com.volcengine.service.tls;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.producer.Attempt;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.request.PutLogsRequest;
import com.volcengine.model.tls.request.RequestBuilder;
import com.volcengine.model.tls.response.PutLogsResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;

public class SendBatchTask implements Runnable {
    private static final Log LOG = LogFactory.getLog(SendBatchTask.class);
    private final ProducerConfig producerConfig;
    private final BlockingQueue<BatchLog> successQueue;
    private final BlockingQueue<BatchLog> failureQueue;
    private final TLSLogClient client;
    private final RetryManager retryManager;
    private final BatchLog batchLog;

    public SendBatchTask(BatchLog batchLog, ProducerConfig producerConfig, BlockingQueue<BatchLog> successQueue,
                         BlockingQueue<BatchLog> failureQueue, TLSLogClient client, RetryManager retryManager) {
        this.producerConfig = producerConfig;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.client = client;
        this.retryManager = retryManager;
        this.batchLog = batchLog;
    }

    @Override
    public void run() {
        sendRequest();
    }

    private void sendRequest() {
        PutLogsRequest putLogsRequest = RequestBuilder.buildFromBatch(batchLog);
        PutLogsResponse putLogsResponse;
        try {
            putLogsResponse = client.putLogs(putLogsRequest);
        } catch (LogException e) {
            LOG.error("send batch failed,batch:" + batchLog, e);
            Attempt fail = new Attempt(false, e.getRequestId(), e.getErrorCode(), e.getErrorMessage());
            batchLog.addAttempt(fail);
            retryManager.put(batchLog);
            LOG.info("retry queue add batch success,batch:" + batchLog);
            if (ProducerConfig.needRetry(e.getHttpCode()) && batchLog.getAttemptCount() < producerConfig.getRetryCount()) {
                try {
                    failureQueue.put(batchLog);
                } catch (InterruptedException ex) {
                    LOG.error("failure queue add batch failed,batch:" + batchLog, e);
                }
            }
            return;
        }
        Attempt success = new Attempt(true, putLogsResponse.getRequestId(), null, null);
        successQueue.add(batchLog);
        batchLog.addAttempt(success);
        LOG.info("send batch success,batch:" + batchLog);
    }

}
