package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageBackgroundColorsRes
 */
@lombok.Data
public final class DeleteImageBackgroundColorsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageBackgroundColorsResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteImageBackgroundColorsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
