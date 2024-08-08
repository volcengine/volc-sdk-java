package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * RenewResourceAutoBody
 */
@lombok.Data
public final class RenewResourceAutoBody  {

    /**
     * <p>业务 ID。您可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>订购请求的唯一标识。</p>
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

    /**
     * <p>并发实例资源续订配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreOrderList")
    private List<com.volcengine.model.acep.v20231030.RequestRenewResourcePreorder> preOrderList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
