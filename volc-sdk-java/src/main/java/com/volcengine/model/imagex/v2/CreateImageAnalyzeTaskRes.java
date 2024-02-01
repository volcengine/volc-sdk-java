package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageAnalyzeTaskRes
 */
@lombok.Data
public final class CreateImageAnalyzeTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageAnalyzeTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageAnalyzeTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
