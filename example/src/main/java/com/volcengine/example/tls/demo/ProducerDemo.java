package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.*;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import com.volcengine.service.tls.Producer;
import com.volcengine.service.tls.ProducerImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ProducerDemo extends BaseDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-zsq";
        String separator = "-";
        Date date = new Date();
        long currentTimeMillis = date.getTime();
        String formatDate = sdf.format(date);
        try {
            //create project
            String projectName = prefix + separator + formatDate + separator + currentTimeMillis;
            String region = clientConfig.getRegion();
            String description = "test project";
            CreateProjectRequest project = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(project);
            System.out.println("create project success,response:" + createProjectResponse);
            String projectId = createProjectResponse.getProjectId();
            //create topic
            String topicName = prefix + separator + formatDate + separator + currentTimeMillis;
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectId);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success,response:" + createTopicResponse);

            //create index
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(createTopicResponse.getTopicId(),
                    new FullTextInfo(false, ",-;", false), null);
            CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
            System.out.println("create index success,response:" + createIndexResponse);

            // producer put logs
            PutLogRequest.LogContent logContent = PutLogRequest.LogContent.newBuilder().setKey("test-key-" +
                    currentTimeMillis).setValue("test-value").build();
            PutLogRequest.Log log = PutLogRequest.Log.newBuilder().setTime(currentTimeMillis).
                    addContents(logContent).build();
            String topicId = createTopicResponse.getTopicId();
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
            List<LogItem> logs = new ArrayList<>();
            currentTimeMillis = System.currentTimeMillis();
            LogItem item = new LogItem(currentTimeMillis);
            item.addContent("index", "" + 1);
            item.addContent("test-key", "test-value");
            logs.add(item);
            producer.sendLogsV2("",topicId,"test-source", "test-file", logs, callBack);
            // describe cursor
            DescribeCursorRequest describeCursorRequest =
                    new DescribeCursorRequest(topicId, 0, "1656604800");
            DescribeCursorResponse describeCursorResponse = client.describeCursor(describeCursorRequest);
            assertTrue(describeCursorResponse.getCursor().length() > 0);

            // wait 30s,index to be queried

            Thread.sleep(30000);
            ConsumeLogsRequest consumeLogsRequest = new ConsumeLogsRequest();
            consumeLogsRequest.setTopicId(topicId);
            consumeLogsRequest.setShardId(0);
            consumeLogsRequest.setCursor(describeCursorResponse.getCursor());
            ConsumeLogsResponse consumeLogsResponse = client.consumeLogs(consumeLogsRequest);
            System.out.println(String.format("consume logs success requestId:%s,cursor:%s,cursorCnt:%d.",
                    consumeLogsResponse.getRequestId(), consumeLogsResponse.getXTlsCursor(),
                    consumeLogsResponse.getXTlsCount()));
            // delete index topic project
            DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(topicId);
            DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
            System.out.println("delete index success,response:" + deleteIndexResponse);
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (LogException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}