package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageStyleRes
 */
@lombok.Data
public final class UpdateImageStyleRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateImageStyleResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private UpdateImageStyleResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
