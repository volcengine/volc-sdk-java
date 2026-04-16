package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSpeechTaskBodyRuleSource
 */
@lombok.Data
public final class CreateSpeechTaskBodyRuleSource  {

    /**
     * <p>源流地址，即需要拉取的原始流地址。支持 RTMP 或 FLV 格式。</p>
     *
     * <p>可通过[地址生成器](https://console.volcengine.com/live/main/locationGenerate)生成拉流地址，并确保域名、`AppName` 和 `StreamName` 与原始直播流的推流地址一致。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 原始直播流的推流地址可从直播平台获取，也可通过[地址生成器](https://console.volcengine.com/live/main/locationGenerate)生成。</p>
     *
     * <p>- 地址中不可直接包含多字节编码字符（如中文字符）。如需包含，必须对这些字符进行 URL 编码（URL-encode）。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
