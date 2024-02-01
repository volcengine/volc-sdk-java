package com.volcengine.model.im;


import com.alibaba.fastjson.JSON;

/**
 * BatchAddWhitelistParticipantRes
 */
@lombok.Data
public final class BatchAddWhitelistParticipantRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private BatchAddWhitelistParticipantResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
