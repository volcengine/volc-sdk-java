package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetV2Body
 */
@lombok.Data
public final class ListVhostRecordPresetV2Body  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>直播录制的存储类型。默认值为 tos，支持以下取值。</p>
     *
     * <p>- vod：录制文件存在 VOD；</p>
     *
     * <p>- tos：录制文件存在 TOS。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
