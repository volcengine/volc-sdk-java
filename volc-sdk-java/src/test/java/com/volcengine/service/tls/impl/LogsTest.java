package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.FullTextInfo;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.LogContent;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.volcengine.model.tls.Const.LZ4;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class LogsTest extends BaseTest {

    public static String projectId;
    public static String projectName;
    public static String topicId;
    public static long currentTimeMillis;

    @BeforeClass
    public static void setupBeforeClass() throws LogException {
        String prefix = "test-java-sdk";
        String separator = "-";
        SimpleDateFormat sdf = new SimpleDateFormat(Const.DATE_FORMAT);
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
        createTopicRequest.setShardCount(1);
        createTopicRequest.setTtl(500);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        System.out.println("create topic success,response:" + createTopicResponse);
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
    public void testLog() {
        try {
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

            // describeHistogramV1 before creating index
             {
                 Exception exception = assertThrows(LogException.class, () -> {
                     DescribeHistogramV1Request request = new DescribeHistogramV1Request();
                     {
                         request.setQuery("*");
                         request.setTopicId("076793b3-c128-4a94-810b-1b935003439b");
                         request.setStartTime(System.currentTimeMillis() - 1000 * 10);
                         request.setEndTime(System.currentTimeMillis());
                         request.setInterval(1000L);
                     }
                     client.describeHistogramV1(request);
                 });
             }

            //create index
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicId,
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
            assertFalse(putLogsResponse.getRequestId().isEmpty());

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
            assertFalse(describeCursorResponse.getCursor().isEmpty());

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

            // wait 60s,index to be queried

            Thread.sleep(60000);
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

            System.out.printf("consume logs success requestId:%s,cursor:%s,cursorCnt:%d.%n",
                    consumeLogsResponse.getRequestId(), consumeLogsResponse.getXTlsCursor(),
                    consumeLogsResponse.getXTlsCount());
            consumeLogsRequest.setTopicId(topicId);
            consumeLogsRequest.setCompression(LZ4);
            consumeLogsResponse = client.consumeLogs(consumeLogsRequest);
            System.out.printf("consume logs success requestId:%s,cursor:%s,cursorCnt:%d.%n",
                    consumeLogsResponse.getRequestId(), consumeLogsResponse.getXTlsCursor(),
                    consumeLogsResponse.getXTlsCount());
            // search logs
            SearchLogsRequest searchLogsRequest = new SearchLogsRequest();
            searchLogsRequest.setTopicId(topicId);
            searchLogsRequest.setQuery("test");
            //开始时间20220701
            Thread.sleep(30000);
            searchLogsRequest.setStartTime(1656604800000L);
            searchLogsRequest.setEndTime(System.currentTimeMillis());
            SearchLogsResponse searchLogsResponse = client.searchLogs(searchLogsRequest);
            assertFalse(searchLogsResponse.getLogs().isEmpty());

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

            // describeHistogramV1
            {
                DescribeHistogramV1Request request = new DescribeHistogramV1Request();
                {
                    request.setQuery("*");
                    request.setTopicId(topicId);
                    request.setStartTime(System.currentTimeMillis() - 1000 * 10);
                    request.setEndTime(System.currentTimeMillis());
                    request.setInterval(1000L);
                }
                DescribeHistogramV1Response response = client.describeHistogramV1(request);
                System.out.println("describe histogram v1 success, response: " + response);
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

    @Test
    public void testPutLogsV2() throws LogException {
        int num = 100;
        long timeStart = System.currentTimeMillis() / 1000;
        List<LogItem> logs = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            LogItem log = new LogItem();
            log.setTime(timeStart + i);
            log.addContent(new LogContent("key"+i, "test-message"+i));
            logs.add(log);
        }

        LogItem lastLog = new LogItem();
        lastLog.setTime(0);
        lastLog.addContent(new LogContent("key"+num, "test-message"+num));
        logs.add(lastLog);

        PutLogsRequestV2 putLogsRequest = new PutLogsRequestV2();
        putLogsRequest.setTopicId(topicId);
        putLogsRequest.setSource("java-sdk-local");
        putLogsRequest.setPath("test.log");
        putLogsRequest.setLogs(logs);

        PutLogsResponse putLogsResponse = client.putLogsV2(putLogsRequest);
        assertNotNull(putLogsResponse.getRequestId());

        DescribeCursorRequest describeCursorRequest = new DescribeCursorRequest();
        describeCursorRequest.setTopicId(topicId);
        describeCursorRequest.setShardId(0);
        describeCursorRequest.setFrom("begin");
        DescribeCursorResponse describeCursorResponse = client.describeCursor(describeCursorRequest);
        assertNotNull(describeCursorResponse.getCursor());

        ConsumeLogsRequest consumeLogsRequest = new ConsumeLogsRequest();
        consumeLogsRequest.setTopicId(topicId);
        consumeLogsRequest.setShardId(0);
        consumeLogsRequest.setCursor(describeCursorResponse.getCursor());
        ConsumeLogsResponse consumeLogsResponse = client.consumeLogs(consumeLogsRequest);
        assertEquals(1, consumeLogsResponse.getXTlsCount());
        PutLogRequest.LogGroupList logGroupList = consumeLogsResponse.getLogGroupList();
        int count = 0;
        for (int i = 0; i < logGroupList.getLogGroupsCount(); i++) {
            PutLogRequest.LogGroup logGroup = logGroupList.getLogGroups(i);
            for (PutLogRequest.Log log : logGroup.getLogsList()) {
                if (log.getTime() < (long)1e10) {
                    assertTrue(timeStart <= log.getTime());
                    assertTrue(timeStart+num-1 >= log.getTime());
                } else {
                    assertTrue(timeStart * 1000 <= log.getTime());
                    assertTrue((timeStart+num-1) * 1000 > log.getTime());
                }

                count++;
            }
        }
        assertEquals(num+1, count);
    }
}
