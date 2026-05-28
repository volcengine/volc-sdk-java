package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.request.ConsumeLogsRequest;
import com.volcengine.model.tls.response.ConsumeLogsResponse;
import com.volcengine.model.tls.pb.PutLogRequest;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static com.volcengine.model.tls.Const.CONSUME_LOGS;
import static com.volcengine.model.tls.Const.CONSUME_ORIGIN_LOGS;
import static com.volcengine.model.tls.Const.X_TLS_COUNT;
import static com.volcengine.model.tls.Const.X_TLS_CURSOR;

public class ConsumeLogsContractTest {
    @Test
    public void defaultOriginalUsesNormalConsumeLogsPath() throws Exception {
        AtomicReference<String> capturedApi = new AtomicReference<>();
        TLSLogClientImpl client = newClient(capturedApi);

        ConsumeLogsRequest request = new ConsumeLogsRequest();
        request.setTopicId("topic");
        request.setShardId(0);
        request.setCursor("cursor");

        ConsumeLogsResponse response = client.consumeLogs(request);

        Assert.assertEquals(CONSUME_LOGS, capturedApi.get());
        Assert.assertEquals("next", response.getCursor());
        Assert.assertEquals(0, response.getCount());
    }

    private TLSLogClientImpl newClient(AtomicReference<String> capturedApi) {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        ServiceInfo info = ClientConfig.initServiceInfo(config);

        Map<String, Object> apiParams = new HashMap<>();
        apiParams.put(Const.Method, "GET");
        apiParams.put(Const.Path, CONSUME_LOGS);
        Map<String, ApiInfo> infos = new HashMap<>();
        infos.put(CONSUME_LOGS, new ApiInfo(apiParams));
        infos.put(CONSUME_ORIGIN_LOGS, new ApiInfo(apiParams));

        return new TLSLogClientImpl(new CapturingTLSHttpUtil(info, infos, capturedApi), config);
    }

    static class CapturingTLSHttpUtil extends TLSHttpUtil {
        private final AtomicReference<String> capturedApi;

        CapturingTLSHttpUtil(ServiceInfo info, Map<String, ApiInfo> infos,
                             AtomicReference<String> capturedApi) {
            super(info, infos);
            this.capturedApi = capturedApi;
        }

        @Override
        public RawResponse json(String api, java.util.List<org.apache.http.NameValuePair> params,
                                String body, Map<String, String> headers) {
            capturedApi.set(api);
            Header[] responseHeaders = new Header[]{
                    new BasicHeader(X_TLS_CURSOR, "next"),
                    new BasicHeader(X_TLS_COUNT, "0")
            };
            return new RawResponse(PutLogRequest.LogGroupList.newBuilder().build().toByteArray(),
                    SdkError.SUCCESS.getNumber(), null, responseHeaders, 200);
        }
    }
}
