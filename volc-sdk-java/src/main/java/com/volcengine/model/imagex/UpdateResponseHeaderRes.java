package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * UpdateResponseHeaderRes
 */
@lombok.Data
public final class UpdateResponseHeaderRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateResponseHeaderResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private String result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
