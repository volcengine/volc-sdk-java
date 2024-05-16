package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetContentSecurityAccessConfigRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "service_item")
    String service;
}

