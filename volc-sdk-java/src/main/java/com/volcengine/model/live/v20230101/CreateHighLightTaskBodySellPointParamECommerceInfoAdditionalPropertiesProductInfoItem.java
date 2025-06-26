package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalPropertiesProductInfoItem
 */
@lombok.Data
public final class CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalPropertiesProductInfoItem  {

    /**
     * <p>商家卖点信息，用于电商场景下标识商品的卖点描述。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Desc")
    private String desc;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
