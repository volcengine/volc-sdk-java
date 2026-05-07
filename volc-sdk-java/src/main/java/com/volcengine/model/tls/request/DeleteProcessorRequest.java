package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.PROCESSOR_ID_HUMP;

@Data
@NoArgsConstructor
public class DeleteProcessorRequest {
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;

    public DeleteProcessorRequest(String processorId) {
        this.processorId = processorId;
    }

    public boolean CheckValidation() {
        return processorId != null && !processorId.isEmpty();
    }
}

