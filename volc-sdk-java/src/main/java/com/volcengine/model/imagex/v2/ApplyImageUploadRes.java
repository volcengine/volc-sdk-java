package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * ApplyImageUploadRes
 */
@lombok.Data
public final class ApplyImageUploadRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ApplyImageUploadResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ApplyImageUploadResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
