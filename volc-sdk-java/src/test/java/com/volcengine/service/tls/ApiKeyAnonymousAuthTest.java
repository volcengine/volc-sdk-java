package com.volcengine.service.tls;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.BatchLog;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.request.DeleteProjectRequest;
import com.volcengine.model.tls.request.PutLogsRequest;
import com.volcengine.model.tls.request.PutLogsRequestV2;
import com.volcengine.service.SignableRequest;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class ApiKeyAnonymousAuthTest {
    private static final String ENDPOINT = "https://tls.example.com";
    private static final String REGION = "cn-north-1";
    private static final String API_KEY = "tls-api-key-secret";

    @Test
    public void newClientWithApiKeyPutLogsSkipsAuthorizationAndAddsAnonymousHeader() throws Exception {
        TLSLogClient client = ClientBuilder.newClientWithApiKey(ENDPOINT, REGION, API_KEY);
        RecordingHttpClient httpClient = new RecordingHttpClient();
        client.setHttpClient(httpClient);

        client.putLogs(newPutLogsRequest());

        assertEquals(1, httpClient.calls);
        assertEquals(Const.PUT_LOGS, httpClient.lastPath);
        assertAnonymousOnly(httpClient.lastRequest);
    }

    @Test
    public void setApiKeyUpdatesAnonymousHeader() throws Exception {
        TLSLogClient client = ClientBuilder.newClientWithApiKey(ENDPOINT, REGION, "old-api-key");
        RecordingHttpClient httpClient = new RecordingHttpClient();
        client.setHttpClient(httpClient);

        client.setApiKey("new-api-key");
        client.putLogs(newPutLogsRequest());

        assertAnonymousOnly(httpClient.lastRequest, "new-api-key");
    }

    @Test
    public void putLogsV2WithApiKeyUsesPutLogsAnonymousAuth() throws Exception {
        TLSLogClient client = ClientBuilder.newClientWithApiKey(ENDPOINT, REGION, API_KEY);
        RecordingHttpClient httpClient = new RecordingHttpClient();
        client.setHttpClient(httpClient);

        LogItem log = new LogItem(System.currentTimeMillis());
        log.addContent("key", "value");
        client.putLogsV2(new PutLogsRequestV2(Collections.singletonList(log), "topic-id"));

        assertEquals(1, httpClient.calls);
        assertEquals(Const.PUT_LOGS, httpClient.lastPath);
        assertAnonymousOnly(httpClient.lastRequest);
    }

    @Test
    public void apiKeyOnlyNonPutLogsFailsBeforeNetworkWithCredentialMessage() throws Exception {
        TLSLogClient client = ClientBuilder.newClientWithApiKey(ENDPOINT, REGION, API_KEY);
        RecordingHttpClient httpClient = new RecordingHttpClient();
        client.setHttpClient(httpClient);

        LogException exception = assertThrows(LogException.class,
                () -> client.deleteProject(new DeleteProjectRequest("project-id")));

        assertEquals(0, httpClient.calls);
        assertTrue(exception.getMessage().contains("accessKeyId"));
        assertTrue(exception.getMessage().contains("accessKeySecret"));
    }

    @Test
    public void apiKeyWithAccessKeysUsesApiKeyOnlyForPutLogsAndSignsOtherApis() throws Exception {
        TLSLogClient client = ClientBuilder.newClientWithApiKey(ENDPOINT, REGION, API_KEY, "ak", "sk", "token");
        RecordingHttpClient httpClient = new RecordingHttpClient();
        client.setHttpClient(httpClient);

        client.putLogs(newPutLogsRequest());
        assertAnonymousOnly(httpClient.lastRequest);

        client.deleteProject(new DeleteProjectRequest("project-id"));
        assertEquals(2, httpClient.calls);
        assertNotNull(httpClient.lastRequest.getFirstHeader("Authorization"));
        assertNull(httpClient.lastRequest.getFirstHeader(Const.ANONYMOUS_IDENTITY_HEADER));
    }

    @Test
    public void producerConfigAcceptsApiKeyOnlyAndDoesNotExposeItInToString() throws Exception {
        ProducerConfig config = new ProducerConfig(ENDPOINT, REGION, API_KEY);

        config.validConfig();

        assertEquals(API_KEY, config.getClientConfig().getApiKey());
        assertFalse(config.toString().contains(API_KEY));
        assertFalse(config.getClientConfig().toString().contains(API_KEY));
    }

    @Test
    public void logDispatcherClientPropagatesProducerApiKeyToPutLogs() throws Exception {
        ProducerConfig producerConfig = new ProducerConfig(ENDPOINT, REGION, API_KEY);
        BlockingQueue<BatchLog> successQueue = new LinkedBlockingQueue<>();
        BlockingQueue<BatchLog> failureQueue = new LinkedBlockingQueue<>();
        LogDispatcher dispatcher = new LogDispatcher(producerConfig, "producer", successQueue, failureQueue,
                new Semaphore(producerConfig.getTotalSizeInBytes()), new AtomicInteger(0), new RetryManager());
        RecordingHttpClient httpClient = new RecordingHttpClient();
        try {
            dispatcher.getClient().setHttpClient(httpClient);

            dispatcher.getClient().putLogs(newPutLogsRequest());

            assertEquals(1, httpClient.calls);
            assertAnonymousOnly(httpClient.lastRequest);
            dispatcher.setApiKey("new-api-key");
            dispatcher.getClient().putLogs(newPutLogsRequest());
            assertEquals(2, httpClient.calls);
            assertAnonymousOnly(httpClient.lastRequest, "new-api-key");
        } finally {
            dispatcher.closeNow();
        }
    }

    private static PutLogsRequest newPutLogsRequest() {
        PutLogRequest.LogContent content = PutLogRequest.LogContent.newBuilder()
                .setKey("key")
                .setValue("value")
                .build();
        PutLogRequest.Log log = PutLogRequest.Log.newBuilder()
                .setTime(System.currentTimeMillis())
                .addContents(content)
                .build();
        PutLogRequest.LogGroup group = PutLogRequest.LogGroup.newBuilder()
                .setSource("source")
                .setFileName("file")
                .addLogs(log)
                .build();
        PutLogRequest.LogGroupList groups = PutLogRequest.LogGroupList.newBuilder()
                .addLogGroups(group)
                .build();
        return new PutLogsRequest(groups, "topic-id");
    }

    private static void assertAnonymousOnly(HttpRequest request) {
        assertAnonymousOnly(request, API_KEY);
    }

    private static void assertAnonymousOnly(HttpRequest request, String expectedApiKey) {
        Header anonymous = request.getFirstHeader(Const.ANONYMOUS_IDENTITY_HEADER);
        assertNotNull(anonymous);
        assertEquals(expectedApiKey, anonymous.getValue());
        assertNull(request.getFirstHeader("Authorization"));
        assertNull(request.getFirstHeader(com.volcengine.helper.Const.XSecurityToken));
        assertTrue(request instanceof HttpUriRequest);
        assertNotNull(((HttpUriRequest) request).getURI());
    }

    private static class RecordingHttpClient implements HttpClient {
        private int calls;
        private HttpRequest lastRequest;
        private String lastUri;
        private String lastPath;

        @Override
        public HttpParams getParams() {
            return null;
        }

        @Override
        public ClientConnectionManager getConnectionManager() {
            return null;
        }

        @Override
        public HttpResponse execute(HttpUriRequest request) throws IOException {
            calls++;
            lastRequest = request;
            lastUri = request.getURI() == null ? request.getRequestLine().getUri() : request.getURI().toString();
            lastPath = request instanceof SignableRequest ? ((SignableRequest) request).getUriBuilder().getPath() : lastUri;
            return successResponse();
        }

        @Override
        public HttpResponse execute(HttpUriRequest request, HttpContext context) throws IOException {
            return execute(request);
        }

        @Override
        public HttpResponse execute(HttpHost target, HttpRequest request) throws IOException {
            calls++;
            lastRequest = request;
            lastUri = target.toURI();
            lastPath = request instanceof SignableRequest ? ((SignableRequest) request).getUriBuilder().getPath() : lastUri;
            return successResponse();
        }

        @Override
        public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException {
            return execute(target, request);
        }

        @Override
        public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler) throws IOException {
            return responseHandler.handleResponse(execute(request));
        }

        @Override
        public <T> T execute(HttpUriRequest request, ResponseHandler<? extends T> responseHandler,
                             HttpContext context) throws IOException {
            return responseHandler.handleResponse(execute(request, context));
        }

        @Override
        public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler)
                throws IOException {
            return responseHandler.handleResponse(execute(target, request));
        }

        @Override
        public <T> T execute(HttpHost target, HttpRequest request, ResponseHandler<? extends T> responseHandler,
                             HttpContext context) throws IOException {
            return responseHandler.handleResponse(execute(target, request, context));
        }

        private HttpResponse successResponse() throws IOException {
            BasicHttpResponse response = new BasicHttpResponse(
                    new ProtocolVersion("HTTP", 1, 1), 200, "OK");
            response.setEntity(new StringEntity("{}", "utf-8"));
            response.addHeader(Const.X_TLS_REQUESTID, "request-id");
            return response;
        }
    }
}
