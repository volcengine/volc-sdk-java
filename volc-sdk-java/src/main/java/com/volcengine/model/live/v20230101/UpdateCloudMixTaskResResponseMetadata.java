package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCloudMixTaskResResponseMetadata
 */
@lombok.Data
public final class UpdateCloudMixTaskResResponseMetadata  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestID")
    private String requestID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
