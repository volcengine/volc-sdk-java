package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetCloudMixTaskDetailRes
 */
@lombok.Data
public final class GetCloudMixTaskDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCloudMixTaskDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCloudMixTaskDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
