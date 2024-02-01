package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplateBodyOutputExtra
 */
@lombok.Data
public final class CreateImageTemplateBodyOutputExtra  {

    /**
     * <p>是否压缩颜色空间，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "png.use_quant")
    private String pngUseQuant;

    /**
     * <p>是否采用 jpeg 渐进编码格式，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "jpeg.progressive")
    private String jpegProgressive;

    /**
     * <p>仅当OutputFormat取值为heic时配置有效</p>
     *
     * <p>是否开启 ROI 编码，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.roi")
    private String heicRoi;

    /**
     * <p>仅当OutputFormat取值为heic时配置有效</p>
     *
     * <p>色位深度，值越大则提供的图像色彩范围越多，使图像颜色变化的更细腻，但图像体积也会增大。取值如下所示：</p>
     *
     *
     *
     * <p>- `8`：8bit</p>
     *
     * <p>- `10`：10bit</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.encode.depth")
    private String heicEncodeDepth;

    /**
     * <p>仅当OutputFormat取值为heic时配置有效</p>
     *
     * <p>缩略图比例。在原图基础上，编码缩小一定倍数的小分辨率图片，跟大图一起封装在同一张图片中，缩小倍数不建议过大，一般为 5~10 之间相对合理。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.thumb.ratio")
    private String heicThumbRatio;

    /**
     * <p>仅当OutputFormat取值为heic时配置有效</p>
     *
     * <p>是否带透明通道编码，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.alpha.reserve")
    private String heicAlphaReserve;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
