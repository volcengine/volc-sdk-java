package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetPullCDNSnapshotTaskRes
 */
@lombok.Data
public final class GetPullCDNSnapshotTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetPullCDNSnapshotTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetPullCDNSnapshotTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
