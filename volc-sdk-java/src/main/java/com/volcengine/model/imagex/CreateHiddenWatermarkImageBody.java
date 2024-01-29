package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateHiddenWatermarkImageBody
 */
@lombok.Data
public final class CreateHiddenWatermarkImageBody  {

    /**
     * <p>获取盲水印图的算法模型，仅支持取值 `tracev1`。该模型可以生成带有水印的透明图像，但仅适用于纯色网页泄露溯源场景。该模型可有效抵抗常见的社交软件传播。然而，该算法对页面背景色的影响相对较大，因此不适合用于保护多彩页面或图片，例如商品页面。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    /**
     * <p>盲水印强度，取值如下所示：</p>
     *
     * <p>- `low`：低强度，适用于对图像质量要求高。</p>
     *
     * <p>- `medium`：中强度</p>
     *
     * <p>- `strong`：高强度，适合图像纹理丰富时使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Strength")
    private String strength;

    /**
     * <p>自定义盲水印文本信息。最大支持 128 个字符，若全部是中文则不超过 42 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Info")
    private String info;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
