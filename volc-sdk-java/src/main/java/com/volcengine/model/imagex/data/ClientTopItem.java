package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ClientTopItem {
    @JSONField(name = "Url")
    private String url;
    @JSONField(name = "Value")
    private Long value;
    @JSONField(name = "Count")
    private Long count;
}
