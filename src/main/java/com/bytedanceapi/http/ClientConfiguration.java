package com.bytedanceapi.http;

public class ClientConfiguration {


    public static final int DEFAULT_CONNECTION_TIMEOUT = 10 * 1000;

    public static final int DEFAULT_SOCKET_TIMEOUT = 50 * 1000;

    public static final int DEFAULT_REQUEST_TIMEOUT = 0;

    public static final int DEFAULT_CLIENT_EXECUTION_TIMEOUT = 0;

    public static final int DEFAULT_MAX_CONNECTIONS = 1000;

    public static final int DEFAULT_MAX_CON_PER_ROUTE = 600;


    private int maxConnections = DEFAULT_MAX_CONNECTIONS;

    private int maxConPerRoute = DEFAULT_MAX_CON_PER_ROUTE;

    private int socketTimeout = DEFAULT_SOCKET_TIMEOUT;

    private int connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;

    private int requestTimeout = DEFAULT_REQUEST_TIMEOUT;

    private int clientExecutionTimeout = DEFAULT_CLIENT_EXECUTION_TIMEOUT;


    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public int getMaxConPerRoute() {
        return maxConPerRoute;
    }

    public void setMaxConPerRoute(int maxConPerRoute) {
        this.maxConPerRoute = maxConPerRoute;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public int getClientExecutionTimeout() {
        return clientExecutionTimeout;
    }

    public void setClientExecutionTimeout(int clientExecutionTimeout) {
        this.clientExecutionTimeout = clientExecutionTimeout;
    }
}
