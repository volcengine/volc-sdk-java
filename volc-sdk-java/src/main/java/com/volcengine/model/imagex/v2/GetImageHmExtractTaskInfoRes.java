package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageHmExtractTaskInfoRes
 */
@lombok.Data
public final class GetImageHmExtractTaskInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageHmExtractTaskInfoResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageHmExtractTaskInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
