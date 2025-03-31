package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXUploadSegmentSpeedByTimeBody
 */
@lombok.Data
public final class DescribeImageXUploadSegmentSpeedByTimeBody  {

    /**
     * <p>应用 ID。默认为空，不传则匹配账号下的所有的 AppID。</p>
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
     * <p>需要匹配的系统类型。取值如下所示：</p>
     *
     * <p>- 不传或传空字符串：Android+iOS。</p>
     *
     * <p>- `iOS`：iOS。</p>
     *
     * <p>- `Android`：Android。</p>
     *
     * <p>- `WEB`：web+小程序。</p>
     *
     * <p>- `Web`：web。</p>
     *
     * <p>- `Imp`：小程序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    /**
     * <p>需要匹配的 SDK 版本，不传则匹配所有版本。</p>
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
     * <p>需要匹配的运营商名称，不传则匹配所有运营商。取值如下所示：</p>
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
     * <p>需要匹配的自定义维度项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraDims")
    private List<DescribeImageXUploadSegmentSpeedByTimeBodyExtraDimsItem> extraDims;

    /**
     * <p>拆分维度。默认为空，表示拆分分位数据。 支持取值：</p>
     *
     * <p>- `Duration`：表示分位数据</p>
     *
     * <p>- 公共维度：`Appid`、`OS`、`AppVer`、`SdkVer`、`Country`、`Province`、`Isp`</p>
     *
     * <p>- 自定义维度：您可以通过调用 [获取自定义维度列表](https://www.volcengine.com/docs/508/1213048)接口获取自定义维度指标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

    /**
     * <p>上传类型，固定值传入`2`，表示上传 2.0 数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UploadType")
    private Integer uploadType;

    /**
     * <p>获取数据起始时间点。</p>
     *
     * <p>日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点，需在起始时间点之后。</p>
     *
     * <p>日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>返回数据的时间粒度。取值如下所示：</p>
     *
     * <p>* `5m`： 5 分钟；</p>
     *
     * <p>* `1h`： 1 小时；</p>
     *
     * <p>* `1d`： 1 天；</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Granularity")
    private String granularity;

    /**
     * <p>取值为不等于的维度（默认为等于）。支持取值：</p>
     *
     * <p>- 公共维度：`AppVer`、`SdkVer`、`Country`、`Province`、`Isp`</p>
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
