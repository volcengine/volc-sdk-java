package com.volcengine.service.tls;

import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import com.volcengine.service.BaseServiceImpl;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * BaseServiceImpl.prepareRequest 必须显式设置 connectionRequestTimeout，
 * 防止 Apache HttpClient 默认 -1（无限等待连接池）。
 */
public class TlsConnectionRequestTimeoutTest {

    private static class StubService extends BaseServiceImpl {
        StubService(ServiceInfo svc, Map<String, ApiInfo> infos) {
            super(svc, infos);
        }
    }

    @Test
    public void prepareRequestSetsConnectionRequestTimeout() throws Exception {
        Map<String, Object> svcParams = new HashMap<>();
        svcParams.put(Const.Scheme, "http");
        svcParams.put(Const.Host, "example.test");
        svcParams.put(Const.CONNECTION_TIMEOUT, 30000);
        svcParams.put(Const.SOCKET_TIMEOUT, 60000);
        svcParams.put(Const.Credentials, new Credentials("cn-guilin-boe", "TLS"));
        ServiceInfo svc = new ServiceInfo(svcParams);

        Map<String, Object> apiParams = new HashMap<>();
        apiParams.put(Const.Method, "POST");
        apiParams.put(Const.Path, "/Foo");
        ApiInfo api = new ApiInfo(apiParams);

        Map<String, ApiInfo> infos = new HashMap<>();
        infos.put("Foo", api);

        StubService impl = new StubService(svc, infos);

        Method m = BaseServiceImpl.class.getDeclaredMethod(
                "prepareRequest", String.class, java.util.List.class);
        m.setAccessible(true);
        HttpRequestBase req = (HttpRequestBase) m.invoke(impl, "Foo", null);

        RequestConfig cfg = req.getConfig();
        // 必须 != -1（默认值），且与 connectionTimeout 同步。
        assertNotEquals(-1, cfg.getConnectionRequestTimeout());
        assertEquals(30000, cfg.getConnectionRequestTimeout());
    }
}
