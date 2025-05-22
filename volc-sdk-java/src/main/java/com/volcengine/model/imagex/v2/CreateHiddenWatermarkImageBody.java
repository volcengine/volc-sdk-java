package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateHiddenWatermarkImageBody
 */
@lombok.Data
public final class CreateHiddenWatermarkImageBody  {

    /**
     * <p>盲水印模型，取值如下所示：</p>
     *
     * <p>- `tracev1`：前景图层水印模型（纯色背景适用）。</p>
     *
     * <p>	</p>
     *
     * <p>	该模型可以生成带有水印的透明图像，但仅适用于**纯色**网页泄露溯源场景。该模型可有效抵抗常见的社交软件传播。然而，该算法对页面背景色的影响相对较大，因此不适合用于保护多彩页面或图片，例如商品页面。</p>
     *
     * <p>	</p>
     *
     * <p>- `tracev2`：前景图层水印模型（彩色背景通用）</p>
     *
     *
     *
     * <p>	该模型可以生成含水印的透明图像，主要应用在前端页面截图泄露溯源场景。该模型生成的水印纹理密集，在正常界面添加后肉眼基本不可见（截图放大后存在肉眼可见的水印纹理），可抵抗常见的社交软件传播。	</p>
     *
     *
     *
     * <p>	:::tip</p>
     *
     * <p>	此模型建议在 PC 端使用，移动端使用视觉效果较差。</p>
     *
     * <p>	:::</p>
     *
     *
     *
     * <p>- `tracev2-app`：前景图层水印模型（移动端）</p>
     *
     *
     *
     * <p>	该模型可以生成含水印的透明图像，主要应用在前端页面截图泄露溯源场景。该模型生成的水印纹理密集，在正常界面添加后肉眼基本不可见（截图放大后存在肉眼可见的水印纹理），可抵抗常见的社交软件传播。	</p>
     *
     *
     *
     * <p>	:::tip</p>
     *
     * <p>	此模型建议在移动端使用，PC 端使用视觉效果较差。</p>
     *
     * <p>	:::</p>
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
     * <p>自定义盲水印文本信息，最多支持 128 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Info")
    private String info;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
