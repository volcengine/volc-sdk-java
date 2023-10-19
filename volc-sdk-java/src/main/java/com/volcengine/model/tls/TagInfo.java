package com.volcengine.model.tls;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import static com.volcengine.model.tls.Const.*;

@Data
public class TagInfo {
    @JSONField(name = KEY)
    String key;
    @JSONField(name = VALUE)
    String value;

    public TagInfo(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
