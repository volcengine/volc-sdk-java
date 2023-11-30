package com.volcengine.example.tls.demo;

import java.util.ArrayList;
import java.util.List;

import com.volcengine.model.tls.consumer.ConsumerConfig;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.pb.PutLogRequest;
import com.volcengine.service.tls.consumer.Consumer;
import com.volcengine.service.tls.consumer.ConsumerImpl;
import com.volcengine.service.tls.consumer.LogProcessor;


// 您需要定义一个实现LogProcessor接口的类
public class ConsumerDemo implements LogProcessor {
    public static void main(String[] args) throws LogException, InterruptedException {
        // 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免AccessKey硬编码引发数据安全风险。详细说明请参考 https://www.volcengine.com/docs/6470/1166455
        // 使用STS时，ak和sk均使用临时密钥，且设置VOLCENGINE_TOKEN；不使用STS时，VOLCENGINE_TOKEN部分传空
        ConsumerConfig config = new ConsumerConfig(System.getenv("VOLCENGINE_ENDPOINT"), System.getenv("VOLCENGINE_REGION"),
                System.getenv("VOLCENGINE_ACCESS_KEY_ID"), System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"), System.getenv("VOLCENGINE_TOKEN"));
        // 请配置您的日志项目ID
        config.setProjectID("your-project-id");
        // 请配置您待消费的日志主题ID列表
        config.setTopicIDList(new ArrayList<String>(){{
            add("your-topic-id");
        }});
        // 请配置您的消费组名称
        config.setConsumerGroupName("java-consumer-group");
        // 请配置消费者名称
        config.setConsumerName("java-consumer");

        // 实例化ConsumerImpl，调用consumer.start()开始持续消费
        Consumer consumer = new ConsumerImpl(config, new ConsumerDemo());
        consumer.start();

        // 可通过调用consumer.stop()来结束消费组消费
        Thread.sleep(10000);
        consumer.stop();
    }

    /**
     * 您需要根据业务需要，自行实现这里的process方法，用于处理每次消费得到的LogGroupList
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
