package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetCompressTaskInfoRes
 */
@lombok.Data
public final class GetCompressTaskInfoRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetCompressTaskInfoResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetCompressTaskInfoResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
