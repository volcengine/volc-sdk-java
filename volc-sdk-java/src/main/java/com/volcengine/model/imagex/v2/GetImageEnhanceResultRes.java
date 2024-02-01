package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageEnhanceResultRes
 */
@lombok.Data
public final class GetImageEnhanceResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageEnhanceResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageEnhanceResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
