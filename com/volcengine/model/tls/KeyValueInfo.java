package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.KEY;
import static com.volcengine.model.tls.Const.VALUE;

@Data
@NoArgsConstructor
public class KeyValueInfo {
    @JSONField(name = KEY)
    String key;
    @JSONField(name = VALUE)
    ValueInfo value;

    /**
     * @param key   需要配置键值索引的字段名称
     * @param value 需要配置键值索引的字段描述信息
     */
    public KeyValueInfo(String key, ValueInfo value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return 需要配置键值索引的字段名称
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key 需要配置键值索引的字段名称
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return 需要配置键值索引的字段描述信息
     */
    public ValueInfo getValue() {
        return value;
    }

    /**
     * @param value 需要配置键值索引的字段描述信息
     */
    public void setValue(ValueInfo value) {
        this.value = value;
    }
}