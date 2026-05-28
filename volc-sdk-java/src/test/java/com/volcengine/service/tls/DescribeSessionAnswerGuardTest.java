package com.volcengine.service.tls;

import com.volcengine.model.tls.ClientBuilder;
import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeSessionAnswerRequest;
import org.junit.Assert;
import org.junit.Test;

public class DescribeSessionAnswerGuardTest {
    @Test
    public void describeSessionAnswerRejectsBlockingSsePlaceholder() throws Exception {
        assertUnsupported(null);
    }

    @Test
    public void describeSessionAnswerRejectsEvenWhenAcceptIsChanged() throws Exception {
        assertUnsupported("application/json");
    }

    private static void assertUnsupported(String accept) throws Exception {
        ClientConfig config = new ClientConfig("http://example.test", "region", "ak", "sk");
        config.setLocalValidationOnly(true);
        TLSLogClient client = ClientBuilder.newClient(config);
        DescribeSessionAnswerRequest request = new DescribeSessionAnswerRequest();
        request.setInstanceId("instance");
        request.setSessionId("session");
        request.setQuestion("question");
        if (accept != null) {
            request.setAccept(accept);
        }

        try {
            client.describeSessionAnswer(request);
            Assert.fail("SSE endpoint must not be implemented through the blocking JSON request path");
        } catch (LogException e) {
            Assert.assertEquals("UnsupportedOperation", e.getErrorCode());
        } finally {
            client.close();
        }
    }
}
