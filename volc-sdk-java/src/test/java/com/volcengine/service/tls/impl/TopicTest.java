package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TopicTest extends BaseTest {
    @Test
    public void testTopic() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-topic";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            //create project
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = System.getenv("region");
            String description = "test project";
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            System.out.println("create project success,response:" + createProjectResponse);
            String projectId = createProjectResponse.getProjectId();

            //create topic
            String topicName = prefix + separator + date + separator + System.currentTimeMillis();
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setTtl(500);
            createTopicRequest.setEnableHotTtl(true);
            createTopicRequest.setHotTtl(100);
            createTopicRequest.setColdTtl(100);
            createTopicRequest.setArchiveTtl(300);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success,response:" + createTopicResponse);
            assertFalse(createTopicResponse.getTopicId().isEmpty());

            Exception exception = assertThrows(LogException.class, () -> {
                client.createTopic(createTopicRequest);
            });
            String expectedMessage = "Topic " + topicName + " already exist";
            String actualMessage = exception.getMessage();
            assertEquals(expectedMessage, actualMessage);


            //describe topic
            DescribeTopicRequest describeTopicRequest = new DescribeTopicRequest(createTopicResponse.getTopicId());
            DescribeTopicResponse describeTopicResponse = client.describeTopic(describeTopicRequest);
            System.out.println("describe topic success,response:" + describeTopicResponse);
            Assert.assertEquals(describeTopicResponse.getTopicInfo().getTopicName(), topicName);

            exception = assertThrows(LogException.class, () -> {
                describeTopicRequest.setTopicId("124_356");
                client.describeTopic(describeTopicRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //modify topic
            ModifyTopicRequest modifyTopicRequest = new ModifyTopicRequest();
            modifyTopicRequest.setTopicId(createTopicResponse.getTopicId());
            modifyTopicRequest.setTopicName(topicName + separator + System.currentTimeMillis());
            modifyTopicRequest.setEnableHotTtl(true);
            modifyTopicRequest.setTtl(500);
            modifyTopicRequest.setHotTtl(100);
            modifyTopicRequest.setColdTtl(200);
            modifyTopicRequest.setArchiveTtl(200);
            ModifyTopicResponse modifyTopicResponse = client.modifyTopic(modifyTopicRequest);
            System.out.println("modify topic success,response:" + modifyTopicResponse);
            describeTopicResponse = client.describeTopic(new DescribeTopicRequest(createTopicResponse.getTopicId()));
            Assert.assertEquals(modifyTopicRequest.getTopicName(), describeTopicResponse.getTopicInfo().getTopicName());

            exception = assertThrows(LogException.class, () -> {
                modifyTopicRequest.setTopicId("1243_456");
                client.modifyTopic(modifyTopicRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //describe topics
            DescribeTopicsRequest describeTopicsRequest = new DescribeTopicsRequest();
            describeTopicsRequest.setProjectName(projectName);
            describeTopicsRequest.setProjectId(createProjectResponse.getProjectId());
            DescribeTopicsResponse describeTopicsResponse = client.describeTopics(describeTopicsRequest);
            System.out.println("describe topics success,response:" + describeTopicsResponse);
            assertTrue(describeTopicsResponse.getTotal() > 0);

            exception = assertThrows(LogException.class, () -> {
                describeTopicsRequest.setTopicId("123_456");
                client.describeTopics(describeTopicsRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //delete topic
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(
                    new DeleteTopicRequest(createTopicResponse.getTopicId()));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            assertFalse(deleteTopicResponse.getRequestId().isEmpty());
            exception = assertThrows(LogException.class, () -> {
                client.deleteTopic(
                        new DeleteTopicRequest(createTopicResponse.getTopicId()));
            });

            expectedMessage = "Topic does not exist.";
            actualMessage = exception.getMessage();
            assertEquals(expectedMessage, actualMessage);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (
                LogException e) {
            e.printStackTrace();
        }
    }

}
