package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdatePolicyRequest {
    @JSONField(name = "PolicyName")
    String policyName;

    @JSONField(name = "NewPolicyName")
    String newPolicyName;

    @JSONField(name = "NewPolicyDocument")
    String newPolicyDocument;

    @JSONField(name = "NewDescription")
    String newDescription;
}
