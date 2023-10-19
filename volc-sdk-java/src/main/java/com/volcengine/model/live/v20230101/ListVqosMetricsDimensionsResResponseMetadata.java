package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVqosMetricsDimensionsResResponseMetadata
 */
@lombok.Data
public final class ListVqosMetricsDimensionsResResponseMetadata  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
