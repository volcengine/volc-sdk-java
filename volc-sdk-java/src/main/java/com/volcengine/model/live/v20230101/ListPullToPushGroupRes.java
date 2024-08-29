package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushGroupRes
 */
@lombok.Data
public final class ListPullToPushGroupRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListPullToPushGroupResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListPullToPushGroupResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
