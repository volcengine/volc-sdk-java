package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageMonitorRuleBody
 */
@lombok.Data
public final class UpdateImageMonitorRuleBody  {

    /**
     * <p>更新后的报警规则，具体请见 [MonitorRule](https://www.volcengine.com/docs/508/1112183#monitorrule)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MonitorRule")
    private UpdateImageMonitorRuleBodyMonitorRule monitorRule;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
