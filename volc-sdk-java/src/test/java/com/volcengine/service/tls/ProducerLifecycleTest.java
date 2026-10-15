package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.RetryPolicy;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.Attempt;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.stats.CriticalFlag;
import com.volcengine.model.tls.stats.Consistency;
import com.volcengine.model.tls.stats.LifecycleState;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.stats.ProducerStatsState;
import com.volcengine.service.tls.stats.StatsClock;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ProducerLifecycleTest {

    @Test
    public void retryPublicationAndRemovalKeepOneAtomicOldestLedger() throws Exception {
        for (int i = 0; i < 500; i++) {
            final RetryManager manager = new RetryManager();
            final BatchLog batch = retryBatch(i + 1L, System.currentTimeMillis() - 1L);
            final CountDownLatch start = new CountDownLatch(1);
            final AtomicInteger removed = new AtomicInteger();
            final AtomicReference<Throwable> failure = new AtomicReference<Throwable>();
            Thread publisher = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        start.await();
                        manager.put(batch);
                    } catch (Throwable t) {
                        failure.compareAndSet(null, t);
                    }
                }
            });
            Thread remover = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        start.await();
                        removed.addAndGet(manager.handleTimeoutBatch(0).size());
                    } catch (Throwable t) {
                        failure.compareAndSet(null, t);
                    }
                }
            });
            publisher.start();
            remover.start();
            start.countDown();
            publisher.join(2000);
            remover.join(2000);
            Assert.assertFalse(publisher.isAlive());
            Assert.assertFalse(remover.isAlive());
            if (failure.get() != null) throw new AssertionError("retry publication race", failure.get());
            manager.close();
            removed.addAndGet(manager.handleRemainingBatches().size());
            Assert.assertEquals(1, removed.get());
            Assert.assertEquals("oldest ledger must be empty with the physical queue",
                    0L, manager.getHeadEnqueueNanos());
        }
    }

    @Test
    public void retryOldestLedgerHandlesOneOneThousandAndOneHundredThousandBatches() throws Exception {
        assertRetryScale(1);
        assertRetryScale(1_000);
        assertRetryScale(100_000);
    }

    @Test
    public void producerClientRetryOwnershipCannotBeReopenedByMutatingOriginalConfig() throws Exception {
        ProducerConfig config = config();
        RetryPolicy initial = RetryPolicy.defaultPolicy();
        initial.setMaxAttempts(4);
        config.getClientConfig().setRetryPolicy(initial);
        config.validConfig();
        LogDispatcher dispatcher = dispatcher(config, new MemoryLimiter(4096, 2048, true));
        try {
            TLSLogClientImpl client = (TLSLogClientImpl) dispatcher.getClient();

            config.getClientConfig().setRetryPolicy(null);
            Assert.assertEquals(1, invokeRetryAttemptCount(client));

            RetryPolicy reopened = RetryPolicy.defaultPolicy();
            reopened.setMaxAttempts(4);
            config.getClientConfig().setRetryPolicy(reopened);
            Assert.assertEquals(1, invokeRetryAttemptCount(client));
        } finally {
            dispatcher.closeNow();
            dispatcher.getClient().close();
        }
    }

    @Test
    public void gracefulCloseWaitsForAnAdmittedSendBeforeClosingPayloadAdmission() throws Exception {
        ProducerConfig config = config();
        config.setMaxBlockMs(2_000L);
        config.validConfig();
        final MemoryLimiter limiter = new MemoryLimiter(4096, 2048, true);
        Assert.assertTrue(limiter.acquirePayload(limiter.getPayloadCapacityBytes(), 0));
        final LogDispatcher dispatcher = dispatcher(config, limiter);
        dispatcher.start();
        final AtomicReference<Throwable> sendFailure = new AtomicReference<Throwable>();
        final AtomicReference<Throwable> closeFailure = new AtomicReference<Throwable>();
        Thread sender = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    dispatcher.addBatch(null, "topic", "source", "file", group(), null);
                } catch (Throwable t) {
                    sendFailure.set(t);
                }
            }
        });
        sender.start();
        waitForBlocked(sender);
        Thread closer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    dispatcher.close();
                } catch (Throwable t) {
                    closeFailure.set(t);
                }
            }
        });
        closer.start();
        closer.join(100);
        Assert.assertTrue("close must wait for the admitted send", closer.isAlive());

        limiter.releasePayload(limiter.getPayloadCapacityBytes());
        sender.join(2000);
        closer.join(2000);
        Assert.assertFalse(sender.isAlive());
        Assert.assertFalse(closer.isAlive());
        Assert.assertNull(sendFailure.get());
        Assert.assertNull(closeFailure.get());
        Assert.assertFalse("an accepted batch must be published before close returns",
                dispatcher.getBatches().isEmpty());
        dispatcher.closeNow();
        dispatcher.getClient().close();
    }

    @Test
    public void producerCloseTimeoutBoundsAdmissionDrainWithoutCancellingTheWinner() throws Exception {
        ProducerConfig config = config();
        config.setMetricsLevel(MetricsLevel.DETAILED);
        config.setMaxBlockMs(1_000L);
        config.validConfig();
        final ProducerImpl producer = new ProducerImpl(config);
        final LogDispatcher dispatcher = (LogDispatcher) field(ProducerImpl.class, "dispatcher").get(producer);
        final MemoryLimiter limiter = (MemoryLimiter) field(ProducerImpl.class, "memoryLimiter").get(producer);
        TLSLogClient originalClient = dispatcher.getClient();
        originalClient.close();
        final AtomicBoolean clientClosed = new AtomicBoolean();
        field(LogDispatcher.class, "client").set(dispatcher, trackingClient(clientClosed));
        final long full = limiter.getPayloadCapacityBytes();
        Assert.assertTrue(limiter.acquirePayload(full, 0));
        final AtomicReference<Throwable> sendFailure = new AtomicReference<Throwable>();
        Thread sender = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    dispatcher.addBatch(null, "topic", "source", "file", group(), null);
                } catch (Throwable t) {
                    sendFailure.set(t);
                }
            }
        });
        sender.start();
        waitForBlocked(sender);

        long startNanos = System.nanoTime();
        boolean timedOut = false;
        try {
            producer.close(50L);
        } catch (com.volcengine.model.tls.exception.LogException expected) {
            timedOut = true;
        }
        long elapsedMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNanos);
        Assert.assertTrue("close(timeout) must report an unfinished admitted send", timedOut);
        Assert.assertTrue("close timeout must be a hard admission-drain budget, elapsed=" + elapsedMs,
                elapsedMs < 500L);
        Assert.assertTrue("timing out close must not cancel the admitted sender", sender.isAlive());
        Assert.assertFalse("admission timeout must not shut down the sender executor",
                dispatcher.getExecutorService().isShutdown());
        Assert.assertFalse("admission timeout must retain the client for admitted work", clientClosed.get());
        try {
            dispatcher.addBatch(null, "topic", "source", "file", group(), null);
            Assert.fail("new sends must be rejected after graceful close starts");
        } catch (com.volcengine.model.tls.exception.LogException expected) {
            Assert.assertTrue(expected.getMessage().contains("closed"));
        }

        limiter.releasePayload(full);
        sender.join(2000);
        Assert.assertFalse(sender.isAlive());
        Assert.assertNull(sendFailure.get());
        producer.close(2000L);
        Assert.assertTrue("retrying close must close the client", clientClosed.get());
        Assert.assertTrue("retrying close must end the sender worker", dispatcher.getExecutorService().isTerminated());
    }

    @Test
    public void closeNowCancelsARealFullBudgetWaiterWithinItsForceBarrier() throws Exception {
        ProducerConfig config = config();
        config.setMetricsLevel(MetricsLevel.DETAILED);
        config.setMaxBlockMs(Integer.MAX_VALUE);
        config.validConfig();
        final ProducerImpl producer = new ProducerImpl(config);
        final LogDispatcher dispatcher = (LogDispatcher) field(ProducerImpl.class, "dispatcher").get(producer);
        final MemoryLimiter limiter = (MemoryLimiter) field(ProducerImpl.class, "memoryLimiter").get(producer);
        ProducerStatsState state = (ProducerStatsState) field(ProducerImpl.class, "statsState").get(producer);
        final long full = limiter.getPayloadCapacityBytes();
        Assert.assertTrue(state.acquirePayloadAndAccept(limiter, full, 0, 1));
        final AtomicReference<Throwable> sendFailure = new AtomicReference<Throwable>();
        Thread sender = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    dispatcher.addBatch(null, "topic", "source", "file", group(), null);
                } catch (Throwable t) {
                    sendFailure.set(t);
                }
            }
        });
        sender.start();
        waitForBlocked(sender);
        final AtomicReference<Throwable> closeFailure = new AtomicReference<Throwable>();
        Thread closer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer.closeNow();
                } catch (Throwable t) {
                    closeFailure.set(t);
                }
            }
        });
        closer.start();
        closer.join(300L);
        boolean bounded = !closer.isAlive();
        if (!bounded) {
            // Cleanup for the pre-fix implementation without waiting Integer.MAX_VALUE ms.
            limiter.releasePayload(full);
            closer.join(3000L);
        }

        Assert.assertTrue("force close must not inherit the sender maxBlockMs", bounded);
        Assert.assertFalse(closer.isAlive());
        sender.join(1000L);
        Assert.assertFalse("force-closed admitted waiter must exit", sender.isAlive());
        Assert.assertTrue(sendFailure.get() instanceof com.volcengine.model.tls.exception.LogException);
        Assert.assertNull(closeFailure.get());
        com.volcengine.model.tls.stats.ProducerStatsSnapshot first = producer.getStats(StatsOptions.debug());
        com.volcengine.model.tls.stats.ProducerStatsSnapshot second = producer.getStats(StatsOptions.debug());
        Assert.assertEquals(first.toJson(), second.toJson());
        Assert.assertEquals(1L, first.getOperational().get().getAcceptedLogsTotal());
        Assert.assertEquals(1L, first.getOperational().get().getTerminalDroppedLogsTotal());
        Assert.assertEquals(0L, first.getManagedMemory().get().getPayloadOwnedBytes());
        Assert.assertEquals(0L, first.getManagedMemory().get().getUsedBytes());
        Assert.assertTrue(first.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void closeNowClosesClientAndWaitsForSenderBeforeFreezingFinalStats() throws Exception {
        ProducerConfig config = config();
        config.setMetricsLevel(MetricsLevel.DETAILED);
        final ProducerImpl producer = new ProducerImpl(config);
        final LogDispatcher dispatcher = (LogDispatcher) field(ProducerImpl.class, "dispatcher").get(producer);
        TLSLogClient original = dispatcher.getClient();
        original.close();
        final AtomicBoolean clientClosed = new AtomicBoolean();
        field(LogDispatcher.class, "client").set(dispatcher, trackingClient(clientClosed));
        final CountDownLatch senderStarted = new CountDownLatch(1);
        final CountDownLatch senderInterrupted = new CountDownLatch(1);
        final CountDownLatch allowSenderExit = new CountDownLatch(1);
        dispatcher.getExecutorService().submit(new Runnable() {
            @Override
            public void run() {
                senderStarted.countDown();
                try {
                    allowSenderExit.await();
                } catch (InterruptedException e) {
                    senderInterrupted.countDown();
                    while (true) {
                        try {
                            allowSenderExit.await();
                            return;
                        } catch (InterruptedException ignored) {
                            // Deliberately stay alive until the test releases us.
                        }
                    }
                }
            }
        });
        Assert.assertTrue(senderStarted.await(2, TimeUnit.SECONDS));
        final AtomicReference<Throwable> closeFailure = new AtomicReference<Throwable>();
        Thread closer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer.closeNow();
                } catch (Throwable t) {
                    closeFailure.set(t);
                }
            }
        });
        closer.start();
        Assert.assertTrue(senderInterrupted.await(2, TimeUnit.SECONDS));
        closer.join(100);
        Assert.assertTrue("closeNow must not freeze while a sender remains alive", closer.isAlive());
        Assert.assertTrue("the transport must be closed before waiting for senders", clientClosed.get());

        allowSenderExit.countDown();
        closer.join(3000);
        Assert.assertFalse(closer.isAlive());
        Assert.assertNull(closeFailure.get());
        Assert.assertTrue(dispatcher.getExecutorService().isTerminated());
        Assert.assertFalse(producer.getStats(StatsOptions.health()).getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void preInterruptedCloseNowStillTearsDownWorkersAndFreezesIncompleteFinal() throws Exception {
        ProducerConfig config = config();
        config.setMetricsLevel(MetricsLevel.DETAILED);
        final ProducerImpl producer = new ProducerImpl(config);
        final LogDispatcher dispatcher = (LogDispatcher) field(ProducerImpl.class, "dispatcher").get(producer);
        TLSLogClient original = dispatcher.getClient();
        original.close();
        final AtomicBoolean clientClosed = new AtomicBoolean();
        field(LogDispatcher.class, "client").set(dispatcher, trackingClient(clientClosed));
        final BatchHandler successHandler = (BatchHandler) field(ProducerImpl.class, "successHandler").get(producer);
        final BatchHandler failHandler = (BatchHandler) field(ProducerImpl.class, "failHandler").get(producer);
        final Mover mover = (Mover) field(ProducerImpl.class, "mover").get(producer);
        final CountDownLatch senderStarted = new CountDownLatch(1);
        final CountDownLatch senderExited = new CountDownLatch(1);
        producer.start();
        dispatcher.getExecutorService().submit(new Runnable() {
            @Override
            public void run() {
                senderStarted.countDown();
                try {
                    new CountDownLatch(1).await();
                } catch (InterruptedException expected) {
                    // Force close owns this interruption.
                } finally {
                    senderExited.countDown();
                }
            }
        });
        Assert.assertTrue(senderStarted.await(2, TimeUnit.SECONDS));

        Throwable closeFailure = null;
        Thread.currentThread().interrupt();
        try {
            producer.closeNow();
        } catch (Throwable failure) {
            closeFailure = failure;
        }
        boolean interruptRestored = Thread.interrupted();
        boolean senderStopped = senderExited.await(1, TimeUnit.SECONDS)
                && dispatcher.getExecutorService().isTerminated();
        boolean workersStopped = !mover.isAlive() && !successHandler.isAlive() && !failHandler.isAlive();
        com.volcengine.model.tls.stats.ProducerStatsSnapshot first = producer.getStats(StatsOptions.debug());
        com.volcengine.model.tls.stats.ProducerStatsSnapshot second = producer.getStats(StatsOptions.debug());
        boolean finalStable = first.getHeader().getLifecycleState() == LifecycleState.CLOSED
                && first.getHeader().getConsistency() == Consistency.FINAL
                && first.toJson().equals(second.toJson());

        if (!finalStable || !workersStopped) {
            // Cleanup for the pre-fix implementation after recording its partial-close state.
            try {
                producer.closeNow();
            } catch (Throwable ignored) {
                Thread.interrupted();
            }
        }

        Assert.assertTrue("pre-existing interruption must be reported after cleanup",
                closeFailure instanceof InterruptedException);
        Assert.assertTrue("closeNow must restore the caller interrupt bit", interruptRestored);
        Assert.assertTrue("closeNow must wait for sender executor termination", senderStopped);
        Assert.assertTrue("closeNow must stop mover and callback handlers", workersStopped);
        Assert.assertTrue("closeNow must publish one stable canonical FINAL", finalStable);
        Assert.assertTrue(first.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
        Assert.assertTrue("transport must still close on an interrupted caller", clientClosed.get());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void closeNowKeepsCallbackHandlersOpenUntilLateSenderPublicationCompletes() throws Exception {
        ProducerConfig config = config();
        config.setMetricsLevel(MetricsLevel.DETAILED);
        final ProducerImpl producer = new ProducerImpl(config);
        final LogDispatcher dispatcher = (LogDispatcher) field(ProducerImpl.class, "dispatcher").get(producer);
        final ProducerStatsState stats = (ProducerStatsState) field(ProducerImpl.class, "statsState").get(producer);
        BatchHandler successHandler = (BatchHandler) field(ProducerImpl.class, "successHandler").get(producer);
        final LinkedBlockingQueue<BatchLog> successQueue = (LinkedBlockingQueue<BatchLog>)
                field(BatchHandler.class, "batchQueue").get(successHandler);
        ((AtomicInteger) field(ProducerImpl.class, "batchCount").get(producer)).incrementAndGet();
        final CountDownLatch callback = new CountDownLatch(1);
        final BatchLog terminal = retryBatch(0L, 0L);
        terminal.setStatsState(stats);
        terminal.addAttempt(new Attempt(true, "request", null, null, 200));
        terminal.getCallBackList().add(new CallBack() {
            @Override
            public void onComplete(Result result) {
                callback.countDown();
            }
        });
        final CountDownLatch senderInterrupted = new CountDownLatch(1);
        final CountDownLatch allowPublication = new CountDownLatch(1);
        producer.start();
        dispatcher.getExecutorService().submit(new Runnable() {
            @Override
            public void run() {
                try {
                    allowPublication.await();
                } catch (InterruptedException e) {
                    senderInterrupted.countDown();
                    boolean done = false;
                    while (!done) {
                        try {
                            allowPublication.await();
                            done = true;
                        } catch (InterruptedException ignored) {
                            // Keep the controlled sender alive until publication is released.
                        }
                    }
                }
                stats.publishTerminal(successQueue, terminal);
            }
        });
        final AtomicReference<Throwable> closeFailure = new AtomicReference<Throwable>();
        Thread closer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer.closeNow();
                } catch (Throwable t) {
                    closeFailure.set(t);
                }
            }
        });
        closer.start();
        Assert.assertTrue(senderInterrupted.await(2, TimeUnit.SECONDS));
        closer.join(100);
        Assert.assertTrue(closer.isAlive());
        allowPublication.countDown();
        closer.join(3000);

        Assert.assertFalse(closer.isAlive());
        Assert.assertNull(closeFailure.get());
        Assert.assertTrue("late sender terminal must still reach its callback", callback.await(1, TimeUnit.SECONDS));
        Assert.assertTrue(successQueue.isEmpty());
        Assert.assertFalse(producer.getStats(StatsOptions.health()).getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    @Test
    public void callbackInitiatedGracefulCloseFailsBoundedlyAndFreezesIncompleteFinal() throws Exception {
        assertCallbackInitiatedCloseIsExplicitlyIncomplete(false);
    }

    @Test
    public void callbackInitiatedForceCloseFailsBoundedlyAndFreezesIncompleteFinal() throws Exception {
        assertCallbackInitiatedCloseIsExplicitlyIncomplete(true);
    }

    @Test
    public void producerCredentialLogsAndValidationErrorsNeverContainCredentialValues() throws Exception {
        final List<String> messages = Collections.synchronizedList(new ArrayList<String>());
        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord record) {
                if (record != null && record.getMessage() != null) messages.add(record.getMessage());
            }

            @Override public void flush() {}
            @Override public void close() {}
        };
        handler.setLevel(Level.ALL);
        Logger dispatcherLogger = Logger.getLogger(LogDispatcher.class.getName());
        Logger producerLogger = Logger.getLogger(ProducerImpl.class.getName());
        Level dispatcherLevel = dispatcherLogger.getLevel();
        Level producerLevel = producerLogger.getLevel();
        boolean dispatcherParent = dispatcherLogger.getUseParentHandlers();
        boolean producerParent = producerLogger.getUseParentHandlers();
        dispatcherLogger.setLevel(Level.ALL);
        producerLogger.setLevel(Level.ALL);
        dispatcherLogger.setUseParentHandlers(false);
        producerLogger.setUseParentHandlers(false);
        dispatcherLogger.addHandler(handler);
        producerLogger.addHandler(handler);

        ProducerImpl producer = null;
        String validationText = "";
        String resetText = "";
        try {
            ProducerConfig initial = new ProducerConfig("http://endpoint", "region",
                    "AK_INITIAL_SENTINEL", "SECRET_INITIAL_SENTINEL", "TOKEN_INITIAL_SENTINEL");
            initial.setMaxThreadCount(1);
            initial.validConfig();
            producer = new ProducerImpl(initial);
            producer.resetAccessKeyToken("AK_ROTATED_SENTINEL", "SECRET_ROTATED_SENTINEL",
                    "TOKEN_ROTATED_SENTINEL");
            producer.setApiKey("API_ROTATED_SENTINEL");
            ProducerConfig replacement = new ProducerConfig("http://replacement", "region",
                    "API_CONFIG_SENTINEL", "AK_CONFIG_SENTINEL", "SECRET_CONFIG_SENTINEL",
                    "TOKEN_CONFIG_SENTINEL");
            replacement.validConfig();
            producer.config(replacement);
            messages.add(String.valueOf(replacement));
            try {
                producer.resetAccessKeyToken("", "SECRET_ERROR_SENTINEL", "TOKEN_ERROR_SENTINEL");
            } catch (Throwable expected) {
                resetText = String.valueOf(expected);
            }
            try {
                new ProducerConfig("", "region", "AK_VALIDATION_SENTINEL",
                        "SECRET_VALIDATION_SENTINEL", "TOKEN_VALIDATION_SENTINEL").validConfig();
            } catch (Throwable expected) {
                validationText = String.valueOf(expected);
            }
        } finally {
            if (producer != null) producer.closeNow();
            dispatcherLogger.removeHandler(handler);
            producerLogger.removeHandler(handler);
            dispatcherLogger.setUseParentHandlers(dispatcherParent);
            producerLogger.setUseParentHandlers(producerParent);
            dispatcherLogger.setLevel(dispatcherLevel);
            producerLogger.setLevel(producerLevel);
        }

        String all = messages.toString() + resetText + validationText;
        Assert.assertFalse("access keys must not leak: " + all, all.contains("AK_"));
        Assert.assertFalse("secrets must not leak: " + all, all.contains("SECRET_"));
        Assert.assertFalse("tokens must not leak: " + all, all.contains("TOKEN_"));
        Assert.assertFalse("api keys must not leak: " + all, all.contains("API_"));
    }

    @SuppressWarnings("unchecked")
    private static void assertCallbackInitiatedCloseIsExplicitlyIncomplete(final boolean force) throws Exception {
        ProducerConfig config = config();
        config.setMetricsLevel(MetricsLevel.DETAILED);
        final ProducerImpl producer = new ProducerImpl(config);
        BatchHandler successHandler = (BatchHandler) field(ProducerImpl.class, "successHandler").get(producer);
        LinkedBlockingQueue<BatchLog> successQueue = (LinkedBlockingQueue<BatchLog>)
                field(BatchHandler.class, "batchQueue").get(successHandler);
        final ProducerStatsState stats = (ProducerStatsState) field(ProducerImpl.class, "statsState").get(producer);
        ((AtomicInteger) field(ProducerImpl.class, "batchCount").get(producer)).incrementAndGet();
        final AtomicReference<Throwable> closeFailure = new AtomicReference<Throwable>();
        final CountDownLatch callbackDone = new CountDownLatch(1);
        BatchLog terminal = retryBatch(0L, 0L);
        terminal.setStatsState(stats);
        terminal.addAttempt(new Attempt(true, "request", null, null, 200));
        terminal.getCallBackList().add(new CallBack() {
            @Override
            public void onComplete(Result result) {
                try {
                    if (force) producer.closeNow();
                    else producer.close(1000L);
                } catch (Throwable t) {
                    closeFailure.set(t);
                } finally {
                    callbackDone.countDown();
                }
            }
        });
        producer.start();
        stats.publishTerminal(successQueue, terminal);

        Assert.assertTrue("callback close must finish within its bound", callbackDone.await(3, TimeUnit.SECONDS));
        successHandler.join(1000L);
        BatchHandler failureHandler = (BatchHandler) field(ProducerImpl.class, "failHandler").get(producer);
        failureHandler.join(1000L);
        Assert.assertFalse("final requires both callback workers to exit", successHandler.isAlive());
        Assert.assertFalse("final requires both callback workers to exit", failureHandler.isAlive());
        Assert.assertTrue("callback close must report that it could not join itself",
                closeFailure.get() instanceof com.volcengine.model.tls.exception.LogException);
        com.volcengine.model.tls.stats.ProducerStatsSnapshot first = producer.getStats(StatsOptions.debug());
        com.volcengine.model.tls.stats.ProducerStatsSnapshot second = producer.getStats(StatsOptions.debug());
        Assert.assertEquals(first.toJson(), second.toJson());
        Assert.assertTrue(first.getHealth().get().getCriticalFlags()
                .contains(CriticalFlag.FINALIZATION_INCOMPLETE));
    }

    private static void assertRetryScale(int count) throws Exception {
        RetryManager manager = new RetryManager();
        long future = System.currentTimeMillis() + 60_000L;
        for (int i = 0; i < count; i++) {
            manager.put(retryBatch(i + 1L, future));
        }
        Assert.assertEquals(1L, manager.getHeadEnqueueNanos());
        manager.close();
        List<BatchLog> remaining = manager.handleRemainingBatches();
        Assert.assertEquals(count, remaining.size());
        Assert.assertEquals(0L, manager.getHeadEnqueueNanos());
    }

    private static BatchLog retryBatch(long epoch, long retryAtMs) throws Exception {
        BatchLog batch = new BatchLog(new BatchLog.BatchKey(null, "topic", "source", "file"), config());
        batch.setRetryQueueEnterNanos(epoch);
        batch.setNextRetryMs(retryAtMs);
        return batch;
    }

    private static int invokeRetryAttemptCount(TLSLogClientImpl client) throws Exception {
        final AtomicInteger calls = new AtomicInteger();
        Method method = TLSLogClientImpl.class.getDeclaredMethod("executeWithRetry", Supplier.class);
        method.setAccessible(true);
        method.invoke(client, new Supplier<RawResponse>() {
            @Override
            public RawResponse get() {
                int call = calls.incrementAndGet();
                int code = call == 1 ? SdkError.ERESP.getNumber() : SdkError.SUCCESS.getNumber();
                int http = call == 1 ? 503 : 200;
                return new RawResponse(null, code, null, null, http);
            }
        });
        return calls.get();
    }

    private static LogDispatcher dispatcher(ProducerConfig config, MemoryLimiter limiter) throws Exception {
        ProducerStatsState state = new ProducerStatsState(MetricsLevel.DETAILED, 1, limiter,
                "producer-lifecycle", StatsClock.SYSTEM);
        return new LogDispatcher(config, "producer-lifecycle", new LinkedBlockingQueue<BatchLog>(),
                new LinkedBlockingQueue<BatchLog>(), limiter, new AtomicInteger(), new RetryManager(),
                new CircuitBreaker(config.getCircuitBreakerConfig()), state);
    }

    private static ProducerConfig config() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", null);
        config.setMaxThreadCount(1);
        config.setMaxBlockMs(0);
        config.setMaxReservedAttempts(2);
        config.validConfig();
        return config;
    }

    private static PutLogRequest.LogGroup group() {
        return PutLogRequest.LogGroup.newBuilder().addLogs(PutLogRequest.Log.newBuilder()
                .setTime(1).addContents(PutLogRequest.LogContent.newBuilder()
                        .setKey("k").setValue("v").build()).build()).build();
    }

    private static Field field(Class<?> type, String name) throws Exception {
        Field field = type.getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }

    private static void waitForBlocked(Thread thread) throws InterruptedException {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(2);
        while (System.nanoTime() < deadline) {
            if (thread.getState() == Thread.State.WAITING
                    || thread.getState() == Thread.State.TIMED_WAITING) return;
            Thread.yield();
        }
        Assert.fail("admitted sender did not block on the real memory budget");
    }

    private static TLSLogClient trackingClient(final AtomicBoolean closed) {
        return (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                    if ("close".equals(method.getName())) closed.set(true);
                    if ("toString".equals(method.getName())) return "TrackingClient";
                    Class<?> result = method.getReturnType();
                    if (result == boolean.class) return false;
                    if (result == int.class) return 0;
                    if (result == long.class) return 0L;
                    return null;
                });
    }

}
