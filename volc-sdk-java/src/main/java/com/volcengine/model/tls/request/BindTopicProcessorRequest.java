package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class BindTopicProcessorRequest {
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;
    @JSONField(name = TOPIC_ID)
    String topicId;

    public boolean CheckValidation() {
        return processorId != null && !processorId.isEmpty()
                && topicId != null && !topicId.isEmpty();
    }
}

