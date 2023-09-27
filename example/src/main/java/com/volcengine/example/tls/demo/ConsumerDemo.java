package com.volcengine.example.tls.demo;

import java.util.ArrayList;
import java.util.List;

import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.service.tls.consumer.Consumer;
import com.volcengine.service.tls.consumer.ConsumerImpl;
import com.volcengine.service.tls.consumer.LogProcessor;


// 实现LogProcessor接口
public class ConsumerDemo implements LogProcessor {
    public static void main(String[] args) throws LogException, InterruptedException {
        // 根据需要修改下面的必须配置项
        ConsumerConfig config = new ConsumerConfig(System.getenv("endPoint"), System.getenv("region"),
                System.getenv("ak"), System.getenv("sk"));
        config.setProjectID("ProjectID");
        config.setConsumerGroupName("java-consumer-group");
        config.setConsumerName("java-consumer");
        config.setTopicIDList(new ArrayList<String>(){{
            add("TopicID");
        }});

        // 实例化ConsumerImpl，调用consumer.start()开始持续消费
        Consumer consumer = new ConsumerImpl(config, new ConsumerDemo());
        consumer.start();

        // 可通过调用consumer.stop()来结束消费组消费
        Thread.sleep(10000);
        consumer.stop();
    }

    /**
     * 用户需要自行实现这里的process方法
     * 下面给出了逐个打印消费到的日志的代码示例
     */
    @Override
    public void process(String topicID, int shardID, PutLogRequest.LogGroupList logGroupList) {
        System.out.println(topicID + " --- " + shardID);
        System.out.println(logGroupList.getLogGroupsCount());

        int count = 0;

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
