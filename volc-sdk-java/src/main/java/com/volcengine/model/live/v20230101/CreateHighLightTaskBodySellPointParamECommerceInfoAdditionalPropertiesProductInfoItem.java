package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalPropertiesProductInfoItem
 */
@lombok.Data
public final class CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalPropertiesProductInfoItem  {

    /**
     * <p>商品简述，用于辅助生成卖点信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
