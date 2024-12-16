package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePlayURLBody
 */
@lombok.Data
public final class GeneratePlayURLBody  {

    /**
     * <p>拉流域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>转码流后缀，默认为空，表示生成源流的拉流地址。配置不为空时表示生成转码流的拉流地址，可通过调用 [ListVhostTransCodePreset](https://www.volcengine.com/docs/6469/1126853) 接口查询对应流的转码流后缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>CDN 类型，默认值为 `fcdn`，支持如下取值。</p>
     *
     * <p>- `fcdn`：火山引擎流媒体直播 CDN；</p>
     *
     * <p>- `3rd`：第三方 CDN。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>拉流地址的有效时长，单位为秒，超过有效时长后需要重新生成。缺省值为 `604800` 表示 7 天，取值范围为正整数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果同时设置 `ValidDuration` 和 `ExpiredTime`，以 `ExpiredTime` 的时间为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private Integer validDuration;

    /**
     * <p>拉流地址的过期时间，RFC3339 格式的 UTC 时间，精度为秒，过期后需要重新生成。缺省情况下表示当前时间往后的 7 天。</p>
     *
     * <p>:::tip</p>
     *
     * <p>如果同时设置 `ValidDuration` 和 `ExpiredTime`，以 `ExpiredTime` 的时间为准。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExpiredTime")
    private String expiredTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
