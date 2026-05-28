package com.volcengine.service.tls.producer;

import com.google.protobuf.CodedOutputStream;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.CircuitBreakerConfig;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.FailureClassifier;
import com.volcengine.model.tls.producer.FailurePolicy;
import com.volcengine.model.tls.producer.FailureType;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.producer.RetryMode;
import com.volcengine.model.tls.response.PutLogsResponse;
import com.volcengine.service.tls.BatchHandler;
import com.volcengine.service.tls.LogDispatcher;
import com.volcengine.service.tls.RetryManager;
import com.volcengine.service.tls.SendBatchTask;
import com.volcengine.service.tls.TLSLogClient;
import org.apache.http.message.BasicHeader;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static com.volcengine.model.tls.Const.X_TLS_REQUESTID;

public class ProducerResilienceContractTest {
    @Test
    public void maxBlockZeroIsAcceptedAsImmediateAcquireMode() throws LogException {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setMaxBlockMs(0);

        config.validConfig();

        Assert.assertEquals(0, config.getMaxBlockMs());
    }

    @Test
    public void producerMemoryBudgetDefaultsToDoublePayloadBudget() throws LogException {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setTotalSizeInBytes(64);

        config.validConfig();

        Assert.assertEquals(64, config.getTotalSizeInBytes());
        Assert.assertEquals(128, config.getMaxProducerMemoryBytes());
    }

    @Test
    public void producerManagedRetryDisablesInnerClientRetry() throws LogException {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setRetryMode(RetryMode.PRODUCER_MANAGED);

        config.validConfig();

        Assert.assertEquals(1, config.getClientConfig().getRetryPolicy().getMaxAttempts());
    }

    @Test
    public void memoryLimiterImmediateFailureDoesNotConsumeBytes() throws InterruptedException {
        MemoryLimiter limiter = new MemoryLimiter(100, 80);

        Assert.assertFalse(limiter.acquirePayload(90, 0));
        Assert.assertEquals(0, limiter.getUsedBytes());

        Assert.assertTrue(limiter.acquirePayload(40, 0));
        Assert.assertEquals(40, limiter.getUsedBytes());
        limiter.releasePayload(40);
        Assert.assertEquals(0, limiter.getUsedBytes());
    }

    @Test
    public void classifierRetriesOnlyTransientFailures() {
        Assert.assertFalse(FailureClassifier.shouldRetry(FailureType.PERMANENT));
        Assert.assertFalse(FailureClassifier.shouldRecordCircuitFailure(FailureType.PERMANENT));
        Assert.assertTrue(FailureClassifier.shouldRetry(FailureType.THROTTLED));
        Assert.assertTrue(FailureClassifier.shouldRecordCircuitFailure(FailureType.THROTTLED));
        Assert.assertTrue(FailureClassifier.shouldRetry(FailureType.SERVER));
        Assert.assertTrue(FailureClassifier.shouldRetry(FailureType.NETWORK));
    }

    @Test
    public void circuitBreakerOpensOnTransientFailureAndRejectsRequests() {
        CircuitBreakerConfig config = new CircuitBreakerConfig();
        config.setEnabled(true);
        config.setConsecutiveFailuresThreshold(1);
        CircuitBreaker breaker = new CircuitBreaker(config);

        Assert.assertTrue(breaker.allowRequest());
        breaker.recordFailure(FailureType.THROTTLED);

        Assert.assertFalse(breaker.allowRequest());
    }

    @Test
    public void halfOpenRequiresConfiguredSuccessesBeforeClosing() {
        CircuitBreakerConfig config = new CircuitBreakerConfig();
        config.setEnabled(true);
        config.setConsecutiveFailuresThreshold(1);
        config.setOpenDurationMs(0);
        config.setHalfOpenMaxRequests(2);
        CircuitBreaker breaker = new CircuitBreaker(config);

        Assert.assertTrue(breaker.allowRequest());
        breaker.recordFailure(FailureType.THROTTLED);
        Assert.assertTrue(breaker.allowRequest());
        breaker.recordSuccess();

        Assert.assertTrue(breaker.allowRequest());
        Assert.assertTrue(breaker.allowRequest());
        Assert.assertFalse(breaker.allowRequest());
    }

    @Test
    public void halfOpenLocalResourceFailureReleasesPermitWithoutOpening() {
        CircuitBreakerConfig config = new CircuitBreakerConfig();
        config.setEnabled(true);
        config.setConsecutiveFailuresThreshold(1);
        config.setOpenDurationMs(0);
        config.setHalfOpenMaxRequests(1);
        CircuitBreaker breaker = new CircuitBreaker(config);

        Assert.assertTrue(breaker.allowRequest());
        breaker.recordFailure(FailureType.THROTTLED);
        Assert.assertTrue(breaker.allowRequest());
        breaker.recordFailure(FailureType.LOCAL_RESOURCE);

        Assert.assertTrue(breaker.allowRequest());
    }

    @Test
    public void retryThenCallbackDoesNotRejectBeforeEnqueueWhenCircuitOpen() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setMaxBlockMs(0);
        config.setFailurePolicy(FailurePolicy.RETRY_THEN_CALLBACK);
        config.validConfig();
        MemoryLimiter limiter = new MemoryLimiter(config.getMaxProducerMemoryBytes(), config.getTotalSizeInBytes());
        CircuitBreakerConfig breakerConfig = new CircuitBreakerConfig();
        breakerConfig.setEnabled(true);
        breakerConfig.setConsecutiveFailuresThreshold(1);
        CircuitBreaker breaker = new CircuitBreaker(breakerConfig);
        breaker.recordFailure(FailureType.THROTTLED);
        LogDispatcher dispatcher = new LogDispatcher(config, "producer-test", new LinkedBlockingQueue<>(),
                new LinkedBlockingQueue<>(), limiter, new AtomicInteger(0), new RetryManager(), breaker);
        try {
            dispatcher.addBatch(null, "topic", "source", "file", newLogGroup(), new RecordingCallback());

            Assert.assertTrue(limiter.getUsedBytes() > 0);
        } finally {
            dispatcher.closeNow();
        }
    }

    @Test
    public void scratchReservationFailureDoesNotCallClientAndReleasesPayload() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setTotalSizeInBytes(64);
        config.setMaxProducerMemoryBytes(80);
        config.setMaxBlockMs(0);
        config.validConfig();

        MemoryLimiter limiter = new MemoryLimiter(config.getMaxProducerMemoryBytes(), config.getTotalSizeInBytes());
        RecordingCallback callback = new RecordingCallback();
        BatchLog batch = newBatch(config, limiter, callback, 64);
        RecordingClient client = new RecordingClient(null);
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<>();
        BatchHandler handler = new BatchHandler("producer-test-failure-handler", limiter, failureQueue, new AtomicInteger(1));
        handler.start();

        try {
            new SendBatchTask(batch, config, new LinkedBlockingQueue<>(), failureQueue, client.proxy(),
                    new RetryManager(), limiter, new CircuitBreaker(config.getCircuitBreakerConfig())).run();

            Assert.assertTrue(callback.await());
            Assert.assertEquals(0, client.calls.get());
            Assert.assertEquals("MemoryLimitExceeded", callback.result.getAttempts().get(0).getErrorCode());
            Assert.assertEquals(0, limiter.getUsedBytes());
        } finally {
            handler.close();
        }
    }

    @Test
    public void retryKeepsReservationUntilTerminalFailure() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setTotalSizeInBytes(4096);
        config.setMaxProducerMemoryBytes(8192);
        config.setMaxBlockMs(0);
        config.setRetryCount(1);
        config.validConfig();

        MemoryLimiter limiter = new MemoryLimiter(config.getMaxProducerMemoryBytes(), config.getTotalSizeInBytes());
        RecordingCallback callback = new RecordingCallback();
        BatchLog batch = newBatch(config, limiter, callback, 32);
        RecordingClient client = new RecordingClient(new LogException(429, "TooManyRequests", "slow down", "r1"));
        RetryManager retryManager = new RetryManager();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<>();

        new SendBatchTask(batch, config, new LinkedBlockingQueue<>(), failureQueue, client.proxy(),
                retryManager, limiter, new CircuitBreaker(config.getCircuitBreakerConfig())).run();

        Assert.assertTrue(limiter.getUsedBytes() > 0);
        retryManager.close();
        List<BatchLog> retryBatches = retryManager.handleRemainingBatches();
        Assert.assertEquals(1, retryBatches.size());
        Assert.assertTrue(failureQueue.isEmpty());

        BatchHandler handler = new BatchHandler("producer-test-terminal-failure-handler", limiter, failureQueue, new AtomicInteger(1));
        handler.start();
        try {
            new SendBatchTask(retryBatches.get(0), config, new LinkedBlockingQueue<>(), failureQueue, client.proxy(),
                    retryManager, limiter, new CircuitBreaker(config.getCircuitBreakerConfig())).run();

            Assert.assertTrue(callback.await());
            Assert.assertFalse(callback.result.isSuccess());
            Assert.assertEquals(2, client.calls.get());
            Assert.assertEquals(0, limiter.getUsedBytes());
        } finally {
            handler.close();
        }
    }

    @Test
    public void nonTransientRuntimeExceptionDoesNotRetryOrOpenCircuit() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setTotalSizeInBytes(4096);
        config.setMaxBlockMs(0);
        config.setRetryCount(1);
        config.validConfig();

        MemoryLimiter limiter = new MemoryLimiter(config.getMaxProducerMemoryBytes(), config.getTotalSizeInBytes());
        RecordingCallback callback = new RecordingCallback();
        BatchLog batch = newBatch(config, limiter, callback, 32);
        RecordingClient client = new RecordingClient(new IllegalStateException("bad local state"));
        RetryManager retryManager = new RetryManager();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<>();
        CircuitBreakerConfig breakerConfig = new CircuitBreakerConfig();
        breakerConfig.setEnabled(true);
        breakerConfig.setConsecutiveFailuresThreshold(1);
        CircuitBreaker breaker = new CircuitBreaker(breakerConfig);

        new SendBatchTask(batch, config, new LinkedBlockingQueue<>(), failureQueue, client.proxy(),
                retryManager, limiter, breaker).run();

        Assert.assertEquals(1, client.calls.get());
        retryManager.close();
        Assert.assertTrue(retryManager.handleRemainingBatches().isEmpty());
        Assert.assertEquals(1, failureQueue.size());
        Assert.assertTrue("permanent local runtime errors must not trip the transient-failure circuit",
                breaker.allowRequest());
    }

    @Test
    public void openCircuitRejectsBeforeHttpCall() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setTotalSizeInBytes(4096);
        config.setMaxBlockMs(0);
        config.validConfig();

        MemoryLimiter limiter = new MemoryLimiter(config.getMaxProducerMemoryBytes(), config.getTotalSizeInBytes());
        RecordingCallback callback = new RecordingCallback();
        BatchLog batch = newBatch(config, limiter, callback, 32);
        CircuitBreakerConfig breakerConfig = new CircuitBreakerConfig();
        breakerConfig.setEnabled(true);
        breakerConfig.setConsecutiveFailuresThreshold(1);
        CircuitBreaker breaker = new CircuitBreaker(breakerConfig);
        breaker.recordFailure(FailureType.THROTTLED);
        RecordingClient client = new RecordingClient(null);
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<>();
        BatchHandler handler = new BatchHandler("producer-test-circuit-handler", limiter, failureQueue, new AtomicInteger(1));
        handler.start();

        try {
            new SendBatchTask(batch, config, new LinkedBlockingQueue<>(), failureQueue, client.proxy(),
                    new RetryManager(), limiter, breaker).run();

            Assert.assertTrue(callback.await());
            Assert.assertEquals(0, client.calls.get());
            Assert.assertEquals("CircuitOpenException", callback.result.getAttempts().get(0).getErrorCode());
            Assert.assertEquals(0, limiter.getUsedBytes());
        } finally {
            handler.close();
        }
    }

    private static BatchLog newBatch(ProducerConfig config, MemoryLimiter limiter, CallBack callback, int estimatedSize)
            throws Exception {
        Assert.assertTrue(limiter.acquirePayload(estimatedSize, 0));
        BatchLog batch = new BatchLog(new BatchLog.BatchKey(null, "topic", "source", "file"), config);
        Assert.assertTrue(batch.tryAdd(newLogGroup(), estimatedSize, callback, 1, 1000, 1000));
        return batch;
    }

    private static PutLogRequest.LogGroup newLogGroup() {
        PutLogRequest.Log log = PutLogRequest.Log.newBuilder()
                .setTime(1)
                .addContents(PutLogRequest.LogContent.newBuilder().setKey("k").setValue("v").build())
                .build();
        return PutLogRequest.LogGroup.newBuilder()
                .setSource("source")
                .setFileName("file")
                .addLogs(log)
                .build();
    }

    private static int entrySize(PutLogRequest.LogGroup group) {
        int groupSize = group.getSerializedSize();
        return CodedOutputStream.computeTagSize(PutLogRequest.LogGroupList.LOGGROUPS_FIELD_NUMBER)
                + CodedOutputStream.computeUInt32SizeNoTag(groupSize)
                + groupSize;
    }

    private static final class RecordingCallback implements CallBack {
        final CountDownLatch latch = new CountDownLatch(1);
        volatile Result result;

        @Override
        public void onComplete(Result result) {
            this.result = result;
            latch.countDown();
        }

        boolean await() throws InterruptedException {
            return latch.await(2, TimeUnit.SECONDS);
        }
    }

    private static final class RecordingClient {
        final AtomicInteger calls = new AtomicInteger();
        final Throwable exception;

        RecordingClient(Throwable exception) {
            this.exception = exception;
        }

        TLSLogClient proxy() {
            return (TLSLogClient) Proxy.newProxyInstance(
                    TLSLogClient.class.getClassLoader(),
                    new Class[]{TLSLogClient.class},
                    (proxy, method, args) -> {
                        if ("putLogs".equals(method.getName())) {
                            calls.incrementAndGet();
                            if (exception != null) {
                                throw exception;
                            }
                            return new PutLogsResponse(new BasicHeader[]{new BasicHeader(X_TLS_REQUESTID, "ok")});
                        }
                        if ("toString".equals(method.getName())) {
                            return "RecordingClient";
                        }
                        return null;
                    });
        }
    }
}
