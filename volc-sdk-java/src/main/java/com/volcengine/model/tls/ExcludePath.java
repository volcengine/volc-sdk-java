package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.TYPE;
import static com.volcengine.model.tls.Const.VALUE;

@Data
@NoArgsConstructor
public class ExcludePath {
    @JSONField(name = TYPE)
    String type;
    @JSONField(name = VALUE)
    String value;

    /**
     * @param type  采集路径类型，File或Path
     * @param value 采集绝对路径
     */
    public ExcludePath(String type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * @return 采集路径类型，File或Path
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 采集路径类型，File或Path
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 采集绝对路径
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value 采集绝对路径
     */
    public void setValue(String value) {
        this.value = value;
    }
}
