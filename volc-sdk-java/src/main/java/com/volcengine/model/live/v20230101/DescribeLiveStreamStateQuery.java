package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamStateQuery
 */
@lombok.Data
public final class DescribeLiveStreamStateQuery  {

    /**
     * <p>域名空间，即直播流地址的域名（`Domain`）所属的域名空间（`Vhost`）。您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>填写直播流使用的域名，默认为空，表示查询所有直推流和回源流的状态和类型。 您可以调用 [`ListDomainDetail`](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址的 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址的 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
