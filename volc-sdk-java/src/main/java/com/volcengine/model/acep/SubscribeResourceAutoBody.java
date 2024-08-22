package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * SubscribeResourceAutoBody
 */
@lombok.Data
public final class SubscribeResourceAutoBody  {

    /**
     * <p>业务 ID。您可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>订购配置单列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreOrderList")
    private List<com.volcengine.model.acep.v20231030.RequestPreOrder> preOrderList;

    /**
     * <p>是否开启自动续费。取值如下：</p>
     *
     *
     *
     * <p>- `true`：开启自动续费。</p>
     *
     * <p>- `false`：（默认）不开启自动续费。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoRenew")
    private Boolean autoRenew;

    /**
     * <p>订购请求的唯一标识。您可根据自身业务需求，自定义设置订购请求的唯一标识。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>防止由于网络等原因造成重复请求，同一 `RoundId` 在 1 天内只可使用一次。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RoundId")
    private String roundId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
