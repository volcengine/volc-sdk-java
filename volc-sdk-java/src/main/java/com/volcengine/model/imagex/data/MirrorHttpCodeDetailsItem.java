package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MirrorHttpCodeDetailsItem {
    @JSONField(name = "HttpCode")
    private String httpCode;
    @JSONField(name = "Value")
    private Long value;
}
