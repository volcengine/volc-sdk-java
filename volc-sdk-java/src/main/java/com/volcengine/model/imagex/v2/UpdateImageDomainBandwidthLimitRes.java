package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainBandwidthLimitRes
 */
@lombok.Data
public final class UpdateImageDomainBandwidthLimitRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageDomainBandwidthLimitResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateImageDomainBandwidthLimitResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
