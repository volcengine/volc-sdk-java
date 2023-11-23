package com.volcengine.service.tls;

import com.volcengine.model.tls.producer.BatchLog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
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
    }

    @Override
    public void run() {
        handleBatches();

        List<BatchLog> batchLogList = new ArrayList<>();
        batchQueue.drainTo(batchLogList);
        for (BatchLog batchLog : batchLogList) {
            handle(batchLog);
        }
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
        try {
            batch.fireCallbacks();
        } catch (Throwable t) {
            LOG.error("batch fire callbacks failed: ", t);
        } finally {
            batchCount.decrementAndGet();
            memoryLock.release(batch.getCurrentBatchSize());
        }
    }

    @Override
    public void start() {
        this.closed = false;
        super.start();
    }

    public void close() {
        this.closed = true;
        interrupt();
    }
}
