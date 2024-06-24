package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRefererBody
 */
@lombok.Data
public final class DeleteRefererBody  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取需要配置 Referer 的拉流域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取需要配置 Referer 的拉流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如创建时传了 `Domain`，删除时需要传该参数；</p>
     *
     * <p>- 如创建时未传 `Domain`，删除时不传该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示所有应用名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如创建时传了 `App`，删除时需要传该参数；</p>
     *
     * <p>- 如创建时未传 `App`，删除时不传该参数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
