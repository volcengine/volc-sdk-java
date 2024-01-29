package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageCompressTaskRes
 */
@lombok.Data
public final class CreateImageCompressTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageCompressTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageCompressTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
