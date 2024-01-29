package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DeleteImageTemplateRes
 */
@lombok.Data
public final class DeleteImageTemplateRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteImageTemplateResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteImageTemplateResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
