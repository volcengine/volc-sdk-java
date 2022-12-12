package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class AttachedPolicy {
    @JSONField(name = "AttachDate")
    String attachDate;

    @JSONField(name = "PolicyTrn")
    String policyTrn;

    @JSONField(name = "PolicyName")
    String policyName;

    @JSONField(name = "PolicyType")
    String policyType;

    @JSONField(name = "Description")
    String description;
}
