package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.SearchLogsRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 与 Go SDK 对齐，SearchLogs(V2) 在 highLight=true 时自动注入 SourceType=front 头。
 *
 * 规则：
 * - highLight=true  → header SourceType=front 必现（V0.2 + V0.3 双路径）
 * - highLight=false / null → header 不出现 SourceType
 */
public class SearchLogsSourceTypeHeaderTest {

    @Test
    public void v0_2_highlight_true_injects_source_type() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        client.searchLogs(buildReq(true));
        Assert.assertEquals("front", captured.get().get("SourceType"));
    }

    @Test
    public void v0_2_highlight_false_no_source_type() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        client.searchLogs(buildReq(false));
        Assert.assertNull(captured.get().get("SourceType"));
    }

    @Test
    public void v0_2_highlight_null_no_source_type() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        client.searchLogs(buildReq(null));
        Assert.assertNull(captured.get().get("SourceType"));
    }

    @Test
    public void v0_3_highlight_true_injects_source_type() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        client.searchLogsV2(buildReq(true));
        Assert.assertEquals("front", captured.get().get("SourceType"));
    }

    @Test
    public void v0_3_highlight_false_no_source_type() throws Exception {
        AtomicReference<Map<String, String>> captured = new AtomicReference<>();
        TLSLogClientImpl client = newClient(captured);
        client.searchLogsV2(buildReq(false));
        Assert.assertNull(captured.get().get("SourceType"));
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
            // 拷贝一份避免后续修改影响断言
            captured.set(new HashMap<>(headers));
            // 返回最小可解析的 200 JSON 响应
            return new RawResponse("{}".getBytes(),
                    SdkError.SUCCESS.getNumber(), null, null, 200);
        }
    }
}
