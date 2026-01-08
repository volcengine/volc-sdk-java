package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.tls.exception.LogException;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TRACE_INSTANCE_ID;

@Data
@NoArgsConstructor
public class SearchTracesRequest {
    @JSONField(name = "Query")
    private TraceQueryParameters query;
    
    @JSONField(name = TRACE_INSTANCE_ID)
    private String traceInstanceId;

    public boolean CheckValidation() {
        return this.traceInstanceId != null && this.query != null;
    }
}