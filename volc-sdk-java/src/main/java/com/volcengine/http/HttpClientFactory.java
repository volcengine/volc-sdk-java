package com.volcengine.http;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;

public class HttpClientFactory {

    public static HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {
        @Override
        public boolean retryRequest(IOException exception,
                                    int executionCount, HttpContext context) {
            if (executionCount >= 5) {
                return false;
            }
            if (exception instanceof NoHttpResponseException) {
                return true;
            }
            if (exception instanceof InterruptedIOException) {
                return false;
            }
            if (exception instanceof UnknownHostException) {
                return false;
            }
            HttpClientContext clientContext = HttpClientContext
                    .adapt(context);
            HttpRequest request = clientContext.getRequest();

            return !(request instanceof HttpEntityEnclosingRequest);
        }
    };
    private static ConnectionKeepAliveStrategy connectionKeepAliveStrategy;

    public static ClientInstance create(ClientConfiguration configuration, HttpHost proxy) {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        int maxCon = configuration.getMaxConnections();
        int maxConPerRoute = configuration.getMaxConPerRoute();
        connectionManager.setMaxTotal(maxCon);
        connectionManager.setDefaultMaxPerRoute(maxConPerRoute);

        ConnectionKeepAliveStrategy strategy;
        if (connectionKeepAliveStrategy != null) {
            strategy = connectionKeepAliveStrategy;
        } else {
            strategy = getConnectionKeepAliveStrategy();
        }
        HttpClient httpClient;
        httpClient = HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setKeepAliveStrategy(strategy)
                .setRetryHandler(httpRequestRetryHandler)
                .setDefaultRequestConfig(RequestConfig.custom().setStaleConnectionCheckEnabled(true).build())
                .setProxy(proxy)
                .build();

        IdleConnectionMonitorThread daemonThread = new IdleConnectionMonitorThread(connectionManager);
        daemonThread.setDaemon(true);
        daemonThread.start();

        return new ClientInstance(httpClient, daemonThread);
    }

    public static ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy() {
        return new ConnectionKeepAliveStrategy() {
            @Override
            public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
                HeaderElementIterator it = new BasicHeaderElementIterator
                        (response.headerIterator(HTTP.CONN_KEEP_ALIVE));
                while (it.hasNext()) {
                    HeaderElement he = it.nextElement();
                    String param = he.getName();
                    String value = he.getValue();
                    if (value != null && param.equalsIgnoreCase
                            ("timeout")) {
                        return Long.parseLong(value) * 1000;
                    }
                }
                return 60 * 1000;//如果没有约定，则默认定义时长为60s
            }
        };
    }

    public static void setConnectionKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        HttpClientFactory.connectionKeepAliveStrategy = connectionKeepAliveStrategy;
    }

    @Getter
    @AllArgsConstructor
    public static class ClientInstance{
        private HttpClient httpClient;
        private IdleConnectionMonitorThread daemonThread;
    }
}
