package com.volcengine.service.tls;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.producer.Attempt;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.FailureClassifier;
import com.volcengine.model.tls.producer.FailureType;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.request.PutLogsRequest;
import com.volcengine.model.tls.request.RequestBuilder;
import com.volcengine.model.tls.response.PutLogsResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;

import java.io.EOFException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
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
    private final MemoryLimiter memoryLimiter;
    private final CircuitBreaker circuitBreaker;

    public SendBatchTask(BatchLog batchLog, ProducerConfig producerConfig, BlockingQueue<BatchLog> successQueue,
                         BlockingQueue<BatchLog> failureQueue, TLSLogClient client, RetryManager retryManager,
                         MemoryLimiter memoryLimiter, CircuitBreaker circuitBreaker) {
        this.producerConfig = producerConfig;
        this.successQueue = successQueue;
        this.failureQueue = failureQueue;
        this.client = client;
        this.retryManager = retryManager;
        this.batchLog = batchLog;
        this.memoryLimiter = memoryLimiter;
        this.circuitBreaker = circuitBreaker;
    }

    @Override
    public void run() {
        sendRequest();
    }

    private void sendRequest() {
        int circuitPermitCount = batchLog.getCircuitPermitCount();
        if (circuitPermitCount <= 0) {
            circuitPermitCount = circuitBreaker.acquirePermit();
            if (circuitPermitCount < 0) {
                handleCircuitOpen();
                return;
            }
            batchLog.addCircuitPermitCount(circuitPermitCount);
        }
        long temporaryBytes = estimateTemporaryReservationBytes();
        boolean temporaryAcquired;
        try {
            temporaryAcquired = memoryLimiter.acquireTemporary(temporaryBytes, producerConfig.getMaxBlockMs());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            handleLocalResourceFailure("interrupted while acquiring temporary send memory");
            return;
        }
        if (!temporaryAcquired) {
            handleLocalResourceFailure("failed to acquire temporary send memory");
            return;
        }
        PutLogsResponse putLogsResponse;
        try {
            PutLogsRequest putLogsRequest = RequestBuilder.buildFromBatch(batchLog);
            if (!calibrateBatchSize(putLogsRequest)) {
                return;
            }
            putLogsResponse = client.putLogs(putLogsRequest);
        } catch (LogException e) {
            handleLogException(e);
            return;
        } catch (Exception e) {
            handleException(e);
            return;
        } finally {
            memoryLimiter.releaseTemporary(temporaryBytes);
        }
        handleSuccess(putLogsResponse);
    }

    private long estimateTemporaryReservationBytes() {
        long payloadBytes = Math.max(1, batchLog.getCurrentBatchSize());
        return payloadBytes * 2L + 1024L;
    }

    private boolean calibrateBatchSize(PutLogsRequest putLogsRequest) throws InterruptedException {
        int estimated = batchLog.getCurrentBatchSize();
        int actual = putLogsRequest.getLogGroupList().getSerializedSize();
        int delta = actual - estimated;
        if (delta > 0) {
            boolean acquired = memoryLimiter.acquirePayload(delta, producerConfig.getMaxBlockMs());
            if (!acquired) {
                handleLocalResourceFailure("failed to acquire memory for calibrated batch size");
                return false;
            }
        } else if (delta < 0) {
            memoryLimiter.releasePayload(-delta);
        }
        batchLog.setCurrentBatchSize(actual);
        batchLog.setReservedBytes(actual);
        putLogsRequest.setBodyRawSize(String.valueOf(actual));
        return true;
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
        return FailureClassifier.shouldRetry(FailureClassifier.classify(e)) &&
                batchLog.getAttemptCount() <= producerConfig.getRetryCount() &&
                !retryManager.isClosed();
    }

    private void handleLogException(LogException e) {
        LOG.error("send batch failed, batch:" + batchLog, e);
        FailureType failureType = FailureClassifier.classify(e);
        circuitBreaker.recordFailure(failureType, batchLog.takeCircuitPermitCount());
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
        FailureType failureType = isTransientNetworkException(e) ? FailureType.NETWORK : FailureType.PERMANENT;
        circuitBreaker.recordFailure(failureType, batchLog.takeCircuitPermitCount());
        Attempt fail = new Attempt(false, null, e.getClass().getName(), e.getMessage());
        batchLog.addAttempt(fail);
        batchLog.handleNextTry();
        if (FailureClassifier.shouldRetry(failureType)
                && batchLog.getAttemptCount() <= producerConfig.getRetryCount()
                && !retryManager.isClosed()) {
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

    private boolean isTransientNetworkException(Throwable e) {
        Throwable current = e;
        while (current != null) {
            if (current instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                return false;
            }
            if (current instanceof SocketTimeoutException
                    || current instanceof ConnectException
                    || current instanceof NoRouteToHostException
                    || current instanceof SocketException
                    || current instanceof EOFException
                    || current instanceof NoHttpResponseException
                    || current instanceof ConnectTimeoutException
                    || current instanceof ConnectionPoolTimeoutException) {
                return true;
            }
            current = current.getCause();
        }
        return false;
    }

    private void handleLocalResourceFailure(String message) {
        LOG.warn("send batch failed before http call, batch:" + batchLog + ", reason:" + message);
        Attempt fail = new Attempt(false, null, "MemoryLimitExceeded", message, 0);
        batchLog.addAttempt(fail);
        circuitBreaker.recordFailure(FailureType.LOCAL_RESOURCE, batchLog.takeCircuitPermitCount());
        putBatchLogToFailureQueue();
    }

    private void handleCircuitOpen() {
        LOG.warn("send batch rejected by open circuit, batch:" + batchLog);
        Attempt fail = new Attempt(false, null, "CircuitOpenException", "producer circuit breaker is open", 0);
        batchLog.addAttempt(fail);
        putBatchLogToFailureQueue();
    }

    private void handleSuccess(PutLogsResponse putLogsResponse) {
        circuitBreaker.recordSuccess(batchLog.takeCircuitPermitCount());
        Attempt success = new Attempt(true, putLogsResponse.getRequestId(), null, null, HTTP_STATUS_OK);
        batchLog.addAttempt(success);
        batchLog.setRetryBackoffMs(0);
        successQueue.add(batchLog);
        LOG.debug("send batch success, batch: " + batchLog);
    }
}
