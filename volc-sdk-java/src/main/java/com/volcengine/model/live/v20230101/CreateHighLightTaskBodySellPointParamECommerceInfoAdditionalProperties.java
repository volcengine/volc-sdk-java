package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalProperties
 */
@lombok.Data
public final class CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalProperties  {

    /**
     * <p>商品简述，用于辅助生成卖点信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductInfo")
    private List<CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalPropertiesProductInfoItem> productInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
