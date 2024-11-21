package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteImageMonitorRulesResResult
 */
@lombok.Data
public final class DeleteImageMonitorRulesResResult  {

    /**
     * <p>成功删除的告警规则 ID 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeletedRules")
    private List<String> deletedRules;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
