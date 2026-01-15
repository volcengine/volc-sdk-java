package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeTraceInstanceRequest;
import com.volcengine.model.tls.request.DescribeTraceInstancesRequest;
import com.volcengine.model.tls.response.DescribeTraceInstanceResponse;
import com.volcengine.model.tls.response.DescribeTraceInstancesResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeTraceInstanceTest extends BaseTest {
    
    @Test
    public void testDescribeTraceInstance() throws Exception {
        DescribeTraceInstancesRequest listRequest = new DescribeTraceInstancesRequest();
        DescribeTraceInstancesResponse listResponse = client.describeTraceInstances(listRequest);
        assertNotNull("DescribeTraceInstancesResponse should not be null", listResponse);
        if (listResponse.getTraceInstances() == null || listResponse.getTraceInstances().isEmpty()) {
            System.out.println("no trace instances found, skip describeTraceInstance positive case");
            return;
        }
        String traceInstanceId = listResponse.getTraceInstances().get(0).getTraceInstanceId();
        
        DescribeTraceInstanceRequest request = new DescribeTraceInstanceRequest();
        request.setTraceInstanceId(traceInstanceId);
        
        try {
            DescribeTraceInstanceResponse response = client.describeTraceInstance(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            
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
