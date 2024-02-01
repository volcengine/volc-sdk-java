package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageAnalyzeTasksRes
 */
@lombok.Data
public final class GetImageAnalyzeTasksRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageAnalyzeTasksResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageAnalyzeTasksResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
