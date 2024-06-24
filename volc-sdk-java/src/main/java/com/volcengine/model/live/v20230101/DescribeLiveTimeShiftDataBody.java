package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTimeShiftDataBody
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataBody  {

    /**
     * <p>数据聚合的时间粒度，单位为秒，当前接口默认且仅支持按 `86400` 秒进行数据聚合。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>域名空间列表，默认为空，表示查询您视频直播产品下所有域名产生的时移存储用量数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取域名所在的域名空间信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhosts")
    private List<String> vhosts;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
