package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateBatchProcessTaskRes
 */
@lombok.Data
public final class CreateBatchProcessTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateBatchProcessTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateBatchProcessTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
