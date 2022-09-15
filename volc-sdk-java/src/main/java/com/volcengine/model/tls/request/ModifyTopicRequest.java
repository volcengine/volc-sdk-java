package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
public class ModifyTopicRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = TOPIC_NAME)
    String topicName;
    @JSONField(name = TTL)
    Integer ttl;
    @JSONField(name = DESCRIPTION)
    String description;
}
