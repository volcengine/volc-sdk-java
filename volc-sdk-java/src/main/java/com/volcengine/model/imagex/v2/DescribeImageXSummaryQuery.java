package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXSummaryQuery
 */
@lombok.Data
public final class DescribeImageXSummaryQuery  {

    /**
     * <p>数据查询时间段，即`Timestamp`所在月份的 1 日 0 时起至传入时间`Timestamp`的时间范围。</p>
     *
     * <p>格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timestamp")
    private String timestamp;

    /**
     * <p>限制查询的服务 ID，传入多个时用英文逗号分割。缺省情况下表示不限制服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台[服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考 [GetAllImageServices](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceIds")
    private String serviceIds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
