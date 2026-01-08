package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeScheduleSqlTaskRequest;
import com.volcengine.model.tls.response.DescribeScheduleSqlTaskResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeScheduleSqlTaskTest extends BaseTest {
    
    @Test
    public void testDescribeScheduleSqlTask() throws Exception {
        // 创建请求对象
        DescribeScheduleSqlTaskRequest request = new DescribeScheduleSqlTaskRequest();
        request.setTaskId("f3e901c3-b17f-42fd-aa8c-dc91a6c7****");
        
        try {
            // 调用接口
            DescribeScheduleSqlTaskResponse response = client.describeScheduleSqlTask(request);
            
            // 验证响应
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            
            // 验证任务详情字段
            assertNotNull("TaskId should not be null", response.getTaskId());
            assertNotNull("TaskName should not be null", response.getTaskName());
            assertNotNull("SourceProjectID should not be null", response.getSourceProjectID());
            assertNotNull("SourceTopicID should not be null", response.getSourceTopicID());
            assertNotNull("DestProjectID should not be null", response.getDestProjectID());
            assertNotNull("DestTopicID should not be null", response.getDestTopicID());
            assertNotNull("Query should not be null", response.getQuery());
            assertNotNull("RequestCycle should not be null", response.getRequestCycle());
            
        } catch (LogException e) {
            // 处理异常情况
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Error Message: " + e.getErrorMessage());
            
            // 验证异常信息不为空
            assertNotNull("Error code should not be null", e.getErrorCode());
            assertNotNull("Error message should not be null", e.getErrorMessage());
        }
    }
    
    @Test
    public void testDescribeScheduleSqlTaskWithInvalidTaskId() throws Exception {
        // 测试无效的任务ID
        DescribeScheduleSqlTaskRequest request = new DescribeScheduleSqlTaskRequest();
        request.setTaskId("invalid-task-id");
        
        try {
            DescribeScheduleSqlTaskResponse response = client.describeScheduleSqlTask(request);
            fail("Expected LogException for invalid task ID");
        } catch (LogException e) {
            // 验证异常被正确抛出
            assertNotNull("Error code should not be null", e.getErrorCode());
            assertNotNull("Error message should not be null", e.getErrorMessage());
        }
    }
    
    @Test
    public void testDescribeScheduleSqlTaskWithNullRequest() throws Exception {
        // 测试空请求
        try {
            DescribeScheduleSqlTaskResponse response = client.describeScheduleSqlTask(null);
            fail("Expected LogException for null request");
        } catch (LogException e) {
            // 验证异常被正确抛出
            assertEquals("InvalidArgument", e.getErrorCode());
            assertNotNull("Error message should not be null", e.getErrorMessage());
        }
    }
    
    @Test
    public void testDescribeScheduleSqlTaskWithEmptyTaskId() throws Exception {
        // 测试空的任务ID
        DescribeScheduleSqlTaskRequest request = new DescribeScheduleSqlTaskRequest();
        request.setTaskId("");
        
        try {
            DescribeScheduleSqlTaskResponse response = client.describeScheduleSqlTask(request);
            fail("Expected LogException for empty task ID");
        } catch (LogException e) {
            // 验证异常被正确抛出
            assertEquals("InvalidArgument", e.getErrorCode());
            assertNotNull("Error message should not be null", e.getErrorMessage());
        }
    }
}