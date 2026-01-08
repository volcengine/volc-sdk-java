package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.DeleteETLTaskRequest;
import com.volcengine.model.tls.response.DeleteETLTaskResponse;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteETLTaskTest extends BaseTest {
    @Test
    public void testDeleteETLTask() throws Exception {
        String taskId = "test-etl-task-" + System.currentTimeMillis();

        DeleteETLTaskRequest request = new DeleteETLTaskRequest();
        request.setTaskId(taskId);

        try {
            DeleteETLTaskResponse response = client.deleteETLTask(request);
            assertNotNull(response.getRequestId());
        } catch (LogException e) {
            // 处理异常情况，如任务不存在等
            assertNotNull(e.getRequestId());
        }
    }
}