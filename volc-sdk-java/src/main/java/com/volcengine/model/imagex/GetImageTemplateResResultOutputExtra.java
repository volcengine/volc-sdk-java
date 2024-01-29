package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTemplateResResultOutputExtra
 */
@lombok.Data
public final class GetImageTemplateResResultOutputExtra  {

    /**
     * <p>是否压缩颜色空间,取值为"true" / "false"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "png.use_quant")
    private String pngUseQuant;

    /**
     * <p>是否采用jpeg渐进编码格式,取值为"true" / "false"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "jpeg.progressive")
    private String jpegProgressive;

    /**
     * <p>heic格式是否开启ROI编码"true"/"false"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.roi")
    private String heicRoi;

    /**
     * <p>heic位深，"8"/"10"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.encode.depth")
    private String heicEncodeDepth;

    /**
     * <p>heic缩略图比例</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.thumb.ratio")
    private String heicThumbRatio;

    /**
     * <p>是否带透明通道编码，"false"/"true"</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "heic.alpha.reserve")
    private String heicAlphaReserve;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
