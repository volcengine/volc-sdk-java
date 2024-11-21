package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetLicensePlateDetectionRes
 */
@lombok.Data
public final class GetLicensePlateDetectionRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetLicensePlateDetectionResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetLicensePlateDetectionResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
