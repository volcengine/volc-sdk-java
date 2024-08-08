package com.volcengine.model.acep.v20231030;


import com.alibaba.fastjson.JSON;

/**
 * RequestRenewResourcePreorder
 */
@lombok.Data
public final class RequestRenewResourcePreorder  {

    /**
     * <p>订购资源的租期：- 预付费模式：租期数，单位：月 - 后付费模式：0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Term")
    private Integer term;

    /**
     * <p>云机id, 资源组id和云机id对于节点售卖方式可以二选一</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HostId")
    private String hostId;

    /**
     * <p>资源组 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResourceSetId")
    private String resourceSetId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
