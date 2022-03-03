package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RoleResponse {
    @JSONField(name = "RoleName")
    String roleName;
    @JSONField(name = "Description")
    String description;
    @JSONField(name = "Trn")
    String trn;
    @JSONField(name = "TrustPolicyDocument")
    String rolePolicyDocument;
    @JSONField(name = "CreateDate")
    String createDate;
    @JSONField(name = "MaxSessionDuration")
    String maxSessionDuration;
}