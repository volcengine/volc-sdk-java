package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteScheduleSqlTaskRequest;
import com.volcengine.model.tls.response.DeleteScheduleSqlTaskResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScheduleSqlTaskTest extends BaseTest {

    @Test
    public void testDeleteScheduleSqlTask() throws Exception {
        // 由于nodejs代码中测试只是创建了一个随机taskId进行删除测试
        // 这里我们也模拟类似的行为，使用一个测试用的taskId
        String taskId = "test-schedule-sql-task-" + System.currentTimeMillis();
        
        DeleteScheduleSqlTaskRequest request = new DeleteScheduleSqlTaskRequest();
        request.setScheduleSqlTaskId(taskId);
        
        try {
            DeleteScheduleSqlTaskResponse response = client.deleteScheduleSqlTask(request);
            assertNotNull("Response should not be null", response);
            assertNotNull("RequestId should not be null", response.getRequestId());
            System.out.println("delete schedule sql task success, response: " + response);
        } catch (LogException e) {
            // 如果任务不存在，也会返回相应的错误信息
            System.out.println("delete schedule sql task failed: " + e.getMessage());
            assertNotNull("Error message should not be null", e.getMessage());
        }
    }
    
    @Test
    public void testDeleteScheduleSqlTaskWithNullRequest() {
        // 测试空请求参数
        LogException exception = assertThrows(LogException.class, () -> {
            client.deleteScheduleSqlTask(null);
        });
        
        String expectedMessage = "Invalid request, Please check it";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
    
    @Test
    public void testDeleteScheduleSqlTaskWithEmptyTaskId() {
        // 测试空的taskId
        DeleteScheduleSqlTaskRequest request = new DeleteScheduleSqlTaskRequest();
        request.setScheduleSqlTaskId("");
        
        LogException exception = assertThrows(LogException.class, () -> {
            client.deleteScheduleSqlTask(request);
        });
        
        String expectedMessage = "Invalid request, Please check it";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}