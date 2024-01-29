package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImagePSDetectionRes
 */
@lombok.Data
public final class GetImagePSDetectionRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImagePSDetectionResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImagePSDetectionResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
