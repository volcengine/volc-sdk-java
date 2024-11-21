package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainDownloadSpeedLimitRes
 */
@lombok.Data
public final class UpdateImageDomainDownloadSpeedLimitRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageDomainDownloadSpeedLimitResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateImageDomainDownloadSpeedLimitResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
