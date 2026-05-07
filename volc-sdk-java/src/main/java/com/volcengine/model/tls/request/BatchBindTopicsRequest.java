package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class BatchBindTopicsRequest {
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;
    @JSONField(name = TOPIC_IDS)
    List<String> topicIds;

    public boolean CheckValidation() {
        return processorId != null && !processorId.isEmpty()
                && topicIds != null && !topicIds.isEmpty();
    }
}

