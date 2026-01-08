package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
@NoArgsConstructor
public class DeleteTopicRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public DeleteTopicRequest(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    public boolean CheckValidation() {
        if (this.topicId == null || this.topicId.isEmpty()) {
            return false;
        }
        return true;
    }
}
