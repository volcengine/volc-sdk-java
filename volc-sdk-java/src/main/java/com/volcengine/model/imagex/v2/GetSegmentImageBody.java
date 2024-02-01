package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetSegmentImageBody
 */
@lombok.Data
public final class GetSegmentImageBody  {

    /**
     * <p>图片类型，支持可选择的模型如下。</p>
     *
     * <p>* general：通用模型v1</p>
     *
     * <p>* human：人脸模型v1</p>
     *
     * <p>* product：商品模型v1</p>
     *
     * <p>* humanv2：人脸模型v2</p>
     *
     * <p>* productv2：商品模型v2</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Class")
    private String myClass;

    /**
     * <p>处理效果，当`Class`取值为`humanv2`或`productv2`时，默认为`true`。</p>
     *
     * <p>* false：保留的图像主体边缘以粗线条处理，图像处理的效率更高。</p>
     *
     * <p>* true：保留的图像主体边缘以发丝级细线条处理，图像处理后的效果更好。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Refine")
    private Boolean refine;

    /**
     * <p>描边设置，仅当`Class`取值`humanv2`或`productv2`时有效。</p>
     *
     * <p>默认关闭，如果开启，抠出的结果图中保留的图像主体会外包一圈描边效果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Contour")
    private GetSegmentImageBodyContour contour;

    /**
     * <p>是否开启透明背景裁剪设置。默认false，关闭状态。如果开启，抠出的结果图会被裁剪到刚好包住保留的图像主体。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TransBg")
    private Boolean transBg;

    /**
     * <p>待擦除原图的存储 URI 和 URL（公网可访问的 URL）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>输出图片格式，取值如下所示：</p>
     *
     * <p>- png</p>
     *
     * <p>- jpeg</p>
     *
     * <p>- webp</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutFormat")
    private String outFormat;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
