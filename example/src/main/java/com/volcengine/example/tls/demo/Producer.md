# LOG Java Producer

Producer 专用的异步发送log的类库，具有异步发送、高性能、失败重试、优雅关闭等特性

## 使用步骤

### producer的启动和关闭

```java
// 获取producer默认配置 具体配置见ProducerConfig
ProducerConfig producerConfig = new ProducerConfig("YourEndPoint","YourAccessKey","YourAccessSecret","YourToken","YourRegion");
Producer producer=new ProducerImpl(producerConfig);

//启动
producer.start()
//安全关闭，等待producer中缓存的所有的数据全部发送完成以后在关闭producer
producer.close()
//强制关闭
producer.closeNow()
```

### 发送日志

参考example/tls/demo/ProducerDemo

## producer配置

### ProducerConfig

| 参数                    | 类型            | 示例值               | 描述                                                                                                                                                                                                                  |
|:----------------------|:--------------|:------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| totalSizeInBytes      | int           | 100 * 1024 * 1024 | 单个 producer 实例能缓存的日志大小上限，单位为b，默认为 100MB。                                                                                                                                                                            |
| maxThreadCount        | int           | 50                | 单个producer能并发的最多线程的数量，默认为50，该参数用户可以根据自己实际服务器的性能去配置。                                                                                                                                                                 |
| maxBlockMs           | long          | 60 * 1000 单位为毫秒   | 如果 producer 可用空间(totalSizeInBytes)不足，调用者在 send 方法上的最大阻塞时间，默认为 60 秒                                                                                                                                                  |
| maxBatchSizeBytes          | int         | 512 * 1024        | 当一个 BatchLog 中缓存的日志大小大于等于 maxBatchSizeBytes 时，该 batch 将被发送，默认为 512 KB，最大可设置成 5MB。                                                                                                                                   |
| maxBatchCount         | int           | 4096              | 当一个 BatchLog 中缓存的日志条数大于等于 maxBatchCount 时，该 batch 将被发送，如果未指定，默认为 4096，最大可设置成 40960                                                                                                                                  |
| lingerMs            | int | 2*1000单位为毫秒       | 一个 BatchLog 从创建到可发送的逗留时间，默认为 2 秒，最小可设置成 100 毫秒。                                                                                                                                                                     |
| retryCount               | int           | 2                 | 如果某个 BatchLog 首次发送失败，能够对其重试的次数，默认为 2 次。                                                                                                                                                                             |
| maxReservedAttempts   | int           | 3                 | 每个 BatchLog 每次被尝试发送都对应着一个 Attempt，此参数用来控制返回给用户的 attempt 个数，默认只保留最近的 3 次 attempt 信息。 该参数越大能让您追溯更多的信息，但同时也会消耗更多的内存。                                                                                                   |

