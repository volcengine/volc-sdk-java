package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskBodyMixedRulesInputLayoutSceneLayoutItem
 */
@lombok.Data
public final class UpdateCloudMixTaskBodyMixedRulesInputLayoutSceneLayoutItem  {

    /**
     * <p>当前素材或 Logo 图片在输出画面中相对画面左上角的 X 偏移位置，单位为 px，取值范围为 0 到设置的画面宽度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "X")
    private Integer x;

    /**
     * <p>当前素材或 Logo 图片在输出画面中相对画面左上角的 Y 偏移位置，单位为 px，取值范围为 0 到设置的画面高度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Y")
    private Integer y;

    /**
     * <p>当前素材或 Logo 图片在混流输出画面中的限制宽度，单位为 px，取值范围为 [10,2160]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "W")
    private Integer w;

    /**
     * <p>当前素材或 Logo 图片在混流输出画面中的限制高度，单位为 px，取值范围为 [10,2160]。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>限制宽度和限制高度指定了素材展示的限制范围，当素材尺寸和限制值不一致时，素材将在限制范围内根据长边进行等比缩放，其余区域透明展示。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "H")
    private Integer h;

    /**
     * <p>当配置素材布局时需要通过 Layer 参数与素材进行一一对应。</p>
     *
     * <p>:::tip</p>
     *
     * <p>配置 Logo 图片的布局时此参数不生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Layer")
    private Integer layer;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
