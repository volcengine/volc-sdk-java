package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateContentSecurityCustomLibRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "description")
    String description;
    @JSONField(name = "biztypes")
    String biztypes;
    @JSONField(name = "service")
    String service;
    @JSONField(name = "lib_type")
    String libType;
    @JSONField(name = "name")
    String name;
}
