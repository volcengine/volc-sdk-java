package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ModifyImportTaskTest extends BaseTest {
    
    @Test
    public void testModifyImportTask() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test";
        String separator = "-";
        String date = sdf.format(new Date());
        String region = System.getenv("region");
        
        // 创建项目
        String projectName = prefix + separator + date + separator + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        createProjectRequest.setDescription("test project for import task");
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        System.out.println("create project success, projectId: " + createProjectResponse.getProjectId());
        
        // 创建主题
        String topicName = prefix + separator + date + separator + System.currentTimeMillis();
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(createProjectResponse.getProjectId());
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setTtl(1);
        createTopicRequest.setShardCount(1);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        assertNotNull(createTopicResponse.getTopicId());
        System.out.println("create topic success, topicId: " + createTopicResponse.getTopicId());
        
        // 测试修改TOS导入任务
        String taskId = "test-import-task-" + System.currentTimeMillis();
        String taskName = "test-tos-import-task-" + System.currentTimeMillis();
        
        ModifyImportTaskRequest modifyTosRequest = new ModifyImportTaskRequest();
        modifyTosRequest.setTaskId(taskId);
        modifyTosRequest.setTaskName(taskName);
        modifyTosRequest.setDescription("test TOS import task");
        modifyTosRequest.setSourceType("tos");
        modifyTosRequest.setStatus(0);
        modifyTosRequest.setProjectID(createProjectResponse.getProjectId());
        modifyTosRequest.setTopicID(createTopicResponse.getTopicId());
        
        // 设置TOS源信息
        TosSourceInfo tosSourceInfo = new TosSourceInfo();
        tosSourceInfo.setBucket("test-bucket");
        tosSourceInfo.setPrefix("test-prefix/");
        tosSourceInfo.setRegion(region);
        tosSourceInfo.setCompressType("none");
        
        ImportSourceInfo importSourceInfo = new ImportSourceInfo();
        importSourceInfo.setTosSourceInfo(tosSourceInfo);
        modifyTosRequest.setImportSourceInfo(importSourceInfo);
        
        // 设置目标信息
        TargetInfo targetInfo = new TargetInfo();
        targetInfo.setRegion(region);
        targetInfo.setLogType("json_log");
        modifyTosRequest.setTargetInfo(targetInfo);
        
        ModifyImportTaskResponse modifyTosResponse = client.modifyImportTask(modifyTosRequest);
        assertNotNull(modifyTosResponse.getRequestId());
        System.out.println("modify TOS import task success, requestId: " + modifyTosResponse.getRequestId());
        
        // 测试修改Kafka导入任务
        String kafkaTaskName = "test-kafka-import-task-" + System.currentTimeMillis();
        
        ModifyImportTaskRequest modifyKafkaRequest = new ModifyImportTaskRequest();
        modifyKafkaRequest.setTaskId(taskId);
        modifyKafkaRequest.setTaskName(kafkaTaskName);
        modifyKafkaRequest.setDescription("test Kafka import task");
        modifyKafkaRequest.setSourceType("kafka");
        modifyKafkaRequest.setStatus(0);
        modifyKafkaRequest.setProjectID(createProjectResponse.getProjectId());
        modifyKafkaRequest.setTopicID(createTopicResponse.getTopicId());
        
        // 设置Kafka源信息
        KafkaSourceInfo kafkaSourceInfo = new KafkaSourceInfo();
        kafkaSourceInfo.setHost("kafka-test-host:9092");
        kafkaSourceInfo.setTopic("test-topic");
        kafkaSourceInfo.setGroup("test-group");
        kafkaSourceInfo.setProtocol("plaintext");
        
        ImportSourceInfo kafkaImportSourceInfo = new ImportSourceInfo();
        kafkaImportSourceInfo.setKafkaSourceInfo(kafkaSourceInfo);
        modifyKafkaRequest.setImportSourceInfo(kafkaImportSourceInfo);
        
        // 设置目标信息
        TargetInfo kafkaTargetInfo = new TargetInfo();
        kafkaTargetInfo.setRegion(region);
        kafkaTargetInfo.setLogType("json_log");
        modifyKafkaRequest.setTargetInfo(kafkaTargetInfo);
        
        ModifyImportTaskResponse modifyKafkaResponse = client.modifyImportTask(modifyKafkaRequest);
        assertNotNull(modifyKafkaResponse.getRequestId());
        System.out.println("modify Kafka import task success, requestId: " + modifyKafkaResponse.getRequestId());
        
        // 测试参数验证异常
        Exception exception = assertThrows(LogException.class, () -> {
            ModifyImportTaskRequest invalidRequest = new ModifyImportTaskRequest();
            client.modifyImportTask(invalidRequest);
        });
        String expectedMessage = "Invalid request, Please check it";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
        
        // 清理资源
        try {
            DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(createTopicResponse.getTopicId());
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(deleteTopicRequest);
            System.out.println("delete topic success, requestId: " + deleteTopicResponse.getRequestId());
            
            DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
            deleteProjectRequest.setProjectId(createProjectResponse.getProjectId());
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(deleteProjectRequest);
            System.out.println("delete project success, requestId: " + deleteProjectResponse.getRequestId());
        } catch (Exception e) {
            System.out.println("cleanup failed: " + e.getMessage());
        }
    }
}