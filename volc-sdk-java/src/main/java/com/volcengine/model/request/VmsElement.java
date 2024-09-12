package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VmsElement {
    @JSONField(name = "sourceType")
    String sourceType;
    @JSONField(name = "content")
    String content;


    public VmsElement(String sourceType, String content) {
        this.sourceType = sourceType;
        this.content = content;
    }
}
