package com.volcengine.model.tls;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.service.tls.TLSHttpUtil;
import com.volcengine.service.tls.TLSLogClient;
import com.volcengine.service.tls.TLSLogClientImpl;
import com.volcengine.service.tls.TLSUtil;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.http.IdleConnectionMonitorThread;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * HTTPS verifySsl 回归用例：HTTPS 仅暴露 verifySsl 开关（默认保持向后兼容 trust-all）。
 *
 * 历史行为：TLSUtil.createHttpClientConnectionManager() 硬编码 trust-all
 * + NoopHostnameVerifier，等同明文。
 * 修复策略（保兼容）：ClientConfig.verifySsl 默认 false（保留旧 trust-all 行为，
 * 避免破坏自签/私有 CA 用户）；新增 (boolean) 重载，安全敏感场景由用户显式
 * setVerifySsl(true) 切换至 JDK 默认安全栈。
 */
public class TlsSslVerificationTest {

    @Test
    public void clientConfigDefaultsToVerifySslFalseForCompat() {
        ClientConfig cfg = new ClientConfig(
                "https://tls-cn-guilin-boe.volces.com",
                "cn-guilin-boe",
                "ak",
                "sk");
        assertFalse("ClientConfig.verifySsl 默认必须为 false（保留旧 trust-all 行为，避免破坏存量自签用户）",
                cfg.isVerifySsl());
    }

    @Test
    public void clientConfigCanOptInToSecureVerification() {
        ClientConfig cfg = new ClientConfig(
                "https://tls-cn-guilin-boe.volces.com",
                "cn-guilin-boe",
                "ak",
                "sk");
        cfg.setVerifySsl(true);
        assertTrue(cfg.isVerifySsl());
    }

    @Test
    public void defaultFactoryRemainsBackwardCompatibleTrustAll() throws LogException {
        // 默认无参入口保持旧 trust-all 行为，等价于 createHttpClientConnectionManager(false)；
        // 仅当调用方显式传 true 才使用 JDK 默认安全栈。
        HttpClientConnectionManager mgr = TLSUtil.createHttpClientConnectionManager();
        assertNotNull(mgr);
    }

    @Test
    public void explicitVerifyTrueProducesSecureConnectionManager() throws LogException {
        HttpClientConnectionManager mgr = TLSUtil.createHttpClientConnectionManager(true);
        assertNotNull(mgr);
    }

    @Test
    public void explicitVerifyFalseStillSupportedForLegacyCallers() throws LogException {
        // 显式回退到 trust-all 仍可工作（仅供自签/调试），不应抛异常。
        HttpClientConnectionManager mgr = TLSUtil.createHttpClientConnectionManager(false);
        assertNotNull(mgr);
    }

    @Test
    public void clientBuilderWiresVerifySslTrueIntoDirectClient() throws Exception {
        ClientConfig cfg = new ClientConfig(
                "https://tls-cn-guilin-boe.volces.com",
                "cn-guilin-boe",
                "ak",
                "sk");
        cfg.setVerifySsl(true);
        TLSLogClient client = ClientBuilder.newClient(cfg);
        try {
            PoolingHttpClientConnectionManager manager = connectionManagerOf(client);
            assertEquals(200, manager.getMaxTotal());
            assertTrue("verifySsl=true must keep the active monitor bound to the replacement connection manager",
                    manager == monitoredConnectionManagerOf(client));
        } finally {
            client.close();
        }
    }

    private static PoolingHttpClientConnectionManager connectionManagerOf(TLSLogClient client) throws Exception {
        Field httpRequestField = TLSLogClientImpl.class.getDeclaredField("httpRequest");
        httpRequestField.setAccessible(true);
        TLSHttpUtil httpRequest = (TLSHttpUtil) httpRequestField.get(client);
        HttpClient httpClient = httpRequest.getHttpClient();
        Field connManagerField = httpClient.getClass().getDeclaredField("connManager");
        connManagerField.setAccessible(true);
        return (PoolingHttpClientConnectionManager) connManagerField.get(httpClient);
    }

    private static HttpClientConnectionManager monitoredConnectionManagerOf(TLSLogClient client) throws Exception {
        Field httpRequestField = TLSLogClientImpl.class.getDeclaredField("httpRequest");
        httpRequestField.setAccessible(true);
        TLSHttpUtil httpRequest = (TLSHttpUtil) httpRequestField.get(client);
        Field monitorThreadField = BaseServiceImpl.class.getDeclaredField("monitorThread");
        monitorThreadField.setAccessible(true);
        IdleConnectionMonitorThread monitorThread = (IdleConnectionMonitorThread) monitorThreadField.get(httpRequest);
        Field connMgrField = IdleConnectionMonitorThread.class.getDeclaredField("connMgr");
        connMgrField.setAccessible(true);
        return (HttpClientConnectionManager) connMgrField.get(monitorThread);
    }
}
