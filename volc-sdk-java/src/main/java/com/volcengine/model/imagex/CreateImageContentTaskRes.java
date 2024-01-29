package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageContentTaskRes
 */
@lombok.Data
public final class CreateImageContentTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageContentTaskResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageContentTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
