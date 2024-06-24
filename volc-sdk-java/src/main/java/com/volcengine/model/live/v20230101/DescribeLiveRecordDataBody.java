package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRecordDataBody
 */
@lombok.Data
public final class DescribeLiveRecordDataBody  {

    /**
     * <p>域名列表，默认为空，表示查询您视频直播产品下所有域名的录制用量数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
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
     * <p>数据聚合的时间粒度，单位为秒，支持的时间粒度如下所示。  </p>
     *
     * <p>- `300`：（默认值）5 分钟。时间粒度为 5 分钟时，单次查询最大时间跨度为 31 天，历史查询最大时间范围为 366 天； </p>
     *
     * <p>- `3600`：1 小时。时间粒度为 1 小时时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天； </p>
     *
     * <p>- `86400`：1 天。时间粒度为 1 天时，单次查询最大时间跨度为 93 天，历史查询时间范围为 366 天。</p>
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

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度数据时，需同时传入 `App` 和 `Stream`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度数据时，需同时传入 `App` 和 `Stream`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
