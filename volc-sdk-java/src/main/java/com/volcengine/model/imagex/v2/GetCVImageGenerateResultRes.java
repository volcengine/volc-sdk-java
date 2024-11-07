package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCVImageGenerateResultRes
 */
@lombok.Data
public final class GetCVImageGenerateResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCVImageGenerateResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCVImageGenerateResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
