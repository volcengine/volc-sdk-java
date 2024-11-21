package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAiGenerateTaskRes
 */
@lombok.Data
public final class GetImageAiGenerateTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAiGenerateTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAiGenerateTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
