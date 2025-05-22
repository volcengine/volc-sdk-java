package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateHmExtractTaskRes
 */
@lombok.Data
public final class CreateHmExtractTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateHmExtractTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateHmExtractTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
