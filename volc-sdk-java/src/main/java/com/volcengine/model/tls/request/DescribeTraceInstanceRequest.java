package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TRACE_INSTANCE_ID;

@Data
@NoArgsConstructor
public class DescribeTraceInstanceRequest {
    @JSONField(name = TRACE_INSTANCE_ID)
    private String traceInstanceId;

    public DescribeTraceInstanceRequest(String traceInstanceId) {
        this.traceInstanceId = traceInstanceId;
    }

    public boolean CheckValidation() {
        return this.traceInstanceId != null && !this.traceInstanceId.isEmpty();
    }
}