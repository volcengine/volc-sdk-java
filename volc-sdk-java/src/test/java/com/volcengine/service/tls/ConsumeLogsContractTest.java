package com.volcengine.service.tls;

import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.ServiceInfo;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
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
    private final AtomicReference<java.util.List<org.apache.http.NameValuePair>> capturedParams = new AtomicReference<>();
    private final AtomicReference<Map<String, String>> capturedHeaders = new AtomicReference<>();
    private final AtomicReference<RawResponse> overrideResponse = new AtomicReference<>();

    @Test
    public void processorIdValidationIsLeftToServerAndItsErrorIsPreserved() throws Exception {
        AtomicReference<String> api = new AtomicReference<>();
        AtomicReference<String> body = new AtomicReference<>();
        TLSLogClientImpl client = newClient(api, body);
        overrideResponse.set(new RawResponse(null, SdkError.EHTTP.getNumber(),
                new Exception("{\"ErrorCode\":\"InvalidArgument\",\"ErrorMessage\":\"invalid ProcessorId\"}"),
                new Header[]{new BasicHeader(com.volcengine.model.tls.Const.X_TLS_REQUESTID, "server-request")}, 400));
        ConsumeLogsRequest request = newRequest(false);
        request.setProcessorId("not-a-uuid");
        try {
            client.consumeLogs(request);
            Assert.fail("expected server error");
        } catch (LogException e) {
            Assert.assertEquals("InvalidArgument", e.getErrorCode());
            Assert.assertEquals("invalid ProcessorId", e.getErrorMessage());
            Assert.assertEquals("server-request", e.getRequestId());
            Assert.assertEquals(400, e.getHttpCode());
        }
        Assert.assertEquals(CONSUME_LOGS, api.get());
        Assert.assertEquals("not-a-uuid", com.alibaba.fastjson.JSON.parseObject(body.get()).getString("ProcessorId"));
    }

    @Test
    public void processorIdUsesNormalPathAndIsSentExactlyInBody() throws Exception {
        AtomicReference<String> api = new AtomicReference<>();
        AtomicReference<String> body = new AtomicReference<>();
        TLSLogClientImpl client = newClient(api, body);
        for (Boolean origin : new Boolean[]{null, false}) {
            ConsumeLogsRequest request = newRequest(origin);
            request.setProcessorId("  processor-id  ");
            ConsumeLogsResponse response = client.consumeLogs(request);
            Assert.assertEquals(CONSUME_LOGS, api.get());
            com.alibaba.fastjson.JSONObject expected = com.alibaba.fastjson.JSON.parseObject(
                    "{\"Cursor\":\"cursor\",\"EndCursor\":\"end\",\"LogGroupCount\":10,"
                            + "\"Compression\":\"none\",\"Offset\":0,\"ProcessorId\":\"  processor-id  \"}");
            Assert.assertEquals(expected, com.alibaba.fastjson.JSON.parseObject(body.get()));
            Assert.assertEquals(java.util.Arrays.asList(
                    new org.apache.http.message.BasicNameValuePair("TopicId", "topic"),
                    new org.apache.http.message.BasicNameValuePair("ShardId", "0")), capturedParams.get());
            Assert.assertEquals("group", capturedHeaders.get().get("ConsumerGroupName"));
            Assert.assertEquals("consumer", capturedHeaders.get().get("ConsumerName"));
            Assert.assertEquals("next", response.getCursor());
            Assert.assertEquals(0, response.getCount());
        }
    }

    @Test
    public void emptyProcessorIdIsOmittedAndKeepsOriginalSelection() throws Exception {
        AtomicReference<String> api = new AtomicReference<>();
        AtomicReference<String> body = new AtomicReference<>();
        TLSLogClientImpl client = newClient(api, body);
        for (String id : new String[]{null, ""}) {
            for (Boolean origin : new Boolean[]{null, false, true}) {
                ConsumeLogsRequest request = newRequest(origin);
                request.setProcessorId(id);
                client.consumeLogs(request);
                Assert.assertEquals(Boolean.TRUE.equals(origin) ? CONSUME_ORIGIN_LOGS : CONSUME_LOGS, api.get());
                Assert.assertFalse(com.alibaba.fastjson.JSON.parseObject(body.get()).containsKey("ProcessorId"));
            }
        }
    }

    @Test
    public void processorIdAndExplicitOriginalFailBeforeSending() throws Exception {
        AtomicReference<String> api = new AtomicReference<>();
        TLSLogClientImpl client = newClient(api, new AtomicReference<>());
        ConsumeLogsRequest request = newRequest(true);
        request.setProcessorId("processor-id");
        try {
            client.consumeLogs(request);
            Assert.fail("expected InvalidArgument");
        } catch (LogException e) {
            Assert.assertEquals("InvalidArgument", e.getErrorCode());
            Assert.assertTrue(e.getErrorMessage().contains("ProcessorId"));
            Assert.assertTrue(e.getErrorMessage().toLowerCase().contains("original"));
        }
        Assert.assertNull(api.get());
    }

    private ConsumeLogsRequest newRequest(Boolean origin) {
        ConsumeLogsRequest request = new ConsumeLogsRequest();
        request.setTopicId("topic");
        request.setShardId(0);
        request.setCursor("cursor");
        request.setEndCursor("end");
        request.setLogGroupCount(10);
        request.setCompression("none");
        request.setOffset(0L);
        request.setConsumerGroupName("group");
        request.setConsumerName("consumer");
        request.setOrigin(origin);
        return request;
    }

    @Test
    public void defaultOriginalUsesNormalConsumeLogsPath() throws Exception {
        AtomicReference<String> capturedApi = new AtomicReference<>();
        AtomicReference<String> capturedBody = new AtomicReference<>();
        TLSLogClientImpl client = newClient(capturedApi, capturedBody);

        ConsumeLogsRequest request = new ConsumeLogsRequest();
        request.setTopicId("topic");
        request.setShardId(0);
        request.setCursor("cursor");

        ConsumeLogsResponse response = client.consumeLogs(request);

        Assert.assertEquals(CONSUME_LOGS, capturedApi.get());
        Assert.assertEquals("next", response.getCursor());
        Assert.assertEquals(0, response.getCount());
    }

    @Test
    public void explicitNonOriginalIsNotSerializedInBody() throws Exception {
        AtomicReference<String> capturedApi = new AtomicReference<>();
        AtomicReference<String> capturedBody = new AtomicReference<>();
        TLSLogClientImpl client = newClient(capturedApi, capturedBody);

        ConsumeLogsRequest request = new ConsumeLogsRequest();
        request.setTopicId("topic");
        request.setShardId(0);
        request.setCursor("cursor");
        request.setOrigin(false);

        client.consumeLogs(request);

        Assert.assertEquals(CONSUME_LOGS, capturedApi.get());
        Assert.assertFalse(capturedBody.get().contains("\"origin\""));
        Assert.assertFalse(capturedBody.get().contains("\"original\""));
    }

    private TLSLogClientImpl newClient(AtomicReference<String> capturedApi,
                                       AtomicReference<String> capturedBody) {
        ClientConfig config = new ClientConfig("https://tls.local.validation", "cn-beijing", "ak", "sk");
        ServiceInfo info = ClientConfig.initServiceInfo(config);

        Map<String, Object> apiParams = new HashMap<>();
        apiParams.put(Const.Method, "GET");
        apiParams.put(Const.Path, CONSUME_LOGS);
        Map<String, ApiInfo> infos = new HashMap<>();
        infos.put(CONSUME_LOGS, new ApiInfo(apiParams));
        infos.put(CONSUME_ORIGIN_LOGS, new ApiInfo(apiParams));

        return new TLSLogClientImpl(
                new CapturingTLSHttpUtil(info, infos, capturedApi, capturedBody, capturedParams, capturedHeaders, overrideResponse), config);
    }

    static class CapturingTLSHttpUtil extends TLSHttpUtil {
        private final AtomicReference<String> capturedApi;
        private final AtomicReference<String> capturedBody;
        private final AtomicReference<java.util.List<org.apache.http.NameValuePair>> capturedParams;
        private final AtomicReference<Map<String, String>> capturedHeaders;
        private final AtomicReference<RawResponse> overrideResponse;

        CapturingTLSHttpUtil(ServiceInfo info, Map<String, ApiInfo> infos,
                             AtomicReference<String> capturedApi,
                             AtomicReference<String> capturedBody,
                             AtomicReference<java.util.List<org.apache.http.NameValuePair>> capturedParams,
                             AtomicReference<Map<String, String>> capturedHeaders,
                             AtomicReference<RawResponse> overrideResponse) {
            super(info, infos);
            this.capturedApi = capturedApi;
            this.capturedBody = capturedBody;
            this.capturedParams = capturedParams;
            this.capturedHeaders = capturedHeaders;
            this.overrideResponse = overrideResponse;
        }

        @Override
        public RawResponse json(String api, java.util.List<org.apache.http.NameValuePair> params,
                                String body, Map<String, String> headers) {
            capturedApi.set(api);
            capturedBody.set(body);
            capturedParams.set(params);
            capturedHeaders.set(headers);
            if (overrideResponse.get() != null) {
                return overrideResponse.get();
            }
            Header[] responseHeaders = new Header[]{
                    new BasicHeader(X_TLS_CURSOR, "next"),
                    new BasicHeader(X_TLS_COUNT, "0"),
                    new BasicHeader(com.volcengine.model.tls.Const.X_TLS_BODY_RAW_SIZE, "0")
            };
            return new RawResponse(PutLogRequest.LogGroupList.newBuilder().build().toByteArray(),
                    SdkError.SUCCESS.getNumber(), null, responseHeaders, 200);
        }
    }
}
