package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCVTextGenerateImageRes
 */
@lombok.Data
public final class GetCVTextGenerateImageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCVTextGenerateImageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCVTextGenerateImageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
