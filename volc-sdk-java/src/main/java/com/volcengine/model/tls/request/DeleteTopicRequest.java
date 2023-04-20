package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;

import static com.volcengine.model.tls.Const.TOPIC_ID;

public class DeleteTopicRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;

    public DeleteTopicRequest(String topicId) {
        this.topicId = topicId;
    }

    public String getTopicId() {
        return topicId;
    }

    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
