package com.volcengine.model.tls.request;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class DeleteRuleFromHostGroupsRequest extends ApplyRuleToHostGroupsRequest {
    public DeleteRuleFromHostGroupsRequest(String ruleId, List<String> hostGroupIds) {
        super(ruleId, hostGroupIds);
    }
}
