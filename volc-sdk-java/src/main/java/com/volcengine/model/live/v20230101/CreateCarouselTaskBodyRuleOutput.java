package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateCarouselTaskBodyRuleOutput
 */
@lombok.Data
public final class CreateCarouselTaskBodyRuleOutput  {

    /**
     * <p>在转码模式（即 `Rule.Mode = 1`）下生效，可选择配置推流的视频参数。缺省情况下，所有参数（除 GOP 外）均按照第一个素材的设置进行轮播处理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Video")
    private CreateCarouselTaskBodyRuleOutputVideo video;

    /**
     * <p>在转码模式（即 `Rule.Mode = 1`）下生效，可用于配置推流的音频参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Audio")
    private CreateCarouselTaskBodyRuleOutputAudio audio;

    /**
     * <p>推流的 RTMP 或 RTMPS 地址，支持**多推**（即同时向多个推流地址推送相同的直播内容）。地址条数最少为 1 条，最多支持 8 条 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private List<String> url;

    /**
     * <p>回调函数配置，以便接收任务状态更新等通知。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private CreateCarouselTaskBodyRuleOutputCallback callback;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
