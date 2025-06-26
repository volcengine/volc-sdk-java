package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * RelaunchPullToPushTaskRes
 */
@lombok.Data
public final class RelaunchPullToPushTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private RelaunchPullToPushTaskResResponseMetadata responseMetadata;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
