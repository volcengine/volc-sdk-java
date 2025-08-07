package com.volcengine.service.tls;

import com.volcengine.model.tls.exception.LogException;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;

import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class TLSUtil {
    public static HttpClientConnectionManager createHttpClientConnectionManager() throws LogException {
        SSLContext sslContext = null;
        try {
            sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {

                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }

            }).build();

        } catch (Exception e) {
            throw new LogException("HttpClientConnectionError", e.getMessage(), "");
        }

        SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext,
                NoopHostnameVerifier.INSTANCE);
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory())
                .register("https", sslSocketFactory).build();

        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(
                socketFactoryRegistry);
        connectionManager.setDefaultMaxPerRoute(50);
        connectionManager.setMaxTotal(200);
        connectionManager.setValidateAfterInactivity(2000);
        connectionManager.setDefaultSocketConfig(
                SocketConfig.custom().setSoTimeout(50 * 1000).setTcpNoDelay(true).build());
        return connectionManager;
    }
}
