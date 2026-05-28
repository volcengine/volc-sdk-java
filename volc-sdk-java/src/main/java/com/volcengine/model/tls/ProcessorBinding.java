package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ProcessorBinding {
    @JSONField(name = TOPIC_ID)
    String topicId;
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;
}
