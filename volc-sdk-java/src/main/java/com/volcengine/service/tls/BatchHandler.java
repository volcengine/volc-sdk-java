package com.volcengine.service.tls;

import com.volcengine.model.tls.producer.BatchLog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class BatchHandler extends Thread {
    private final Semaphore memoryLock;
    private final BlockingQueue<BatchLog> batchQueue;
    private final AtomicInteger batchCount;
    private volatile boolean closed;
    private final String name;
    private final static Log LOG = LogFactory.getLog(BatchHandler.class);

    public BatchHandler(String name, Semaphore memoryLock, BlockingQueue<BatchLog> batchQueue, AtomicInteger batchCount) {
        super(name);
        setDaemon(true);
        this.memoryLock = memoryLock;
        this.batchQueue = batchQueue;
        this.batchCount = batchCount;
        this.name = name;
        this.closed = false;
    }

    @Override
    public void run() {
        handleBatches();
    }

    private void handleBatches() {
        while (!this.closed) {
            try {
                BatchLog batch = batchQueue.take();
                handle(batch);
            } catch (InterruptedException e) {
                LOG.info("batch handler " + this.name + " has been interrupted");
            }
        }
    }

    private void handle(BatchLog batch) {
        batch.fireCallbacks();
        batchCount.decrementAndGet();
        memoryLock.release(batch.getCurrentBatchSize());
    }

    public void close() {
        this.closed = true;
        interrupt();
    }
}
