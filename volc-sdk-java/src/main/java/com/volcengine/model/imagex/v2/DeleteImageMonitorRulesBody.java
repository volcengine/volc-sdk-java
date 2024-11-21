package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageMonitorRulesBody
 */
@lombok.Data
public final class DeleteImageMonitorRulesBody  {

    /**
     * <p>待删除的告警规则 ID 列表，您可以调用 [GetImageMonitorRules](https://www.volcengine.com/docs/508/1112186)获取所需的告警规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleIds")
    private List<String> ruleIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
