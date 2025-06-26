package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateLivePadPresetBody
 */
@lombok.Data
public final class UpdateLivePadPresetBody  {

    /**
     * <p>待更新的垫片模板名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>垫片模板的描述信息，用于详细说明该模板的用途或特性，最大长度为 `1024` 字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>垫片类型，取值及含义如下所示。</p>
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
     * <p>断流等待时间，即直播断流后等待播放垫片的时长，单位为毫秒，取值范围为 `[0,6000]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitDuration")
    private Long waitDuration;

    /**
     * <p>垫片最大播放时长，单位为毫秒，取值范围为 `[1000,1000000000]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxDuration")
    private Long maxDuration;

    /**
     * <p>垫片素材的地址，用于指定垫片播放时使用的图片或视频资源。</p>
     *
     * <p>- 当  `PadType = 1`（图片）或 `PadType =2`（视频）时**有效**；</p>
     *
     * <p>- 当 `PadType = 3`（源流最后一帧）**无效**。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
