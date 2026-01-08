package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Trace {

    /** Trace 中的 Span 列表. */
    @JSONField(name = "Spans")
    private List<Span> spans;
}
