package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAnalyzeResultRes
 */
@lombok.Data
public final class GetImageAnalyzeResultRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAnalyzeResultResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAnalyzeResultResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
