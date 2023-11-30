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
        String prefix = "test-log";
        String separator = "-";
        Date date = new Date();
        long currentTimeMillis = date.getTime();
        String formatDate = sdf.format(date);

        try {
            // 创建日志项目
            String projectName = prefix + separator + formatDate + separator + currentTimeMillis;
            String region = clientConfig.getRegion();
            String description = "test project";
            CreateProjectRequest createProjectRequest = new CreateProjectRequest(projectName, region, description);
            CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
            System.out.println("create project success, response: " + createProjectResponse);

            String projectID = createProjectResponse.getProjectId();

            // 创建日志主题
            String topicName = prefix + separator + formatDate + separator + currentTimeMillis;
            CreateTopicRequest createTopicRequest = new CreateTopicRequest();
            createTopicRequest.setTopicName(topicName);
            createTopicRequest.setProjectId(projectID);
            createTopicRequest.setTtl(500);
            CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
            System.out.println("create topic success, response: " + createTopicResponse);

            String topicID = createTopicResponse.getTopicId();

            // 创建索引配置
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicID,
                    new FullTextInfo(false, ",-;", false), null);
            CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
            System.out.println("create index success, response: " + createIndexResponse);

            // （不推荐）本文档以PutLogs接口同步请求的方式上传日志为例
            // （推荐）在实际生产环境中，为了提高数据写入效率，建议通过Java Producer方式写入日志数据

            // 如果选择使用PutLogs上传日志的方式，建议您一次性聚合多条日志后调用一次PutLogs接口，以提升吞吐率并避免触发限流
            // 请根据您的需要，填写topicId、source、fileName和logs列表，建议您使用lz4压缩
            // PutLogs API的请求参数规范和限制请参阅https://www.volcengine.com/docs/6470/112191
            List<LogItem> logs = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                LogItem item = new LogItem(System.currentTimeMillis());
                item.addContent("index", String.valueOf(i));
                item.addContent("test-key", "test-value");
                logs.add(item);
            }
            PutLogsRequestV2 request = new PutLogsRequestV2(logs, topicID, null, LZ4, "log-path", "127.0.0.1");
            PutLogsResponse putLogsResponse = client.putLogsV2(request);
            Thread.sleep(30000);

            // 查询Shard
            // 请根据您的需要，填写topicId等参数
            // DescribeShards API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112197
            DescribeShardsRequest describeShardsRequest = new DescribeShardsRequest(topicID, 1, 20);
            DescribeShardsResponse describeShardsResponse = client.describeShards(describeShardsRequest);
            System.out.println("describe shards success, response: " + describeShardsResponse);

            // 获取消费游标
            // 请根据您的需要，填写topicId、shardId和from
            // DescribeCursor API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112193
            DescribeCursorRequest describeCursorRequest = new DescribeCursorRequest(topicID, 0, "begin");
            DescribeCursorResponse describeCursorResponse = client.describeCursor(describeCursorRequest);
            System.out.println("describe cursor success, response: " + describeCursorResponse);

            // 消费日志
            // 请根据您的需要，填写topicId、shardId、cursor和logGroupCount等参数
            // ConsumeLogs API的请求参数规范请参阅 https://www.volcengine.com/docs/6470/112194
            ConsumeLogsRequest consumeLogsRequest = new ConsumeLogsRequest();
            consumeLogsRequest.setTopicId(topicID);
            consumeLogsRequest.setShardId(0);
            consumeLogsRequest.setCursor(describeCursorResponse.getCursor());
            consumeLogsRequest.setCompression(Const.LZ4);
            ConsumeLogsResponse consumeLogsResponse = client.consumeLogs(consumeLogsRequest);

            // 查询分析日志数据
            // 请根据您的需要，填写topicId、query、startTime、endTime、limit等参数值
            // SearchLogs API的请求参数规范和限制请参阅 https://www.volcengine.com/docs/6470/112195
            SearchLogsRequest searchLogsRequest = new SearchLogsRequest();
            searchLogsRequest.setTopicId(topicID);
            searchLogsRequest.setQuery("*");
            searchLogsRequest.setStartTime(1656604800000L);
            searchLogsRequest.setEndTime(System.currentTimeMillis());
            SearchLogsResponseV2 searchLogsResponse = client.searchLogsV2(searchLogsRequest);
            System.out.println("search log success, response: " + searchLogsResponse);

            // 删除日志主题
            DeleteTopicResponse deleteTopicResponse = client.deleteTopic(new DeleteTopicRequest(topicID));
            System.out.println("delete topic success, response: " + deleteTopicResponse);

            // 删除日志项目
            DeleteProjectResponse deleteProjectResponse = client.deleteProject(new DeleteProjectRequest(projectID));
            System.out.println("delete project success, response: " + deleteProjectResponse);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (LogException ex) {
            ex.printStackTrace();
        }
    }
}
