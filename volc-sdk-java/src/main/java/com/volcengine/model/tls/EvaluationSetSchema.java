package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EvaluationSetSchema {
    @JSONField(name = "FieldSchemas")
    private List<EvaluationSetFieldSchema> fieldSchemas;
}
