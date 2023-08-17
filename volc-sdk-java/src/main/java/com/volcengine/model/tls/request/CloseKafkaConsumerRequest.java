package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
@NoArgsConstructor
public class CloseKafkaConsumerRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;


    /**
     * @param topicId 日志主题id
     */
    public CloseKafkaConsumerRequest(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return 日志主题id
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId 日志主题id
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
