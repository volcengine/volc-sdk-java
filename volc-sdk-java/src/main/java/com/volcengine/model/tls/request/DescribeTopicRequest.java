package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
public class DescribeTopicRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;

    public DescribeTopicRequest(String topicId) {
        this.topicId = topicId;
    }

}
