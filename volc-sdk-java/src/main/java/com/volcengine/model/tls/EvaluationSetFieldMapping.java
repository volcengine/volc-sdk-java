package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EvaluationSetFieldMapping {
    @JSONField(name = "Source")
    private String source;
    @JSONField(name = "Target")
    private String target;
}
