# 日志服务Java SDK

火山引擎日志服务 Java SDK 封装了日志服务的常用接口，您可以通过日志服务 Java SDK 调用服务端 API，实现日志采集、日志检索等功能。

## 快速开始

### 初始化客户端

初始化 Client 实例之后，才可以向 TLS 服务发送请求。初始化时推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免 AccessKey 硬编码引发数据安全风险。

初始化代码如下：

```java
ClientConfig clientConfig = new ClientConfig(System.getenv("VOLCENGINE_ENDPOINT"), System.getenv("VOLCENGINE_REGION"),
        System.getenv("VOLCENGINE_ACCESS_KEY_ID"), System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"), System.getenv("VOLCENGINE_TOKEN"));
// 【强烈推荐】Producer/Consumer 等自定义连接池场景显式启用 HTTPS 证书与主机名校验；
// ClientBuilder.newClient 在 verifySsl=true 时也会显式使用 JDK 默认安全栈。
clientConfig.setVerifySsl(true);
TLSLogClient client = ClientBuilder.newClient(clientConfig);
```

> ⚠️ **HTTPS 安全提示**：`ClientConfig.verifySsl` 默认 `false` 是为了保留 Producer/Consumer 自定义连接池的旧 trust-all 兼容入口。
> 公网 / 生产环境使用 Producer/Consumer 时**必须**显式 `setVerifySsl(true)`，启用 JDK 默认安全栈进行证书与主机名校验。
> `ClientBuilder.newClient` 默认使用底层 HttpClient 的系统证书校验；显式 `setVerifySsl(true)` 会改用 TLS SDK 的安全连接池。

如需使用 API Key 匿名鉴权写入日志，请使用显式 API Key 初始化入口。当前匿名鉴权仅支持最终请求为 `/PutLogs` 的接口，例如 `putLogs`、`putLogsV2` 和 Producer 写入；其他接口仍需要完整 AK/SK。

```java
TLSLogClient client = ClientBuilder.newClientWithApiKey(
        System.getenv("VOLCENGINE_ENDPOINT"),
        System.getenv("VOLCENGINE_REGION"),
        System.getenv("VOLCENGINE_TLS_API_KEY"));
```

如果同时配置 API Key 与 AK/SK，`putLogs`/`putLogsV2` 会优先使用 API Key 匿名鉴权，其他接口继续使用 AK/SK 签名：

```java
TLSLogClient client = ClientBuilder.newClientWithApiKey(
        System.getenv("VOLCENGINE_ENDPOINT"),
        System.getenv("VOLCENGINE_REGION"),
        System.getenv("VOLCENGINE_TLS_API_KEY"),
        System.getenv("VOLCENGINE_ACCESS_KEY_ID"),
        System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"),
        System.getenv("VOLCENGINE_TOKEN"));
```

API Key 可在运行时更新：

```java
client.setApiKey(System.getenv("VOLCENGINE_TLS_API_KEY_NEW"));
```

请勿在日志或错误信息中打印 API Key 原文。

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
        // 【强烈推荐】生产环境显式开启 HTTPS 证书与主机名校验，防御中间人攻击。
        clientConfig.setVerifySsl(true);
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
        // 【强烈推荐】生产环境显式开启 HTTPS 证书与主机名校验，防御中间人攻击。
        producerConfig.getClientConfig().setVerifySsl(true);
        // 如需使用 API Key 匿名鉴权写入日志，可改为：
        // ProducerConfig producerConfig = new ProducerConfig(System.getenv("VOLCENGINE_ENDPOINT"),
        //         System.getenv("VOLCENGINE_REGION"), System.getenv("VOLCENGINE_TLS_API_KEY"));
        // 当前 API Key 匿名鉴权仅支持 Producer 最终发送的 /PutLogs 请求。
        // 实例化并启动Producer
        Producer producer = new ProducerImpl(producerConfig);
        producer.start();
        // 如需轮换 API Key，可在运行时更新：
        // producer.setApiKey(System.getenv("VOLCENGINE_TLS_API_KEY_NEW"));

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

| 参数                  | 类型   | 示例值               | 描述                                                                                                   |
|:--------------------|:-----|:------------------|:-----------------------------------------------------------------------------------------------------|
| totalSizeInBytes    | int  | 100 * 1024 * 1024 | 单个Producer实例能缓存的日志大小上限，单位为B，默认为100MB。                                                                |
| maxThreadCount      | int  | 50                | 单个Producer实例并发线程的最大数量，取值范围为1~50；不配置时默认取min(availableProcessors, 50)。                               |
| maxBlockMs          | long | 60 * 1000         | 当Producer可用缓存空间（totalSizeInBytes）不足时，调用者在send方法上的最长阻塞时间，单位为毫秒，默认为60秒。                                |
| maxBatchSizeBytes   | int  | 512 * 1024        | 当一个BatchLog中缓存的日志大小大于等于maxBatchSizeBytes时，该batch将被发送，单位为B，默认为512KB，最大可设置为10MB。                       |
| maxBatchCount       | int  | 4096              | 当一个BatchLog中缓存的日志条数大于等于maxBatchCount时，该batch将被发送，默认为4096，最大可设置为40960。                                |
| lingerMs            | int  | 2 * 1000          | 一个BatchLog从创建到可发送的等待时间，单位为毫秒，默认为2秒，最小可设置成100毫秒。                                                      |
| retryCount          | int  | 10                | 如果某个BatchLog首次发送失败，Producer对其自动重试的次数，默认为10次。                                                         |
| maxReservedAttempts | int  | 11                | 每个BatchLog每次尝试发送都对应着一个Attempt，此参数用来控制返回给用户的Attempt个数，默认只保留最近3次Attempt信息。该参数越大，您可追溯的信息越多，但同时也会消耗更多内存。 |

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
        // 【强烈推荐】生产环境显式开启 HTTPS 证书与主机名校验，防御中间人攻击。
        config.getClientConfig().setVerifySsl(true);
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

## 本地健康观测（getStats）

Producer 和 Consumer 提供按实例采集、按调用投影的不可变本地快照。采集由 `MetricsLevel` 控制，
展示由 `StatsOptions` 控制；请求 DEBUG 不会临时开启额外采集。`getStats(options)` 只聚合固定大小的
内部状态，不访问网络/磁盘，不调用用户回调，也不遍历业务 batch、shard、queue 或 executor。
固定大小不代表无锁：Producer 的内存与终态计数共享账本锁以保证守恒，Consumer 的实时快照在
短临界区复制事实后于锁外构建 DTO 和读取 histogram；持续切档时保留有界的锁内回退。
请按诊断需要定期读取，避免在每次日志回调中高频轮询；这不是无争用或线上吞吐性能承诺。

### 开启与读取

```java
ProducerConfig producerConfig = new ProducerConfig(endpoint, region, ak, sk, securityToken);
producerConfig.setMetricsLevel(MetricsLevel.CORE); // OFF / CORE / DETAILED
Producer producer = new ProducerImpl(producerConfig);
producer.start();

ProducerStatsSnapshot health = producer.getStats(StatsOptions.health());
ProducerStatsSnapshot operational = producer.getStats(StatsOptions.operational());
System.out.println(operational.toJson());

ConsumerConfig consumerConfig = new ConsumerConfig(endpoint, region, ak, sk, securityToken);
consumerConfig.setProjectID(projectId);
consumerConfig.setTopicIDList(topicIds);
consumerConfig.setConsumerGroupName(consumerGroup);
consumerConfig.setConsumerName(consumerName);
consumerConfig.setMetricsLevel(MetricsLevel.DETAILED);
Consumer consumer = new ConsumerImpl(consumerConfig, logProcessor);
consumer.start();
ConsumerStatsSnapshot debug = consumer.getStats(StatsOptions.debug());
```

配置中的 `null` MetricsLevel 归一为 `OFF`。运行中的实例可调用
`producer.setMetricsLevel(MetricsLevel.DETAILED)` 或 `consumer.setMetricsLevel(...)` 切换采集档位；
运行时 setter 拒绝 `null`，未运行或正在关闭时也拒绝切换。Consumer 完整停止后支持同一实例
`start → stop → start`；失败运行或仍有未退出 worker 时不允许重启。
CORE 与 DETAILED 互切保留 collection generation；跨 OFF 或 Consumer 重启会更换 generation，
不能跨代差分。OFF 不更新业务 counter/histogram，重新开启也不回填 OFF 期间的历史。

Consumer 主循环或 shard 任务发生不可恢复错误时会停止续发心跳，使服务端在租约到期后重新分配；
已进入的心跳请求可能完成。调用方仍需调用 `stop()` 完成 worker、checkpoint 和连接清理，
清理不完整或运行失败会显式报错，不会伪装成正常关闭。`process()` 抛出的普通异常仍按原语义重试，
`Error` 不再被当作可恢复的业务异常无限重试。正常停止引起的 worker 排空中断不算运行失败。

Producer 保持唯一重试 owner；`setRetryMode(LEGACY_DOUBLE_RETRY)` 显式拒绝，`null` 使用默认值。
`close()` 默认预算 30 秒，小于默认 `maxBlockMs=60s`；准入等待超时不代表资源已关闭。
调用方应重试 `close(timeoutMs)`，或在接受取消/丢日志语义时调用 `closeNow()`；不能在已有发送
仍需资源时提前关闭 callback handler 和 HTTP client。详见 [Producer 关闭说明](../../model/tls/producer/Producer.md)。

### 采集档位与展示视图

| 维度 | 取值 | 含义 |
|---|---|---|
| MetricsLevel | OFF | 只保留 header/lifecycle；不采集业务 counter 或 histogram |
| | CORE | Health 与 Operational 所需的低成本事实 |
| | DETAILED | CORE + worker/retry detail、固定 profile histogram、内存 breakdown |
| StatsView | HEALTH | evaluator 所需的最小事实 |
| | OPERATIONAL | HEALTH + 累计 counter、queue/worker/memory summary |
| | DEBUG | OPERATIONAL + 有界 detail/histogram |

section 只按包含关系增加：`HEALTH ⊂ OPERATIONAL ⊂ DEBUG`。若请求的 view 高于已采集档位，header
设置 `partial=true` 并列出固定枚举 `missing_sections`；不支持的字段缺失，而不是伪造为 0。
OFF 时 `metrics_disabled=true`，所有事实 section 均缺失。
累计 counter 和运行时 gauge 只从 `getOperational()` 读取；`getHealth()` 仅含健康信号。
诊断 section 直接使用快照的 `getWorkerDetails()`、`getRetryDetails()`、`getLatencyHistograms()`；
Producer 另有 `getManagedMemory()` 和 `getMemoryBreakdown()`，各 getter 返回 `Optional`。

### Header 与快照一致性

JSON 使用与 Go 对齐的唯一快照契约（协议标识 `schema_version=2`），不提供旧版兼容入口。
每份快照包含 SDK identity、随机 `instance_id`、
component、capture time、单调 `uptime_ms`、`snapshot_sequence`、`collection_generation`、
`collection_started_at_unix_ms`、lifecycle、`collected_level`、`requested_view`、capabilities、
partial/missing sections。OFF 的 collection start 为 0。
运行中为 `consistency=weak`；终态冻结一份与 view 无关的 canonical final facts，后续请求不同 view
只做纯投影，不再读取运行时容器。Producer 尚在排空，或 Consumer 失败后尚未完成显式 `stop()`
处理时仍为 weak。Consumer 的 `stop()` 若因 worker 未退出而失败，会冻结 `FAILED + FINAL` 并带上
`FINALIZATION_INCOMPLETE`；此时仍需重试清理。`FINAL` 只表示这份诊断事实不会再变化，不能脱离
lifecycle、critical flags 和关闭异常，将其等同于“全部资源已释放”。

累计 counter 保留已观测历史；跨 OFF 后不能用累计 accepted 减累计 terminal 推导当前 ownership，
因为旧代际的完成不会回填新的采集段。`rejected_*` 发生在 accepted 之前；retry 不重复增加 accepted。
managed memory 的 `used_bytes` 来自实际预算账本，等于 payload ownership 与 runtime buffer 之和，
即使跨 OFF 也保持物理预算真实。payload admission pressure 为 used / payload admission limit，
因此 runtime buffer 已占用的预算也会压缩新的 payload admission 空间；runtime buffer 可使用预留 headroom。
Java 不提供独立 batch admission gate capability，对应字段缺失，不使用 0 冒充。

### 健康判定与速率

Snapshot 只输出事实，不把 policy 写死为 `healthy/degraded/unhealthy`。调用方显式构造 policy：

```java
HealthPolicy policy = HealthPolicy.builder()
        .queuePressureDegraded(0.8)
        .memoryPressureDegraded(0.8).build();

HealthResult result = HealthEvaluator.evaluate(Optional.of(previous), current, policy);
```

`HealthEvaluator` 是纯函数；OFF、非运行态、首样本、身份/代际变化或缺少必需事实时返回 UNKNOWN。
稳定采集期间按 lifecycle failure、critical worker 缺失、queue/memory pressure 判断健康；
不再根据累计错误比例或推测的无进展时间判定。`evaluated_at_unix_ms` 等于 current capture time。

速率使用 `DeltaAdapter`，按 capture time 差分。每个 adapter 只保存一份不可变 baseline，
不创建线程或执行 I/O：

```java
DeltaAdapter adapter = new DeltaAdapter();
DeltaResult first = adapter.observe(CounterSamples.from(previous)); // 建立 baseline
DeltaResult delta = adapter.observe(CounterSamples.from(current));
```

首样本、metrics 不可用、instance/generation 变化、sequence 不递增、uptime 回退、capture time
不递增、counter 集合变化或计数回退时返回无效结果及 reset reason，并将当前样本作为新 baseline。
不同 component 应使用独立 adapter；无效结果不能当作零速率。

### DETAILED 诊断边界

所有 histogram 使用 `System.nanoTime()` 差值，单位 ms，固定 profile。
`fast_v1/slow_v1` 是跨语言协议中的桶配置标识，不代表 SDK 有多套观测实现：

- `fast_v1`：`1,2,5,10,20,50,100,200,500,1000,2000,5000,10000,+Inf`。
- `slow_v1`：`10,20,50,100,200,500,1000,2000,5000,10000,20000,50000,100000,200000,300000,+Inf`。

Producer 观测 queue delay、单次 transport call、batch delivery、每个 callback；Consumer 观测 fetch、
dispatch、handler、checkpoint。queue/send/fetch/dispatch 使用 fast，其余使用 slow。
延迟只记录同一 DETAILED 采集段内开始并结束的操作，不跨档位回填。
Debug 的 worker 列表按固定角色聚合，最多 64 项，不按 shard/thread 展开；
Producer retry detail 只含重试队列摘要和累计调度次数，Consumer retry detail 只含累计 backoff 次数。
不输出旧 retry/drop 原因分类，也不产生 topic、shard、group、endpoint、异常文本等高基数维度。

`instance_id` 为 SDK 随机标识。managed memory 只表示 SDK 自己管理的预算，不等于 JVM heap 或进程 RSS；
进程级 CPU/heap/RSS 仅属于 benchmark 报告，不进入 Snapshot 或 HealthEvaluator。
