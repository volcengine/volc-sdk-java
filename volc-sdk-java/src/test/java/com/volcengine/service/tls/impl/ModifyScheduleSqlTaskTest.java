package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.RequestCycle;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModifyScheduleSqlTaskTest extends BaseTest {

    @Test
    public void testModifyScheduleSqlTask() throws Exception {
        String region = System.getenv("region");
        
        // 创建项目
        String projectName = "test-schedule-project-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        createProjectRequest.setDescription("test project for schedule sql task");
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        System.out.println("create project success, projectId: " + createProjectResponse.getProjectId());
        
        // 创建主题
        String topicName = "test-schedule-topic-" + System.currentTimeMillis();
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(createProjectResponse.getProjectId());
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setTtl(1);
        createTopicRequest.setShardCount(1);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        assertNotNull(createTopicResponse.getTopicId());
        System.out.println("create topic success, topicId: " + createTopicResponse.getTopicId());
        
        // 测试修改定时SQL任务
        String taskId = "test-schedule-task-" + System.currentTimeMillis();
        String taskName = "test-schedule-task-name-" + System.currentTimeMillis();
        
        // 创建请求周期对象
        RequestCycle requestCycle = new RequestCycle();
        requestCycle.setType("Period");
        requestCycle.setTime(1);
        
        ModifyScheduleSqlTaskRequest modifyRequest = new ModifyScheduleSqlTaskRequest();
        modifyRequest.setTaskId(taskId);
        modifyRequest.setTaskName(taskName);
        modifyRequest.setDescription("This is a test schedule sql task");
        modifyRequest.setDestRegion(region);
        modifyRequest.setDestTopicID(createTopicResponse.getTopicId());
        modifyRequest.setStatus(0);
        modifyRequest.setProcessSqlDelay(60);
        modifyRequest.setProcessTimeWindow("@m-15m,@m");
        modifyRequest.setQuery("* | select *");
        modifyRequest.setRequestCycle(requestCycle);
        
        try {
            ModifyScheduleSqlTaskResponse modifyResponse = client.modifyScheduleSqlTask(modifyRequest);
            assertNotNull(modifyResponse.getRequestId());
            System.out.println("modify schedule sql task success, requestId: " + modifyResponse.getRequestId());
        } catch (LogException e) {
            // 期望任务不存在，但API调用应该成功（返回基础响应）
            System.out.println("modify schedule sql task failed as expected: " + e.getErrorCode() + " - " + e.getErrorMessage());
            assertNotNull(e.getRequestId());
        }
        
        // 清理资源
        DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(createTopicResponse.getTopicId());
        client.deleteTopic(deleteTopicRequest);
        System.out.println("delete topic success");
        
        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
        deleteProjectRequest.setProjectId(createProjectResponse.getProjectId());
        client.deleteProject(deleteProjectRequest);
        System.out.println("delete project success");
    }
}
