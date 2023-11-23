package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreatePullCDNSnapshotTaskRes
 */
@lombok.Data
public final class CreatePullCDNSnapshotTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreatePullCDNSnapshotTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreatePullCDNSnapshotTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
