package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXMirrorRequestHttpCodeOverviewBody
 */
@lombok.Data
public final class DescribeImageXMirrorRequestHttpCodeOverviewBody  {

    /**
     * <p>服务 ID。为空时表示不筛选，支持查询多个服务，使用逗号分隔不同的服务。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考 [GetAllImageServices](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceIds")
    private List<String> serviceIds;

    /**
     * <p>域名。为空时表示不筛选，支持查询多个域名，不同的域名使用逗号分隔。</p>
     *
     * <p>您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379) 获取服务下所有域名信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainNames")
    private List<String> domainNames;

    /**
     * <p>获取数据起始时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
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
     * <p>获取数据结束时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>状态码是否聚合。支持取值如下：</p>
     *
     *
     *
     * <p>- `true`：聚合</p>
     *
     * <p>- `false`：（默认）不聚合</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AggregateCode")
    private String aggregateCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
