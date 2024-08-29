package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushTaskV2Res
 */
@lombok.Data
public final class ListPullToPushTaskV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListPullToPushTaskV2ResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListPullToPushTaskV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
