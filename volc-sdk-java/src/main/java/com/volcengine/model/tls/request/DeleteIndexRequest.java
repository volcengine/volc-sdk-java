package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;

import static com.volcengine.model.tls.Const.TOPIC_ID;

public class DeleteIndexRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;

    public DeleteIndexRequest(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicId() {
        return topicId;
    }
}
