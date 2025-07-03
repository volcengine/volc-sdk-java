package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetSyncAuditResultQuery
 */
@lombok.Data
public final class GetSyncAuditResultQuery  {

    /**
     * <p>服务唯一id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
