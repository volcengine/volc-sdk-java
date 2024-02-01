package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchRemoveWhitelistParticipantRes
 */
@lombok.Data
public final class BatchRemoveWhitelistParticipantRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchRemoveWhitelistParticipantResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
