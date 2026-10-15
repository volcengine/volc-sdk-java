package com.volcengine.service.tls.stats;

import com.volcengine.model.tls.consumer.CheckpointInfo;
import com.volcengine.model.tls.consumer.ConsumeShard;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.stats.MetricsLevel;
import com.volcengine.model.tls.stats.StatsOptions;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.consumer.CheckpointTracker;
import com.volcengine.service.tls.consumer.ConsumerImpl;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class CheckpointPendingLifecycleTest {
    @Test
    public void clearingCursorRemovesPendingWithoutInventingAnUpload() throws Exception {
        try (Fixture fixture = new Fixture(false)) {
            fixture.setCursor("cursor-1");
            assertEquals(1L, fixture.pending());

            fixture.setCursor(null);
            fixture.setCursor(null);
            assertEquals(0L, fixture.pending());
            fixture.tracker.uploadCheckpoint();
            assertEquals(0, fixture.uploads.get());

            fixture.setCursor("cursor-2");
            assertEquals(1L, fixture.pending());
            fixture.tracker.uploadCheckpoint();
            assertEquals(1, fixture.uploads.get());
            assertEquals(0L, fixture.pending());
            assertEquals(1L, fixture.state.snapshot(StatsOptions.operational())
                    .getOperational().get().getCheckpointSuccessTotal());
        }
    }

    @Test
    public void clearingCursorDuringUploadDoesNotLeaveOrDoubleClearPending() throws Exception {
        try (Fixture fixture = new Fixture(true)) {
            fixture.setCursor("cursor-1");
            AtomicReference<Throwable> failure = new AtomicReference<>();
            Thread uploader = new Thread(() -> {
                try {
                    fixture.tracker.uploadCheckpoint();
                } catch (Throwable thrown) {
                    failure.set(thrown);
                }
            }, "checkpoint-pending-upload");
            uploader.start();
            try {
                assertTrue(fixture.uploadEntered.await(3, TimeUnit.SECONDS));
                fixture.setCursor(null);
                assertEquals("clearing the next cursor removes pending even during an old upload",
                        0L, fixture.pending());
            } finally {
                fixture.finishUpload.countDown();
                uploader.join(3000L);
            }
            assertFalse("upload must terminate", uploader.isAlive());
            assertNull(failure.get());
            assertEquals(0L, fixture.pending());
            assertFalse(fixture.state.snapshot(StatsOptions.health()).getHealth().get()
                    .getCriticalFlags().contains(
                            com.volcengine.model.tls.stats.CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));

            fixture.setCursor("cursor-2");
            assertEquals(1L, fixture.pending());
            fixture.tracker.uploadCheckpoint();
            assertEquals(2, fixture.uploads.get());
            assertEquals(0L, fixture.pending());
        }
    }

    @Test
    public void successfulNewerUploadRestoresPendingAfterNullThenPersistedCursor() throws Exception {
        try (Fixture fixture = new Fixture(false)) {
            fixture.setCursor("cursor-a");
            fixture.tracker.uploadCheckpoint();
            assertEquals(1, fixture.uploads.get());
            assertEquals(0L, fixture.pending());

            fixture.blockUploads.set(true);
            fixture.setCursor("cursor-b");
            AtomicReference<Throwable> failure = new AtomicReference<>();
            Thread uploader = new Thread(() -> {
                try {
                    fixture.tracker.uploadCheckpoint();
                } catch (Throwable thrown) {
                    failure.set(thrown);
                }
            }, "checkpoint-pending-newer-upload");
            uploader.start();
            try {
                assertTrue(fixture.uploadEntered.await(3, TimeUnit.SECONDS));
                fixture.setCursor(null);
                fixture.setCursor("cursor-a");
            } finally {
                fixture.finishUpload.countDown();
                uploader.join(3000L);
            }
            assertFalse("upload must terminate", uploader.isAlive());
            assertNull(failure.get());
            assertEquals("B success must expose A as pending after null -> A",
                    1L, fixture.pending());

            fixture.tracker.uploadCheckpoint();
            assertEquals("A must be uploaded after B", 3, fixture.uploads.get());
            assertEquals(0L, fixture.pending());
            assertFalse(fixture.state.snapshot(StatsOptions.health()).getHealth().get()
                    .getCriticalFlags().contains(
                            com.volcengine.model.tls.stats.CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
        }
    }

    @Test
    public void staleUploadClearsCurrentGenerationAfterOffReopenAndNullThenCursor() throws Exception {
        try (Fixture fixture = new Fixture(false)) {
            fixture.setCursor("cursor-a");
            fixture.blockUploads.set(true);
            AtomicReference<Throwable> failure = new AtomicReference<>();
            Thread uploader = new Thread(() -> {
                try {
                    fixture.tracker.uploadCheckpoint();
                } catch (Throwable thrown) {
                    failure.set(thrown);
                }
            }, "checkpoint-pending-stale-generation-upload");
            uploader.start();
            try {
                assertTrue(fixture.uploadEntered.await(3, TimeUnit.SECONDS));
                fixture.state.setMetricsLevel(MetricsLevel.OFF);
                fixture.state.setMetricsLevel(MetricsLevel.CORE);
                fixture.setCursor(null);
                fixture.setCursor("cursor-a");
                assertEquals("new generation must observe the re-dirtied cursor before old completion",
                        1L, fixture.pending());
            } finally {
                fixture.finishUpload.countDown();
                uploader.join(3000L);
            }
            assertFalse("upload must terminate", uploader.isAlive());
            assertNull(failure.get());
            assertEquals("stale completion must clean the current generation marker", 0L,
                    fixture.pending());
            assertEquals("stale transport completion must not enter the reopened cohort", 0L,
                    fixture.state.snapshot(StatsOptions.operational()).getOperational().get()
                            .getCheckpointSuccessTotal());
            assertFalse(fixture.state.snapshot(StatsOptions.health()).getHealth().get()
                    .getCriticalFlags().contains(
                            com.volcengine.model.tls.stats.CriticalFlag.ACCOUNTING_INVARIANT_BROKEN));
        }
    }

    private static final class Fixture implements AutoCloseable {
        final AtomicInteger uploads = new AtomicInteger();
        final CountDownLatch uploadEntered = new CountDownLatch(1);
        final CountDownLatch finishUpload = new CountDownLatch(1);
        final AtomicBoolean blockUploads = new AtomicBoolean();
        final ConsumerImpl consumer;
        final ConsumerStatsState state;
        final CheckpointTracker tracker;
        final ConsumeShard shard = new ConsumeShard("topic", 0);

        Fixture(boolean blockUpload) throws Exception {
            blockUploads.set(blockUpload);
            ConsumerConfig config = new ConsumerConfig("https://tls.local.validation", "region", "ak", "sk");
            config.setProjectID("project");
            config.setConsumerGroupName("group");
            config.setConsumerName("consumer");
            config.setTopicIDList(Collections.singletonList("topic"));
            config.setStopTimeout(1);
            config.setMetricsLevel(MetricsLevel.CORE);
            consumer = new ConsumerImpl(config, (topic, shardId, logs) -> { });
            Field clientField = ConsumerImpl.class.getDeclaredField("tlsClient");
            clientField.setAccessible(true);
            ((TLSLogClient) clientField.get(consumer)).close();
            TLSLogClient fake = (TLSLogClient) Proxy.newProxyInstance(TLSLogClient.class.getClassLoader(),
                    new Class<?>[]{TLSLogClient.class}, (proxy, method, args) -> {
                        if ("modifyCheckPoint".equals(method.getName())) {
                            uploads.incrementAndGet();
                            if (blockUploads.get()) {
                                uploadEntered.countDown();
                                if (!finishUpload.await(3, TimeUnit.SECONDS)) {
                                    throw new AssertionError("test upload was not released");
                                }
                            }
                        }
                        return null;
                    });
            clientField.set(consumer, fake);
            Field stateField = ConsumerImpl.class.getDeclaredField("statsState");
            stateField.setAccessible(true);
            state = (ConsumerStatsState) stateField.get(consumer);
            state.markStarted();
            tracker = new CheckpointTracker(consumer, shard);
        }

        void setCursor(String cursor) {
            tracker.setCheckpoint(new CheckpointInfo(cursor, shard));
        }

        long pending() {
            return state.snapshot(StatsOptions.operational()).getOperational().get()
                    .getCheckpointPending().getCurrentItems();
        }

        @Override
        public void close() {
            finishUpload.countDown();
            tracker.abandonPending();
            consumer.stop();
        }
    }
}
