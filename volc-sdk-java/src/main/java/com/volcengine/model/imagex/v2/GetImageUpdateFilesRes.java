package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageUpdateFilesRes
 */
@lombok.Data
public final class GetImageUpdateFilesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageUpdateFilesResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageUpdateFilesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
