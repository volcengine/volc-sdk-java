package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSuperResolutionResultRes
 */
@lombok.Data
public final class GetImageSuperResolutionResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageSuperResolutionResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageSuperResolutionResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
