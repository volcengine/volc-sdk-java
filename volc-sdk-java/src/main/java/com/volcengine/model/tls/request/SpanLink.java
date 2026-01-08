package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SpanLink {
    @JSONField(name = "SpanId")
    private String spanId;

    @JSONField(name = "TraceId")
    private String traceId;

    @JSONField(name = "Attributes")
    private List<KeyValue> attributes;

    @JSONField(name = "TraceState")
    private String traceState;
}