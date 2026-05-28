package com.volcengine.service.tls;

import com.google.protobuf.CodedOutputStream;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class ProducerMemoryLockTest {
    private static void setMaxBlockMsZero(ProducerConfig config) throws Exception {
        Field f = ProducerConfig.class.getDeclaredField("maxBlockMs");
        f.setAccessible(true);
        f.setLong(config, 0L);
    }

    private static MemoryLimiter getMemoryLimiter(ProducerImpl producer) throws Exception {
        Field f = ProducerImpl.class.getDeclaredField("memoryLimiter");
        f.setAccessible(true);
        return (MemoryLimiter) f.get(producer);
    }

    @Test
    public void testAcquireUsesBatchSizeWhenMaxBlockMsIsZero() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", null);
        config.setTotalSizeInBytes(1024 * 1024);
        config.setMaxProducerMemoryBytes(2 * 1024 * 1024);
        config.setMaxThreadCount(1);
        config.setMaxBatchSizeBytes(ProducerConfig.MAX_BATCH_SIZE);
        config.setMaxBatchCount(ProducerConfig.DEFAULT_MAX_BATCH_COUNT);
        setMaxBlockMsZero(config);

        ProducerImpl producer = new ProducerImpl(config);
        MemoryLimiter limiter = getMemoryLimiter(producer);
        long before = limiter.getUsedBytes();

        char[] payload = new char[4096];
        for (int i = 0; i < payload.length; i++) {
            payload[i] = 'a';
        }
        PutLogRequest.Log log = PutLogRequest.Log.newBuilder()
                .setTime(1)
                .addContents(PutLogRequest.LogContent.newBuilder().setKey("k").setValue(new String(payload)).build())
                .build();
        PutLogRequest.LogGroup group = PutLogRequest.LogGroup.newBuilder()
                .setSource("source")
                .setFileName("file")
                .addLogs(log)
                .build();
        int groupSize = group.getSerializedSize();
        int entrySize = CodedOutputStream.computeTagSize(PutLogRequest.LogGroupList.LOGGROUPS_FIELD_NUMBER)
                + CodedOutputStream.computeUInt32SizeNoTag(groupSize)
                + groupSize;

        producer.sendLogGroup(null, "topic", "source", "file", group, null);

        long after = limiter.getUsedBytes();
        Assert.assertEquals(before + entrySize, after);
    }
}
