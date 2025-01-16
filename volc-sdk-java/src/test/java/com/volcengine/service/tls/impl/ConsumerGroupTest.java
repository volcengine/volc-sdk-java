package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;


public class ConsumerGroupTest extends BaseTest {

    public static String projectId;
    public static String projectName;
    public static String topicId;

    @BeforeClass
    public static void setupBeforeClass() throws LogException {

        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-topic";
        String separator = "-";
        String date = sdf.format(new Date());

        //create project
        projectName = prefix + separator + date + separator + System.currentTimeMillis();
        String description = "test project";
        CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
        CreateProjectResponse createProjectResponse = client.createProject(project);
        System.out.println("create project success,response:" + createProjectResponse);
        assertNotNull(createProjectResponse.getProjectId());
        projectId = createProjectResponse.getProjectId();

        //create topic
        String topicName = prefix + separator + date + separator + System.currentTimeMillis();
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setProjectId(projectId);
        createTopicRequest.setTtl(10);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        System.out.println("create topic success,response:" + createTopicResponse);
        assertNotNull(createTopicResponse.getTopicId());
        topicId = createTopicResponse.getTopicId();

    }

    @AfterClass
    public static void tearDownAfterClass() throws LogException {
        //delete topic
        DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
        System.out.println("delete topic success,response:" + deleteTopicResponse);
        assertNotNull(deleteTopicResponse.getRequestId());

        // delete project
        DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
        System.out.println("delete project success,response:" + deleteProjectResponse);
        assertNotNull(deleteProjectResponse.getRequestId());
    }

    @Test
    public void testDescribeConsumerGroups() throws LogException {
        String consumerGroup = "consumer-group-" + UUID.randomUUID();
        List<String> topicList = new ArrayList<>();
        topicList.add(topicId);

        // create group
        CreateConsumerGroupRequest createConsumerGroupRequest = new CreateConsumerGroupRequest();
        createConsumerGroupRequest.setProjectID(projectId);
        createConsumerGroupRequest.setConsumerGroupName(consumerGroup);
        createConsumerGroupRequest.setTopicIDList(topicList);
        createConsumerGroupRequest.setHeartbeatTTL(60);
        createConsumerGroupRequest.setOrderedConsume(true);
        CreateConsumerGroupResponse createConsumerGroupResponse = client.createConsumerGroup(createConsumerGroupRequest);
        System.out.println("create consumer group success,response:" + createConsumerGroupResponse);
        assertNotNull(createConsumerGroupResponse.getRequestId());

        // describe groups
        DescribeConsumerGroupsRequest describeConsumerGroupsRequest = new DescribeConsumerGroupsRequest();
        describeConsumerGroupsRequest.setProjectID(projectId);
        describeConsumerGroupsRequest.setProjectName(projectName);
        describeConsumerGroupsRequest.setTopicId(topicId);
        describeConsumerGroupsRequest.setConsumerGroupName(consumerGroup);

        DescribeConsumerGroupsResponse describeConsumerGroupsResponse = client.describeConsumerGroups(
                describeConsumerGroupsRequest);
        assertNotNull(describeConsumerGroupsResponse.getConsumerGroups());

        // delete group
        DeleteConsumerGroupRequest deleteConsumerGroupRequest = new DeleteConsumerGroupRequest();
        deleteConsumerGroupRequest.setProjectID(projectId);
        deleteConsumerGroupRequest.setConsumerGroupName(consumerGroup);
        DeleteConsumerGroupResponse deleteConsumerGroupResponse = client.deleteConsumerGroup(deleteConsumerGroupRequest);
        System.out.println("delete consumer group success,response:" + deleteConsumerGroupResponse);
        assertNotNull(deleteConsumerGroupResponse.getRequestId());
    }
}

