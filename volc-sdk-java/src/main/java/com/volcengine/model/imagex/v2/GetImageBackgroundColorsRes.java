package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageBackgroundColorsRes
 */
@lombok.Data
public final class GetImageBackgroundColorsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageBackgroundColorsResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageBackgroundColorsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
