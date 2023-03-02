package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class TopValueItem {
    @JSONField(name = "Key")
    private String key;
    @JSONField(name = "value")
    private Double Value;
}
