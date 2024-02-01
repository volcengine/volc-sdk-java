package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetVendorBucketsRes
 */
@lombok.Data
public final class GetVendorBucketsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetVendorBucketsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetVendorBucketsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
