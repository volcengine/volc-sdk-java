package com.volcengine.model.tls.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DeleteRuleFromHostGroupsRequest extends ApplyRuleToHostGroupsRequest {
    /**
     * @param ruleId       采集配置id
     * @param hostGroupIds 机器组id列表
     */
    public DeleteRuleFromHostGroupsRequest(String ruleId, List<String> hostGroupIds) {
        super(ruleId, hostGroupIds);
    }

    public boolean CheckValidation() {
        if (this.ruleId == null || this.hostGroupIds == null) {
            return false;
        }
        return true;
    }
}
