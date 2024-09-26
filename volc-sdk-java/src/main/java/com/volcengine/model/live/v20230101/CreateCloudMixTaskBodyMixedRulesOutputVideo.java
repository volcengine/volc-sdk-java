package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCloudMixTaskBodyMixedRulesOutputVideo
 */
@lombok.Data
public final class CreateCloudMixTaskBodyMixedRulesOutputVideo  {

    /**
     * <p>混流输出视频码率，单位为 bps，取值范围为 [1000000,20000000]，输入值小于或大于取值范围时会进行自动修正至最小值和最大值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BitRate")
    private Integer bitRate;

    /**
     * <p>混流输出视频帧率，单位为 fps，取值范围为 [10,60]，输入值小于或大于取值范围时会进行自动修正至最小值和最大值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameRate")
    private Integer frameRate;

    /**
     * <p>IDR 帧之间的最大间隔时间，单位为秒，取值范围为 [1,10]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>混流输出视频编码格式，支持的取值及含义如下所示。</p>
     *
     * <p>- `h264`：使用 H.264 编码格式；</p>
     *
     * <p>- `h265`：使用 H.265 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Codec")
    private String codec;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
