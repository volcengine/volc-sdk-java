package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySellPointParam
 */
@lombok.Data
public final class CreateHighLightTaskBodySellPointParam  {

    /**
     * <p>电商场景下使用的卖点效果配置，为 JSON Map 格式。</p>
     *
     * <p>- Key：输入视频的链接或索引</p>
     *
     * <p>- Value：对应视频的商家卖点信息 `ProductInfo`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ECommerceInfo")
    private CreateHighLightTaskBodySellPointParamECommerceInfo eCommerceInfo;

    /**
     * <p>使用的卖点效果模版，当前仅支持 `default`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EffectType")
    private String effectType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
