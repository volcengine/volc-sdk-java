package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetTemplatesFromBinRes
 */
@lombok.Data
public final class GetTemplatesFromBinRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetTemplatesFromBinResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetTemplatesFromBinResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
