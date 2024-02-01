package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageUploadFilesRes
 */
@lombok.Data
public final class GetImageUploadFilesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageUploadFilesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageUploadFilesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
