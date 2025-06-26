package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * CreateHighLightTaskBodySellPointParamECommerceInfo
 */
@lombok.Data
public final class CreateHighLightTaskBodySellPointParamECommerceInfo  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Field124")
    private String field124;

    /**
     * <p>对应输入视频的商家卖点信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdditionalProperties")
    private Map<String, CreateHighLightTaskBodySellPointParamECommerceInfoAdditionalProperties> additionalProperties;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
