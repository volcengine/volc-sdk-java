package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXSensibleTopRamURLBody
 */
@lombok.Data
public final class DescribeImageXSensibleTopRamURLBody  {

    /**
     * <p>应用 ID。默认为空，缺省情况下匹配账号下的所有的 App ID。您可以通过调用[GetImageXQueryApps](https://www.volcengine.com/docs/508/1213042)的方式获取所需的 AppID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Appid")
    private String appid;

    /**
     * <p>需要匹配的系统类型，缺省情况下匹配非 WEB 端的所有系统。取值如下所示：</p>
     *
     *
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
     * <p>需要匹配 App 版本，缺省情况下则匹配 App 的所有版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppVer")
    private List<String> appVer;

    /**
     * <p>需要匹配的 SDK 版本，缺省情况下匹配所有版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SdkVer")
    private List<String> sdkVer;

    /**
     * <p>需要匹配的图片类型，缺省情况下则匹配所有图片类型。支持以下取值：</p>
     *
     *
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
     * <p>- `AVIF`</p>
     *
     * <p>- `AVIS`</p>
     *
     * <p>- `其他`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageType")
    private List<String> imageType;

    /**
     * <p>需要匹配的自定义维度项</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraDims")
    private List<DescribeImageXSensibleTopRamURLBodyExtraDimsItem> extraDims;

    /**
     * <p>获取数据起始时间点。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>获取数据结束时间点，需在起始时间点之后。日期格式按照`ISO8601`表示法，格式为：`YYYY-MM-DDThh:mm:ss±hh:mm`，比如`2019-06-02T00:00:00+08:00`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>查询 Top URL 条数，取值范围为(0,1000]。缺省情况下默认为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Top")
    private Integer top;

    /**
     * <p>支持以下取值：</p>
     *
     * <p>- `1`：按上报次数降序排序；</p>
     *
     * <p>- `2`：按内存大小降序排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OrderByIdx")
    private Integer orderByIdx;

    /**
     * <p>取值为不等于的维度（默认为等于）。支持取值：</p>
     *
     * <p>- 公共维度：`AppVer`、`SdkVer`、`ImageType`</p>
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
