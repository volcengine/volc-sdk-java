package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeTraceInstanceRequest;
import com.volcengine.model.tls.response.DescribeTraceInstanceResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeTraceInstanceTest extends BaseTest {
    
    @Test
    public void testDescribeTraceInstance() throws Exception {
        // 这里假设有一个存在的 TraceInstanceId
        // 在实际测试中，您需要先创建一个 TraceInstance 或者使用已存在的 TraceInstanceId
        String traceInstanceId = "test-trace-instance-id";
        
        DescribeTraceInstanceRequest request = new DescribeTraceInstanceRequest();
        request.setTraceInstanceId(traceInstanceId);
        
        try {
            DescribeTraceInstanceResponse response = client.describeTraceInstance(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            
            // 验证返回的字段
            assertEquals("TraceInstanceId should match", traceInstanceId, response.getTraceInstanceId());
            assertNotNull("CreateTime should not be null", response.getCreateTime());
            assertNotNull("ModifyTime should not be null", response.getModifyTime());
            assertNotNull("TraceInstanceName should not be null", response.getTraceInstanceName());
            assertNotNull("TraceInstanceStatus should not be null", response.getTraceInstanceStatus());
            assertNotNull("ProjectId should not be null", response.getProjectId());
            assertNotNull("ProjectName should not be null", response.getProjectName());
            assertNotNull("TraceTopicId should not be null", response.getTraceTopicId());
            assertNotNull("TraceTopicName should not be null", response.getTraceTopicName());
            assertNotNull("DependencyTopicId should not be null", response.getDependencyTopicId());
            assertNotNull("DependencyTopicTopicName should not be null", response.getDependencyTopicTopicName());
            assertNotNull("Description should not be null", response.getDescription());
            
            System.out.println("DescribeTraceInstance success, response: " + response);
            
        } catch (LogException e) {
            // 如果 TraceInstance 不存在，应该抛出相应的异常
            System.out.println("DescribeTraceInstance failed: " + e.getMessage());
            throw e;
        }
    }
    
    @Test
    public void testDescribeTraceInstanceWithInvalidId() throws Exception {
        // 测试使用无效的 TraceInstanceId
        String invalidTraceInstanceId = "";
        
        DescribeTraceInstanceRequest request = new DescribeTraceInstanceRequest();
        request.setTraceInstanceId(invalidTraceInstanceId);
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.describeTraceInstance(request);
        });
        
        assertNotNull("Exception should not be null", exception);
        System.out.println("Expected exception for invalid TraceInstanceId: " + exception.getMessage());
    }
    
    @Test
    public void testDescribeTraceInstanceWithNullRequest() throws Exception {
        // 测试传入 null 请求
        Exception exception = assertThrows(LogException.class, () -> {
            client.describeTraceInstance(null);
        });
        
        assertNotNull("Exception should not be null", exception);
        System.out.println("Expected exception for null request: " + exception.getMessage());
    }
}