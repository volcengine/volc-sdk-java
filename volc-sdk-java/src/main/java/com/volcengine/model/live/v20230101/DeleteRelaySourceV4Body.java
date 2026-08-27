package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRelaySourceV4Body
 */
@lombok.Data
public final class DeleteRelaySourceV4Body  {

    /**
     * <p>域名空间。</p>
     *
     * <p>通过以下任一方式，获取域名空间：</p>
     *
     *
     *
     * <p>- 调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口，通过返回参数 `Vhost` 获取。</p>
     *
     * <p>- 在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，通过**域名空间**字段获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>视频直播播放地址中的 `AppName`。您可调用 [ListRelaySourceV4](https://docs.volcengine.com/docs/6469/1126878?lang=zh) 并根据返回参数 `App` 获取固定触发回源配置的 `AppName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>视频直播播放地址中的 `StreamName`。您可调用 [ListRelaySourceV4](https://docs.volcengine.com/docs/6469/1126878?lang=zh) 并根据返回参数 `Stream` 获取固定触发回源配置的 `StreamName`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
