package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListCarouselTaskResResponseMetadata
 */
@lombok.Data
public final class ListCarouselTaskResResponseMetadata  {

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
