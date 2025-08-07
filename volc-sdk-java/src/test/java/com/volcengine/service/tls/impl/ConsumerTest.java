package com.volcengine.service.tls.impl;

import com.volcengine.model.tls.Const;
import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import com.volcengine.service.tls.Producer;
import com.volcengine.service.tls.ProducerImpl;
import com.volcengine.service.tls.consumer.Consumer;
import com.volcengine.service.tls.consumer.ConsumerImpl;
import com.volcengine.service.tls.consumer.LogProcessor;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConsumerTest extends BaseTest {

    public static String projectId;
    public static String projectName;
    public static String topicId;
    public static long timestamp = System.currentTimeMillis() / 1000 - 1;

    public static int count = 17;

    @BeforeClass
    public static void setupBeforeClass() throws LogException, InterruptedException {
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

        // 写数据
        ProducerConfig producerConfig = new ProducerConfig(
            System.getenv("endPoint"),
            System.getenv("region"),
            System.getenv("ak"),
            System.getenv("sk")
        );
        // 实例化并启动Producer
        Producer producer = new ProducerImpl(producerConfig);
        producer.start();

        // 请根据您的需要，填写topicId、source、filename
        String source = "your-log-source";
        String filename = "your-log-filename";
        // 如果您不需要回调处理，Producer提供的sendLogV2和sendLogsV2接口的callback参数传入null即可
        CallBack callBack = result -> System.out.println("producer result:" + result);

        // 调用Producer的sendLogsV2接口，一次提交多条日志
        List<LogItem> items = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            LogItem item = new LogItem();
            item.setTime(System.currentTimeMillis());
            item.addContent("Key", "key-" + i);
            item.addContent("Value", "test-message-" + i);
            items.add(item);
        }
        producer.sendLogsV2("", topicId, source, filename, items, callBack);

        // 关闭Producer
        producer.close();
    }

    @AfterClass
    public static void tearDownAfterClass() throws LogException {
        // delete consumerGroup
        DeleteConsumerGroupRequest deleteConsumerGroupRequest = new DeleteConsumerGroupRequest();
        deleteConsumerGroupRequest.setProjectID(projectId);
        deleteConsumerGroupRequest.setConsumerGroupName("java-consumer-group");
        DeleteConsumerGroupResponse deleteConsumerGroupResponse = client.deleteConsumerGroup(deleteConsumerGroupRequest);
        System.out.println("delete consumerGroup success,response:" + deleteConsumerGroupResponse);
        assertNotNull(deleteConsumerGroupResponse.getRequestId());

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
    public void testConsumer() throws Exception {
        ConsumerConfig config = new ConsumerConfig(
                System.getenv("endPoint"),
                System.getenv("region"),
                System.getenv("ak"),
                System.getenv("sk")
        );
        // 请配置您的日志项目ID
        config.setProjectID(projectId);
        // 请配置您待消费的日志主题ID列表
        config.setTopicIDList(new ArrayList<String>(){{
            add(topicId);
        }});
        // 请配置您的消费组名称
        config.setConsumerGroupName("java-consumer-group");
        // 请配置消费者名称
        config.setConsumerName("java-consumer");

        // 实例化ConsumerImpl，调用consumer.start()开始持续消费
        ConsumerLogProcessor processor = new ConsumerLogProcessor();
        Consumer consumer = new ConsumerImpl(config, processor);
        consumer.start();

        // 可通过调用consumer.stop()来结束消费组消费
        Thread.sleep(60 * 1000);
        if (processor.count == count) {
            System.out.println("consumer success");
        }
        assertEquals(processor.count, count);
        consumer.stop();
        consumer.stop();
    }

    @Test
    public void testConsumerWithConsumerFromIsTimestamp() throws LogException, InterruptedException {
        ConsumerConfig config = new ConsumerConfig(
                System.getenv("endPoint"),
                System.getenv("region"),
                System.getenv("ak"),
                System.getenv("sk")
        );
        // 请配置您的日志项目ID
        config.setProjectID(projectId);
        // 请配置您待消费的日志主题ID列表
        config.setTopicIDList(new ArrayList<String>(){{
            add(topicId);
        }});
        // 请配置您的消费组名称
        config.setConsumerGroupName("java-consumer-group-with-timestamp");
        // 请配置消费者名称
        config.setConsumerName("java-consumer-with-timestamp1");
        config.setConsumeFrom(String.valueOf(timestamp + 1000));

        // 实例化ConsumerImpl，调用consumer.start()开始持续消费
        Consumer consumer = new ConsumerImpl(config, new ConsumerLogProcessor());
        consumer.start();

        // 可通过调用consumer.stop()来结束消费组消费
        Thread.sleep(60 * 1000);
        consumer.stop();
        consumer.stop();
    }
}

class ConsumerLogProcessor implements LogProcessor {

    public int count;

    @Override
    public void process(String topicID, int shardID, PutLogRequest.LogGroupList logGroupList) {
        System.out.println(topicID + " --- " + shardID);
        System.out.println(logGroupList.getLogGroupsCount());

        List<PutLogRequest.LogGroup> logGroups = logGroupList.getLogGroupsList();
        for (PutLogRequest.LogGroup logGroup: logGroups) {
            List<PutLogRequest.Log> logs = logGroup.getLogsList();
            for (PutLogRequest.Log log: logs) {
                count++;
                System.out.println("*** Count = " + count + " ***");
                List<PutLogRequest.LogContent> logContents = log.getContentsList();
                for (PutLogRequest.LogContent logContent: logContents) {
                    System.out.println(logContent.getKey() + ": " + logContent.getValue());
                }
                System.out.println();
            }
        }
    }
}