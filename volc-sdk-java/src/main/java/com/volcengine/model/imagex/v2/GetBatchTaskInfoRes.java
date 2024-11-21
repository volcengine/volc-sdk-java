package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetBatchTaskInfoRes
 */
@lombok.Data
public final class GetBatchTaskInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetBatchTaskInfoResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetBatchTaskInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
