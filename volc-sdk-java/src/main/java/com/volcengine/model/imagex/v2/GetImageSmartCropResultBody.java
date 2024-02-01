package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSmartCropResultBody
 */
@lombok.Data
public final class GetImageSmartCropResultBody  {

    /**
     * <p>服务 ID。</p>
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待处理原图的存储 URI 和 URL（公网可访问的 URL）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>降级策略，即当智能裁剪失败时的操作，默认居中裁剪。<br>支持取值如下：</p>
     *
     * <p>* center：居中裁剪，默认裁剪中间图片；</p>
     *
     * <p>* top：居上裁剪，默认裁剪上方图片；</p>
     *
     * <p>* fglass：高斯模糊，将按设置宽高自动适配图片，结果图多出原图部分以原图背景高斯模糊效果填充。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Policy")
    private String policy;

    /**
     * <p>裁剪场景 (normal,cartoon)，默认普通人脸裁剪。支持取值如下：</p>
     *
     * <p>* normal：普通人脸裁剪；</p>
     *
     * <p>* cartoon：动漫人脸裁剪。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当前仅支持了智能人脸裁剪能力，其他裁剪能力在持续开放中，敬请期待。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Scene")
    private String scene;

    /**
     * <p>当`Policy`取值为`fglass`时的高斯模糊参数，取值为大于 0 的整数，值越大越模糊。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Sigma")
    private Double sigma;

    /**
     * <p>图片裁剪后的宽度设置，单位为 px。当图片小于设置的宽高时，将不被裁剪。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>图片裁剪后的高度设置，单位为 px。当图片小于设置的宽高时，将不被裁剪。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
