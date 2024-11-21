package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetProductAIGCResultBodySellingPointConfigSellingPointExtractConfigItem
 */
@lombok.Data
public final class GetProductAIGCResultBodySellingPointConfigSellingPointExtractConfigItem  {

    /**
     * <p>选择需要提取的卖点类型、取值：core_sp（核心卖点提取）, short_title(短标题), product_desc_sp(商品信息类卖点)，product_promotion_sp(导购激发类卖点)</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    /**
     * <p>卖点渲染图层索引列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UniqueIds")
    private List<String> uniqueIds;

    /**
     * <p>卖点信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
