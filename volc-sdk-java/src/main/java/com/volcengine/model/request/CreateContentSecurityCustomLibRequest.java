package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateContentSecurityCustomLibRequest {
    @JSONField(name = "app_id")
    Integer appId;
    @JSONField(name = "name")
    String name;
    @JSONField(name = "description")
    String description;
    @JSONField(name = "match_type")
    String matchType;
    @JSONField(name = "decision")
    String decision;
    @JSONField(name = "biztypes")
    String biztypes;
    @JSONField(name = "service")
    String service;
    @JSONField(name = "lib_type")
    String libType;
}
