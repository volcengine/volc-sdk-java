package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteAlarmWebhookIntegrationRequest;
import com.volcengine.model.tls.response.DeleteAlarmWebhookIntegrationResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteAlarmWebhookIntegrationTest extends BaseTest {
    @Test
    public void testDeleteAlarmWebhookIntegration() throws Exception {
        DeleteAlarmWebhookIntegrationRequest request = new DeleteAlarmWebhookIntegrationRequest();
        request.setWebhookId("test-webhook-id-12345");
        
        try {
            DeleteAlarmWebhookIntegrationResponse response = client.deleteAlarmWebhookIntegration(request);
            assertNotNull(response.getRequestId());
        } catch (LogException e) {
            // Handle expected exceptions for invalid webhook ID
            assertTrue(e.getMessage().contains("Invalid") || 
                      e.getMessage().contains("NotFound") || 
                      e.getMessage().contains("Webhook"));
        }
    }

    @Test
    public void testDeleteAlarmWebhookIntegrationWithInvalidRequest() {
        DeleteAlarmWebhookIntegrationRequest request = new DeleteAlarmWebhookIntegrationRequest();
        // Don't set webhookId to test validation
        
        LogException exception = assertThrows(LogException.class, () -> {
            client.deleteAlarmWebhookIntegration(request);
        });
        
        assertEquals("InvalidArgument", exception.getErrorCode());
    }
}