# LOG Java Producer

Producer具有异步发送、高性能、失败重试、优雅关闭等特性。日志服务推荐您使用Producer来上报日志。

## 使用步骤

### Producer的启动和关闭

```java
// 初始化客户端，推荐通过环境变量动态获取火山引擎密钥等身份认证信息，以免AccessKey硬编码引发数据安全风险。详细说明请参考 https://www.volcengine.com/docs/6470/1166455
// 使用STS时，ak和sk均使用临时密钥，且设置VOLCENGINE_TOKEN；不使用STS时，VOLCENGINE_TOKEN部分传空
ProducerConfig producerConfig = new ProducerConfig(System.getenv("VOLCENGINE_ENDPOINT"), System.getenv("VOLCENGINE_REGION"),
        System.getenv("VOLCENGINE_ACCESS_KEY_ID"), System.getenv("VOLCENGINE_ACCESS_KEY_SECRET"), null);
Producer producer = new ProducerImpl(producerConfig);

// 启动Producer
producer.start()
        
// 关闭Producer
producer.close()
```

### 发送日志

请参考example/tls/demo/ProducerDemo。

### Producer配置

| 参数                  | 类型   | 示例值               | 描述                                                                                                   |
|:--------------------|:-----|:------------------|:-----------------------------------------------------------------------------------------------------|
| totalSizeInBytes    | int  | 100 * 1024 * 1024 | 单个Producer实例能缓存的日志大小上限，单位为B，默认为100MB。                                                                |
| maxThreadCount      | int  | 50                | 单个Producer实例并发线程的最大数量，默认为50，您可根据实际情况配置。                                                              |
| maxBlockMs          | long | 60 * 1000         | 当Producer可用缓存空间（totalSizeInBytes）不足时，调用者在send方法上的最长阻塞时间，单位为毫秒，默认为60秒。                                |
| maxBatchSizeBytes   | int  | 512 * 1024        | 当一个BatchLog中缓存的日志大小大于等于maxBatchSizeBytes时，该batch将被发送，单位为B，默认为512KB，最大可设置为10MB。                       |
| maxBatchCount       | int  | 4096              | 当一个BatchLog中缓存的日志条数大于等于maxBatchCount时，该batch将被发送，默认为4096，最大可设置为40960。                                |
| lingerMs            | int  | 2 * 1000          | 一个BatchLog从创建到可发送的等待时间，单位为毫秒，默认为2秒，最小可设置成100毫秒。                                                      |
| retryCount          | int  | 2                 | 如果某个BatchLog首次发送失败，Producer对其自动重试的次数，默认为2次。                                                          |
| maxReservedAttempts | int  | 3                 | 每个BatchLog每次尝试发送都对应着一个Attempt，此参数用来控制返回给用户的Attempt个数，默认只保留最近3次Attempt信息。该参数越大，您可追溯的信息越多，但同时也会消耗更多内存。 |
