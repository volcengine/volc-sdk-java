package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTimeShiftDataBody
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataBody  {

    /**
     * <p>聚合时间粒度，单位秒，支持配置为 86400，支持查询最近 366 天内的数据，单次查询时间范围 93 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>开始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>域名空间列表，缺省情况表示查询该用户的所有域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhosts")
    private List<String> vhosts;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
