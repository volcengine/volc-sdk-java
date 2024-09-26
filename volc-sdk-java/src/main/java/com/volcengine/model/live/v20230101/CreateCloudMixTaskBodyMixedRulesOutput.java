package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateCloudMixTaskBodyMixedRulesOutput
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRulesOutput  {

    /**
     * <p>混流音频参数设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Audio")
    private CreateCloudMixTaskBodyMixedRulesOutputAudio audio;

    /**
     * <p>混流视频的推流地址，支持最多配置 8 个推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private List<String> url;

    /**
     * <p>混流视频参数设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Video")
    private CreateCloudMixTaskBodyMixedRulesOutputVideo video;

    /**
     * <p>任务状态回调地址配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private CreateCloudMixTaskBodyMixedRulesOutputCallback callback;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
