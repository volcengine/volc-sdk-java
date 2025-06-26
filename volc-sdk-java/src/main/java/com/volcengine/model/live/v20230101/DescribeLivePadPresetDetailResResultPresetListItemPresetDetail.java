package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadPresetDetailResResultPresetListItemPresetDetail
 */
@lombok.Data
public final class DescribeLivePadPresetDetailResResultPresetListItemPresetDetail  {

    /**
     * <p>垫片类型，取值如下所示。</p>
     *
     * <p>- `1`：图片；</p>
     *
     * <p>- `2`：视频；</p>
     *
     * <p>- `3`：源流最后一帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PadType")
    private Integer padType;

    /**
     * <p>等待持续时间，单位为毫秒。表示在触发垫片播放前需要等待的时间长度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitDuration")
    private Long waitDuration;

    /**
     * <p>最大持续时间，单位为毫秒。表示垫片播放的最长时间限制。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxDuration")
    private Long maxDuration;

    /**
     * <p>垫片素材的公网可访问地址。确保提供的地址能够被公网正常访问，以便正确加载垫片素材内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>垫片模板的描述信息，用于说明该垫片模板的具体用途或特性。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>模版名称，用于标识特定的垫片模板配置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
