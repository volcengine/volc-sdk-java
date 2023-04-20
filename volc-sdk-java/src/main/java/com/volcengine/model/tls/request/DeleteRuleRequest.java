package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.volcengine.model.tls.Const.RULE_ID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRuleRequest {
    @JSONField(name = RULE_ID)
    private String ruleId;

    public boolean CheckValidation() {
        if (this.ruleId == null) {
            return false;
        }
        return true;
    }
}
