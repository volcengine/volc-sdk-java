package com.volcengine.service.tls;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.RetryPolicy;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CircuitBreaker;
import com.volcengine.model.tls.producer.MemoryLimiter;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.RetryMode;
import com.volcengine.model.tls.request.PutLogsRequest;
import com.volcengine.http.HttpClientFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerManagedTransportRetryTest {
    @Test
    public void producerManagedPutLogsDisablesTransportRetryForItsSingleAttempt() throws Exception {
        ProducerConfig config = new ProducerConfig("http://endpoint", "region", "ak", "sk", "topic");
        config.setRetryMode(RetryMode.PRODUCER_MANAGED);
        config.validConfig();
        MemoryLimiter limiter = new MemoryLimiter(config.getMaxProducerMemoryBytes(), config.getTotalSizeInBytes());
        RetryManager retryManager = new RetryManager();
        LogDispatcher dispatcher = new LogDispatcher(config, "producer-retry-owner-test",
                new LinkedBlockingQueue<>(), new LinkedBlockingQueue<>(), limiter,
                new AtomicInteger(), retryManager, new CircuitBreaker(config.getCircuitBreakerConfig()));
        CapturingHttpClient httpClient = new CapturingHttpClient();
        dispatcher.getClient().setHttpClient(httpClient);

        try {
            expectPutLogsFailure(dispatcher.getClient());

            Assert.assertEquals(1, httpClient.calls);
            Assert.assertTrue(httpClient.transportRetryDisabled);
        } finally {
            dispatcher.closeNow();
            retryManager.close();
        }
    }

    @Test
    public void directPutLogsWithOneSdkAttemptKeepsExistingTransportBehavior() throws Exception {
        ClientConfig config = new ClientConfig("http://endpoint", "region", "ak", "sk");
        RetryPolicy policy = RetryPolicy.defaultPolicy();
        policy.setMaxAttempts(1);
        config.setRetryPolicy(policy);
        TLSLogClient client = ClientBuilder.newClient(config);
        CapturingHttpClient httpClient = new CapturingHttpClient();
        client.setHttpClient(httpClient);

        expectPutLogsFailure(client);

        Assert.assertEquals(1, httpClient.calls);
        Assert.assertFalse(httpClient.transportRetryDisabled);
    }

    private static void expectPutLogsFailure(TLSLogClient client) throws Exception {
        try {
            client.putLogs(newPutLogsRequest());
            Assert.fail("expected PutLogs failure");
        } catch (LogException expected) {
            // Expected from the synthetic 503 response.
        }
    }

    private static PutLogsRequest newPutLogsRequest() {
        PutLogRequest.Log log = PutLogRequest.Log.newBuilder()
                .addContents(PutLogRequest.LogContent.newBuilder().setKey("key").setValue("value"))
                .build();
        PutLogRequest.LogGroup group = PutLogRequest.LogGroup.newBuilder().addLogs(log).build();
        return new PutLogsRequest(
                PutLogRequest.LogGroupList.newBuilder().addLogGroups(group).build(), "topic");
    }

    private static class CapturingHttpClient extends CloseableHttpClient {
        private int calls;
        private boolean transportRetryDisabled;

        @Override
        protected CloseableHttpResponse doExecute(HttpHost target, HttpRequest request, HttpContext context)
                throws IOException {
            calls++;
            transportRetryDisabled = context != null && !HttpClientFactory.httpRequestRetryHandler.retryRequest(
                    new NoHttpResponseException("connection closed"), 1, context);
            BasicHttpResponse response = new BasicHttpResponse(
                    new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), 503, "Service Unavailable"));
            response.setEntity(new StringEntity("{\"ErrorCode\":\"InternalServerError\"}", "UTF-8"));
            return new DelegatingCloseableHttpResponse(response);
        }

        @Override
        public void close() {
        }

        @Override
        public HttpParams getParams() {
            return new BasicHttpParams();
        }

        @Override
        public ClientConnectionManager getConnectionManager() {
            return null;
        }
    }

    private static class DelegatingCloseableHttpResponse extends BasicHttpResponse
            implements CloseableHttpResponse {
        DelegatingCloseableHttpResponse(HttpResponse response) {
            super(response.getStatusLine());
            setHeaders(response.getAllHeaders());
            setEntity(response.getEntity());
        }

        @Override
        public void close() {
        }
    }
}
