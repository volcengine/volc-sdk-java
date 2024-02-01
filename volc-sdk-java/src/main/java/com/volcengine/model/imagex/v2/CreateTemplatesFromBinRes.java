package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateTemplatesFromBinRes
 */
@lombok.Data
public final class CreateTemplatesFromBinRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateTemplatesFromBinResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateTemplatesFromBinResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
