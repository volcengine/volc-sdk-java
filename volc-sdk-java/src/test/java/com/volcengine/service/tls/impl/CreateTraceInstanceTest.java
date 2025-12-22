package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateTraceInstanceRequest;
import com.volcengine.model.tls.response.CreateTraceInstanceResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateTraceInstanceTest extends BaseTest {
    
    @Test
    public void testCreateTraceInstance() throws Exception {
        // 准备测试数据
        String projectId = "test-project-id";
        String traceInstanceName = "test-trace-instance";
        String description = "Test trace instance description";
        
        // 创建请求
        CreateTraceInstanceRequest request = new CreateTraceInstanceRequest();
        request.setProjectId(projectId);
        request.setTraceInstanceName(traceInstanceName);
        request.setDescription(description);
        
        try {
            // 调用接口
            CreateTraceInstanceResponse response = client.createTraceInstance(request);
            
            // 验证响应
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            assertNotNull("TraceInstanceId should not be null", response.getTraceInstanceId());
            
            System.out.println("Create trace instance success, response: " + response);
            
        } catch (LogException e) {
            // 处理异常
            System.err.println("Create trace instance failed: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testCreateTraceInstanceWithNullRequest() {
        // 测试空请求
        Exception exception = assertThrows(LogException.class, () -> {
            client.createTraceInstance(null);
        });
        
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
    
    @Test
    public void testCreateTraceInstanceWithInvalidRequest() {
        // 测试无效请求 - 缺少必填参数
        CreateTraceInstanceRequest request = new CreateTraceInstanceRequest();
        request.setDescription("Test description");
        // 不设置 projectId 和 traceInstanceName
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.createTraceInstance(request);
        });
        
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
    
    @Test
    public void testCreateTraceInstanceWithoutDescription() throws Exception {
        // 测试不设置描述信息（可选参数）
        String projectId = "test-project-id";
        String traceInstanceName = "test-trace-instance-no-desc";
        
        CreateTraceInstanceRequest request = new CreateTraceInstanceRequest();
        request.setProjectId(projectId);
        request.setTraceInstanceName(traceInstanceName);
        // 不设置 description
        
        try {
            CreateTraceInstanceResponse response = client.createTraceInstance(request);
            
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            assertNotNull("TraceInstanceId should not be null", response.getTraceInstanceId());
            
            System.out.println("Create trace instance without description success, response: " + response);
            
        } catch (LogException e) {
            System.err.println("Create trace instance failed: " + e.getMessage());
            throw e;
        }
    }
}