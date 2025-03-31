package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnDurationDetailByTimeBody
 */
@lombok.Data
public final class DescribeImageXCdnDurationDetailByTimeBody  {

    /**
     * <p>应用 ID。默认为空，不传则匹配账号下的所有的 App ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/1213042)的方式获取所需的 AppID。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Appid")
    private String appid;

    /**
     * <p>需要匹配的 App 版本，不传则匹配 App 的所有版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVer")
    private List<String> appVer;

    /**
     * <p>需要匹配的系统类型，不传则匹配非 WEB 端的所有系统。取值如下所示：</p>
     *
     * <p>- `iOS`</p>
     *
     * <p>- `Android`</p>
     *
     * <p>- `WEB`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    /**
     * <p>需要匹配的 SDK 版本，不传则匹配所有版本.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SdkVer")
    private List<String> sdkVer;

    /**
     * <p>需要匹配的国家名称。</p>
     *
     * <p>* 不传则匹配所有国家。</p>
     *
     * <p>* 取值为`海外`时，匹配海外所有国家。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Country")
    private String country;

    /**
     * <p>需要匹配的省份名称，不传则匹配所有省份。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Province")
    private String province;

    /**
     * <p>需要匹配的运营商名称，不传则匹配所有运营商。支持取值如下：</p>
     *
     * <p>- `电信`</p>
     *
     * <p>- `联通`</p>
     *
     * <p>- `移动`</p>
     *
     * <p>- `铁通`</p>
     *
     * <p>- `鹏博士`</p>
     *
     * <p>- `教育网`</p>
     *
     * <p>- `其他`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Isp")
    private List<String> isp;

    /**
     * <p>需要匹配的域名，不传则匹配所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private List<String> domain;

    /**
     * <p>需要匹配的图片类型，不传则匹配所有图片类型。</p>
     *
     * <p>- `GIF`</p>
     *
     * <p>- `PNG`</p>
     *
     * <p>- `JPEG`</p>
     *
     * <p>- `HEIF`</p>
     *
     * <p>- `HEIC`</p>
     *
     * <p>- `WEBP`</p>
     *
     * <p>- `AWEBP`</p>
     *
     * <p>- `VVIC`</p>
     *
     * <p>- `其他`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageType")
    private List<String> imageType;

    /**
     * <p>需要匹配的自定义维度项 。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraDims")
    private List<DescribeImageXCdnDurationDetailByTimeBodyExtraDimsItem> extraDims;

    /**
     * <p>拆分维度。默认为空，标识不拆分。支持取值：</p>
     *
     * <p>* `Duration`：表示拆分网络耗时分位数据</p>
     *
     * <p>- `Phase`：表示拆分网络耗时分布数据</p>
     *
     * <p>- 公共维度：`Appid`、`OS`、`AppVer`、`SdkVer`、`ImageType`、`Country`、`Province`、`Isp`、`Domain`</p>
     *
     * <p>- 自定义维度：您可以通过调用 [获取自定义维度列表](https://www.volcengine.com/docs/508/1213048)接口获取自定义维度指标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>指定查询特定阶段的耗时数据。默认空，返回总耗时数据。</p>
     *
     * <p>* `dns`： DNS 耗时，即网络阶段的 DNS 平均耗时。</p>
     *
     * <p>* `ssl`： SSL 耗时，即网络阶段的 SSL 握手平均耗时。</p>
     *
     * <p>* `connect`：连接耗时，即网络阶段的 TCP 建立连接平均耗时。</p>
     *
     * <p>* `send`：发送耗时，即网络阶段的发送数据平均耗时。</p>
     *
     * <p>* `wait`：等待耗时，即网络阶段发送完数据后等待首个回包字节的耗时。</p>
     *
     * <p>* `receive`：接收耗时，即网络阶段的接收数据耗时。</p>
     *
     * <p>* `proxy`：代理耗时，即网络阶段的建立代理连接的耗时。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private String phase;

    /**
     * <p>获取数据起始时间点。</p>
     *
     * <p>* 日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点，需在起始时间点之后。</p>
     *
     * <p>* 日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>返回数据的时间粒度。</p>
     *
     * <p>* `5m`：5 分钟；</p>
     *
     * <p>* `1h`：1 小时；</p>
     *
     * <p>* `1d`：1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Granularity")
    private String granularity;

    /**
     * <p>取值为不等于的维度（默认为等于）。支持取值：</p>
     *
     * <p>- 公共维度：`AppVer`、`SdkVer`、`Country`、`Province`、`Isp`、`Domain`、`ImageType`</p>
     *
     * <p>- 自定义维度：您可以通过调用 [GetImageXQueryDims](https://www.volcengine.com/docs/508/1213048)接口获取自定义维度指标</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Not")
    private List<String> not;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
