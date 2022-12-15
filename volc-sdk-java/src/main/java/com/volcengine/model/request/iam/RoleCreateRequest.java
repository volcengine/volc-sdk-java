package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RoleCreateRequest {
    @JSONField(name = "TrustPolicyDocument")
    String trustPolicyDocument;
    @JSONField(name = "RoleName")
    String roleName;
    @JSONField(name = "DisplayName")
    String displayName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "MaxSessionDuration")
    String maxSessionDuration;
}
