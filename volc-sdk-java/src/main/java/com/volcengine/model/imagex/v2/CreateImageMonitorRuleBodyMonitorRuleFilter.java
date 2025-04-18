package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateImageMonitorRuleBodyMonitorRuleFilter
 */
@lombok.Data
public final class CreateImageMonitorRuleBodyMonitorRuleFilter  {

    /**
     * <p>过滤条件之间的逻辑关系，取值如下所示：</p>
     *
     *
     *
     * <p>- `and`：和</p>
     *
     * <p>- `or`：或</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogicOp")
    private String logicOp;

    /**
     * <p>过滤条件</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DimFilter")
    private List<CreateImageMonitorRuleBodyMonitorRuleFilterDimFilterItem> dimFilter;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
