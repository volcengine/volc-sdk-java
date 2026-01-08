package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeAlarmWebhookIntegrationsRequest;
import com.volcengine.model.tls.response.DescribeAlarmWebhookIntegrationsResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeAlarmWebhookIntegrationsTest extends BaseTest {
    @Test
    public void testDescribeAlarmWebhookIntegrations() throws Exception {
        DescribeAlarmWebhookIntegrationsRequest request = new DescribeAlarmWebhookIntegrationsRequest();
        request.setPageNumber(1);
        request.setPageSize(20);
        
        try {
            DescribeAlarmWebhookIntegrationsResponse response = client.describeAlarmWebhookIntegrations(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getTotal());
            assertNotNull(response.getWebhookIntegrations());
            
            System.out.println("describe alarm webhook integrations success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe alarm webhook integrations failed, error: " + e.getMessage());
            throw e;
        }
    }
}