package com.volcengine.http;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

public class OkHttpClientFactory {

    private static class ClientHolder {
        private static OkHttpClient INSTANCE = new OkHttpClient();

        static {
            OkHttpClient.Builder builder = new OkHttpClient.Builder()
                    .connectTimeout(ClientConfiguration.DEFAULT_CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
                    .readTimeout(ClientConfiguration.DEFAULT_SOCKET_TIMEOUT, TimeUnit.MILLISECONDS);

            String hostname = System.getProperty("volc.proxy.hostname");
            if (StringUtils.isNotBlank(hostname)) {
                int port = 80;
                String portP = System.getProperty("volc.proxy.port");
                if (StringUtils.isNotBlank(portP)) {
                    port = Integer.parseInt(portP);
                }
                SocketAddress addr = new InetSocketAddress(hostname, port);
                Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
                builder.proxy(proxy);
            }
            INSTANCE = builder.build();
        }
    }

    public static OkHttpClient create(ClientConfiguration conf, Proxy proxy, Interceptor... interceptors) {
        OkHttpClient.Builder builder = ClientHolder.INSTANCE.newBuilder();
        builder.proxy(proxy)
                .connectTimeout(conf.getConnectionTimeout(), TimeUnit.MILLISECONDS)
                .readTimeout(conf.getSocketTimeout(), TimeUnit.MILLISECONDS);
        for (Interceptor interceptor: interceptors) {
            builder.addInterceptor(interceptor);
        }

        return builder.build();
    }

    public static OkHttpClient create(Proxy proxy, Interceptor... interceptors) {
        OkHttpClient.Builder builder = ClientHolder.INSTANCE.newBuilder().proxy(proxy);
        for (Interceptor interceptor: interceptors) {
            builder.addInterceptor(interceptor);
        }
        return builder.build();
    }


    public static OkHttpClient create(Interceptor... interceptors) {
        OkHttpClient.Builder builder = ClientHolder.INSTANCE.newBuilder();
        for (Interceptor interceptor: interceptors) {
            builder.addInterceptor(interceptor);
        }
        return builder.build();
    }

    public static OkHttpClient create() {
        return ClientHolder.INSTANCE;
    }

}
