package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageMonitorRuleBody
 */
@lombok.Data
public final class CreateImageMonitorRuleBody  {

    /**
     * <p>告警规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MonitorRule")
    private CreateImageMonitorRuleBodyMonitorRule monitorRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
