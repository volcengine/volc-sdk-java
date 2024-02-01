package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageSmartCropResultRes
 */
@lombok.Data
public final class GetImageSmartCropResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageSmartCropResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageSmartCropResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
