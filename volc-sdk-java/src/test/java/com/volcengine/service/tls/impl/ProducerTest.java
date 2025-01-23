package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.LogContent;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import com.volcengine.service.tls.Producer;
import com.volcengine.service.tls.ProducerImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProducerTest extends BaseTest {

    private String projectId;
    private String topicId;
    private long currentTimeMillis;

    @Before
    public void setUp() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-producer";
        String separator = "-";
        Date date = new Date();
        currentTimeMillis = date.getTime();
        String formatDate = sdf.format(date);

        //create project
        String projectName = prefix + separator + formatDate + separator + currentTimeMillis;
        String region = clientConfig.getRegion();
        String description = "test project";
        CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
        CreateProjectResponse createProjectResponse = client.createProject(project);
        System.out.println("create project success,response:" + createProjectResponse);
        projectId = createProjectResponse.getProjectId();
        //create topic
        String topicName = prefix + separator + formatDate + separator + currentTimeMillis;
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setTopicName(topicName);
        createTopicRequest.setProjectId(projectId);
        createTopicRequest.setTtl(500);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        System.out.println("create topic success,response:" + createTopicResponse);
        topicId = createTopicResponse.getTopicId();

        //create index
        CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicId,
                new FullTextInfo(false, ",-;", false), null);
        CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
        System.out.println("create index success,response:" + createIndexResponse);
    }

    @After
    public void tearDown() throws Exception {
        // delete index topic project
        DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(topicId);
        DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
        System.out.println("delete index success,response:" + deleteIndexResponse);
        DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
        System.out.println("delete topic success,response:" + deleteTopicResponse);
        DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
        System.out.println("delete project success,response:" + deleteProjectResponse);
    }

    @Test
    public void testProducer() {
        try {
            // producer put logs
            PutLogRequest.LogContent logContent = PutLogRequest.LogContent.newBuilder().setKey("test-key-" +
                    currentTimeMillis).setValue("test-value").build();
            PutLogRequest.Log log = PutLogRequest.Log.newBuilder().setTime(currentTimeMillis).
                    addContents(logContent).build();
            Producer producer = ProducerImpl.defaultProducer(
                    clientConfig.getEndpoint(), clientConfig.getRegion(), clientConfig.getAccessKeyId(), clientConfig.getAccessKeySecret(),
                    clientConfig.getSecurityToken());
            producer.start();
            // 如果不需要回调，callback参数传null即可
            CallBack callBack = new CallBack() {
                @Override
                public void onComplete(Result result) {
                    System.out.println("producer result:" + result);
                }
            };
            producer.sendLog("", topicId, "test-source", "test-file", log, callBack);
            // describe cursor
            DescribeCursorRequest describeCursorRequest =
                    new DescribeCursorRequest(topicId, 0, "1656604800");
            DescribeCursorResponse describeCursorResponse = client.describeCursor(describeCursorRequest);
            assertFalse(describeCursorResponse.getCursor().isEmpty());

            // wait 30s,index to be queried
            Thread.sleep(30000);
            ConsumeLogsRequest consumeLogsRequest = new ConsumeLogsRequest();
            consumeLogsRequest.setTopicId(topicId);
            consumeLogsRequest.setShardId(0);
            consumeLogsRequest.setCursor(describeCursorResponse.getCursor());
            ConsumeLogsResponse consumeLogsResponse = client.consumeLogs(consumeLogsRequest);
            assertTrue(consumeLogsResponse.getXTlsCount() > 0);
            System.out.println(String.format("consume logs success requestId:%s,cursor:%s,cursorCnt:%d.",
                    consumeLogsResponse.getRequestId(), consumeLogsResponse.getXTlsCursor(),
                    consumeLogsResponse.getXTlsCount()));
        } catch (LogException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProducerWithdrawalMechanism() throws Exception {
        Producer producer = ProducerImpl.defaultProducer(
                clientConfig.getEndpoint(), clientConfig.getRegion(), clientConfig.getAccessKeyId(), clientConfig.getAccessKeySecret(),
                clientConfig.getSecurityToken());
        producer.start();

        LogItem logItem = new LogItem();
        logItem.setTime(currentTimeMillis);
        logItem.setContents(Arrays.asList(
                new LogContent("k1", "v1"),
                new LogContent("k2", "v2")
        ));
        producer.sendLogV2("", topicId, "test-source", "test-filename", logItem, null);

        Thread.sleep(60000);
    }
}
