package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTranscodeQueueRes
 */
@lombok.Data
public final class CreateImageTranscodeQueueRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageTranscodeQueueResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageTranscodeQueueResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
