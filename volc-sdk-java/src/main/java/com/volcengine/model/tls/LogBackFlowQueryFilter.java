package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogBackFlowQueryFilter {
    @JSONField(name = FIELD)
    private String field;
    @JSONField(name = VALUE)
    private Object value;
    @JSONField(name = VALUES)
    private List<String> values;
    @JSONField(name = OPERATOR)
    private String operator;
}
