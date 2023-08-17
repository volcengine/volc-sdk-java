package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.RULE_ID;

@Data
@NoArgsConstructor
public class DeleteRuleRequest {
    @JSONField(name = RULE_ID)
    private String ruleId;

    /**
     * @param ruleId 采集配置的 ID
     */
    public DeleteRuleRequest(String ruleId) {
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

    public boolean CheckValidation() {
        if (this.ruleId == null) {
            return false;
        }
        return true;
    }
}
