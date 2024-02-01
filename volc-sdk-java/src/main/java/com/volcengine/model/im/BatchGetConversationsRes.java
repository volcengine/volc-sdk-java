package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchGetConversationsRes
 */
@lombok.Data
public final class BatchGetConversationsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchGetConversationsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
