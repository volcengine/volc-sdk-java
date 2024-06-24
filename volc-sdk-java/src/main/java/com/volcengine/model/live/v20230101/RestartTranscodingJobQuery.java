package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RestartTranscodingJobQuery
 */
@lombok.Data
public final class RestartTranscodingJobQuery  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同，默认为空表示查询所有流名称。支持由大小写字母（A - Z、a - z）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>转码配置的后缀，需去除转码后缀前的下划线（`_`）。如您配置的转码后缀为`_hd`，此处应传入`hd`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodingTemplate")
    private String transcodingTemplate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
