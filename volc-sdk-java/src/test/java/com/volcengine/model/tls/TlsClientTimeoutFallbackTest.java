package com.volcengine.model.tls;

import com.volcengine.model.ApiInfo;
import com.volcengine.service.tls.TLSHttpUtil;
import com.volcengine.service.tls.TLSLogClientImpl;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 修复后语义：
 *   getRetryPolicy 兜底优先用本实例 socketTimeout，
 *   不再读会被其他实例污染的静态字段。
 *
 * 验证手段：
 *   1) 构造两个独立 client（不共享 ClientConfig.retryPolicy）；
 *   2) 分别 setTimeout 不同 socket；
 *   3) 反射调 getRetryPolicy()，断言 totalTimeoutMs 跟随实例值，互不串扰。
 */
public class TlsClientTimeoutFallbackTest {

    private static TLSLogClientImpl newClient() {
        ClientConfig cfg = new ClientConfig("http://example.test", "cn-guilin-boe", "ak", "sk");
        TLSHttpUtil http = new TLSHttpUtil(ClientConfig.initServiceInfo(cfg), new HashMap<String, ApiInfo>());
        return new TLSLogClientImpl(http, cfg);
    }

    private static long totalTimeoutOf(TLSLogClientImpl client) throws Exception {
        Method m = TLSLogClientImpl.class.getDeclaredMethod("getRetryPolicy");
        m.setAccessible(true);
        RetryPolicy p = (RetryPolicy) m.invoke(client);
        return p.getTotalTimeoutMs();
    }

    @Test
    public void instanceSocketTimeoutDrivesFallback_noCrossPollution() throws Exception {
        TLSLogClientImpl a = newClient();
        TLSLogClientImpl b = newClient();

        a.setTimeout(60_000, 60_000);
        b.setTimeout(120_000, 60_000);

        // a 取 60s（在 normalize 区间 [30s,15min] 内）
        assertEquals(60_000L, totalTimeoutOf(a));
        // b 取 120s
        assertEquals(120_000L, totalTimeoutOf(b));

        // 反向：再调换顺序，b 不应被 a 污染
        a.setTimeout(45_000, 45_000);
        assertEquals(120_000L, totalTimeoutOf(b));
        assertEquals(45_000L, totalTimeoutOf(a));
    }

    @Test
    public void unsetInstanceFallsBackToFinalDefault() throws Exception {
        TLSLogClientImpl c = newClient();
        // 构造器里 setSocketTimeout(60000) 已写入实例域；这里手动归零模拟"未配置"路径。
        c.setTimeout(0, 0);
        // 实例域 0 → 回退到 final 默认 90s
        assertEquals(90_000L, totalTimeoutOf(c));
    }

    @Test
    public void fallbackDoesNotMutateSharedConfigRetryPolicy() throws Exception {
        ClientConfig cfg = new ClientConfig("http://example.test", "cn-guilin-boe", "ak", "sk");
        RetryPolicy shared = new RetryPolicy();
        shared.setTotalTimeoutMs(0);
        cfg.setRetryPolicy(shared);
        TLSHttpUtil http = new TLSHttpUtil(ClientConfig.initServiceInfo(cfg), new HashMap<String, ApiInfo>());
        TLSLogClientImpl client = new TLSLogClientImpl(http, cfg);
        client.setTimeout(60_000, 60_000);

        assertEquals(60_000L, totalTimeoutOf(client));
        assertEquals("getRetryPolicy must not mutate ClientConfig.retryPolicy shared by callers",
                0L, shared.getTotalTimeoutMs());
    }
}
