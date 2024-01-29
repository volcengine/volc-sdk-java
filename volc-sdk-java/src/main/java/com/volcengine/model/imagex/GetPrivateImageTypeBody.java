package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetPrivateImageTypeBody
 */
@lombok.Data
public final class GetPrivateImageTypeBody  {

    /**
     * <p>原图的存储 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUri")
    private String imageUri;

    /**
     * <p>检测内容，默认为`all`，取值如下所示：</p>
     *
     * <p>- face：图片内人脸检测</p>
     *
     * <p>- cloth：图片内衣物检测</p>
     *
     * <p>- all：图片内人脸和衣物均检测</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    /**
     * <p>人脸置信度，取值范围为[0, 1], 默认值为 0.52，表示高于 0.52 即为有效检测。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ThresFace")
    private Double thresFace;

    /**
     * <p>衣物置信度，取值范围为[0, 1], 默认值为 0.8，表示高于 0.8 即为有效检测。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ThresCloth")
    private Double thresCloth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
