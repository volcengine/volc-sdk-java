package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchAddBlockParticipantsRes
 */
@lombok.Data
public final class BatchAddBlockParticipantsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchAddBlockParticipantsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
