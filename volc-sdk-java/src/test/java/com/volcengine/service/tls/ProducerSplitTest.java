package com.volcengine.service.tls;

import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.ProducerConfig;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ProducerSplitTest {
    private ProducerImpl newProducer() throws Exception {
        ProducerConfig config = new ProducerConfig("endpoint", "region", "ak", "sk", null);
        config.setTotalSizeInBytes(Integer.MAX_VALUE);
        config.setMaxThreadCount(1);
        config.setMaxBatchSizeBytes(ProducerConfig.MAX_BATCH_SIZE);
        config.setMaxBatchCount(ProducerConfig.MAX_BATCH_COUNT);
        return new ProducerImpl(config);
    }

    private LogDispatcher getDispatcher(ProducerImpl producer) throws Exception {
        Field field = ProducerImpl.class.getDeclaredField("dispatcher");
        field.setAccessible(true);
        return (LogDispatcher) field.get(producer);
    }

    private List<PutLogRequest.LogGroup> collectGroups(LogDispatcher dispatcher) {
        ConcurrentHashMap<BatchLog.BatchKey, BatchLog.BatchManager> batches = dispatcher.getBatches();
        List<PutLogRequest.LogGroup> groups = new ArrayList<>();
        for (BatchLog.BatchManager manager : batches.values()) {
            BatchLog batchLog = manager.getBatchLog();
            if (batchLog == null) {
                continue;
            }
            groups.addAll(batchLog.getLogGroupList().getLogGroupsList());
        }
        return groups;
    }

    private LogItem makeItem(int payloadBytes) {
        LogItem item = new LogItem(1);
        char[] chars = new char[payloadBytes];
        for (int i = 0; i < payloadBytes; i++) {
            chars[i] = 'a';
        }
        item.addContent("k", new String(chars));
        return item;
    }

    @Test
    public void testSplitByCount() throws Exception {
        ProducerImpl producer = newProducer();
        List<LogItem> items = new ArrayList<>();
        for (int i = 0; i < 25000; i++) {
            items.add(makeItem(1));
        }
        producer.sendLogsV2(null, "topic", "source", "file", items, null);

        List<PutLogRequest.LogGroup> groups = collectGroups(getDispatcher(producer));
        int total = 0;
        for (PutLogRequest.LogGroup g : groups) {
            Assert.assertTrue(g.getLogsCount() <= ProducerConfig.MAX_LOG_GROUP_COUNT);
            Assert.assertTrue(g.getSerializedSize() <= ProducerConfig.MAX_BATCH_SIZE);
            total += g.getLogsCount();
        }
        Assert.assertEquals(25000, total);
        Assert.assertEquals(3, groups.size());
    }

    @Test
    public void testSplitBySize() throws Exception {
        ProducerImpl producer = newProducer();
        List<LogItem> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(makeItem(2 * 1024 * 1024));
        }
        producer.sendLogsV2(null, "topic", "source", "file", items, null);

        List<PutLogRequest.LogGroup> groups = collectGroups(getDispatcher(producer));
        int total = 0;
        Assert.assertTrue(groups.size() > 1);
        for (PutLogRequest.LogGroup g : groups) {
            Assert.assertTrue(g.getSerializedSize() <= ProducerConfig.MAX_BATCH_SIZE);
            Assert.assertTrue(g.getLogsCount() <= ProducerConfig.MAX_LOG_GROUP_COUNT);
            total += g.getLogsCount();
        }
        Assert.assertEquals(10, total);
    }

    @Test
    public void testConcurrentProduceNeverExceedsLimits() throws Exception {
        ProducerImpl producer = newProducer();
        Runnable job = () -> {
            List<LogItem> items = new ArrayList<>();
            for (int i = 0; i < 12000; i++) {
                items.add(new LogItem(1));
            }
            try {
                producer.sendLogsV2(null, "topic", "source", "file", items, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        List<PutLogRequest.LogGroup> groups = collectGroups(getDispatcher(producer));
        int total = 0;
        for (PutLogRequest.LogGroup g : groups) {
            Assert.assertTrue(g.getLogsCount() <= ProducerConfig.MAX_LOG_GROUP_COUNT);
            Assert.assertTrue(g.getSerializedSize() <= ProducerConfig.MAX_BATCH_SIZE);
            total += g.getLogsCount();
        }
        Assert.assertEquals(24000, total);
    }
}
