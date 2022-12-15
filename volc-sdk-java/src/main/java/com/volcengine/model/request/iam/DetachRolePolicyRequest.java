package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DetachRolePolicyRequest {
    @JSONField(name = "PolicyName")
    String policyName;

    @JSONField(name = "PolicyType")
    String policyType;

    @JSONField(name = "RoleName")
    String roleName;
}
