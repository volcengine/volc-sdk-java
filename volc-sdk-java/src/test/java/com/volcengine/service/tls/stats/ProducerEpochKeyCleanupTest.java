package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.service.tls.LogDispatcher;
import com.volcengine.service.tls.Mover;
import com.volcengine.service.tls.RetryManager;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.model.tls.response.PutLogsResponse;
import org.apache.http.message.BasicHeader;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static com.volcengine.model.tls.Const.X_TLS_REQUESTID;

public class ProducerEpochKeyCleanupTest {
    private static final int GENERATION_COUNT = 300;

    @Test
    public void frequentOffOnGenerationsDoNotRetainEmptyManagers() throws Exception {
        Fixture fixture = new Fixture();
        AtomicInteger callbacks = new AtomicInteger();
        try {
            for (int i = 0; i < GENERATION_COUNT; i++) {
                fixture.dispatcher.addBatch(null, "topic", "source", "file", group(), callback(callbacks));
                invoke(fixture.mover, "handleRemainingBatch");

                BatchLog terminal = takeTerminal(fixture.successQueue, fixture.failureQueue);
                fixture.state.onTerminalDequeued();
                terminal.fireCallbacks(fixture.state);
                Assert.assertEquals("one generation must not leave a manager behind", 0,
                        fixture.dispatcher.getBatches().size());
                waitForMemoryRelease(fixture.limiter);

                if (i + 1 < GENERATION_COUNT) {
                    fixture.state.setMetricsLevel(MetricsLevel.OFF);
                    fixture.state.setMetricsLevel(MetricsLevel.DETAILED);
                }
            }
            Assert.assertEquals(GENERATION_COUNT, callbacks.get());
        } finally {
            fixture.close();
        }
    }

    @Test
    public void admissionRetriesWhenMoverRemovesTheManagerItAlreadyRead() throws Exception {
        Fixture fixture = new Fixture();
        final BatchLog.BatchKey key = new BatchLog.BatchKey(null, "topic", "source", "file", 1L);
        final BatchLog.BatchManager oldManager = new BatchLog.BatchManager();
        final AdmissionGateMap batches = new AdmissionGateMap();
        batches.put(key, oldManager);
        batches.expected = oldManager;
        replaceBatches(fixture.dispatcher, batches);
        replaceBatches(fixture.mover, batches);

        final AtomicInteger callbacks = new AtomicInteger();
        final AtomicReference<Throwable> admissionFailure = new AtomicReference<Throwable>();
        final Thread admission = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fixture.dispatcher.addBatch(null, "topic", "source", "file", group(), callback(callbacks));
                } catch (Throwable t) {
                    admissionFailure.set(t);
                }
            }
        }, "epoch-key-admitter");
        batches.admissionThread = admission;
        batches.gate = true;
        admission.start();

        Thread mover = null;
        try {
            Assert.assertTrue("admission must first observe the old manager",
                    batches.observed.await(2, TimeUnit.SECONDS));
            final AtomicReference<Throwable> moverFailure = new AtomicReference<Throwable>();
            mover = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        invoke(fixture.mover, "handleRemainingBatch");
                    } catch (Throwable t) {
                        moverFailure.set(t);
                    }
                }
            }, "epoch-key-mover");
            mover.start();
            mover.join(2000);
            Assert.assertFalse("mover scan must finish", mover.isAlive());
            Assert.assertNull(moverFailure.get());
            Assert.assertFalse("mover must remove the empty manager it owns", batches.containsKey(key));

            batches.gate = false;
            batches.release.countDown();
            admission.join(2000);
            Assert.assertFalse("admission must retry against the replacement manager", admission.isAlive());
            Assert.assertNull(admissionFailure.get());

            invoke(fixture.mover, "handleRemainingBatch");
            BatchLog terminal = takeTerminal(fixture.successQueue, fixture.failureQueue);
            fixture.state.onTerminalDequeued();
            terminal.fireCallbacks(fixture.state);
            Assert.assertEquals(1, callbacks.get());
            Assert.assertEquals(0, fixture.dispatcher.getBatches().size());
            waitForMemoryRelease(fixture.limiter);
        } finally {
            batches.gate = false;
            batches.release.countDown();
            if (admission.isAlive()) admission.join(2000);
            if (mover != null && mover.isAlive()) mover.join(2000);
            fixture.close();
        }
    }

    private static BatchLog takeTerminal(BlockingQueue<BatchLog> successQueue,
                                         BlockingQueue<BatchLog> failureQueue) throws Exception {
        BatchLog batch = successQueue.poll(2, TimeUnit.SECONDS);
        if (batch == null) {
            batch = failureQueue.poll(2, TimeUnit.SECONDS);
        }
        Assert.assertNotNull("accepted batch must reach a terminal queue", batch);
        return batch;
    }

    private static CallBack callback(final AtomicInteger callbacks) {
        return new CallBack() {
            @Override
            public void onComplete(Result result) {
                callbacks.incrementAndGet();
            }
        };
    }

    private static void invoke(Object target, String name) throws Exception {
        Method method = target.getClass().getDeclaredMethod(name);
        method.setAccessible(true);
        method.invoke(target);
    }

    private static void replaceBatches(LogDispatcher dispatcher,
                                       ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches)
            throws Exception {
        Field field = LogDispatcher.class.getDeclaredField("batches");
        field.setAccessible(true);
        field.set(dispatcher, batches);
    }

    private static void replaceBatches(Mover mover,
                                       ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches)
            throws Exception {
        Field field = Mover.class.getDeclaredField("batches");
        field.setAccessible(true);
        field.set(mover, batches);
    }

    private static void waitForMemoryRelease(MemoryLimiter limiter) throws Exception {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(2);
        while (limiter.getUsedBytes() != 0L && System.nanoTime() < deadline) {
            Thread.yield();
        }
        Assert.assertEquals("terminal settlement must release the generation payload", 0L,
                limiter.getUsedBytes());
    }

    private static PutLogRequest.LogGroup group() {
        return PutLogRequest.LogGroup.newBuilder().addLogs(PutLogRequest.Log.newBuilder()
                .setTime(1)
                .addContents(PutLogRequest.LogContent.newBuilder()
                        .setKey("k").setValue("v").build())
                .build()).build();
    }

    private static ProducerConfig config() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", null);
        config.setMaxThreadCount(2);
        config.setMaxBlockMs(1000L);
        config.setMaxReservedAttempts(2);
        config.validConfig();
        return config;
    }

    private static TLSLogClient recordingClient() {
        return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                    if ("putLogs".equals(method.getName())) {
                        return new PutLogsResponse(new BasicHeader[]{
                                new BasicHeader(X_TLS_REQUESTID, "request")});
                    }
                    if ("toString".equals(method.getName())) return "RecordingClient";
                    return null;
                });
    }

    private static final class Fixture {
        final ProducerConfig config;
        final MemoryLimiter limiter;
        final ProducerStatsState state;
        final BlockingQueue<BatchLog> successQueue = new LinkedBlockingQueue<BatchLog>();
        final BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<BatchLog>();
        final RetryManager retryManager = new RetryManager();
        final LogDispatcher dispatcher;
        final Mover mover;

        Fixture() throws Exception {
            config = config();
            limiter = new MemoryLimiter(4 * 1024 * 1024L, 2 * 1024 * 1024L, true);
            state = new ProducerStatsState(MetricsLevel.DETAILED, 2, limiter,
                    "producer-epoch-key-test", StatsClock.SYSTEM);
            dispatcher = new LogDispatcher(config, "producer-epoch-key-test", successQueue, failureQueue,
                    limiter, new AtomicInteger(), retryManager,
                    new CircuitBreaker(config.getCircuitBreakerConfig()), state);
            Field client = LogDispatcher.class.getDeclaredField("client");
            client.setAccessible(true);
            client.set(dispatcher, recordingClient());
            state.markStarted();
            dispatcher.start();
            mover = new Mover("producer-epoch-key-test-mover", config, dispatcher, retryManager,
                    successQueue, failureQueue, limiter,
                    new CircuitBreaker(config.getCircuitBreakerConfig()), state);
        }

        void close() {
            mover.close();
            dispatcher.closeNow();
            dispatcher.getClient().close();
        }
    }

    private static final class AdmissionGateMap
            extends ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> {
        final CountDownLatch observed = new CountDownLatch(1);
        final CountDownLatch release = new CountDownLatch(1);
        volatile Thread admissionThread;
        volatile BatchLog.BatchManager expected;
        volatile boolean gate;

        @Override
        public BatchLog.BatchManager get(Object key) {
            BatchLog.BatchManager value = super.get(key);
            if (gate && Thread.currentThread() == admissionThread && value == expected) {
                observed.countDown();
                try {
                    release.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            return value;
        }
    }
}
