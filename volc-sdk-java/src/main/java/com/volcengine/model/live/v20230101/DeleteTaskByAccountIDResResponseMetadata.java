package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTaskByAccountIDResResponseMetadata
 */
@lombok.Data
public final class DeleteTaskByAccountIDResResponseMetadata  {

    /**
     * <p>RequestId为每次API请求的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestID")
    private String requestID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
