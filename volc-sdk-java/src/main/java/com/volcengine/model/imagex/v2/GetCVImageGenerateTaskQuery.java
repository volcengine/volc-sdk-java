package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCVImageGenerateTaskQuery
 */
@lombok.Data
public final class GetCVImageGenerateTaskQuery  {

    /**
     * <p>指定要查询的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
