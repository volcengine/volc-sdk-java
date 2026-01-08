package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Span {
    @JSONField(name = "Kind")
    private String kind;

    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Links")
    private List<SpanLink> links;

    @JSONField(name = "Events")
    private List<SpanEvent> events;

    @JSONField(name = "SpanId")
    private String spanId;

    @JSONField(name = "Status")
    private Status status;

    @JSONField(name = "EndTime")
    private Long endTime;

    @JSONField(name = "TraceId")
    private String traceId;

    @JSONField(name = "Resource")
    private Resource resource;

    @JSONField(name = "StartTime")
    private Long startTime;

    @JSONField(name = "Attributes")
    private List<KeyValue> attributes;

    @JSONField(name = "TraceState")
    private String traceState;

    @JSONField(name = "ParentSpanId")
    private String parentSpanId;

    @JSONField(name = "InstrumentationLibrary")
    private InstrumentationLibrary instrumentationLibrary;
}