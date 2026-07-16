package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.ArrayList;

import static com.volcengine.model.tls.Const.*;

@Data
@NoArgsConstructor
public class LogBackFlowQueryFilter {
    @JSONField(name = FIELD)
    private String field;
    @JSONField(name = VALUE)
    private Object value;
    @JSONField(serialize = false, deserialize = false)
    private List<String> values;
    @JSONField(name = VALUES)
    private List<Object> valuesAny;
    @JSONField(name = OPERATOR)
    private String operator;

    @JSONField(serialize = false, deserialize = false)
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
        this.valuesAny = values == null ? null : new ArrayList<Object>(values);
    }

    @JSONField(name = VALUES)
    public List<Object> getValuesAny() {
        return valuesAny;
    }

    public void setValuesAny(List<Object> valuesAny) {
        this.valuesAny = valuesAny;
        this.values = null;
        if (valuesAny == null) {
            return;
        }
        List<String> strings = new ArrayList<>();
        for (Object value : valuesAny) {
            if (!(value instanceof String)) {
                return;
            }
            strings.add((String) value);
        }
        this.values = strings;
    }
}
