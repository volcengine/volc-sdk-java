package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * GetMessagesRes
 */
@lombok.Data
public final class GetMessagesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetMessagesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
