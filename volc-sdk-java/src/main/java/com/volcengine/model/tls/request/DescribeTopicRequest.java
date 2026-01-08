package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
@NoArgsConstructor
public class DescribeTopicRequest {
    @JSONField(name = TOPIC_ID)
    private String topicId;

    /**
     * @param topicId 日志所在的日志主题 ID
     */
    public DescribeTopicRequest(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 日志所在的日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志所在的日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null || this.topicId.isEmpty()) {
            return false;
        }
        return true;
    }
}
