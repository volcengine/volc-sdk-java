package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHTTPHeaderConfigBody
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名。默认为空，表示查询 Vhost 下的全部拉流域名的 HTTP Header 配置。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看待查询的拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>HTTP Header 的类型，支持的取值及含义如下所示。</p>
     *
     * <p>- `0`：请求响应头；</p>
     *
     * <p>- `1`：回源请求头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Phase")
    private Integer phase;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
