package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmEmbedBody
 */
@lombok.Data
public final class CreateImageHmEmbedBody  {

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
     * <p>待添加盲水印的原图 Uri。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>算法模型，取值如下所示：</p>
     *
     * <p>* default：文本嵌入模型，默认文本嵌入模型；</p>
     *
     * <p>* adapt_resize：画质自适应文本嵌入模型。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    /**
     * <p>自定义盲水印文本内容。</p>
     *
     * <p>* 文本嵌入模型支持最长可嵌入115个水印内容字符。</p>
     *
     * <p>* 画质自适应文本嵌入模型无水印内容长度限制。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Info")
    private String info;

    /**
     * <p>输出图片格式，默认 png，支持图片格式有：png、jpeg、webp。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutFormat")
    private String outFormat;

    /**
     * <p>输出图片质量参数。取值范围为 [1,100]，默认为 75。</p>
     *
     * <p>对于 PNG 无损压缩，其他格式下其值越小，压缩率越高，画质越差。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutQuality")
    private Integer outQuality;

    /**
     * <p>算法强度，强度越高，图像抵抗攻击性能越强。<br>取值如下所示：</p>
     *
     * <p>* low：低强度，适用于纯色图场景以及对图像质量要求高；</p>
     *
     * <p>* medium：中强度，默认中强度；</p>
     *
     * <p>* strong：高强度，适合图像纹理丰富时使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StrengthLevel")
    private String strengthLevel;

    /**
     * <p>待添加盲水印的可公网访问原图 Url。当 StoreUri 和 ImageUrl 均不为空，以 StoreUri 取值为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
