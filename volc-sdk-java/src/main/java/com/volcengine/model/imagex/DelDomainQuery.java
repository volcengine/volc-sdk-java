package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DelDomainQuery
 */
@lombok.Data
public final class DelDomainQuery  {

    /**
     * <p>imagex服务ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
