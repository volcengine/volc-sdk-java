package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GeneratePushURLBody
 */
@lombok.Data
public final class GeneratePushURLBody  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名名称，需要推流地址的域名，不填返回Vhost下所有推流域名生成的地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>有效时长，推流地址的有效时间，过期后需要重新生成。单位为秒，取值 ﹥0，缺省情况下表示 7 天。</p>
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
     * <p>过期时间，推流地址的有效时间，过期后需要重新生成。RFC3339 格式的 UTC 时间，精度为秒，缺省情况下表示 7 天。</p>
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
