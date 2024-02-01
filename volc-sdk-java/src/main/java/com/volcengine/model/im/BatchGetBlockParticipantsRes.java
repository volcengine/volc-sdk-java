package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchGetBlockParticipantsRes
 */
@lombok.Data
public final class BatchGetBlockParticipantsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchGetBlockParticipantsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
