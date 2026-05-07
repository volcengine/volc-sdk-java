package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ModifyProcessorRequest {
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;
    @JSONField(name = PROCESSOR_NAME)
    String processorName;
    @JSONField(name = DESCRIPTION)
    String description;
    @JSONField(name = DSL_CONTENT)
    String dslContent;
    @JSONField(name = FAIL_STRATEGY)
    String failStrategy;
    @JSONField(name = TIMEOUT_MS)
    Integer timeoutMs;
    @JSONField(name = MAX_QPS)
    Integer maxQps;

    public boolean CheckValidation() {
        return processorId != null && !processorId.isEmpty();
    }
}

