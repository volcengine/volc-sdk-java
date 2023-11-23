package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullCDNSnapshotTaskRes
 */
@lombok.Data
public final class ListPullCDNSnapshotTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListPullCDNSnapshotTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListPullCDNSnapshotTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
