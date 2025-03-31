package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * ApplyVpcUploadInfoRes
 */
@lombok.Data
public final class ApplyVpcUploadInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ApplyVpcUploadInfoResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ApplyVpcUploadInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
