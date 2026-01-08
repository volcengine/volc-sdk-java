package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.TargetResource;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CreateETLTaskTest extends BaseTest {
    @Test
    public void testCreateETLTask() throws Exception {
        // 创建项目
        String projectName = "test-etl-project-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        createProjectRequest.setDescription("Test ETL project");
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        String projectId = createProjectResponse.getProjectId();

        try {
            // 创建源日志主题
            String sourceTopicName = "test-source-topic-" + System.currentTimeMillis();
            CreateTopicRequest createSourceTopicRequest = new CreateTopicRequest();
            createSourceTopicRequest.setProjectId(projectId);
            createSourceTopicRequest.setTopicName(sourceTopicName);
            createSourceTopicRequest.setShardCount(1);
            createSourceTopicRequest.setTtl(1);
            CreateTopicResponse createSourceTopicResponse = client.createTopic(createSourceTopicRequest);
            assertNotNull(createSourceTopicResponse.getTopicId());
            String sourceTopicId = createSourceTopicResponse.getTopicId();

            // 创建目标日志主题
            String targetTopicName = "test-target-topic-" + System.currentTimeMillis();
            CreateTopicRequest createTargetTopicRequest = new CreateTopicRequest();
            createTargetTopicRequest.setProjectId(projectId);
            createTargetTopicRequest.setTopicName(targetTopicName);
            createTargetTopicRequest.setShardCount(1);
            createTargetTopicRequest.setTtl(1);
            CreateTopicResponse createTargetTopicResponse = client.createTopic(createTargetTopicRequest);
            assertNotNull(createTargetTopicResponse.getTopicId());
            String targetTopicId = createTargetTopicResponse.getTopicId();

            // 创建 ETL 任务
            String taskName = "test-etl-task-" + System.currentTimeMillis();
            CreateETLTaskRequest createETLTaskRequest = new CreateETLTaskRequest();
            createETLTaskRequest.setDslType("NORMAL");
            createETLTaskRequest.setName(taskName);
            createETLTaskRequest.setDescription("Test ETL task");
            createETLTaskRequest.setEnable(true);
            createETLTaskRequest.setSourceTopicId(sourceTopicId);
            createETLTaskRequest.setScript("f_set(\"key\", \"value\")");
            createETLTaskRequest.setTaskType("Resident");
            
            List<TargetResource> targetResources = new ArrayList<>();
            TargetResource targetResource = new TargetResource("test", targetTopicId, region);
            targetResources.add(targetResource);
            createETLTaskRequest.setTargetResources(targetResources);

            CreateETLTaskResponse createETLTaskResponse = client.createETLTask(createETLTaskRequest);
            assertNotNull(createETLTaskResponse.getTaskId());
            assertNotNull(createETLTaskResponse.getRequestId());

            // 清理资源
            client.deleteTopic(new DeleteTopicRequest(targetTopicId));
            client.deleteTopic(new DeleteTopicRequest(sourceTopicId));
        } finally {
            // 删除项目
            client.deleteProject(new DeleteProjectRequest(projectId));
        }
    }

    @Test
    public void testCreateETLTaskWithInvalidRequest() {
        // 测试无效请求
        CreateETLTaskRequest invalidRequest = new CreateETLTaskRequest();
        
        Exception exception = assertThrows(LogException.class, () -> {
            client.createETLTask(invalidRequest);
        });
        
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
}
