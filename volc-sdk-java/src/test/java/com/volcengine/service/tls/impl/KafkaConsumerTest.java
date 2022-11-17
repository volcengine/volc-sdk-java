package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class KafkaConsumerTest extends BaseTest {
    @Test
    public void testKafkaConsumer() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-topic";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            // create project
            String projectId;
            {
                String projectName = prefix + separator + date + separator + System.currentTimeMillis();
                String region = "cn-guilin-boe";
                String description = "test project";
                CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
                CreateProjectResponse createProjectResponse = client.createProject(project);
                System.out.println("create project success,response:" + createProjectResponse);
                projectId = createProjectResponse.getProjectId();
            }

            // create topic
            String topicId;
            {
                String topicName = prefix + separator + date + separator + System.currentTimeMillis();
                CreateTopicRequest createTopicRequest = new CreateTopicRequest();
                createTopicRequest.setTopicName(topicName);
                createTopicRequest.setProjectId(projectId);
                createTopicRequest.setTtl(500);
                CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
                System.out.println("create topic success,response:" + createTopicResponse);
                topicId = createTopicResponse.getTopicId();
            }

            // create index
            {
                CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicId,
                        new FullTextInfo(false, ",-;", false), null);
                CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
                assertTrue(createIndexResponse.getTopicId().length() > 0);
                System.out.println("create index success,response:" + createIndexResponse);
            }

            // Test kafka consumer sdk

            // OpenKafkaConsumer
            {
                OpenKafkaConsumerRequest request = new OpenKafkaConsumerRequest(); {
                    request.setTopicId(topicId);
                }
                OpenKafkaConsumerResponse response = client.openKafkaConsumer(request);
                System.out.println("Open kafka consumer success, response: " + response);

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setTopicId("notexist");
                    client.openKafkaConsumer(request);
                });
            }

            // DescribeKafkaConsumer
            {
                DescribeKafkaConsumerRequest request = new DescribeKafkaConsumerRequest(); {
                    request.setTopicId(topicId);
                }
                DescribeKafkaConsumerResponse response = client.describeKafkaConsumer(request);
                System.out.println("Describe kafka consumer success, response: " + response);

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setTopicId("notexist");
                    client.describeKafkaConsumer(request);
                });
            }

            // CloseKafkaConsumer
            {
                CloseKafkaConsumerRequest request = new CloseKafkaConsumerRequest(); {
                    request.setTopicId(topicId);
                }
                CloseKafkaConsumerResponse response = client.closeKafkaConsumer(request);
                System.out.println("Close kafka consumer success, response: " + response);

                // Invalid case
                Exception exception = assertThrows(LogException.class, () -> {
                    request.setTopicId("notexist");
                    client.closeKafkaConsumer(request);
                });
            }

            // delete index
            {
                DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(topicId);
                DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
                assertTrue(deleteIndexResponse.getRequestId().length() > 0);
                System.out.println("delete index success,response:" + deleteIndexResponse);
            }

            // delete topic and project
            {
                DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
                System.out.println("delete topic success,response:" + deleteTopicResponse);
                DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
                System.out.println("delete project success,response:" + deleteProjectResponse);
            }
        } catch (LogException e) {
            e.printStackTrace();
        }
    }

}
