package com.volcengine.service.tls.impl;

import com.alibaba.fastjson.JSONObject;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.CreateConsumerGroupRequest;
import com.volcengine.model.tls.request.CreateProjectRequest;
import com.volcengine.model.tls.request.CreateTopicRequest;
import com.volcengine.model.tls.request.DeleteConsumerGroupRequest;
import com.volcengine.model.tls.request.DeleteProjectRequest;
import com.volcengine.model.tls.request.DeleteTopicRequest;
import com.volcengine.model.tls.request.DescribeCheckpointRequest;
import com.volcengine.model.tls.request.DescribeShardsRequest;
import com.volcengine.model.tls.response.CreateConsumerGroupResponse;
import com.volcengine.model.tls.response.CreateProjectResponse;
import com.volcengine.model.tls.response.CreateTopicResponse;
import com.volcengine.model.tls.response.DeleteConsumerGroupResponse;
import com.volcengine.model.tls.response.DeleteProjectResponse;
import com.volcengine.model.tls.response.DeleteTopicResponse;
import com.volcengine.model.tls.response.DescribeCheckpointResponse;
import com.volcengine.model.tls.response.DescribeShardsResponse;
import com.volcengine.model.tls.Shard;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class DescribeCheckpointTest extends BaseTest {

    private static String projectId;
    private static String topicId;
    private static Integer shardId;
    private static String consumerGroupName;

    @BeforeClass
    public static void setup() throws LogException {
        String projectName = "tls-java-sdk-test-describe-checkpoint-project-" + System.currentTimeMillis();
        CreateProjectRequest createProjectRequest = new CreateProjectRequest();
        createProjectRequest.setProjectName(projectName);
        createProjectRequest.setRegion(region);
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        assertNotNull(createProjectResponse.getProjectId());
        projectId = createProjectResponse.getProjectId();

        String topicName = "tls-java-sdk-test-describe-checkpoint-topic-" + System.currentTimeMillis();
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(projectId);
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setTtl(1);
        createTopicRequest.setShardCount(1);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        assertNotNull(createTopicResponse.getTopicId());
        topicId = createTopicResponse.getTopicId();

        consumerGroupName = "tls-java-sdk-test-consumer-group-" + System.currentTimeMillis();
        CreateConsumerGroupRequest createConsumerGroupRequest = new CreateConsumerGroupRequest();
        createConsumerGroupRequest.setProjectID(projectId);
        createConsumerGroupRequest.setConsumerGroupName(consumerGroupName);
        createConsumerGroupRequest.setTopicIDList(Collections.singletonList(topicId));
        createConsumerGroupRequest.setHeartbeatTTL(60);
        createConsumerGroupRequest.setOrderedConsume(true);
        CreateConsumerGroupResponse createConsumerGroupResponse = client.createConsumerGroup(createConsumerGroupRequest);
        assertNotNull(createConsumerGroupResponse.getRequestId());

        DescribeShardsRequest describeShardsRequest = new DescribeShardsRequest();
        describeShardsRequest.setTopicId(topicId);
        describeShardsRequest.setPageNumber(1);
        describeShardsRequest.setPageSize(20);
        DescribeShardsResponse describeShardsResponse = client.describeShards(describeShardsRequest);
        assertNotNull(describeShardsResponse.getShards());
        assertTrue(describeShardsResponse.getShards().size() > 0);
        Shard first = describeShardsResponse.getShards().get(0);
        shardId = first.getShardId();
    }

    @AfterClass
    public static void cleanup() throws LogException {
        if (projectId == null) {
            return;
        }

        if (consumerGroupName != null) {
            DeleteConsumerGroupRequest deleteConsumerGroupRequest = new DeleteConsumerGroupRequest();
            deleteConsumerGroupRequest.setProjectID(projectId);
            deleteConsumerGroupRequest.setConsumerGroupName(consumerGroupName);
            DeleteConsumerGroupResponse deleteConsumerGroupResponse = client.deleteConsumerGroup(deleteConsumerGroupRequest);
            assertNotNull(deleteConsumerGroupResponse.getRequestId());
        }

        if (topicId != null) {
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
            assertNotNull(deleteTopicResponse.getRequestId());
        }

        DeleteProjectRequest deleteProjectRequest = new DeleteProjectRequest();
        deleteProjectRequest.setProjectId(projectId);
        DeleteProjectResponse deleteProjectResponse = client.deleteProject(deleteProjectRequest);
        assertNotNull(deleteProjectResponse.getRequestId());
    }

    @Test
    public void testDescribeCheckPoint() throws Exception {
        DescribeCheckpointRequest request = new DescribeCheckpointRequest();
        request.setProjectID(projectId);
        request.setTopicID(topicId);
        request.setShardID(shardId);
        request.setConsumerGroupName(consumerGroupName);

        String requestBody = JSONObject.toJSONString(request);
        System.out.println("DescribeCheckPoint query request =" + request);
        System.out.println("DescribeCheckPoint requestBody: " + requestBody);

        try {
            DescribeCheckpointResponse response = client.describeCheckPoint(request);
            System.out.println("DescribeCheckPoint response =" + response);
            assertNotNull(response);
            assertNotNull(response.getRequestId());
        } catch (LogException e) {
            assertNotNull(e.getMessage());
            System.out.println("DescribeCheckPoint failed: " + e.getMessage());
        }
    }

    @Test
    public void testDescribeCheckPointWithInvalidRequest() {
        DescribeCheckpointRequest request = new DescribeCheckpointRequest();
        LogException exception = assertThrows(LogException.class, () -> client.describeCheckPoint(request));
        assertEquals("InvalidArgument", exception.getErrorCode());
        assertTrue(exception.getMessage().contains("Invalid request"));
    }
}
