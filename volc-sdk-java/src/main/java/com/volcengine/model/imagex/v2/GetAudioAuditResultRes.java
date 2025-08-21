package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetAudioAuditResultRes
 */
@lombok.Data
public final class GetAudioAuditResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetAudioAuditResultResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetAudioAuditResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
