package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListTimeShiftPresetV2Body
 */
@lombok.Data
public final class ListTimeShiftPresetV2Body  {

    /**
     * <p>时移类型，默认类型为 `vod`。</p>
     *
     * <p>- `vod`：点播时移，表示查询时移录制存储在 VOD 中的时移配置；</p>
     *
     * <p>- `tos`：直播时移，表示查询时移录制存储在 TOS 以及 fcdn-tos 中的时移配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要时移的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
