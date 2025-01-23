package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.BatchLog.BatchKey;
import com.volcengine.model.tls.producer.ProducerConfig;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatchLogTest extends BaseTest {

    private BatchLog batchLog;

    @Before
    public void setUp() {

        BatchKey batchKey = new BatchKey("", "test-topic-id", "test-source", "test-filename");

        ProducerConfig producerConfig = new ProducerConfig(
                clientConfig.getEndpoint(),
                clientConfig.getRegion(),
                clientConfig.getAccessKeyId(),
                clientConfig.getAccessKeySecret(),
                clientConfig.getSecurityToken()
        );

        batchLog = new BatchLog(batchKey, producerConfig);
    }

    @Test
    public void testHandleNextTry() {

        for (int i = 0; i < batchLog.getProducerConfig().getRetryCount(); i++) {

            batchLog.handleNextTry();
            long now = System.currentTimeMillis();

            assertEquals(i, batchLog.getAttemptCount());
            assertTrue(1 < batchLog.getRetryBackoffMs());
            assertTrue(now + batchLog.getRetryBackoffMs() >= batchLog.getNextRetryMs());
            assertTrue(batchLog.getRetryBackoffMs() <= batchLog.getMaxRetryBackoffMs());

            batchLog.setAttemptCount(batchLog.getAttemptCount() + 1);
        }

        assertEquals(1000, batchLog.getBaseRetryBackoffMs());
        assertEquals(1000, batchLog.getBaseIncreaseBackoffMs());
        assertEquals(10 * 1000, batchLog.getMaxRetryBackoffMs());
    }

    @Test
    public void  testToString() {
        String string = batchLog.toString();
        assertFalse(string.isEmpty());
    }
}
