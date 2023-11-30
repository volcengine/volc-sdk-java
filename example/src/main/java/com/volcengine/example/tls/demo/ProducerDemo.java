package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.LogItem;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.producer.CallBack;
import com.volcengine.model.tls.producer.ProducerConfig;
import com.volcengine.model.tls.producer.Result;
import com.volcengine.service.tls.Producer;
import com.volcengine.service.tls.ProducerImpl;

import java.util.ArrayList;
import java.util.List;


public class ProducerDemo {
    public static void main(String[] args) throws LogException, InterruptedException {
        // 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免AccessKey硬编码引发数据安全风险。详细说明请参考 https://www.volcengine.com/docs/6470/1166455
        // 使用STS时，ak和sk均使用临时密钥，且设置VOLCENGINE_TOKEN；不使用STS时，VOLCENGINE_TOKEN部分传空
        ProducerConfig producerConfig = new ProducerConfig(System.getenv("VOLCENGINE_ENDPOINT"), System.getenv("VOLCENGINE_REGION"),
                System.getenv("VOLCENGINE_ACCESS_KEY_ID"), System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"), System.getenv("VOLCENGINE_TOKEN"));
        // 实例化并启动Producer
        Producer producer = new ProducerImpl(producerConfig);
        producer.start();

        // 请根据您的需要，填写topicId、source、filename
        String topicID = "your-topic-id";
        String source = "your-log-source";
        String filename = "your-log-filename";
        // 如果您不需要回调处理，Producer提供的sendLogV2和sendLogsV2接口的callback参数传入null即可
        CallBack callBack = new CallBack() {
            @Override
            public void onComplete(Result result) {
                System.out.println("producer result:" + result);
            }
        };

        LogItem item;

        // 调用Producer的sendLogV2接口，一次提交一条日志
        item = new LogItem();
        item.setTime(System.currentTimeMillis());
        item.addContent("key1", "value1");
        item.addContent("key2", "value2");
        producer.sendLogV2(null, topicID, source, filename, item, callBack);

        // 调用Producer的sendLogsV2接口，一次提交多条日志
        List<LogItem> items = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            item = new LogItem();
            item.setTime(System.currentTimeMillis());
            item.addContent("key1", "value1-" + i);
            item.addContent("key2", "value2-" + i);
            items.add(item);
        }
        producer.sendLogsV2(null, topicID, source, filename, items, callBack);

        // 关闭Producer
        producer.close();
    }
}
