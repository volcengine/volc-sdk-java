package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageMonitorRuleBodyMonitorRuleCondItemCondItem
 */
@lombok.Data
public final class UpdateImageMonitorRuleBodyMonitorRuleCondItemCondItem  {

    /**
     * <p>指标名称，取值参考 [veImageX 告警指标定义](https://www.volcengine.com/docs/508/1113944)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Item")
    private String item;

    /**
     * <p>持续周期，当监控指标在聚合周期内，连续`RepeatCnt`次满足指标比较阈值且上报量满足样本量阈值时，才会触发告警。取值如下所示：</p>
     *
     *
     *
     * <p>- `1`</p>
     *
     * <p>- `3`</p>
     *
     * <p>- `5`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RepeatCnt")
    private Integer repeatCnt;

    /**
     * <p>聚合周期，单位为分钟。被监控指标在该指定周期内满足指标比较阈值且上报量满足样本量阈值时，才会触发告警。取值如下所示：</p>
     *
     *
     *
     * <p>- `5`</p>
     *
     * <p>- `10`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AggrInterval")
    private Integer aggrInterval;

    /**
     * <p>样本量阈值。被监控指标超过该值时触发告警。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CntThreshold")
    private Integer cntThreshold;

    /**
     * <p>指标比较阈值，需要与 `CntThreshold` 同时被满足才会触发告警。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Threshold")
    private Double threshold;

    /**
     * <p>指标比较方法，取值如下所示：</p>
     *
     *
     *
     * <p>- `LE`：小于等于</p>
     *
     * <p>- `GE`：大于等于</p>
     *
     * <p>- `INC`：环比上升</p>
     *
     * <p>- `DEC`：环比下降</p>
     *
     * <p>- `HOH_INC`：与上小时同比上升</p>
     *
     * <p>- `HOH_DEC`：与上小时同比下降</p>
     *
     * <p>- `DOD_INC`：与昨天同比上升</p>
     *
     * <p>- `DOD_DEC`：与昨天同比下降</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Op")
    private String op;

    /**
     * <p>指标取值函数，取值如下所示：</p>
     *
     *
     *
     * <p>- `max`：最大值</p>
     *
     * <p>- `min`：最小值</p>
     *
     * <p>- `avg`：平均值</p>
     *
     * <p>- `pct25`：25峰值</p>
     *
     * <p>- `pct50`：50峰值</p>
     *
     * <p>- `pct90`：90峰值</p>
     *
     * <p>- `pct99`：99峰值</p>
     *
     * <p>- `sum`：总和</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>各指标支持的函数参考 [veImageX 告警指标定义](https://www.volcengine.com/docs/508/1113944)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Func")
    private String func;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
