package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageTemplateRes
 */
@lombok.Data
public final class GetImageTemplateRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageTemplateResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageTemplateResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
