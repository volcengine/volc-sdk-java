package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeImportTasksRequest;
import com.volcengine.model.tls.response.DescribeImportTasksResponse;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DescribeImportTasksTest extends BaseTest {
    @Test
    public void testDescribeImportTasks() throws Exception {
        DescribeImportTasksRequest request = new DescribeImportTasksRequest();
        
        try {
            DescribeImportTasksResponse response = client.describeImportTasks(request);
            assertNotNull(response.getRequestId());
            if (response.getTasks() != null) {
                assertNotNull(response.getTotal());
            }
            System.out.println("describe import tasks success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe import tasks failed, error: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testDescribeImportTasksWithParams() throws Exception {
        DescribeImportTasksRequest request = new DescribeImportTasksRequest();
        request.setPageNumber(1);
        request.setPageSize(10);
        
        try {
            DescribeImportTasksResponse response = client.describeImportTasks(request);
            assertNotNull(response.getRequestId());
            if (response.getTasks() != null) {
                assertNotNull(response.getTotal());
            }
            System.out.println("describe import tasks with params success, response: " + response);
        } catch (LogException e) {
            System.out.println("describe import tasks with params failed, error: " + e.getMessage());
            throw e;
        }
    }
}