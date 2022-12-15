package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeletePolicyRequest {
    @JSONField(name = "PolicyName")
    String policyName;
}
