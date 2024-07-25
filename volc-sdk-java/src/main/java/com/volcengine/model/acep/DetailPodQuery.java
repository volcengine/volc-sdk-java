package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

/**
 * DetailPodQuery
 */
@lombok.Data
public final class DetailPodQuery  {

    /**
     * <p>实例所归属的业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID，可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodId")
    private String podId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
