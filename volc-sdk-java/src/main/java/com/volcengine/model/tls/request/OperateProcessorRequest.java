package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class OperateProcessorRequest {
    @JSONField(name = PROCESSOR_ID_HUMP)
    String processorId;
    @JSONField(name = OPERATE_ACTION)
    String operateAction;

    public boolean CheckValidation() {
        return processorId != null && !processorId.isEmpty()
                && operateAction != null && !operateAction.isEmpty();
    }
}

