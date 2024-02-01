package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeDetailsRes
 */
@lombok.Data
public final class GetImageTranscodeDetailsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageTranscodeDetailsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageTranscodeDetailsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
