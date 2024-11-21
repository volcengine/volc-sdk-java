package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeImageXHeifEncodeFileInSizeByTimeBody
 */
@lombok.Data
public final class DescribeImageXHeifEncodeFileInSizeByTimeBody  {

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
     * <p>需要匹配的系统类型，不传则匹配所有系统。取值如下所示：</p>
     *
     * <p>- `iOS`</p>
     *
     * <p>- `Android`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OS")
    private String oS;

    /**
     * <p>需要匹配的图片类型，不传则匹配所有图片类型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageType")
    private List<String> imageType;

    /**
     * <p>需要匹配的自定义维度项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExtraDims")
    private List<DescribeImageXHeifEncodeFileInSizeByTimeBodyExtraDimsItem> extraDims;

    /**
     * <p>拆分维度。默认为空，标识不拆分。支持取值：</p>
     *
     * <p>- `Duration`：表示拆分分位数据</p>
     *
     * <p>- 公共维度：`Appid`、`OS`、`AppVer`、`SdkVer`、`ImageType`、`ImageResolution`</p>
     *
     * <p>- 自定义维度：您可以通过调用 [获取自定义维度列表](https://www.volcengine.com/docs/508/1213048)接口获取自定义维度指标。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupBy")
    private String groupBy;

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
     * <p>需要匹配的 SDK 版本，不传则匹配所有版本。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SdkVer")
    private List<String> sdkVer;

    /**
     * <p>需要匹配的图片分辨率，不传则匹配所有图片分辨率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageResolution")
    private List<String> imageResolution;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
