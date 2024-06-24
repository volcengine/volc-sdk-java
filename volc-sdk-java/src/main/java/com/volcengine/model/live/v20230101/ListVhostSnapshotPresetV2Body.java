package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2Body
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2Body  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>截图配置中截图文件的存储位置，缺省情况下表示不对存储位置进行过滤，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `tos`：TOS 对象存储服务；</p>
     *
     * <p>- `imageX`：veImageX 图片服务。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
