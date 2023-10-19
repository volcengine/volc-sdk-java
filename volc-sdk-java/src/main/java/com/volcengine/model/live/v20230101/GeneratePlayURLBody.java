package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePlayURLBody
 */
@lombok.Data
public final class GeneratePlayURLBody  {

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，默认为所有应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>转码流后缀，不传默认为空，可通过调用 [ListVhostTransCodePreset](https://www.volcengine.com/docs/6469/1126853) 接口查询。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Suffix")
    private String suffix;

    /**
     * <p>CDN 类型，默认值为 fcdn，支持如下取值。</p>
     *
     * <p>- fcdn：火山引擎流媒体直播 CDN；</p>
     *
     * <p>- 3rd：第三方 CDN。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>有效时长，拉流地址的有效时间，过期后需要重新生成。单位为秒，取值 ﹥0，缺省情况下表示 7 天。</p>
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
     * <p>过期时间，拉流地址的有效时间，过期后需要重新生成。RFC3339 格式的 UTC 时间，精度为秒，缺省情况下表示 7 天。</p>
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
