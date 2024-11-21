package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * CreateImageTemplatesByImportRes
 */
@lombok.Data
public final class CreateImageTemplatesByImportRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private CreateImageTemplatesByImportResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private CreateImageTemplatesByImportResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
