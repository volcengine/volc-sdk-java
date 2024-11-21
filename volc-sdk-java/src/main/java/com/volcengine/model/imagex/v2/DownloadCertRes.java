package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DownloadCertRes
 */
@lombok.Data
public final class DownloadCertRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DownloadCertResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DownloadCertResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
