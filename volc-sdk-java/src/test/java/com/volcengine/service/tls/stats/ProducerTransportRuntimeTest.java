package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.response.PutLogsResponse;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.ProducerStatsSnapshot;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.RetryManager;
import com.volcengine.service.tls.SendBatchTask;
import com.volcengine.service.tls.TLSLogClient;
import org.apache.http.message.BasicHeader;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.AGGREGATE;
import static com.volcengine.service.tls.stats.ManagedMemoryAccountant.PayloadStage.SEND;
import static org.junit.Assert.*;

/** Actual transport task boundaries, with a local blocking client and no network. */
public class ProducerTransportRuntimeTest {
    @Test public void callAcrossOffDoesNotEnterNewGeneration() throws Exception {
        verifyTransition(MetricsLevel.CORE, true);
    }

    @Test public void callAcrossDetailChangeKeepsCountersButNotPartialLatency() throws Exception {
        verifyTransition(MetricsLevel.DETAILED, false);
    }

    private static void verifyTransition(MetricsLevel initial, boolean crossOff) throws Exception {
        ProducerConfig config = new ProducerConfig("https://example.invalid", "region", "ak", "sk", "");
        config.setTotalSizeInBytes(4096);
        config.setMaxProducerMemoryBytes(8192);
        config.validConfig();
        MemoryLimiter limiter = new MemoryLimiter(8192, 4096, true);
        ProducerStatsState stats = new ProducerStatsState(initial, 1, limiter, "transport", StatsClock.SYSTEM);
        stats.markStarted();
        long generation = stats.acquirePayloadAndAcceptGeneration(limiter, 64, 0, 1);
        assertTrue(generation > 0);
        BatchLog batch = new BatchLog(new BatchLog.BatchKey(null, "topic", "source", "file", generation), config);
        stats.onBatchCreated(batch);
        PutLogRequest.LogGroup group = PutLogRequest.LogGroup.newBuilder()
                .addLogs(PutLogRequest.Log.newBuilder().setTime(1).addContents(
                        PutLogRequest.LogContent.newBuilder().setKey("k").setValue("v"))).build();
        assertTrue(batch.tryAdd(group, 64, null, 1, 1, 1));
        batch.addAggregatedPayload(limiter, 64);
        stats.onGroupAggregated(batch);
        assertTrue(batch.transitionPayload(limiter, AGGREGATE, SEND));
        stats.onBatchSubmittedFromIngress(batch);

        CountDownLatch entered = new CountDownLatch(1), release = new CountDownLatch(1);
        TLSLogClient client = (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                    if (!"putLogs".equals(method.getName())) throw new AssertionError(method.getName());
                    assertFalse("the accountant monitor must not span a transport call",
                            Thread.holdsLock(limiter.getAccountant()));
                    entered.countDown();
                    if (!release.await(3, TimeUnit.SECONDS)) throw new AssertionError("test did not release transport");
                    return new PutLogsResponse(new BasicHeader[]{new BasicHeader(Const.X_TLS_REQUESTID, "mock")});
                });
        LinkedBlockingQueue<BatchLog> success = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<BatchLog> failure = new LinkedBlockingQueue<>();
        SendBatchTask task = new SendBatchTask(batch, config, success, failure, client,
                new RetryManager(), limiter, new CircuitBreaker(config.getCircuitBreakerConfig()));
        AtomicReference<Throwable> error = new AtomicReference<>();
        Thread thread = new Thread(() -> { try { task.run(); } catch (Throwable t) { error.set(t); } });
        thread.start();
        try {
            assertTrue(entered.await(3, TimeUnit.SECONDS));
            assertEquals(Integer.valueOf(1), stats.snapshot(StatsOptions.operational()).getOperational().get().getSendCallsInFlight());
            if (crossOff) stats.setMetricsLevel(MetricsLevel.OFF);
            else stats.setMetricsLevel(MetricsLevel.CORE);
            stats.setMetricsLevel(MetricsLevel.DETAILED);
        } finally {
            release.countDown();
            thread.join(3000);
        }
        assertFalse(thread.isAlive());
        assertNull(error.get());
        assertEquals(1, success.size());
        assertTrue(failure.isEmpty());
        assertEquals(0, limiter.getUsedBytes());
        ProducerStatsSnapshot snapshot = stats.snapshot(StatsOptions.debug());
        assertEquals(crossOff ? 0 : 1, snapshot.getOperational().get().getSendCallsSuccessTotal());
        assertEquals(crossOff ? 0 : 1, snapshot.getOperational().get().getTerminalSuccessLogsTotal());
        assertEquals(0, snapshot.getManagedMemory().get().getPayloadOwnedBytes());
        assertEquals(Integer.valueOf(0), snapshot.getOperational().get().getSendCallsInFlight());
        assertEquals(0, snapshot.getLatencyHistograms().get().getSendCallDuration().getCount());
    }
}
