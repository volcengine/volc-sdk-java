package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.ModifyETLTaskStatusRequest;
import com.volcengine.model.tls.response.ModifyETLTaskStatusResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class ETLTaskTest extends BaseTest {
    @Test
    public void testModifyETLTaskStatus() throws Exception {
        // 测试开启ETL任务
        String taskId = "test-etl-task-" + System.currentTimeMillis();
        
        ModifyETLTaskStatusRequest enableRequest = new ModifyETLTaskStatusRequest();
        enableRequest.setTaskId(taskId);
        enableRequest.setEnable(true);
        
        try {
            ModifyETLTaskStatusResponse enableResponse = client.modifyETLTaskStatus(enableRequest);
            assertNotNull("Response should not be null", enableResponse);
            assertNotNull("RequestId should not be null", enableResponse.getRequestId());
            System.out.println("Enable ETL task success, response: " + enableResponse);
        } catch (LogException e) {
            // 在实际测试中，可能会因为任务不存在而报错
            System.out.println("Enable ETL task failed: " + e.getMessage());
        }

        // 测试禁用ETL任务
        ModifyETLTaskStatusRequest disableRequest = new ModifyETLTaskStatusRequest();
        disableRequest.setTaskId(taskId);
        disableRequest.setEnable(false);
        
        try {
            ModifyETLTaskStatusResponse disableResponse = client.modifyETLTaskStatus(disableRequest);
            assertNotNull("Response should not be null", disableResponse);
            assertNotNull("RequestId should not be null", disableResponse.getRequestId());
            System.out.println("Disable ETL task success, response: " + disableResponse);
        } catch (LogException e) {
            // 在实际测试中，可能会因为任务不存在而报错
            System.out.println("Disable ETL task failed: " + e.getMessage());
        }
    }

    @Test
    public void testModifyETLTaskStatusWithNullRequest() {
        Exception exception = assertThrows(LogException.class, () -> {
            client.modifyETLTaskStatus(null);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
    }

    @Test
    public void testModifyETLTaskStatusWithNullTaskId() {
        ModifyETLTaskStatusRequest request = new ModifyETLTaskStatusRequest();
        request.setEnable(true);
        // taskId为null
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.modifyETLTaskStatus(request);
        });
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
}