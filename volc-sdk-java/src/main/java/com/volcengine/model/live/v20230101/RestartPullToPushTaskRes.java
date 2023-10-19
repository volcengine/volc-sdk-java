package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RestartPullToPushTaskRes
 */
@lombok.Data
public final class RestartPullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private RestartPullToPushTaskResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
