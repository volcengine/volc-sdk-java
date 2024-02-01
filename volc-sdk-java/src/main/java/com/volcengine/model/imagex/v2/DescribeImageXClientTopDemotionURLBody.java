package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageXClientTopDemotionURLBody
 */
@lombok.Data
public final class DescribeImageXClientTopDemotionURLBody  {

    /**
     * <p>应用 ID。默认为空，不传则匹配账号下的所有的 App ID。您可以通过调用[获取应用列表](https://www.volcengine.com/docs/508/19511)的方式获取所需的 AppID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Appid")
    private String appid;

    /**
     * <p>需要匹配的系统类型，不传则匹配非 WEB 端的所有系统。取值如下所示：</p>
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
     * <p>降级类型。取值如下所示：</p>
     *
     *
     *
     * <p>- `heic`：HEIC 降级</p>
     *
     * <p>- `heif`：HEIF 降级</p>
     *
     * <p>- `avif`：AVIF 降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DemotionType")
    private String demotionType;

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
     * <p>查询 Top URL 条数，取值范围为[0,1000]，默认值为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Top")
    private Integer top;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
