package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.request.importtask.TosSourceInfo;
import com.volcengine.model.tls.request.importtask.TargetInfo;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImportTaskTest extends BaseTest {
    @Test
    public void testCreateImportTask() throws Exception {
        // 创建项目和主题用于测试
        String projectName = "tls-java-sdk-test-import-task-project-" + System.currentTimeMillis();
        String region = System.getenv("region");
        String description = "test project for import task";
        
        CreateProjectRequest projectRequest = new CreateProjectRequest();
        projectRequest.setProjectName(projectName);
        projectRequest.setRegion(region);
        projectRequest.setDescription(description);
        
        CreateProjectResponse projectResponse = client.createProject(projectRequest);
        assertNotNull(projectResponse.getProjectId());
        String projectId = projectResponse.getProjectId();
        
        String topicName = "tls-java-sdk-test-import-task-topic-" + System.currentTimeMillis();
        CreateTopicRequest topicRequest = new CreateTopicRequest();
        topicRequest.setProjectId(projectId);
        topicRequest.setTopicName(topicName);
        topicRequest.setShardCount(1);
        topicRequest.setTtl(1);
        
        CreateTopicResponse topicResponse = client.createTopic(topicRequest);
        assertNotNull(topicResponse.getTopicId());
        String topicId = topicResponse.getTopicId();
        
        try {
            // 测试创建 TOS 导入任务
            String taskName = "tls-java-sdk-test-import-task-" + System.currentTimeMillis();
            
            CreateImportTaskRequest importTaskRequest = new CreateImportTaskRequest();
            importTaskRequest.setTaskName(taskName);
            importTaskRequest.setTopicID(topicId);
            importTaskRequest.setProjectID(projectId);
            importTaskRequest.setSourceType("tos");
            importTaskRequest.setDescription("测试导入任务");
            
            // 设置 TOS 源信息
            TosSourceInfo tosSourceInfo = new TosSourceInfo();
            tosSourceInfo.setBucket("test-bucket");
            tosSourceInfo.setPrefix("test-prefix/");
            tosSourceInfo.setRegion("cn-shanghai");
            tosSourceInfo.setCompressType("none");
            
            com.volcengine.model.tls.request.importtask.ImportSourceInfo importSourceInfo = 
                new com.volcengine.model.tls.request.importtask.ImportSourceInfo();
            importSourceInfo.setTosSourceInfo(tosSourceInfo);
            importTaskRequest.setImportSourceInfo(importSourceInfo);
            
            // 设置目标信息
            TargetInfo targetInfo = new TargetInfo();
            targetInfo.setRegion("cn-shanghai");
            targetInfo.setLogType("json_log");
            importTaskRequest.setTargetInfo(targetInfo);
            
            CreateImportTaskResponse importTaskResponse = client.createImportTask(importTaskRequest);
            assertNotNull(importTaskResponse.getTaskId());
            assertNotNull(importTaskResponse.getRequestId());
            
        } catch (LogException e) {
            // 如果创建失败，检查错误信息
            System.out.println("Create import task failed: " + e.getMessage());
            throw e;
        } finally {
            // 清理资源
            try {
                DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(topicId);
                client.deleteTopic(deleteTopicRequest);
                
                DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
                deleteProjectRequest.setProjectId(projectId);
                client.deleteProject(deleteProjectRequest);
            } catch (Exception e) {
                System.out.println("Cleanup failed: " + e.getMessage());
            }
        }
    }
}