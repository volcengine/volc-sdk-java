package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
public class CreateTopicRequest {
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = PROJECT_ID)
    String projectId;
    @JSONField(name = TTL)
    Integer ttl;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = SHARD_COUNT)
    Integer shardCount;

}
