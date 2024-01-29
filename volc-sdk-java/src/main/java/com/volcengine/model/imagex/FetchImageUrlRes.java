package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * FetchImageUrlRes
 */
@lombok.Data
public final class FetchImageUrlRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private FetchImageUrlResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private FetchImageUrlResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
