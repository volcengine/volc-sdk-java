package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRelaySourceV3Body
 */
@lombok.Data
public final class DescribeRelaySourceV3Body  {

    /**
     * <p>直播流使用的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，即直播流地址的 `AppName` 字段取值，默认为空，表示查询当前域名空间下所有播放触发回源配置。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回源组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
