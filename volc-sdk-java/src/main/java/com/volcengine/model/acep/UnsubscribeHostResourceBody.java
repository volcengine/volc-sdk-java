package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * UnsubscribeHostResourceBody
 */
@lombok.Data
public final class UnsubscribeHostResourceBody  {

    /**
     * <p>业务 ID。您可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>云机 ID 列表。可通过 [ListHost](https://www.volcengine.com/docs/6394/1221480) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostIdList")
    private List<String> hostIdList;

    /**
     * <p>是否允许强制退订。取值如下：</p>
     *
     *
     *
     * <p>- `false`：（默认）不允许强制退订。</p>
     *
     * <p>- `true`：允许强制退订。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>节点资源存在实例时依然可以退订，并主动删除相关实例数据。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Force")
    private Boolean force;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
