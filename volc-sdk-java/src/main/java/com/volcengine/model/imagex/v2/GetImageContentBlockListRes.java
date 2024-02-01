package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageContentBlockListRes
 */
@lombok.Data
public final class GetImageContentBlockListRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageContentBlockListResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageContentBlockListResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
