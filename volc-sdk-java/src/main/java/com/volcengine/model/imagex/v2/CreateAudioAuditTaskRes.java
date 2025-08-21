package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateAudioAuditTaskRes
 */
@lombok.Data
public final class CreateAudioAuditTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateAudioAuditTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateAudioAuditTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
