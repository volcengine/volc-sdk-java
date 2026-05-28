package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.request.SearchLogsRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static com.volcengine.model.tls.Const.HEADER_API_VERSION;

/**
 * 与 Go SDK CommonRequest.Headers + assembleHeader 行为对齐。
 *
 * 规则：
 *   - setCustomHeaders / addCustomHeader 实例级生效，所有 API 调用共享。
 *   - 用户 header 抵达 wire。
 *   - SDK 内部 header（HEADER_API_VERSION、SourceType 等）后写覆盖用户值（user-first → SDK overrides）。
 *   - setCustomHeaders(null) 视为清空。
 *   - getCustomHeaders 返回的视图不可变，外部修改不会污染实例状态。
 */
public class TlsCustomHeadersTest {

    @Test
    public void custom_headers_pass_through_to_wire() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        Map<String, String> uh = new HashMap<>();
        uh.put("X-Trace-Id", "trace-abc");
        uh.put("X-Tenant-Tag", "team-foo");
        client.setCustomHeaders(uh);

        client.searchLogs(buildReq(false));

        Assert.assertEquals("trace-abc", captured.get().get("X-Trace-Id"));
        Assert.assertEquals("team-foo", captured.get().get("X-Tenant-Tag"));
    }

    @Test
    public void add_custom_header_appends() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        client.addCustomHeader("X-Trace-Id", "trace-1");
        client.addCustomHeader("X-Tenant-Tag", "team-bar");

        client.searchLogs(buildReq(false));

        Assert.assertEquals("trace-1", captured.get().get("X-Trace-Id"));
        Assert.assertEquals("team-bar", captured.get().get("X-Tenant-Tag"));
    }

    @Test
    public void sdk_header_overrides_user_header() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        Map<String, String> uh = new HashMap<>();
        uh.put(HEADER_API_VERSION, "9.9.9");
        uh.put("SourceType", "user-injected");
        client.setCustomHeaders(uh);

        // highLight=true 触发 SDK 写入 SourceType=front
        client.searchLogs(buildReq(true));

        Assert.assertEquals("SDK 应覆盖用户 HEADER_API_VERSION",
                "0.2.0", captured.get().get(HEADER_API_VERSION));
        Assert.assertEquals("SDK 应覆盖用户 SourceType",
                "front", captured.get().get("SourceType"));
    }

    @Test
    public void clear_custom_headers_via_null() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        Map<String, String> uh = new HashMap<>();
        uh.put("X-Trace-Id", "trace-abc");
        client.setCustomHeaders(uh);
        client.setCustomHeaders(null);

        client.searchLogs(buildReq(false));

        Assert.assertNull(captured.get().get("X-Trace-Id"));
    }

    @Test
    public void get_custom_headers_returns_immutable_view() {
        TLSLogClientImpl client = newClient(new AtomicReference<>());
        Map<String, String> uh = new HashMap<>();
        uh.put("X-Trace-Id", "trace-abc");
        client.setCustomHeaders(uh);

        Map<String, String> snap = client.getCustomHeaders();
        try {
            snap.put("X-Should-Not-Leak", "x");
            Assert.fail("getCustomHeaders 应返回不可变视图");
        } catch (UnsupportedOperationException expected) {
            // ok
        }
        // 实例状态不受外部 map 修改影响
        uh.put("X-Trace-Id", "MUTATED");
        Assert.assertEquals("trace-abc", client.getCustomHeaders().get("X-Trace-Id"));
    }

    private SearchLogsRequest buildReq(Boolean highLight) {
        SearchLogsRequest req = new SearchLogsRequest();
        req.setTopicId("tid");
        req.setQuery("*");
        req.setStartTime(1L);
        req.setEndTime(2L);
        req.setLimit(1);
        req.setHighLight(highLight);
        return req;
    }

    private TLSLogClientImpl newClient(AtomicReference<Map<String, String>> captured) {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        ServiceInfo info = ClientConfig.initServiceInfo(config);

        Map<String, Object> apiParams = new HashMap<>();
        apiParams.put(Const.Method, "POST");
        apiParams.put(Const.Path, "/SearchLogs");
        Map<String, ApiInfo> infos = new HashMap<>();
        infos.put("/SearchLogs", new ApiInfo(apiParams));

        CapturingTLSHttpUtil util = new CapturingTLSHttpUtil(info, infos, captured);
        return new TLSLogClientImpl(util, config);
    }

    static class CapturingTLSHttpUtil extends TLSHttpUtil {
        private final AtomicReference<Map<String, String>> captured;

        CapturingTLSHttpUtil(ServiceInfo info, Map<String, ApiInfo> infos,
                             AtomicReference<Map<String, String>> captured) {
            super(info, infos);
            this.captured = captured;
        }

        @Override
        public RawResponse json(String api, java.util.List<org.apache.http.NameValuePair> params,
                                String body, Map<String, String> headers) {
            captured.set(new HashMap<>(headers));
            return new RawResponse("{}".getBytes(),
                    SdkError.SUCCESS.getNumber(), null, null, 200);
        }
    }
}
