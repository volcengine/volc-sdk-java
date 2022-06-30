package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateCustomContentsRequest {
    @JSONField(name = "AppId")
    Integer appId;
    @JSONField(name = "Service")
    String service;
    @JSONField(name = "Decision")
    String decision;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Name")
    String name;
}
