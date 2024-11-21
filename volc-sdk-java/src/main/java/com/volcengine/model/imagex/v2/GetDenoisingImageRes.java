package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDenoisingImageRes
 */
@lombok.Data
public final class GetDenoisingImageRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetDenoisingImageResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetDenoisingImageResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
