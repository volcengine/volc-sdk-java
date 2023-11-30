# 日志服务Java SDK

火山引擎日志服务 Java SDK 封装了日志服务的常用接口，您可以通过日志服务 Java SDK 调用服务端 API，实现日志采集、日志检索等功能。

## 快速开始

### 初始化客户端

初始化 Client 实例之后，才可以向 TLS 服务发送请求。初始化时推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免 AccessKey 硬编码引发数据安全风险。

初始化代码如下：

```java
ClientConfig clientConfig = new ClientConfig(System.getenv("VOLCENGINE_ENDPOINT"), System.getenv("VOLCENGINE_REGION"),
        System.getenv("VOLCENGINE_ACCESS_KEY_ID"), System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"), System.getenv("VOLCENGINE_TOKEN"));
TLSLogClient client = ClientBuilder.newClient(clientConfig);
```

### 示例代码

本文档以日志服务的基本日志采集和检索流程为例，介绍如何使用日志服务 Java SDK 管理日志服务基础资源。本示例中，创建一个 Demo.java 文件，并调用接口分别完成创建项目、创建主题、创建索引、写入日志数据、消费日志和查询日志数据。

代码示例如下：

```java
package com.volcengine.example.tls.demo;

import com.volcengine.model.tls.*;
import com.volcengine.model.tls.exception.LogException;
import com.volcengine.model.tls.request.*;
import com.volcengine.model.tls.response.*;
import com.volcengine.service.tls.TLSLogClient;

import java.util.ArrayList;
import java.util.List;

import static com.volcengine.model.tls.Const.LZ4;


public class Demo {
    public static void main(String[] args) throws LogException, InterruptedException {
        // 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免 AccessKey 硬编码引发数据安全风险。详细说明请参考https://www.volcengine.com/docs/6470/1166455
        // 使用 STS 时，ak 和 sk 均使用临时密钥，且设置 VOLCENGINE_TOKEN；不使用 STS 时，VOLCENGINE_TOKEN 部分传空
        ClientConfig clientConfig = new ClientConfig(System.getenv("VOLCENGINE_ENDPOINT"), System.getenv("VOLCENGINE_REGION"),
                System.getenv("VOLCENGINE_ACCESS_KEY_ID"), System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"), System.getenv("VOLCENGINE_TOKEN"));
        TLSLogClient client = ClientBuilder.newClient(clientConfig);

        // 创建日志项目
        // 请根据您的需要，填写ProjectName和可选的Description；请您填写和初始化client时一致的Region；
        // CreateProject API的请求参数规范请参阅https://www.volcengine.com/docs/6470/112174
        CreateProjectRequest createProjectRequest = new CreateProjectRequest("project-name", System.getenv("VOLCENGINE_REGION"), "description");
        CreateProjectResponse createProjectResponse = client.createProject(createProjectRequest);
        String projectID = createProjectResponse.getProjectId();

        // 创建日志主题
        // 请根据您的需要，填写ProjectId、TopicName、Ttl、Description、ShardCount等参数值
        // CreateTopic API的请求参数规范请参阅https://www.volcengine.com/docs/6470/112180
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        createTopicRequest.setProjectId(projectID);
        createTopicRequest.setTopicName("topic-name");
        createTopicRequest.setTtl(30);
        createTopicRequest.setDescription("description");
        createTopicRequest.setShardCount(2);
        CreateTopicResponse createTopicResponse = client.createTopic(createTopicRequest);
        String topicID = createTopicResponse.getTopicId();

        // 创建索引配置
        // 请根据您的需要，填写TopicId，开启FullText全文索引或KeyValue键值索引或同时开启二者
        // CreateIndex API的请求参数规范请参阅https://www.volcengine.com/docs/6470/112187
        FullTextInfo fullText = new FullTextInfo(false, ",-;", false);
        ValueInfo textValueInfo = new ValueInfo();
        textValueInfo.setValueType("text");
        textValueInfo.setDelimiter(",");
        textValueInfo.setCaseSensitive(false);
        textValueInfo.setIncludeChinese(false);
        textValueInfo.setSqlFlag(false);
        List<KeyValueInfo> keyValue = new ArrayList<>();
        keyValue.add(new KeyValueInfo("test-key", textValueInfo));
        CreateIndexRequest createIndexRequest = new CreateIndexRequest(topicID, fullText, keyValue);
        CreateIndexResponse createIndexResponse = client.createIndex(createIndexRequest);

        // （不推荐）本文档以 PutLogs 接口同步请求的方式上传日志为例
        // （推荐）在实际生产环境中，为了提高数据写入效率，建议通过 Java Producer 方式写入日志数据

        // 如果选择使用PutLogs上传日志的方式，建议您一次性聚合多条日志后调用一次PutLogs接口，以提升吞吐率并避免触发限流
        // 请根据您的需要，填写TopicId、Source、FileName和Logs列表，建议您使用lz4压缩
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

        // 查询分析日志数据
        // 请根据您的需要，填写TopicId、Query、StartTime、EndTime、Limit等参数值
        // SearchLogs API的请求参数规范和限制请参阅https://www.volcengine.com/docs/6470/112195
        SearchLogsRequest searchLogsRequest = new SearchLogsRequest();
        searchLogsRequest.setTopicId("TopicId");
        searchLogsRequest.setQuery("*");
        searchLogsRequest.setStartTime(1346457600);
        searchLogsRequest.setEndTime(1630454400);
        searchLogsRequest.setLimit(20);
        SearchLogsResponseV2 searchLogsResponse = client.searchLogsV2(searchLogsRequest);

        // 打印SearchLogs接口返回值中的部分基本信息
        // 请根据您的需要，自行处理返回值中的其他信息
        System.out.println(searchLogsResponse.getResultStatus());
        System.out.println(searchLogsResponse.getHitCount());
        System.out.println(searchLogsResponse.getCount());
        System.out.println(searchLogsResponse.isAnalysis());
    }
}
```


## 通过 Producer 上报日志数据

### 场景说明

Java SDK 支持通过以下方式写入日志：

|   写入方式   | 说明                                                                                                                           |
|:--------:|:-----------------------------------------------------------------------------------------------------------------------------|
| PutLogs  | 不推荐。<br/>日志服务支持通过 PutLogs 接口同步请求的方式上传日志。如果选择使用 PutLogs 上传日志，建议您一次性聚合多条日志后调用一次 PutLogs 接口。相对于逐条上传日志的方式，日志聚合后上传可以提升吞吐率并避免触发限流。 |
| Producer | 推荐。<br/>在实际生产环境中，为了提高数据写入效率，建议通过 Java Producer 方式写入日志数据。Producer 用于在海量数据、高并发场景下快速发送日志数据，具有异步发送、高性能、失败重试、优雅关闭等特性。             |

### 示例代码

```java
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


public class Demo {
    public static void main(String[] args) throws LogException, InterruptedException {
        // 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免 AccessKey 硬编码引发数据安全风险。详细说明请参考https://www.volcengine.com/docs/6470/1166455
        // 使用 STS 时，ak 和 sk 均使用临时密钥，且设置 VOLCENGINE_TOKEN；不使用 STS 时，VOLCENGINE_TOKEN 部分传空
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
        producer.sendLogV2("", topicID, source, filename, item, callBack);

        // 调用Producer的sendLogsV2接口，一次提交多条日志
        List<LogItem> items = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            item = new LogItem();
            item.setTime(System.currentTimeMillis());
            item.addContent("key1", "value1-" + i);
            item.addContent("key2", "value2-" + i);
            items.add(item);
        }
        producer.sendLogsV2("", topicID, source, filename, items, callBack);

        // 关闭Producer
        producer.close();
    }
}
```

### Producer配置

| 参数                  | 类型   | 示例值               | 描述                                                                                                                |
|:--------------------|:-----|:------------------|:------------------------------------------------------------------------------------------------------------------|
| totalSizeInBytes    | int  | 100 * 1024 * 1024 | 单个 producer 实例能缓存的日志大小上限，单位为b，默认为 100MB。                                                                          |
| maxThreadCount      | int  | 50                | 单个producer能并发的最多线程的数量，默认为50，该参数用户可以根据自己实际服务器的性能去配置。                                                               |
| maxBlockMs          | long | 60 * 1000 单位为毫秒   | 如果 producer 可用空间(totalSizeInBytes)不足，调用者在 send 方法上的最大阻塞时间，默认为 60 秒                                                |
| maxBatchSizeBytes   | int  | 512 * 1024        | 当一个 BatchLog 中缓存的日志大小大于等于 maxBatchSizeBytes 时，该 batch 将被发送，默认为 512 KB，最大可设置成 5MB。                                 |
| maxBatchCount       | int  | 4096              | 当一个 BatchLog 中缓存的日志条数大于等于 maxBatchCount 时，该 batch 将被发送，如果未指定，默认为 4096，最大可设置成 40960                                |
| lingerMs            | int  | 2*1000单位为毫秒       | 一个 BatchLog 从创建到可发送的逗留时间，默认为 2 秒，最小可设置成 100 毫秒。                                                                   |
| retryCount          | int  | 2                 | 如果某个 BatchLog 首次发送失败，能够对其重试的次数，默认为 2 次。                                                                           |
| maxReservedAttempts | int  | 3                 | 每个 BatchLog 每次被尝试发送都对应着一个 Attempt，此参数用来控制返回给用户的 attempt 个数，默认只保留最近的 3 次 attempt 信息。 该参数越大能让您追溯更多的信息，但同时也会消耗更多的内存。 |


## 通过 Consumer 消费日志数据

日志服务提供消费日志的OpenAPI接口ConsumeLogs，支持实时消费采集到服务端的日志数据。
在使用ConsumeLogs接口时，需要按照日志分区维度消费日志数据，消费时自行指定日志主题ID、Shard ID和起始结束游标（Cursor），所以消费日志的进度受限于单个Shard的读写能力，还需要自行维护消费进度，在Shard自动分裂的场景下消费逻辑与流程繁琐。

日志服务通过SDK提供了消费组（ConsumerGroup）功能，支持通过消费组消费日志数据，通过消费组消费时，日志服务会自动均衡各个消费者的消费能力与进度，自动分配Shard，您无需关注消费组的内部调度细节及消费者之间的负载均衡、故障转移等，只需要专注于业务逻辑。

日志服务提供了Consumer异步日志消费库，支持消费同一个日志项目下多个日志主题，具有异步消费、高性能、失败重试、优雅关闭等特性。

关于通过消费组消费数据的基本概念和限制说明等更多信息，请您参阅[通过消费组消费数据](https://www.volcengine.com/docs/6470/1152208)。

### 示例代码

以下代码以Java SDK为例，演示通过SDK创建消费组和消费者，并消费日志的整体流程。

```java
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
        // 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免 AccessKey 硬编码引发数据安全风险。详细说明请参考https://www.volcengine.com/docs/6470/1166455
        // 使用 STS 时，ak 和 sk 均使用临时密钥，且设置 VOLCENGINE_TOKEN；不使用 STS 时，VOLCENGINE_TOKEN 部分传空 
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
```

### Consumer配置

在上述示例代码中，ConsumerConfig类的构造函数返回了Java SDK消费组的默认配置config，并向您展示了如何配置您的endpoint、region、accessKeyID、accessKeySecret等基本信息、日志项目ID和日志主题ID列表、消费组名称和消费者名称。

除此之外，您还可通过ConsumerConfig的其他字段的setter方法进行额外的自定义配置。ConsumerConfig的可配置字段如下所示。

| 参数                              | 类型      | 示例值   | 描述                                                                                                                                                                      |
|:--------------------------------|:--------|:------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| maxFetchLogGroupCount           | int     | 100   | 消费者单次消费日志时，最大获取LogGroup数量，默认为100，最大为1000。                                                                                                                               |
| heartbeatIntervalInSecond       | int     | 20    | Consumer心跳上报时间间隔，单位为秒。                                                                                                                                                  |
| dataFetchIntervalInMillisecond  | int     | 200   | Consumer消费日志时间间隔，单位为毫秒。                                                                                                                                                 |
| flushCheckpointIntervalInSecond | int     | 5     | Consumer上传消费进度的时间间隔，单位为秒。                                                                                                                                               |
| consumeFrom                     | String  | begin | 开始消费时的默认消费位点，与DescribeCursor的From参数一致，仅在该消费者从未上传过消费位点时有效。                                                                                                               |
| orderedConsume                  | boolean | false | 是否开启顺序消费。开启顺序消费后，消费者会根据Shard分裂的父子关系进行消费。例如Shard0分裂为Shard1与Shard2，而Shard1又分裂为Shard3与Shard4。在开启顺序消费之后，会根据(Shard0) -> (Shard1, Shard2) -> (Shard2, Shard3, Shard4)的顺序进行消费。 |