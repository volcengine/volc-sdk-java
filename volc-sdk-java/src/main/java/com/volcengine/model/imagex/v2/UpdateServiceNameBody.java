package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateServiceNameBody
 */
@lombok.Data
public final class UpdateServiceNameBody  {

    /**
     * <p>服务名称，最多不超过 32 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceName")
    private String serviceName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
