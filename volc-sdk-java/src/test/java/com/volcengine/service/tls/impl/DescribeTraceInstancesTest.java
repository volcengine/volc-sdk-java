package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeTraceInstancesRequest;
import com.volcengine.model.tls.response.DescribeTraceInstancesResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeTraceInstancesTest extends BaseTest {
    @Test
    public void testDescribeTraceInstances() throws Exception {
        DescribeTraceInstancesRequest request = new DescribeTraceInstancesRequest();
        request.setPageNumber(1);
        request.setPageSize(20);
        
        try {
            DescribeTraceInstancesResponse response = client.describeTraceInstances(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getTotal());
            assertNotNull(response.getTraceInstances());
            System.out.println("describe trace instances success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe trace instances failed, error: " + e.getErrorCode() + ", " + e.getErrorMessage());
            throw e;
        }
    }

    @Test
    public void testDescribeTraceInstancesWithParams() throws Exception {
        DescribeTraceInstancesRequest request = new DescribeTraceInstancesRequest();
        request.setPageNumber(1);
        request.setPageSize(10);
        request.setProjectId("test-project-id");
        request.setStatus("CREATED");
        
        try {
            DescribeTraceInstancesResponse response = client.describeTraceInstances(request);
            assertNotNull(response.getRequestId());
            assertNotNull(response.getTotal());
            assertNotNull(response.getTraceInstances());
            System.out.println("describe trace instances with params success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe trace instances with params failed, error: " + e.getErrorCode() + ", " + e.getErrorMessage());
            throw e;
        }
    }
}