package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * ListResourceQuotaQuery
 */
@lombok.Data
public final class ListResourceQuotaQuery  {

    /**
     * <p>业务 ID，可在「云手机控制台-业务管理-业务详情」中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
