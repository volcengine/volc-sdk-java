package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TRACE_INSTANCE_ID;

@Data
@NoArgsConstructor
public class DeleteTraceInstanceRequest {
    @JSONField(name = TRACE_INSTANCE_ID)
    private String traceInstanceId;

    /**
     * @param traceInstanceId Trace实例ID
     */
    public DeleteTraceInstanceRequest(String traceInstanceId) {
        this.traceInstanceId = traceInstanceId;
    }

    /**
     * @return Trace实例ID
     */
    public String getTraceInstanceId() {
        return traceInstanceId;
    }

    /**
     * @param traceInstanceId Trace实例ID
     */
    public void setTraceInstanceId(String traceInstanceId) {
        this.traceInstanceId = traceInstanceId;
    }

    public boolean CheckValidation() {
        return this.traceInstanceId != null && !this.traceInstanceId.isEmpty();
    }
}