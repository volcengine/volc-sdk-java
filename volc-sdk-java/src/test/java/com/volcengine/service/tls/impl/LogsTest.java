package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.Test;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.volcengine.model.tls.Const.LZ4;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class LogsTest extends BaseTest {
    @Test
    public void testLog() {
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
        String prefix = "test-zsq";
        String separator = "-";
        Date date = new Date();
        long currentTimeMillis = date.getTime();
        String formatDate = sdf.format(date);
        try {
            //create project
            String projectName = prefix + separator + formatDate + separator + currentTimeMillis;
            String region = "your-region";
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
            String topicId = createTopicResponse.getTopicId();
            System.out.println("create topic success,response:" + createTopicResponse);

            // describeHistogram before creating index
            {
                Exception exception = assertThrows(LogException.class, () -> {
                    DescribeHistogramRequest request = new DescribeHistogramRequest();
                    {
                        request.setQuery("*");
                        request.setTopicId(topicId);
                        request.setStartTime(System.currentTimeMillis() - 1000 * 10);
                        request.setEndTime(System.currentTimeMillis());
                        request.setInterval(BigInteger.valueOf(1000));
                    }
                    client.describeHistogram(request);
                });
            }

            //create index
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(createTopicResponse.getTopicId(),
                    new FullTextInfo(false, ",-;", false), null);
            CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);
            System.out.println("create index success,response:" + createIndexResponse);

            // put logs
            PutLogRequest.LogContent logContent = PutLogRequest.LogContent.newBuilder().setKey("test-key-" +
                    currentTimeMillis).setValue("test-value").build();
            PutLogRequest.Log log = PutLogRequest.Log.newBuilder().setTime(currentTimeMillis).
                    addContents(logContent).build();
            PutLogRequest.LogGroup logGroup = PutLogRequest.LogGroup.newBuilder().
                    setSource("test-source-" + currentTimeMillis).setFileName("test5.txt").addLogs(log).build();
            PutLogRequest.LogGroupList logGroupList = PutLogRequest.LogGroupList.newBuilder().
                    addLogGroups(logGroup).build();
            PutLogsRequest putLogsRequest = new PutLogsRequest(logGroupList, topicId);
            putLogsRequest.setCompressType(LZ4);
//            putLogsRequest.setCompressType(null);
            PutLogsResponse putLogsResponse = client.putLogs(putLogsRequest);
            assertTrue(putLogsResponse.getRequestId().length() > 0);

            Exception exception = assertThrows(LogException.class, () -> {
                putLogsRequest.setTopicId("zsq_123");
                client.putLogs(putLogsRequest);
            });
            String expectedMessage = "Invalid argument key TopicId";
            String actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("put logs success,response:" + putLogsResponse);
            // describe cursor
            DescribeCursorRequest describeCursorRequest =
                    new DescribeCursorRequest(topicId, 0, "1656604800");
            DescribeCursorResponse describeCursorResponse = client.describeCursor(describeCursorRequest);
            assertTrue(describeCursorResponse.getCursor().length() > 0);

            exception = assertThrows(LogException.class, () -> {
                describeCursorRequest.setTopicId("124_356");
                client.describeCursor(describeCursorRequest);
            });
            expectedMessage = "Invalid argument key TopicId";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("describe cursor success,response:" + describeCursorResponse);

            // describes shards
            DescribeShardsRequest describeShardsRequest =
                    new DescribeShardsRequest(topicId, 1, 20);
            DescribeShardsResponse describeShardsResponse = client.describeShards(describeShardsRequest);
            assertTrue(describeShardsResponse.getTotal() > 0);

            exception = assertThrows(LogException.class, () -> {
                describeShardsRequest.setTopicId("124_356");
                client.describeShards(describeShardsRequest);
            });
            expectedMessage = "Invalid argument key TopicId";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));
            System.out.println("describe shards success,response:" + describeShardsResponse);

            // wait 30s,index to be queried

            Thread.sleep(30000);
            ConsumeLogsRequest consumeLogsRequest = new ConsumeLogsRequest();
            consumeLogsRequest.setTopicId(topicId);
            consumeLogsRequest.setShardId(0);
            consumeLogsRequest.setCursor(describeCursorResponse.getCursor());
            ConsumeLogsResponse consumeLogsResponse = client.consumeLogs(consumeLogsRequest);
            assertTrue(consumeLogsResponse.getXTlsCount() > 0);

            exception = assertThrows(LogException.class, () -> {
                consumeLogsRequest.setTopicId("124_356");
                client.consumeLogs(consumeLogsRequest);
            });
            expectedMessage = "Invalid argument key TopicId";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            System.out.println(String.format("consume logs success requestId:%s,cursor:%s,cursorCnt:%d.",
                    consumeLogsResponse.getRequestId(), consumeLogsResponse.getXTlsCursor(),
                    consumeLogsResponse.getXTlsCount()));
            consumeLogsRequest.setTopicId(createTopicResponse.getTopicId());
            consumeLogsRequest.setCompression(LZ4);
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
            SearchLogsResponse searchLogsResponse = client.searchLogs(searchLogsRequest);
            assertTrue(searchLogsResponse.getLogs().size() > 0);

            exception = assertThrows(LogException.class, () -> {
                searchLogsRequest.setTopicId("124_356");
                client.searchLogs(searchLogsRequest);
            });
            expectedMessage = "Invalid argument key TopicId";
            actualMessage = exception.getMessage();
            assertTrue(actualMessage.contains(expectedMessage));

            System.out.println("search log success,response:" + searchLogsResponse);

            // describeHistogram
            {
                DescribeHistogramRequest request = new DescribeHistogramRequest();
                {
                    request.setQuery("*");
                    request.setTopicId(topicId);
                    request.setStartTime(System.currentTimeMillis() - 1000 * 10);
                    request.setEndTime(System.currentTimeMillis());
                    request.setInterval(BigInteger.valueOf(1000));
                }
                DescribeHistogramResponse response = client.describeHistogram(request);
                System.out.println("describe histogram success, response: " + response);
            }

            // webtracks
            {
                WebTracksRequest request = new WebTracksRequest();
                {
                    request.setTopicId(topicId);
                    request.setSource("test-source");
                    request.setCompressType("lz4");
                    request.setProjectId(projectId);
                    List<Map<String, String>> testLogs = new ArrayList<>();
                    {
                        Map<String, String> testLog = new HashMap<>();
                        testLog.put("testKey", "testValue");
                        testLogs.add(testLog);
                    }
                    request.setLogs(testLogs);
                }
                WebTracksResponse response = client.webTracks(request);
                System.out.println("webTracks success, response: " + response);

                // invalid case
                exception = assertThrows(LogException.class, () -> {
                    request.setTopicId(null);
                    client.webTracks(request);
                });
            }

            // DescribeLogContext
            {
                exception = assertThrows(LogException.class, () -> {
                    DescribeLogContextRequest request = new DescribeLogContextRequest();
                    {
                        request.setTopicId(topicId);
                        request.setSource("test-source");
                        request.setPrevLogs(10);
                        request.setNextLogs(10);
                        request.setPackageOffset(0);
                        request.setContextFlow("test-flow");
                    }
                    DescribeLogContextResponse response = client.describeLogContext(request);
                });
            }

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
