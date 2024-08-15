package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullRecordTaskBody
 */
@lombok.Data
public final class CreatePullRecordTaskBody  {

    /**
     * <p>域名空间。您可以调用 [ListVhostRecordPresetV2](https://www.volcengine.com/docs/6469/1126858) 接口查看待使用的录制配置的 `Vhost` 取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播流使用的推流域名或拉流域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，即直播流地址的 `AppName` 字段取值，支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，即直播流地址的 `StreamName` 字段取值，支持由大小写字母（A - Z、a - z）、数字（0 - 9）、字母、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>待录制直播流的拉流地址。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当前仅支持 FLV 格式的拉流地址。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamURL")
    private String streamURL;

    /**
     * <p>指定录制任务的开始时间，RFC3339 格式的时间戳，精度为秒。默认为空，表示立即开始。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>指定录制任务的结束时间，RFC3339 格式的时间戳，精度为秒，默认为空，表示录制到直播流结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
