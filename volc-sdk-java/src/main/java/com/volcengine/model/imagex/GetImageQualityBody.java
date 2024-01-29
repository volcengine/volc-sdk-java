package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageQualityBody
 */
@lombok.Data
public final class GetImageQualityBody  {

    /**
     * <p>图片存储 Uri 或访问 URL。</p>
     *
     * <p>* 图片 Uri 格式，例如：tos-example/7a7979974.jpeg</p>
     *
     * <p>* 图片 URL 格式，例如：https://example.org/tos-example/7a7979974.jpeg~tplv.png</p>
     *
     * <p>:::tip</p>
     *
     * <p>若传 URL，必须保证 URL 公网可访问。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    /**
     * <p>评估工具，默认选择全部。多个支持的评估工具用逗号隔开，当前支持以下工具：</p>
     *
     * <p>* nr_index</p>
     *
     * <p>* vqscore</p>
     *
     * <p>* advcolor</p>
     *
     * <p>* blockiness</p>
     *
     * <p>* noise</p>
     *
     * <p>* aesmod</p>
     *
     * <p>* blur</p>
     *
     * <p>* cg</p>
     *
     * <p>* contrast</p>
     *
     * <p>* texture</p>
     *
     * <p>* colorfulness</p>
     *
     * <p>* brightness</p>
     *
     * <p>* overexposure</p>
     *
     * <p>* hue</p>
     *
     * <p>* saturation</p>
     *
     * <p>:::tip</p>
     *
     * <p>nr_index 工具支持评估 contrast、brightness 等多个维度。您也可以单独指定各维度，获取指定维度估值。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VqType")
    private String vqType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
