package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateCarouselTaskResResponseMetadata
 */
@lombok.Data
public final class UpdateCarouselTaskResResponseMetadata  {

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
