package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageMonitorRuleBodyMonitorRuleCond
 */
@lombok.Data
public final class CreateImageMonitorRuleBodyMonitorRuleCond  {

    /**
     * <p>多条监控规则之间的逻辑关系，取值如下所示：</p>
     *
     *
     *
     * <p>- `and`：且。表示有多条监控规则时，需满足所有监控规则才会触发告警通知。</p>
     *
     * <p>- `or`：或。表示有多条监控规则时，满足其中一条监控规则就会触发告警通知。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogicOp")
    private String logicOp;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ItemCond")
    private List<CreateImageMonitorRuleBodyMonitorRuleCondItemCondItem> itemCond;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
