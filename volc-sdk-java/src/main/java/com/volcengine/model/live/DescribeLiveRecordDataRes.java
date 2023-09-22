package com.volcengine.model.live;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveRecordDataRes
 */
@lombok.Data
public final class DescribeLiveRecordDataRes {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeLiveRecordDataResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeLiveRecordDataResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
