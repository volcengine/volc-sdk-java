package com.volcengine.service.tls;

import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.service.tls.stats.ProducerStatsState;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class BatchHandler extends Thread {
    private final MemoryLimiter memoryLimiter;
    private final BlockingQueue<BatchLog> batchQueue;
    private final AtomicInteger batchCount;
    private volatile boolean closed;
    private final String name;
    private final ProducerStatsState statsState;
    /** true for the success queue handler, false for the failure queue handler. */
    private final boolean successHandler;
    private final static Log LOG = LogFactory.getLog(BatchHandler.class);

    /**
     * Backward-compatible constructor for callers that predate local health stats; uses a
     * disabled stats state so behavior is unchanged.
     */
    public BatchHandler(String name, MemoryLimiter memoryLimiter, BlockingQueue<BatchLog> batchQueue,
                        AtomicInteger batchCount) {
        this(name, memoryLimiter, batchQueue, batchCount, ProducerStatsState.disabled(), true);
    }

    public BatchHandler(String name, MemoryLimiter memoryLimiter, BlockingQueue<BatchLog> batchQueue,
                        AtomicInteger batchCount, ProducerStatsState statsState, boolean successHandler) {
        super(name);
        setDaemon(true);
        this.memoryLimiter = memoryLimiter;
        this.batchQueue = batchQueue;
        this.batchCount = batchCount;
        this.name = name;
        this.statsState = statsState;
        this.successHandler = successHandler;
    }

    @Override
    public void run() {
        statsState.onCallbackWorkerStarted();
        try {
            handleBatches();

            List<BatchLog> batchLogList = new ArrayList<>();
            batchQueue.drainTo(batchLogList);
            for (BatchLog batchLog : batchLogList) {
                handle(batchLog);
            }
        } finally {
            statsState.onCallbackWorkerStopped();
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
        ProducerStatsState stats = batch.getStatsState();
        if (stats != null) {
            stats.onTerminalDequeued();
        }
        try {
            batch.fireCallbacks(stats);
        } catch (Throwable t) {
            LOG.error("batch fire callbacks failed: ", t);
        } finally {
            batchCount.decrementAndGet();
        }
    }

    @Override
    public void start() {
        this.closed = false;
        super.start();
    }

    public void close() {
        this.closed = true;
        // A callback is allowed to request close. It cannot join its own handler, but it also does
        // not need an interrupt to leave: once the callback returns the loop observes closed. Avoid
        // manufacturing an interruption that would mask the explicit incomplete-close feedback.
        if (Thread.currentThread() != this) interrupt();
    }
}
