package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchGetWhitelistParticipantRes
 */
@lombok.Data
public final class BatchGetWhitelistParticipantRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchGetWhitelistParticipantResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
