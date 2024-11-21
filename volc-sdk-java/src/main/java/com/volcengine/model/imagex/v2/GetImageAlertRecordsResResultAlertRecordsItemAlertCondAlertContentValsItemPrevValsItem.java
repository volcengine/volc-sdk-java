package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAlertRecordsResResultAlertRecordsItemAlertCondAlertContentValsItemPrevValsItem
 */
@lombok.Data
public final class GetImageAlertRecordsResResultAlertRecordsItemAlertCondAlertContentValsItemPrevValsItem  {

    /**
     * <p>指标值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Val")
    private Double val;

    /**
     * <p>指标上一周期值，仅在 `Op` 为同比/环比相关方法时有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValBase")
    private String valBase;

    /**
     * <p>指标值对应的时间。日期格式按照 `ISO8601` 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValTime")
    private String valTime;

    /**
     * <p>指标上一周期值对应的时间。日期格式按照 `ISO8601` 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`。仅在 `Op` 为同比/环比相关方法时有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BaseTime")
    private String baseTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
