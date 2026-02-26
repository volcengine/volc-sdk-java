package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class RuleResult {
    @JSONField(name = "RuleSubType")
    String ruleSubType;

    @JSONField(name = "RuleSuggestion")
    String ruleSuggestion;

    @JSONField(name = "Reason")
    String reason;
}