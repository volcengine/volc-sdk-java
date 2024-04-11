package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItemBandwidthConfig
 */
@lombok.Data
public final class DescribeStreamQuotaConfigResResultQuotaListItemQuotaDetailListItemBandwidthConfig  {

    /**
     * <p>拉流域名的带宽限额。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quota")
    private Integer quota;

    /**
     * <p>带宽限额的计量单位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaUnit")
    private String quotaUnit;

    /**
     * <p>带宽限额的告警阈值，缺省情况表示未设置告警。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlarmThreshold")
    private Integer alarmThreshold;

    /**
     * <p>带宽限额告警的计量单位，缺省情况表示不未设置告警。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlarmThresholdUnit")
    private String alarmThresholdUnit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
