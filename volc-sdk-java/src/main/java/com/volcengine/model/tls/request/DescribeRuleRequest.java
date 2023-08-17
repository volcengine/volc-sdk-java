package com.volcengine.model.tls.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DescribeRuleRequest {
    private String ruleId;

    /**
     * @param ruleId 采集配置的 ID
     */
    public DescribeRuleRequest(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return 采集配置的 ID
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * @param ruleId 采集配置的 ID
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * @return 检验必填参数，true合法false不合法
     */
    public boolean CheckValidation() {
        if (this.ruleId == null) {
            return false;
        }
        return true;
    }
}
