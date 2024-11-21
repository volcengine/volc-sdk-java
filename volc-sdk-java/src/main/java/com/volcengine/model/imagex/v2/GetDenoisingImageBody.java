package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDenoisingImageBody
 */
@lombok.Data
public final class GetDenoisingImageBody  {

    /**
     * <p>待降噪的原图 URI。 若同时传入 StoreUri 和 ImageUrl，仅取值 StoreUri，ImageUrl 将会被忽略。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StoreUri")
    private String storeUri;

    /**
     * <p>公网可访问的待降噪的原图 URL。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageUrl")
    private String imageUrl;

    /**
     * <p>输出格式，支持格式有：png、jpeg、webp。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutFormat")
    private String outFormat;

    /**
     * <p>降噪强度，取值范围为[0,1]。取值为0时表示不降噪，取值越大降噪强度越大。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Intensity")
    private Double intensity;

    /**
     * <p>是否支持降级，即发生错误时返回原图地址。</p>
     *
     * <p>传入 StoreUri 则返回 StoreUri，传入 ImageUrl 则返回 ImageUrl。</p>
     *
     * <p>取值如下所示：</p>
     *
     *
     *
     * <p>- true：支持降级</p>
     *
     * <p>- false：不支持降级</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CanDemotion")
    private Boolean canDemotion;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
