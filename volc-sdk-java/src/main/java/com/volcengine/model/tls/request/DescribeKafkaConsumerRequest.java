package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeKafkaConsumerRequest {
    @JSONField(serialize = false)
    String topicId;
}
