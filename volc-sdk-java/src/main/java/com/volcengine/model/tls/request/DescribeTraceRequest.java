package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeTraceRequest {
    @JSONField(name = "TraceId")
    private String traceId;

    @JSONField(name = "TraceInstanceId")
    private String traceInstanceId;

    public boolean CheckValidation() {
        return this.traceId != null && !this.traceId.isEmpty() && this.traceInstanceId != null && !this.traceInstanceId.isEmpty();
    }
}