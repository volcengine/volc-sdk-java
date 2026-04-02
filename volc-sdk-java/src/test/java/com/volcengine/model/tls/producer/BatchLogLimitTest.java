package com.volcengine.model.tls.producer;

import com.volcengine.model.tls.pb.PutLogRequest;
import org.junit.Assert;
import org.junit.Test;

public class BatchLogLimitTest {
    private PutLogRequest.LogGroup buildGroup(int count) {
        PutLogRequest.LogGroup.Builder builder = PutLogRequest.LogGroup.newBuilder();
        for (int i = 0; i < count; i++) {
            builder.addLogs(PutLogRequest.Log.newBuilder().build());
        }
        return builder.build();
    }

    @Test
    public void testMaxBatchCount32768() {
        ProducerConfig config = new ProducerConfig("endpoint", "region", "ak", "sk", null);
        BatchLog.BatchKey key = new BatchLog.BatchKey("", "topic", "source", "file");
        BatchLog batch = new BatchLog(key, config);

        PutLogRequest.LogGroup g1 = buildGroup(10000);
        PutLogRequest.LogGroup g2 = buildGroup(10000);
        PutLogRequest.LogGroup g3 = buildGroup(10000);
        PutLogRequest.LogGroup g4 = buildGroup(10000);

        Assert.assertTrue(batch.tryAdd(g1, g1.getSerializedSize(), null, g1.getLogsCount(), 0, 0));
        Assert.assertTrue(batch.tryAdd(g2, g2.getSerializedSize(), null, g2.getLogsCount(), 0, 0));
        Assert.assertTrue(batch.tryAdd(g3, g3.getSerializedSize(), null, g3.getLogsCount(), 0, 0));
        Assert.assertFalse(batch.tryAdd(g4, g4.getSerializedSize(), null, g4.getLogsCount(), 0, 0));
        Assert.assertTrue(batch.getCurrentBatchCount() <= ProducerConfig.MAX_BATCH_COUNT);
    }
}
