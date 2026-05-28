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
    /**
     * 默认入口：保持向后兼容（trust-all + NoopHostnameVerifier）。
     *
     * <p>L4-D2：原行为存在 P0 级 MITM 风险（接受任意 CA / 自签 / 主机名不匹配），
     * 但收紧默认会破坏存量自签 / 私有 CA 用户。本次仅暴露
     * {@link #createHttpClientConnectionManager(boolean)} 开关；安全敏感场景请显式
     * 传 {@code true}（或在 {@code ClientConfig} 中 {@code setVerifySsl(true)}），
     * 切换到 JDK 默认安全栈，与 Go / Python / C++ V2 默认对齐。
     */
    public static HttpClientConnectionManager createHttpClientConnectionManager() throws LogException {
        return createHttpClientConnectionManager(false);
    }

    /**
     * @param verifySsl true：使用 JDK 默认 SSLContext + 默认 HostnameVerifier（安全，推荐）；
     *                  false：信任任意证书 + 跳过主机名校验（仅供自签 / 调试场景，存在 MITM 风险）。
     */
    public static HttpClientConnectionManager createHttpClientConnectionManager(boolean verifySsl)
            throws LogException {
        SSLConnectionSocketFactory sslSocketFactory;
        if (verifySsl) {
            sslSocketFactory = SSLConnectionSocketFactory.getSocketFactory();
        } else {
            try {
                SSLContext sslContext = new SSLContextBuilder()
                        .loadTrustMaterial(null, new TrustStrategy() {
                            @Override
                            public boolean isTrusted(X509Certificate[] chain, String authType)
                                    throws CertificateException {
                                return true;
                            }
                        })
                        .build();
                sslSocketFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
            } catch (Exception e) {
                throw new LogException("HttpClientConnectionError", e.getMessage(), "");
            }
        }

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
