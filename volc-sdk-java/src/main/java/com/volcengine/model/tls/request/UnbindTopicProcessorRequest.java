package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TOPIC_ID;

@Data
@NoArgsConstructor
public class UnbindTopicProcessorRequest {
    @JSONField(name = TOPIC_ID)
    String topicId;

    public boolean CheckValidation() {
        return topicId != null && !topicId.isEmpty();
    }
}

