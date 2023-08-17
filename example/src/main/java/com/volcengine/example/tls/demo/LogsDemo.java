package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.volcengine.model.tls.Const.LZ4;

public class LogsDemo extends BaseDemo {
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
            String topicId = createTopicResponse.getTopicId();
            //create index
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(createTopicResponse.getTopicId(),
                    new FullTextInfo(false, ",-;", false), null);
            CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
            System.out.println("create index success,response:" + createIndexResponse);
            int limit = 100;
            for (int index = 0; index < limit; index++) {
                // put logs
                List<LogItem> logs = new ArrayList<>();
                currentTimeMillis = System.currentTimeMillis();
                LogItem item = new LogItem(currentTimeMillis);
                item.addContent("index", "" + index);
                item.addContent("test-key", "test-value");
                logs.add(item);
                PutLogsRequestV2 request = new PutLogsRequestV2(logs, topicId, null, LZ4, "test-path", "test-file");
                PutLogsResponse putLogsResponse = client.putLogsV2(request);
                System.out.println("put logs success,response:" + putLogsResponse);

            }
            // describe cursor
            DescribeCursorRequest describeCursorRequest =
                    new DescribeCursorRequest(topicId, 0, "1656604800");
            DescribeCursorResponse describeCursorResponse = client.describeCursor(describeCursorRequest);
            System.out.println("describe cursor success,response:" + describeCursorResponse);

            // describes shards
            DescribeShardsRequest describeShardsRequest =
                    new DescribeShardsRequest(topicId, 1, 20);
            DescribeShardsResponse describeShardsResponse = client.describeShards(describeShardsRequest);
            System.out.println("describe shards success,response:" + describeShardsResponse);
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
            consumeLogsRequest.setCompression(Const.LZ4);
            consumeLogsResponse = client.consumeLogs(consumeLogsRequest);
            System.out.println(String.format("consume logs success requestId:%s,cursor:%s,cursorCnt:%d.",
                    consumeLogsResponse.getRequestId(), consumeLogsResponse.getXTlsCursor(),
                    consumeLogsResponse.getXTlsCount()));
            // search logs
            SearchLogsRequest searchLogsRequest = new SearchLogsRequest();
            searchLogsRequest.setTopicId(topicId);
            searchLogsRequest.setQuery("test");
            //开始时间20220701
            searchLogsRequest.setStartTime(1656604800000L);
            searchLogsRequest.setEndTime(System.currentTimeMillis());
            SearchLogsResponseV2 searchLogsResponse = client.searchLogsV2(searchLogsRequest);
            System.out.println("search log success,response:" + searchLogsResponse);
            // delete index topic project
            DeleteIndexRequest deleteIndexRequest = new DeleteIndexRequest(topicId);
            DeleteIndexResponse deleteIndexResponse = client.deleteIndex(deleteIndexRequest);
            System.out.println("delete index success,response:" + deleteIndexResponse);
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicId));
            System.out.println("delete topic success,response:" + deleteTopicResponse);
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectId));
            System.out.println("delete project success,response:" + deleteProjectResponse);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (LogException ex) {
            ex.printStackTrace();
        }
    }

}