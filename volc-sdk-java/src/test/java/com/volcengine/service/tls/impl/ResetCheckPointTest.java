package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Collections;

import static org.junit.Assert.*;

public class ResetCheckPointTest extends BaseTest {

    public static String projectId;
    public static String topicId;
    public static String consumerGroupName;

    @BeforeClass
    public static void setupBeforeClass() throws LogException {
        // Create project
        String projectName = "test-reset-checkpoint-project-" + System.currentTimeMillis();
        CreateProjectRequest projectRequest = new CreateProjectRequest();
        projectRequest.setProjectName(projectName);
        projectRequest.setRegion(region);
        projectRequest.setDescription("Test project for ResetCheckPoint");
        CreateProjectResponse projectResponse = client.createProject(projectRequest);
        assertNotNull(projectResponse.getProjectId());
        projectId = projectResponse.getProjectId();

        // Create topic
        String topicName = "test-reset-checkpoint-topic-" + System.currentTimeMillis();
        CreateTopicRequest topicRequest = new CreateTopicRequest();
        topicRequest.setTopicName(topicName);
        topicRequest.setProjectId(projectId);
        topicRequest.setTtl(1);
        topicRequest.setShardCount(1);
        CreateTopicResponse topicResponse = client.createTopic(topicRequest);
        assertNotNull(topicResponse.getTopicId());
        topicId = topicResponse.getTopicId();

        // Create consumer group
        consumerGroupName = "test-consumer-group-" + System.currentTimeMillis();
        CreateConsumerGroupRequest consumerGroupRequest = new CreateConsumerGroupRequest();
        consumerGroupRequest.setProjectID(projectId);
        consumerGroupRequest.setConsumerGroupName(consumerGroupName);
        consumerGroupRequest.setTopicIDList(Collections.singletonList(topicId));
        CreateConsumerGroupResponse consumerGroupResponse = client.createConsumerGroup(consumerGroupRequest);
        assertNotNull(consumerGroupResponse.getRequestId());
    }

    @Test
    public void testResetCheckPointToBegin() throws LogException {
        ResetCheckPointRequest request = new ResetCheckPointRequest();
        request.setProjectID(projectId);
        request.setConsumerGroupName(consumerGroupName);
        request.setPosition("begin");

        ResetCheckPointResponse response = client.resetCheckPoint(request);
        assertNotNull(response.getRequestId());
    }

    @Test
    public void testResetCheckPointToEnd() throws LogException {
        ResetCheckPointRequest request = new ResetCheckPointRequest();
        request.setProjectID(projectId);
        request.setConsumerGroupName(consumerGroupName);
        request.setPosition("end");

        ResetCheckPointResponse response = client.resetCheckPoint(request);
        assertNotNull(response.getRequestId());
    }

    @Test
    public void testResetCheckPointToTimestamp() throws LogException {
        ResetCheckPointRequest request = new ResetCheckPointRequest();
        request.setProjectID(projectId);
        request.setConsumerGroupName(consumerGroupName);
        request.setPosition(String.valueOf(System.currentTimeMillis() / 1000));

        ResetCheckPointResponse response = client.resetCheckPoint(request);
        assertNotNull(response.getRequestId());
    }

    @AfterClass
    public static void cleanupAfterClass() throws LogException {
        // Delete consumer group
        DeleteConsumerGroupRequest deleteConsumerGroupRequest = new DeleteConsumerGroupRequest();
        deleteConsumerGroupRequest.setProjectID(projectId);
        deleteConsumerGroupRequest.setConsumerGroupName(consumerGroupName);
        client.deleteConsumerGroup(deleteConsumerGroupRequest);

        // Delete topic
        DeleteTopicRequest deleteTopicRequest = new DeleteTopicRequest(topicId);
        client.deleteTopic(deleteTopicRequest);

        // Delete project
        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
        deleteProjectRequest.setProjectId(projectId);
        client.deleteProject(deleteProjectRequest);
    }
}