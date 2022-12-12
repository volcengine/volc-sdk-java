package com.volcengine.model.response.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Policy {
    @JSONField(name = "CreateDate")
    String createDate;

    @JSONField(name = "UpdateDate")
    String updateDate;

    @JSONField(name = "PolicyTrn")
    String policyTrn;

    @JSONField(name = "PolicyName")
    String policyName;

    @JSONField(name = "PolicyType")
    String policyType;

    @JSONField(name = "Description")
    String description;

    @JSONField(name = "PolicyDocument")
    String policyDocument;
}
