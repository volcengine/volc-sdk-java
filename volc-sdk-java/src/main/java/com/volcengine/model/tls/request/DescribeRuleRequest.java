package com.volcengine.model.tls.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescribeRuleRequest {
    private String ruleId;

    public boolean CheckValidation() {
        if (this.ruleId == null) {
            return false;
        }
        return true;
    }
}
