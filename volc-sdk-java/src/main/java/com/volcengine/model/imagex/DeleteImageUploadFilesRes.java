package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageUploadFilesRes
 */
@lombok.Data
public final class DeleteImageUploadFilesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageUploadFilesResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteImageUploadFilesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
