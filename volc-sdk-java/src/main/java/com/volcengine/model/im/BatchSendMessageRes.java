package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchSendMessageRes
 */
@lombok.Data
public final class BatchSendMessageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchSendMessageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
