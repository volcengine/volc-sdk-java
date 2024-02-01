package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchDeleteBlockParticipantsRes
 */
@lombok.Data
public final class BatchDeleteBlockParticipantsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchDeleteBlockParticipantsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
