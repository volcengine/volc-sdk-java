package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateCVImageGenerateTaskRes
 */
@lombok.Data
public final class CreateCVImageGenerateTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateCVImageGenerateTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateCVImageGenerateTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
