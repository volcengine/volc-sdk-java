package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSnapshotDataRes
 */
@lombok.Data
public final class DescribeLiveSnapshotDataRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveSnapshotDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveSnapshotDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
