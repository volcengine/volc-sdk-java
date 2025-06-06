package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXCdnErrorCodeAllBody
 */
@lombok.Data
public final class DescribeImageXCdnErrorCodeAllBody  {

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
     * <p>需要匹配的域名，不传则匹配所有域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private List<String> domain;

    /**
     * <p>需要匹配的图片类型，不传则匹配所有图片类型。取值如下所示：</p>
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
    private List<DescribeImageXCdnErrorCodeAllBodyExtraDimsItem> extraDims;

    /**
     * <p>聚合维度。取值如下所示：</p>
     *
     * <p>* `Domain`：域名；</p>
     *
     * <p>* `ErrorCode`：错误码；</p>
     *
     * <p>* `Region`：地区；</p>
     *
     * <p>* `Isp`：运营商。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

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
     * <p>目前仅支持传入`Count`按错误码数量排序。不传或者传空默认按错误码数量排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OrderBy")
    private String orderBy;

    /**
     * <p>是否升序排序。取值如下所示：</p>
     *
     * <p>- `true`：是，表示升序排序。</p>
     *
     * <p>- `false`：（默认）否，表示降序排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OrderAsc")
    private Boolean orderAsc;

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
