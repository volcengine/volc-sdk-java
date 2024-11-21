package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetBatchProcessResultQuery
 */
@lombok.Data
public final class GetBatchProcessResultQuery  {

    /**
     * <p>指定同步批处理的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceId")
    private String serviceId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
