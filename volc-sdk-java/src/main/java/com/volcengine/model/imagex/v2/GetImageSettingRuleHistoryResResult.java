package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageSettingRuleHistoryResResult
 */
@lombok.Data
public final class GetImageSettingRuleHistoryResResult  {

    /**
     * <p>修改记录列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Records")
    private List<GetImageSettingRuleHistoryResResultRecordsItem> records;

    /**
     * <p>总记录条数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
