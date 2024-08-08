package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailHostQuery
 */
@lombok.Data
public final class DetailHostQuery  {

    /**
     * <p>业务 ID。可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>云机 ID。可通过调用 [ListHost](https://www.volcengine.com/docs/6394/1221480) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
