package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.PutLogsRequest;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static com.volcengine.model.tls.Const.PUT_LOGS;
import static com.volcengine.model.tls.Const.X_TLS_REQUESTID;

public class PutLogsContractTest {
    @Test
    public void providedStatsDoesNotRewriteLogBodyBeforeSend() throws Exception {
        AtomicReference<PutLogRequest.LogGroupList> capturedBody = new AtomicReference<>();
        TLSLogClientImpl client = newClient(capturedBody);
        PutLogRequest.Log log = PutLogRequest.Log.newBuilder()
                .addContents(PutLogRequest.LogContent.newBuilder().setKey("k").setValue("v").build())
                .build();
        PutLogRequest.LogGroup group = PutLogRequest.LogGroup.newBuilder().addLogs(log).build();

        PutLogsRequest request = new PutLogsRequest(
                PutLogRequest.LogGroupList.newBuilder().addLogGroups(group).build(), "topic");
        request.setLogCount(1);
        request.setEarliestLogTime(1L);
        request.setLatestLogTime(1L);

        client.putLogs(request);

        long sentTime = capturedBody.get().getLogGroups(0).getLogs(0).getTime();
        Assert.assertEquals("provided stats are used by Producer to avoid another full log scan", 0L, sentTime);
    }

    private TLSLogClientImpl newClient(AtomicReference<PutLogRequest.LogGroupList> capturedBody) {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        ServiceInfo info = ClientConfig.initServiceInfo(config);

        Map<String, Object> apiParams = new HashMap<>();
        apiParams.put(Const.Method, "POST");
        apiParams.put(Const.Path, PUT_LOGS);
        Map<String, ApiInfo> infos = new HashMap<>();
        infos.put(PUT_LOGS, new ApiInfo(apiParams));

        return new TLSLogClientImpl(new CapturingTLSHttpUtil(info, infos, capturedBody), config);
    }

    static class CapturingTLSHttpUtil extends TLSHttpUtil {
        private final AtomicReference<PutLogRequest.LogGroupList> capturedBody;

        CapturingTLSHttpUtil(ServiceInfo info, Map<String, ApiInfo> infos,
                             AtomicReference<PutLogRequest.LogGroupList> capturedBody) {
            super(info, infos);
            this.capturedBody = capturedBody;
        }

        @Override
        public RawResponse proto(String api, List<NameValuePair> params, Map<String, String> header,
                                 byte[] body, String compressType) {
            try {
                capturedBody.set(PutLogRequest.LogGroupList.parseFrom(body));
            } catch (Exception e) {
                throw new AssertionError(e);
            }
            Header[] responseHeaders = new Header[]{new BasicHeader(X_TLS_REQUESTID, "request-id")};
            return new RawResponse(new byte[0], SdkError.SUCCESS.getNumber(), null, responseHeaders, 200);
        }
    }
}
