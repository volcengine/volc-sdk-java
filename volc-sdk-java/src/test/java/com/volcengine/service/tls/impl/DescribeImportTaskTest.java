package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeImportTaskRequest;
import com.volcengine.model.tls.response.DescribeImportTaskResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeImportTaskTest extends BaseTest {
    
    @Test
    public void testDescribeImportTask() throws Exception {
        // 创建请求
        DescribeImportTaskRequest request = new DescribeImportTaskRequest();
        request.setTaskId("test-task-id");
        
        try {
            // 调用接口
            DescribeImportTaskResponse response = client.describeImportTask(request);
            
            // 验证响应
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            
            // 打印响应信息
            System.out.println("DescribeImportTask response: " + response);
            
        } catch (LogException e) {
            // 处理异常情况
            System.err.println("DescribeImportTask failed: " + e.getMessage());
            System.err.println("Error code: " + e.getErrorCode());
            System.err.println("HTTP code: " + e.getHttpCode());
            
            // 如果任务不存在，这是预期的错误
            if ("InvalidTaskId".equals(e.getErrorCode()) || "ResourceNotFound".equals(e.getErrorCode())) {
                System.out.println("Task not found, which is expected for test task ID");
            } else {
                throw e;
            }
        }
    }
    
    @Test
    public void testDescribeImportTaskWithInvalidRequest() {
        // 测试空请求
        DescribeImportTaskRequest nullRequest = null;
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.describeImportTask(nullRequest);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
        
        // 测试空taskId
        DescribeImportTaskRequest emptyRequest = new DescribeImportTaskRequest();
        emptyRequest.setTaskId(null);
        
        exception = assertThrows(LogException.class, () -> {
            client.describeImportTask(emptyRequest);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
}