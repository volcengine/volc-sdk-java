package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXHitRateTrafficDataQuery
 */
@lombok.Data
public final class DescribeImageXHitRateTrafficDataQuery  {

    /**
     * <p>服务 ID。支持查询多个服务，传入多个时用英文逗号“,”分割，缺省情况下表示查询所有服务。您可以在 veImageX 控制台的[服务管理](https://console.volcengine.com/imagex/service_manage/)模块或者调用 [GetAllImageServices](https://www.volcengine.com/docs/508/9360) 接口获取服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceIds")
    private String serviceIds;

    /**
     * <p>域名。支持查询多个域名，传入多个时用英文逗号“,”分割，缺省情况下表示查询所有域名。您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379) 获取服务下所有域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainNames")
    private String domainNames;

    /**
     * <p>需要分组查询的参数。取值仅支持`DomainName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>获取数据起始时间点。日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。例如`2019-06-02T00:00:00+08:00`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>由于仅支持查询近 93 天的历史数据，则若此刻时间为`2011-11-21T16:14:00+08:00`，那么您可输入最早的开始时间为`2011-08-21T00:00:00+08:00`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点。日期格式按照 ISO8601 表示法，格式为：YYYY-MM-DDThh:mm:ss±hh:mm。例如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询数据的时间粒度，单位为秒。缺省时查询`StartTime`和`EndTime`时间段全部数据，此时单次查询最大时间跨度为 93 天。支持以下取值：</p>
     *
     *
     *
     * <p>- `60`：单次查询最大时间跨度为 6 小时</p>
     *
     * <p>- `120`：单次查询最大时间跨度为 6 小时</p>
     *
     * <p>- `300`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `600`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `1200`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `1800`：单次查询最大时间跨度为 31 天</p>
     *
     * <p>- `3600`：单次查询最大时间跨度为 93 天</p>
     *
     * <p>- `86400`：单次查询最大时间跨度为 93 天</p>
     *
     * <p>- `604800`：单次查询最大时间跨度为 93 天</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private String interval;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
