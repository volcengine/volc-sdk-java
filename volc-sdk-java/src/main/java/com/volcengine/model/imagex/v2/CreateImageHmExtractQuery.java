package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmExtractQuery
 */
@lombok.Data
public final class CreateImageHmExtractQuery  {

    /**
     * <p>待提取水印图对应的服务 ID。</p>
     *
     *
     *
     * <p>- 您可以在 veImageX 控制台 [服务管理](https://console.volcengine.com/imagex/service_manage/)页面，在创建好的图片服务中获取服务 ID。</p>
     *
     * <p>- 您也可以通过 OpenAPI 的方式获取服务 ID，具体请参考[获取所有服务信息](https://www.volcengine.com/docs/508/9360)。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    /**
     * <p>待提取盲水印的图片的 URI。`StoreUri` 和 `ImageUrl` 都不为空时，以 `StoreUri` 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>待提取盲水印图片的 URL。`StoreUri` 和 `ImageUrl` 都不为空时，以 `StoreUri` 为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    /**
     * <p>算法模型，取值如下所示：</p>
     *
     *
     *
     * <p>- `default`：文本嵌入基础模型</p>
     *
     * <p>- `adapt_resize`：画质自适应文本嵌入模型。</p>
     *
     * <p>- `adapt`: 文本嵌入自适应模型（AIGC 适用）</p>
     *
     * <p>- `natural`：文本嵌入基础模型（彩色图片通用）</p>
     *
     * <p>- `tracev1`：前景图层水印模型（纯色背景适用）</p>
     *
     * <p>- `tracev2`：前景图层水印模型（彩色背景通用）</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>指定 `tracev1` 或 `tracev2` 模型时，请传入已添加对应模型水印的背景网页的**截图**。若模型错误，则无法提取水印。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
