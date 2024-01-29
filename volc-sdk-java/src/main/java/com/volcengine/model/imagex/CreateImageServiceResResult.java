package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageServiceResResult
 */
@lombok.Data
public final class CreateImageServiceResResult  {

    /**
     * <p>服务的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceName")
    private String serviceName;

    /**
     * <p>创建的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
