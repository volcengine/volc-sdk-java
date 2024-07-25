package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * GetProductResourceResResult
 */
@lombok.Data
public final class GetProductResourceResResult  {

    /**
     * <p>业务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>账号 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    /**
     * <p>已订购存储总容量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyDataSize")
    private Integer applyDataSize;

    /**
     * <p>实例已使用存储容量，单位 GB。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UsedDataSize")
    private Integer usedDataSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
