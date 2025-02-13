package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadPresetDetailResResultPresetListItemPresetDetail
 */
@lombok.Data
public final class DescribeLivePadPresetDetailResResultPresetListItemPresetDetail  {

    /**
     * <p>垫片类型，1: 图片、2: 视频、3: 源流最后一帧</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PadType")
    private Integer padType;

    /**
     * <p>等待持续时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WaitDuration")
    private Long waitDuration;

    /**
     * <p>最大持续时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxDuration")
    private Long maxDuration;

    /**
     * <p>垫片内容URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Url")
    private String url;

    /**
     * <p>描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>预设名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
