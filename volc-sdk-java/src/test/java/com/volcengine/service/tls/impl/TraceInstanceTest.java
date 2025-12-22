package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ModifyTraceInstanceRequest;
import com.volcengine.model.tls.response.ModifyTraceInstanceResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class TraceInstanceTest extends BaseTest {

    @Test
    public void testModifyTraceInstance() throws LogException {
        // 创建修改Trace实例请求
        ModifyTraceInstanceRequest request = new ModifyTraceInstanceRequest();
        request.setTraceInstanceId("test-trace-instance-id");
        request.setDescription("jest-modify");

        // 调用修改Trace实例接口
        ModifyTraceInstanceResponse response = client.modifyTraceInstance(request);

        // 验证响应
        assertNotNull("Response should not be null", response);
        assertNotNull("Request ID should not be null", response.getRequestId());
        
        System.out.println("Modify trace instance success, response: " + response);
    }

    @Test
    public void testModifyTraceInstanceWithNullRequest() {
        try {
            client.modifyTraceInstance(null);
            fail("Expected LogException for null request");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
            assertTrue(e.getMessage().contains("Invalid request"));
        }
    }

    @Test
    public void testModifyTraceInstanceWithNullTraceInstanceId() {
        try {
            ModifyTraceInstanceRequest request = new ModifyTraceInstanceRequest();
            request.setDescription("test-description");
            // TraceInstanceId is null
            client.modifyTraceInstance(request);
            fail("Expected LogException for null trace instance id");
        } catch (LogException e) {
            assertEquals("InvalidArgument", e.getErrorCode());
            assertTrue(e.getMessage().contains("Invalid request"));
        }
    }
}