package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetImageXQueryRegionsRes
 */
@lombok.Data
public final class GetImageXQueryRegionsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageXQueryRegionsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageXQueryRegionsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
