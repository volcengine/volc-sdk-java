package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageMonitorRuleStatusBody
 */
@lombok.Data
public final class UpdateImageMonitorRuleStatusBody  {

    /**
     * <p>待更新的告警规则 ID，您可以调用 [GetImageMonitorRules](https://www.volcengine.com/docs/508/1112186)获取所需的告警规则 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    /**
     * <p>是否开启告警监测，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：不开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enabled")
    private Boolean enabled;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
