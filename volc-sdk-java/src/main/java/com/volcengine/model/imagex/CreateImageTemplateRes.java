package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplateRes
 */
@lombok.Data
public final class CreateImageTemplateRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageTemplateResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageTemplateResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
