package com.volcengine.http;

import org.apache.http.NoHttpResponseException;
import org.apache.http.client.protocol.HttpClientContext;
import org.junit.Assert;
import org.junit.Test;

public class HttpClientFactoryProducerRetryTest {
    @Test
    public void markedProducerRequestDoesNotRetryNoHttpResponse() {
        HttpClientContext context = HttpClientContext.create();
        context.setAttribute(HttpClientFactory.DISABLE_REQUEST_RETRY_CONTEXT_ATTRIBUTE, Boolean.TRUE);

        Assert.assertFalse(HttpClientFactory.httpRequestRetryHandler.retryRequest(
                new NoHttpResponseException("connection closed"), 1, context));
    }

    @Test
    public void unmarkedRequestKeepsExistingNoHttpResponseRetry() {
        HttpClientContext context = HttpClientContext.create();

        Assert.assertTrue(HttpClientFactory.httpRequestRetryHandler.retryRequest(
                new NoHttpResponseException("connection closed"), 1, context));
    }
}
