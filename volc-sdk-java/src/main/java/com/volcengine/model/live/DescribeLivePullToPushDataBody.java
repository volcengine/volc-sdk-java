package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * DescribeLivePullToPushDataBody
 */
@lombok.Data
public final class DescribeLivePullToPushDataBody {

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合的时间粒度，单位为 s，默认值为 86400。支持如下时间粒度。    </p>
     *
     * <p>60：支持单次查询时间跨度为 1 天，历史查询时间范围为 7 天。</p>
     *
     * <p>3600：支持单次查询时间跨度为 93 天，历史查询时间范围为 93天。</p>
     *
     * <p>86400：支持单次查询时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>是否返回过滤字段和时间聚合后的数据，可取元素"Domain"，空不返还。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
