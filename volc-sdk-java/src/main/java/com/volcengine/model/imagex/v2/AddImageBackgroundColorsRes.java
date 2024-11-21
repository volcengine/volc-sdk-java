package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * AddImageBackgroundColorsRes
 */
@lombok.Data
public final class AddImageBackgroundColorsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private AddImageBackgroundColorsResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private AddImageBackgroundColorsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
