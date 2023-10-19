package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullToPushTaskRes
 */
@lombok.Data
public final class CreatePullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreatePullToPushTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreatePullToPushTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
