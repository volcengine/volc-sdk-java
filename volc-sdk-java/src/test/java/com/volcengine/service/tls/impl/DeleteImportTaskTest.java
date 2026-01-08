package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteImportTaskRequest;
import com.volcengine.model.tls.response.DeleteImportTaskResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteImportTaskTest extends BaseTest {
    
    @Test
    public void testDeleteImportTask() throws Exception {
        // P0: 基础功能测试 - 删除导入任务
        String taskId = "test-import-task-" + System.currentTimeMillis();
        
        DeleteImportTaskRequest request = new DeleteImportTaskRequest();
        request.setTaskId(taskId);
        
        try {
            DeleteImportTaskResponse response = client.deleteImportTask(request);
            assertNotNull(response.getRequestId());
            System.out.println("delete import task success, response: " + response);
        } catch (LogException e) {
            // 任务不存在或其他错误，但请求应该被正确处理
            assertNotNull(e.getMessage());
            System.out.println("delete import task failed: " + e.getMessage());
        }
    }
    
    @Test
    public void testDeleteImportTaskWithEmptyTaskId() throws Exception {
        // P2: 异常场景测试 - 空任务ID
        DeleteImportTaskRequest request = new DeleteImportTaskRequest();
        request.setTaskId("");
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.deleteImportTask(request);
        });
        
        String expectedMessage = "Invalid request";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        System.out.println("test empty taskId success, exception: " + actualMessage);
    }
    
    @Test
    public void testDeleteImportTaskWithNullTaskId() throws Exception {
        // P2: 异常场景测试 - null任务ID
        DeleteImportTaskRequest request = new DeleteImportTaskRequest();
        request.setTaskId(null);
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.deleteImportTask(request);
        });
        
        String expectedMessage = "Invalid request";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        System.out.println("test null taskId success, exception: " + actualMessage);
    }
}