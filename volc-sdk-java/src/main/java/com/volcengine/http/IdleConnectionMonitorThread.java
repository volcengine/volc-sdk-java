package com.volcengine.http;

import org.apache.http.conn.HttpClientConnectionManager;

import java.util.concurrent.TimeUnit;

public class IdleConnectionMonitorThread extends Thread {

    private final HttpClientConnectionManager connMgr;
    private volatile boolean shutdown;

    public IdleConnectionMonitorThread(HttpClientConnectionManager connMgr) {
        super();
        this.connMgr = connMgr;
    }

    @Override
    public void run() {
        try {
            while (!shutdown) {
                synchronized (this) {
                    wait(5000);
                    // Close expired connections
                    connMgr.closeExpiredConnections();
                    // Optionally, close connections
                    // that have been idle longer than 30 sec
                    connMgr.closeIdleConnections(30, TimeUnit.SECONDS);
                }

                if (this.isInterrupted()) {
                    shutdown();
                }
            }
        } catch (InterruptedException ex) {
            // terminate
            shutdown();
        }
    }

    public void shutdown() {
        shutdown = true;
        connMgr.shutdown();
        synchronized (this) {
            notifyAll();
        }
    }
}
