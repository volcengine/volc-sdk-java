package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateResEventRuleBody
 */
@lombok.Data
public final class UpdateResEventRuleBody  {

    /**
     * <p>事件通知规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EventRules")
    private List<UpdateResEventRuleBodyEventRulesItem> eventRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
