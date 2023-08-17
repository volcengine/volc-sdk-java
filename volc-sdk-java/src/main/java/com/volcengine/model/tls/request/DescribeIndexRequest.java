package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeIndexRequest {
    private String topicId;

    /**
     * @param topicId 日志主题 ID
     */
    public DescribeIndexRequest(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 日志主题 ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题 ID
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.topicId == null) {
            return false;
        }
        return true;
    }
}
