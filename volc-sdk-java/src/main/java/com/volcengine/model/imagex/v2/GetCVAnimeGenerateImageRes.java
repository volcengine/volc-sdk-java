package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCVAnimeGenerateImageRes
 */
@lombok.Data
public final class GetCVAnimeGenerateImageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCVAnimeGenerateImageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCVAnimeGenerateImageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
