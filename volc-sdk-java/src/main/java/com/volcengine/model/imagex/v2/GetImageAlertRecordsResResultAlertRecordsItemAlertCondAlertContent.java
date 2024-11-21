package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageAlertRecordsResResultAlertRecordsItemAlertCondAlertContent
 */
@lombok.Data
public final class GetImageAlertRecordsResResultAlertRecordsItemAlertCondAlertContent  {

    /**
     * <p>指标名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Item")
    private String item;

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
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Func")
    private String func;

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
     * <p>拆分维度。仅当告警配置了维度拆分时有值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Dim")
    private String dim;

    /**
     * <p>告警指标值列表。维度拆分条件下可能存在多个元素。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vals")
    private List<GetImageAlertRecordsResResultAlertRecordsItemAlertCondAlertContentValsItem> vals;

    /**
     * <p>指标比较阈值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Threshold")
    private Double threshold;

    /**
     * <p>聚合周期，单位为分钟。被监控指标在该指定周期内满足指标比较阈值触发告警。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AggrInterval")
    private Integer aggrInterval;

    /**
     * <p>持续周期，表示聚合周期内的异常指标持续出现指定次数触发告警。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RepeatCnt")
    private Integer repeatCnt;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
