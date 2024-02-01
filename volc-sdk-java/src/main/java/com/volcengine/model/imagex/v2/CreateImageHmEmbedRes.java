package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageHmEmbedRes
 */
@lombok.Data
public final class CreateImageHmEmbedRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageHmEmbedResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageHmEmbedResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
