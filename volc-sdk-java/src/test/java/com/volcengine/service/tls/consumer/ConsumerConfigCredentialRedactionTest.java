package com.volcengine.service.tls.consumer;

import com.volcengine.model.tls.ClientConfig;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.exception.LogException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class ConsumerConfigCredentialRedactionTest {
    private static final String ACCESS_KEY = "access-key-sensitive-value";
    private static final String SECRET = "secret-sensitive-value";
    private static final String TOKEN = "token-sensitive-value";
    private static final String API_KEY = "api-key-sensitive-value";

    @Test
    public void configStringsNeverExposeCredentialMaterial() {
        ConsumerConfig config = validConfig();

        assertRedacted(config.getClientConfig().toString());
        assertRedacted(config.toString());
    }

    @Test
    public void invalidClientConfigExceptionNeverExposesCredentialMaterial() {
        ConsumerConfig config = validConfig();
        config.getClientConfig().setEndpoint(null);

        try {
            config.validateConsumerConfig();
            fail("invalid client config must be rejected");
        } catch (LogException expected) {
            assertRedacted(expected.getMessage());
            assertRedacted(expected.toString());
        }
    }

    private static ConsumerConfig validConfig() {
        ConsumerConfig config = new ConsumerConfig(
                "http://endpoint", "region", ACCESS_KEY, SECRET, TOKEN);
        ClientConfig client = config.getClientConfig();
        client.setApiKey(API_KEY);
        return config;
    }

    private static void assertRedacted(String value) {
        assertFalse(value.contains(ACCESS_KEY));
        assertFalse(value.contains(SECRET));
        assertFalse(value.contains(TOKEN));
        assertFalse(value.contains(API_KEY));
    }
}
