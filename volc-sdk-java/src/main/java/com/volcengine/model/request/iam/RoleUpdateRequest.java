package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RoleUpdateRequest {
    @JSONField(name = "RoleName")
    String roleName;
    @JSONField(name = "TrustPolicyDocument")
    String trustPolicyDocument;
    @JSONField(name = "DisplayName")
    String displayName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "MaxSessionDuration")
    Integer maxSessionDuration;
}
