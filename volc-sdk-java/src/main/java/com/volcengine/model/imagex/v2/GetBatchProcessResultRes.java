package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetBatchProcessResultRes
 */
@lombok.Data
public final class GetBatchProcessResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetBatchProcessResultResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetBatchProcessResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
