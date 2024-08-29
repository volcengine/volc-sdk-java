package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushBandwidthDataBody
 */
@lombok.Data
public final class DescribeLivePullToPushBandwidthDataBody  {

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒，支持的时间粒度如下所示。</p>
     *
     * <p>- `300`：（默认值）5 分钟。时间粒度为 5 分钟时，单次查询最大时间跨度为 31 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- `3600`：1 小时。时间粒度为 1 小时时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天；</p>
     *
     * <p>- `86400`：1 天。时间粒度为 1 天时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，默认为空表示不按维度进行数据拆分，当前支持按 `Group` 维度进行拆分。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>配置数据拆分的维度时，对应的维度参数传入多个值时才会返回按此维度拆分的数据。例如，配置按 Group 进行数据拆分时， GroupList 传入多个 Group 值时，才会返回按 Group 拆分的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>拉流转推任务群组列表，默认为空，表示查询所有拉流转推任务群组的带宽用量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupList")
    private List<String> groupList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
