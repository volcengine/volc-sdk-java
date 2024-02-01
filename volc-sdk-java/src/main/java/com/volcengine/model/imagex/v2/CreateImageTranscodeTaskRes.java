package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTranscodeTaskRes
 */
@lombok.Data
public final class CreateImageTranscodeTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageTranscodeTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageTranscodeTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
