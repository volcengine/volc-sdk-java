package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class ExecProcessorRequest {
    @JSONField(name = EXEC_ACTION)
    String execAction;
    @JSONField(name = PROCESSOR_TYPE)
    String processorType;
    @JSONField(name = DSL_CONTENT)
    String dslContent;
    @JSONField(name = LOG_SAMPLE)
    Map<String, Object> logSample;
    @JSONField(name = PROCESSOR_DSL_TYPE)
    String processorDSLType;

    public boolean CheckValidation() {
        return execAction != null && !execAction.isEmpty()
                && processorType != null && !processorType.isEmpty()
                && dslContent != null && !dslContent.isEmpty()
                && logSample != null;
    }
}
