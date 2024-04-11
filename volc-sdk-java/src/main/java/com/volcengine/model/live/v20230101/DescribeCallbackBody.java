package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCallbackBody
 */
@lombok.Data
public final class DescribeCallbackBody  {

    /**
     * <p>应用名称，缺省情况下表示查询全部。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流使用的推流域名，默认为空，表示查询所有当前域名空间（Vhost）下的在线流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>回调类型。默认为空，表示查询全部回调类型，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `push`：推流开始回调；</p>
     *
     * <p>- `push_end`：推流结束回调；</p>
     *
     * <p>- `snapshot`：截图回调；</p>
     *
     * <p>- `record`：录制回调；</p>
     *
     * <p>- `audit_snapshot`：截图审核回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageType")
    private String messageType;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
