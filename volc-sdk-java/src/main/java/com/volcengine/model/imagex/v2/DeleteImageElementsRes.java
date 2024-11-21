package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageElementsRes
 */
@lombok.Data
public final class DeleteImageElementsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageElementsResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteImageElementsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
