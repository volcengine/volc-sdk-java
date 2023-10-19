package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStreamCountDataBody
 */
@lombok.Data
public final class DescribeLiveStreamCountDataBody  {

    /**
     * <p>域名列表，缺省情况表示该用户的所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的开始时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>聚合的时间粒度，支持以下取值：</p>
     *
     * <p>- 60s：查询支持的时间跨度为 24h、历史查询时间范围为 7d</p>
     *
     * <p>- 300s：查询支持的时间跨度为 31d、历史查询时间范围为 93d</p>
     *
     * <p>- 3600s：查询支持的时间跨度为 93d、历史查询时间范围为93d</p>
     *
     * <p>- 1d：查询支持的时间跨度为 93d、历史查询时间范围为93d，</p>
     *
     *
     *
     * <p>默认 300s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，可取元素"Domain"，设置为空时不进行数据拆分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>流类型，默认查全部，支持以下取值：</p>
     *
     * <p>- 推流：push</p>
     *
     * <p>- 拉流：pull</p>
     *
     * <p>- 回源流：relay-source</p>
     *
     * <p>- 转码：transcode</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private List<String> streamType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
