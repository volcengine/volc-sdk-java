package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateCloudMixTaskBodyMixedRulesOutput
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRulesOutput  {

    /**
     * <p>混流声音参数设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Audio")
    private UpdateCloudMixTaskBodyMixedRulesOutputAudio audio;

    /**
     * <p>混流视频的推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private List<String> url;

    /**
     * <p>混流画面参数设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Video")
    private UpdateCloudMixTaskBodyMixedRulesOutputVideo video;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
