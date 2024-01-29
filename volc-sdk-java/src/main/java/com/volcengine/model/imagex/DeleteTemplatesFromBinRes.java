package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DeleteTemplatesFromBinRes
 */
@lombok.Data
public final class DeleteTemplatesFromBinRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteTemplatesFromBinResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteTemplatesFromBinResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
