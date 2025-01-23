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

import static com.volcengine.model.tls.Const.HTTP_STATUS_OK;

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
            handleLogException(e);
            return;
        } catch (Exception e) {
            handleException(e);
            return;
        }
        handleSuccess(putLogsResponse);
    }

    private void putBatchLogToFailureQueue() {
        try {
            failureQueue.put(batchLog);
            LOG.info("failure queue add batch success, batch: " + batchLog);
        } catch (InterruptedException ex) {
            LOG.error("failure queue add batch failed, batch: " + batchLog, ex);
        }
    }

    private boolean needRetry(LogException e) {
        return ProducerConfig.needRetry(e.getHttpCode()) &&
                batchLog.getAttemptCount() <= producerConfig.getRetryCount() &&
                !retryManager.isClosed();
    }

    private void handleLogException(LogException e) {
        LOG.error("send batch failed, batch:" + batchLog, e);
        Attempt fail = new Attempt(false, e.getRequestId(), e.getErrorCode(), e.getErrorMessage(), e.getHttpCode());
        batchLog.addAttempt(fail);
        batchLog.handleNextTry();
        if (needRetry(e)) {
            try {
                retryManager.put(batchLog);
                LOG.info("retry queue add batch success, batch: " + batchLog);
                return;
            } catch (LogException ex) {
                LOG.warn("retry manager is closed and put batch log to failure queue");
            }
        }

        putBatchLogToFailureQueue();
    }

    private void handleException(Exception e) {
        LOG.error("send batch failed, batch:" + batchLog, e);
        Attempt fail = new Attempt(false, null, e.getClass().getName(), e.getMessage());
        batchLog.addAttempt(fail);
        putBatchLogToFailureQueue();
    }

    private void handleSuccess(PutLogsResponse putLogsResponse) {
        Attempt success = new Attempt(true, putLogsResponse.getRequestId(), null, null, HTTP_STATUS_OK);
        batchLog.addAttempt(success);
        batchLog.setRetryBackoffMs(0);
        successQueue.add(batchLog);
        LOG.debug("send batch success, batch: " + batchLog);
    }
}
