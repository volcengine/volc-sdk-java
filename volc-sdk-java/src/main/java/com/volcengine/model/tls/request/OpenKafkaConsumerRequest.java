package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class OpenKafkaConsumerRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;
}
