package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateSpeechTaskBodyRuleOutput
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleOutput  {

    /**
     * <p>转推地址，同传任务会将经过同传处理的新直播流推送到该地址。</p>
     *
     * <p>支持 RTMP 格式。最多支持传入 8 个转推地址。</p>
     *
     * <p>可从直播平台获取或通过[地址生成器](https://console.volcengine.com/live/main/locationGenerate)生成推流地址。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 如需拉取经过同传处理的新直播流，可通过[地址生成器](https://console.volcengine.com/live/main/locationGenerate)生成拉流地址，并确保域名、`AppName` 和 `StreamName` 与转推地址一致。</p>
     *
     * <p>- 地址中不可直接包含多字节编码字符（如中文字符）。如需包含，必须对这些字符进行 URL 编码（URL-encode）。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private List<String> url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
