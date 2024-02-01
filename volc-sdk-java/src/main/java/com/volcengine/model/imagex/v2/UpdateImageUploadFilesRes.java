package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageUploadFilesRes
 */
@lombok.Data
public final class UpdateImageUploadFilesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageUploadFilesResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateImageUploadFilesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
