package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageMonitorRulesResResultMonitorRulesItemFilterDimFilterItem
 */
@lombok.Data
public final class GetImageMonitorRulesResResultMonitorRulesItemFilterDimFilterItem  {

    /**
     * <p>维度名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dim")
    private String dim;

    /**
     * <p>维度取值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vals")
    private List<String> vals;

    /**
     * <p>纬度值是否取反，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：指定维度的实际值不得满足 `Vals` 所有指定值</p>
     *
     * <p>- `false`：（默认）维度值等于 `Vals` 中之一即可</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Not")
    private Boolean not;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
