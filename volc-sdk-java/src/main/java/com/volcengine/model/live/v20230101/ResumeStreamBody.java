package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ResumeStreamBody
 */
@lombok.Data
public final class ResumeStreamBody  {

    /**
     * <p>域名空间。您可以调用 [DescribeForbiddenStreamInfoByPage](https://www.volcengine.com/docs/6469/1126843) 接口，查看禁推直播流的信息，包括 `Vhost`、`Domain`、`App` 和 `Stream`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播流使用的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>直播流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
