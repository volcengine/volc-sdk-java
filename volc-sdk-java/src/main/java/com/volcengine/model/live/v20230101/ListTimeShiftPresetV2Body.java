package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListTimeShiftPresetV2Body
 */
@lombok.Data
public final class ListTimeShiftPresetV2Body  {

    /**
     * <p>时移类型。默认类型为 VoD。</p>
     *
     * <p>- vod：点播时移，获取 vod 类型的时移模板配置信息；</p>
     *
     * <p>- tos：直播时移，获取 tos 以及 fcdn-tos 类型的时移模板配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
