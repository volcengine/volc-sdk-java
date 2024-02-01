package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * QueryLiveParticipantStatusRes
 */
@lombok.Data
public final class QueryLiveParticipantStatusRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private QueryLiveParticipantStatusResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
