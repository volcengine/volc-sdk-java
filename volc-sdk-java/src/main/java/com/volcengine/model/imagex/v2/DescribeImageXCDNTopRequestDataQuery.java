package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXCDNTopRequestDataQuery
 */
@lombok.Data
public final class DescribeImageXCDNTopRequestDataQuery  {

    /**
     * <p>服务 ID。支持查询多个服务，传入多个时用英文逗号“,”分割，缺省情况下表示查询所有服务。您可以在 veImageX 控制台的[服务管理](https://console.volcengine.com/imagex/service_manage/)模块或者调用 [GetAllImageServices](https://www.volcengine.com/docs/508/9360) 接口获取服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceIds")
    private String serviceIds;

    /**
     * <p>域名。支持查询多个域名，传入多个时用英文逗号“,”分割，缺省情况下表示查询所有域名。您可以通过调用 [GetServiceDomains](https://www.volcengine.com/docs/508/9379) 获取所需的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainNames")
    private String domainNames;

    /**
     * <p>网络协议。缺省情况下则表示不限制网络协议，取值如下所示：</p>
     *
     *
     *
     * <p>- `IPv4`</p>
     *
     * <p>- `IPv6`</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`KeyType`取值为`Domain`时，`IPVersion`的取值无效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPVersion")
    private String iPVersion;

    /**
     * <p>数据访问区域。仅在`KeyType`取值为`Region`或`Isp`时生效，取值如下所示：</p>
     *
     *
     *
     * <p>- `China`：中国。</p>
     *
     * <p>- `Other`：中国境外的区域。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>排序依据，取值如下所示：</p>
     *
     *
     *
     * <p>- `URL`：生成的图片访问 URL</p>
     *
     * <p>- `UserAgent`：用户代理</p>
     *
     * <p>- `Refer`：请求 Refer</p>
     *
     * <p>- `ClientIP`：客户端 IP</p>
     *
     * <p>- `Region`：访问区域</p>
     *
     * <p>- `Domain`：域名</p>
     *
     * <p>- `Isp`：运营商</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyType")
    private String keyType;

    /**
     * <p>排序依据，即获取按`ValueType`值排序的`KeyType`列表。取值如下所示：</p>
     *
     *
     *
     * <p>- `Traffic`：按流量排序</p>
     *
     * <p>- `RequestCnt`：按请求次数排序</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>当`KeyType`取值为`Domain`时，仅支持将`ValueType`取值为`Traffic`，即按照流量排序获取域名列表。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValueType")
    private String valueType;

    /**
     * <p>获取数据起始时间点。日期格式按照 ISO8601 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如 2019-06-02T00:00:00+08:00。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点。日期格式按照 ISO8601 表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如 2019-06-02T00:00:00+08:00。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>每页查询数据量，默认为`0`，即返回所有数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private String limit;

    /**
     * <p>分页偏移量，默认取值为`0` 。取值为`10`时，表示跳过前 10 条数据，从第 11 条数据开始取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private String offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
