package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListDisplayLayoutMiniQuery
 */
@lombok.Data
public final class ListDisplayLayoutMiniQuery  {

    /**
     * <p>业务 ID，可在**云手机控制台 > 业务信息**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>筛选条件，屏幕布局 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    /**
     * <p>分页偏移量，默认值为 0。</p>
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
