package com.volcengine.model.request.iam;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ListEntitiesForPolicyRequest {
    @JSONField(name = "PolicyName")
    String policyName;

    @JSONField(name = "PolicyType")
    String policyType;

    @JSONField(name = "EntityFilter")
    String entityFilter;

    @JSONField(name = "Limit")
    int limit;

    @JSONField(name = "Offset")
    int offset;
}
