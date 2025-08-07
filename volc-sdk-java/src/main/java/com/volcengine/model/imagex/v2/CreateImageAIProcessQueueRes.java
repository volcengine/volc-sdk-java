package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAIProcessQueueRes
 */
@lombok.Data
public final class CreateImageAIProcessQueueRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageAIProcessQueueResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageAIProcessQueueResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
