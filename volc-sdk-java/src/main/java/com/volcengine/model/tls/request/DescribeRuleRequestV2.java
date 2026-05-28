package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.RULE_ID;

@Data
@NoArgsConstructor
public class DescribeRuleRequestV2 {
    @JSONField(name = RULE_ID, serialize = false)
    private String ruleId;

    public DescribeRuleRequestV2(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public boolean CheckValidation() {
        return this.ruleId != null;
    }
}
