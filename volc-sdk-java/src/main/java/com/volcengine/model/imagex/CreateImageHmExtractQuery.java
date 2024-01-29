package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmExtractQuery
 */
@lombok.Data
public final class CreateImageHmExtractQuery  {

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
     * <p>待提取盲水印的图片 Uri，StoreUri 和 ImageUrl 都不为空时，以 StoreUri 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>算法模型，取值如下所示：</p>
     *
     * <p>* `default`：文本嵌入模型，默认文本嵌入模型；</p>
     *
     * <p>* `adapt_resize`：画质自适应文本嵌入模型。</p>
     *
     * <p>* `adapt`: 画质自适应文本嵌入模型。</p>
     *
     * <p>* `tracev1`：获取暗水印前、背景图。</p>
     *
     * <p>* `natural`: 适用于自然色彩的图片</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    /**
     * <p>待提取盲水印文件 URL，StoreUri 和 ImageUrl 都不为空时，以 StoreUri 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
