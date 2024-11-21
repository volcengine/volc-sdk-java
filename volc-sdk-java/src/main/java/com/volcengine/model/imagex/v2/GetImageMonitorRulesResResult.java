package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageMonitorRulesResResult
 */
@lombok.Data
public final class GetImageMonitorRulesResResult  {

    /**
     * <p>规则总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MonitorRules")
    private List<GetImageMonitorRulesResResultMonitorRulesItem> monitorRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
