package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CommitImageUploadRes
 */
@lombok.Data
public final class CommitImageUploadRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CommitImageUploadResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CommitImageUploadResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
