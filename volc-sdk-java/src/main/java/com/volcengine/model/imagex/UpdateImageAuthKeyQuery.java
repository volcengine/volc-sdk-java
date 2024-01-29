package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageAuthKeyQuery
 */
@lombok.Data
public final class UpdateImageAuthKeyQuery  {

    /**
     * <p>服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
