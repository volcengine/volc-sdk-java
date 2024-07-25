package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailDisplayLayoutMiniQuery
 */
@lombok.Data
public final class DetailDisplayLayoutMiniQuery  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>屏幕布局 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisplayLayoutId")
    private String displayLayoutId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
