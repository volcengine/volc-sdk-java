package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyVodParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyVodParam  {

    /**
     * <p>视频点播（VOD）空间名称。可登录[视频点播控制台](https://console.volcengine.com/vod/)查询。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Space")
    private String space;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
