package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCVImageGenerateTaskRes
 */
@lombok.Data
public final class GetCVImageGenerateTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCVImageGenerateTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCVImageGenerateTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
