package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AIGCMetaData {
    @JSONField(name = "Label")
    private String label;

    @JSONField(name = "ContentProducer")
    private String contentProducer;

    @JSONField(name = "ProduceID")
    private String produceID;

    @JSONField(name = "ReservedCode1")
    private String reservedCode1;

    @JSONField(name = "ContentPropagator")
    private String contentPropagator;

    @JSONField(name = "PropagateID")
    private String propagateID;

    @JSONField(name = "ReservedCode2")
    private String reservedCode2;
}
