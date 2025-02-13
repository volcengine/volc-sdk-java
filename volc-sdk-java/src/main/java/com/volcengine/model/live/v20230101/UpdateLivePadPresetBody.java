package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateLivePadPresetBody
 */
@lombok.Data
public final class UpdateLivePadPresetBody  {

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>模板描述，长度上限：1024字节。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>垫片类型，1: 图片、2: 视频、3: 源流最后一帧</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PadType")
    private Integer padType;

    /**
     * <p>断流等待时间。断流等待时间。 取值范围：0-6000。 单位：ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitDuration")
    private Long waitDuration;

    /**
     * <p>垫片时长。取值范围：>=1000。单位ms</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxDuration")
    private Long maxDuration;

    /**
     * <p>垫片素材地址。对 源流最后一帧类型无效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
