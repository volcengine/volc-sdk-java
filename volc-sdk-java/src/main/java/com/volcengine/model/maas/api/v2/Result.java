package com.volcengine.model.maas.api.v2;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Result {
    @JSONField(name = "ApiKey")
    private String ApiKey;
}