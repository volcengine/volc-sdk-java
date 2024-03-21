package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXExceedResolutionRatioAllBody
 */
@lombok.Data
public final class DescribeImageXExceedResolutionRatioAllBody  {

    /**
     * <p>应用 ID。默认为空，不传则匹配账号下的所有的 App ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppID。</p>
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
    private List<DescribeImageXExceedResolutionRatioAllBodyExtraDimsItem> extraDims;

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
     * <p>- 不传或者传空或者取值为`Count`时，表示按上报量排序。</p>
     *
     * <p>- 取值为`WidthRatio`时，表示按宽比排序。</p>
     *
     * <p>- 取值为`HeightRatio`时，表示按高比排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OrderBy")
    private String orderBy;

    /**
     * <p>是否升序排序。不传则默认降序排序。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OrderAsc")
    private String orderAsc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
