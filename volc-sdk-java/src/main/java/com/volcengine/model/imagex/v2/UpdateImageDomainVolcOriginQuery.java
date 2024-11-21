package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainVolcOriginQuery
 */
@lombok.Data
public final class UpdateImageDomainVolcOriginQuery  {

    /**
     * <p>服务ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
