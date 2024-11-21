package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageStyleRes
 */
@lombok.Data
public final class CreateImageStyleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageStyleResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageStyleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
