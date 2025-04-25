package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskBodyRuleOutputVideo
 */
@lombok.Data
public final class CreateCarouselTaskBodyRuleOutputVideo  {

    /**
     * <p>视频的码率，单位为 `bit`，取值必须小于或等于 `20`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BitRate")
    private Integer bitRate;

    /**
     * <p>视频帧率，取值范围为 `[10, 60]`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameRate")
    private Integer frameRate;

    /**
     * <p>IDR 帧之间的最大间隔，单位为秒，默认值为 `2`，取值范围为 `[1,10]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>视频宽度，单位为像素。支持的取值范围为 `[10, 2160]`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>视频的高度（单位：像素），取值范围为 `[10, 2160]`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
