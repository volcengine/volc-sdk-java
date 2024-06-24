package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAuditDataBody
 */
@lombok.Data
public final class DescribeLiveAuditDataBody  {

    /**
     * <p>域名列表，默认为空，表示查询您视频直播产品下所有域名的截图审核张数用量数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

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
     * <p>数据聚合的时间粒度，单位为秒，当前接口默认且仅支持按 `86400` 秒进行数据聚合。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>时间粒度为 86400 秒时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，默认为空表示不按维度进行数据拆分，当前接口仅支持填写 `Domain` 表示按查询的域名为维度进行数据拆分。</p>
     *
     * <p>:::tip</p>
     *
     * <p>配置数据拆分的维度时，对应的维度参数传入多个值时才会返回按此维度拆分的数据。例如，配置按 Domain 进行数据拆分时， DomainList 传入多个 Domain 值时，才会返回按 Domain 拆分的数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
