package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageComicResultRes
 */
@lombok.Data
public final class GetImageComicResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageComicResultResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageComicResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
