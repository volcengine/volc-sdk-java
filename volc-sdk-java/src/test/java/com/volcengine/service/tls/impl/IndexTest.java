package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.KeyValueInfo;
import com.volcengine.model.tls.ValueInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class IndexTest extends BaseTest {
    @Test
    public void testIndex() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-topic";
        String separator = "-";
        String date = sdf.format(new Date());
        try {
            //create project
            String projectName = prefix + separator + date + separator + System.currentTimeMillis();
            String region = clientConfig.getRegion();
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
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success,response:" + createTopicResponse);

            //create index
            ArrayList<KeyValueInfo> keyValueInfos = new ArrayList<>();
            ValueInfo value = new ValueInfo();
            value.setValueType("text");
            value.setCaseSensitive(true);
            value.setIncludeChinese(false);
            value.setDelimiter("\\n\\t\\r\\");
            value.setSqlFlag(false);
            keyValueInfos.add(new KeyValueInfo("test-key", value));
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(createTopicResponse.getTopicId(),
                    new FullTextInfo(false, "!@#%^&*\"()-_=', <>/?|;:\\n\\n", false), keyValueInfos);
            CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
            assertTrue(createIndexResponse.getTopicId().length() > 0);
            System.out.println("create index success,response:" + createIndexResponse);

            LogException exception = assertThrows(LogException.class, () -> {
                client.createIndex(createIndexRequest);
            });
            String expectedMessage = "Index already exist";
            String actualMessage = exception.getErrorMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //describe index
            DescribeIndexRequest describeIndexRequest = new DescribeIndexRequest(createTopicResponse.getTopicId());
            DescribeIndexResponse describeIndexResponse = client.describeIndex(describeIndexRequest);
            Assert.assertEquals(describeIndexResponse.getFullTextInfo(), createIndexRequest.getFullTextInfo());
            Assert.assertEquals(describeIndexResponse.getKeyValue().get(0), createIndexRequest.getKeyValue().get(0));
            System.out.println("describe index success,response:" + describeIndexResponse);

            exception = assertThrows(LogException.class, () -> {
                describeIndexRequest.setTopicId("zsq-12304-57");
                client.describeIndex(describeIndexRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //modify index
            ModifyIndexRequest modifyIndexRequest = new ModifyIndexRequest(createTopicResponse.getTopicId(),
                    new FullTextInfo(false, ";", false), null);
            ModifyIndexResponse modifyIndexResponse = client.modifyIndex(modifyIndexRequest);
            describeIndexResponse = client.describeIndex(new DescribeIndexRequest(createTopicResponse.getTopicId()));
            Assert.assertEquals(describeIndexResponse.getFullTextInfo(), modifyIndexRequest.getFullTextInfo());
            System.out.println("modify index success,response:" + modifyIndexResponse);

            exception = assertThrows(LogException.class, () -> {
                modifyIndexRequest.setTopicId("1243_456");
                client.modifyIndex(modifyIndexRequest);
            });
            expectedMessage = "Invalid argument key";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            //delete index
            DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(createTopicResponse.getTopicId());
            DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
            assertTrue(deleteIndexResponse.getRequestId().length() > 0);
            System.out.println("delete index success,response:" + deleteIndexResponse);
            exception = assertThrows(LogException.class, () -> {
                client.deleteIndex(deleteIndexRequest);
            });
            expectedMessage = "Index does not exist.";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            //delete topic and project
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(
                    new DeleteTopicRequest(createTopicResponse.getTopicId()));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (LogException e) {
            e.printStackTrace();
        }
    }


}
