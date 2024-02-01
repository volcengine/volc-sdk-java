package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTranscodeQueuesRes
 */
@lombok.Data
public final class GetImageTranscodeQueuesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageTranscodeQueuesResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageTranscodeQueuesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
