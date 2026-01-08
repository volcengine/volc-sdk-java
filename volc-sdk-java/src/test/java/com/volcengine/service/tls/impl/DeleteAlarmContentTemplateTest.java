package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteAlarmContentTemplateRequest;
import com.volcengine.model.tls.response.DeleteAlarmContentTemplateResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteAlarmContentTemplateTest extends BaseTest {
    @Test
    public void testDeleteAlarmContentTemplate() throws Exception {
        DeleteAlarmContentTemplateRequest request = new DeleteAlarmContentTemplateRequest("test-template-id");
        try {
            DeleteAlarmContentTemplateResponse response = client.deleteAlarmContentTemplate(request);
            assertNotNull(response.getRequestId());
        } catch (LogException e) {
            // Handle expected exceptions for non-existent template
            assertTrue(e.getErrorCode().equals("InvalidArgument") || 
                      e.getErrorCode().equals("ResourceNotFound") ||
                      e.getErrorCode().contains("NotFound"));
        }
    }
}