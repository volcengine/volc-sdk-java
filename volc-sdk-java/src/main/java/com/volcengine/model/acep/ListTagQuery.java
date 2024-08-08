package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListTagQuery
 */
@lombok.Data
public final class ListTagQuery  {

    /**
     * <p>业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>筛选条件，标签名称，精确搜索。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagName")
    private String tagName;

    /**
     * <p>筛选条件，标签名称，模糊搜索。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagNameFuzzy")
    private String tagNameFuzzy;

    /**
     * <p>分页偏移量，默认为 0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Long offset;

    /**
     * <p>分页大小，默认值为 10，最大值为 100。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Long count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
