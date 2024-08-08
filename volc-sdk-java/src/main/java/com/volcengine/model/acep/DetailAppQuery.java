package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailAppQuery
 */
@lombok.Data
public final class DetailAppQuery  {

    /**
     * <p>业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>应用 ID，可通过调用 [ListApp](https://www.volcengine.com/docs/6394/1226894) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
