package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateStreamQuotaConfigBodyQuotaDetailListItemBandwidthConfig
 */
@lombok.Data
public final class UpdateStreamQuotaConfigBodyQuotaDetailListItemBandwidthConfig  {

    /**
     * <p>带宽限额，下行带宽峰值超过此限额的额外访问将会被拒绝，取值范围为 [1,10000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quota")
    private Integer quota;

    /**
     * <p>拉流带宽限额的计量单位，支持的取值如下所示。</p>
     *
     *
     *
     * <p>- Mbps</p>
     *
     * <p>- Gbps</p>
     *
     * <p>- Tbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaUnit")
    private String quotaUnit;

    /**
     * <p>拉流带宽限额告警阈值，取值范围为 [1,10000]，缺省情况表示不设置告警。</p>
     *
     * <p>:::tip</p>
     *
     * <p>该参数的取值需要小于等于拉流带宽限额 `Quota`，否则会报错。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlarmThreshold")
    private Integer alarmThreshold;

    /**
     * <p>拉流带宽限额告警的计量单位，缺省情况表示不设置告警。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- Mbps</p>
     *
     * <p>- Gbps</p>
     *
     * <p>- Tbps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AlarmThresholdUnit")
    private String alarmThresholdUnit;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
