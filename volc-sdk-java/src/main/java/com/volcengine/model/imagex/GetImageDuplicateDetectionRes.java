package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageDuplicateDetectionRes
 */
@lombok.Data
public final class GetImageDuplicateDetectionRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageDuplicateDetectionResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageDuplicateDetectionResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
