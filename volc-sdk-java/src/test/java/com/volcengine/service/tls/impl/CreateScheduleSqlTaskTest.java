package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.request.RequestCycle;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateScheduleSqlTaskTest extends BaseTest {
    @Test
    public void testCreateScheduleSqlTask() throws Exception {
        // 创建项目和主题用于测试
        String projectName = "tls-java-sdk-test-schedule-project-" + System.currentTimeMillis();
        String region = System.getenv("region");
        
        CreateProjectRequest projectRequest = new CreateProjectRequest();
        projectRequest.setProjectName(projectName);
        projectRequest.setRegion(region);
        projectRequest.setDescription("测试定时SQL任务的项目");
        
        CreateProjectResponse projectResponse = client.createProject(projectRequest);
        assertNotNull(projectResponse.getProjectId());
        String projectId = projectResponse.getProjectId();

        try {
            // 创建源主题
            String sourceTopicName = "tls-java-sdk-test-schedule-source-topic-" + System.currentTimeMillis();
            CreateTopicRequest sourceTopicRequest = new CreateTopicRequest();
            sourceTopicRequest.setProjectId(projectId);
            sourceTopicRequest.setTopicName(sourceTopicName);
            sourceTopicRequest.setShardCount(1);
            sourceTopicRequest.setTtl(1);
            
            CreateTopicResponse sourceTopicResponse = client.createTopic(sourceTopicRequest);
            assertNotNull(sourceTopicResponse.getTopicId());
            String sourceTopicId = sourceTopicResponse.getTopicId();

            // 创建目标主题
            String destTopicName = "tls-java-sdk-test-schedule-dest-topic-" + System.currentTimeMillis();
            CreateTopicRequest destTopicRequest = new CreateTopicRequest();
            destTopicRequest.setProjectId(projectId);
            destTopicRequest.setTopicName(destTopicName);
            destTopicRequest.setShardCount(1);
            destTopicRequest.setTtl(1);
            
            CreateTopicResponse destTopicResponse = client.createTopic(destTopicRequest);
            assertNotNull(destTopicResponse.getTopicId());
            String destTopicId = destTopicResponse.getTopicId();

            // 创建索引用于源主题
            CreateIndexRequest indexRequest = new CreateIndexRequest();
            indexRequest.setTopicId(sourceTopicId);
            // 设置全文索引配置
            
            CreateIndexResponse indexResponse = client.createIndex(indexRequest);
            assertNotNull(indexResponse.getRequestId());

            // 创建定时 SQL 任务
            long currentTime = System.currentTimeMillis() / 1000;
            String taskName = "tls-java-sdk-test-schedule-task-" + System.currentTimeMillis();
            
            // 创建请求周期配置
            RequestCycle requestCycle = new RequestCycle();
            requestCycle.setType("Period");
            requestCycle.setTime(60); // 每60分钟执行一次
            
            CreateScheduleSqlTaskRequest scheduleSqlTaskRequest = new CreateScheduleSqlTaskRequest();
            scheduleSqlTaskRequest.setTaskName(taskName);
            scheduleSqlTaskRequest.setTopicId(sourceTopicId);
            scheduleSqlTaskRequest.setDestTopicId(destTopicId);
            scheduleSqlTaskRequest.setProcessStartTime(currentTime + 3600); // 1小时后开始
            scheduleSqlTaskRequest.setProcessTimeWindow("@m-15m,@m");
            scheduleSqlTaskRequest.setQuery("* | select count(*) as count");
            scheduleSqlTaskRequest.setRequestCycle(requestCycle);
            scheduleSqlTaskRequest.setStatus(0); // 关闭任务，后续需手动启动
            scheduleSqlTaskRequest.setDescription("测试定时SQL任务");
            scheduleSqlTaskRequest.setProcessSqlDelay(60);
            
            CreateScheduleSqlTaskResponse scheduleSqlTaskResponse = client.createScheduleSqlTask(scheduleSqlTaskRequest);
            assertNotNull(scheduleSqlTaskResponse.getTaskId());
            assertNotNull(scheduleSqlTaskResponse.getRequestId());
            
            System.out.println("Create schedule SQL task success, taskId: " + scheduleSqlTaskResponse.getTaskId());

            // 清理资源
            DeleteTopicRequest deleteDestTopicRequest = new DeleteTopicRequest();
            deleteDestTopicRequest.setTopicId(destTopicId);
            client.deleteTopic(deleteDestTopicRequest);
            
            DeleteTopicRequest deleteSourceTopicRequest = new DeleteTopicRequest();
            deleteSourceTopicRequest.setTopicId(sourceTopicId);
            client.deleteTopic(deleteSourceTopicRequest);
            
        } finally {
            // 删除项目
            DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
            deleteProjectRequest.setProjectId(projectId);
            client.deleteProject(deleteProjectRequest);
        }
    }
}
