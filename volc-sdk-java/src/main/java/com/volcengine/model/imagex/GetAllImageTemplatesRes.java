package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetAllImageTemplatesRes
 */
@lombok.Data
public final class GetAllImageTemplatesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetAllImageTemplatesResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetAllImageTemplatesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
