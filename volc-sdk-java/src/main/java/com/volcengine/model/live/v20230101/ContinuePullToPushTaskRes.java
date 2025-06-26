package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ContinuePullToPushTaskRes
 */
@lombok.Data
public final class ContinuePullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ContinuePullToPushTaskResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
