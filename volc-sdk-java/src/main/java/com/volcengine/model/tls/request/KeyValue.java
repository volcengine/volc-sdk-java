package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KeyValue {

    /**
     * Key.
     */
    @JSONField(name = "Key")
    private String key;

    /**
     * Value.
     */
    @JSONField(name = "Value")
    private String value;
}
