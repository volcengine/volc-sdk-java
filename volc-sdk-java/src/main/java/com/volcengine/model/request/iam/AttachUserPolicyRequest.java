package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AttachUserPolicyRequest {
    @JSONField(name = "PolicyName")
    String policyName;

    @JSONField(name = "PolicyType")
    String policyType;

    @JSONField(name = "UserName")
    String userName;
}
