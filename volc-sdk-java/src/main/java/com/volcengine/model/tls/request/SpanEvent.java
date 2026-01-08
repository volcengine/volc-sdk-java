package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SpanEvent {
    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "Timestamp")
    private Long timestamp;

    @JSONField(name = "Attributes")
    private List<KeyValue> attributes;
}