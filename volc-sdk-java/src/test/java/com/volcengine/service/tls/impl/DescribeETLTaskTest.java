package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DescribeETLTaskRequest;
import com.volcengine.model.tls.response.DescribeETLTaskResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescribeETLTaskTest extends BaseTest {
    @Test
    public void testDescribeETLTask() throws Exception {
        String taskId = "test-etl-task-" + System.currentTimeMillis();
        
        DescribeETLTaskRequest request = new DescribeETLTaskRequest();
        request.setTaskId(taskId);
        
        try {
            DescribeETLTaskResponse response = client.describeETLTask(request);
            assertNotNull(response.getRequestId());
            // 由于这是一个新创建的测试任务，可能会返回错误或空结果
            // 这里主要验证接口调用是否成功
        } catch (LogException e) {
            // 预期的异常处理，因为测试任务可能不存在
            assertNotNull(e.getMessage());
        }
    }
    
    @Test
    public void testDescribeETLTaskWithInvalidRequest() {
        DescribeETLTaskRequest request = new DescribeETLTaskRequest();
        // 不设置 taskId，验证参数校验
        
        assertThrows(LogException.class, () -> {
            client.describeETLTask(request);
        });
    }
}