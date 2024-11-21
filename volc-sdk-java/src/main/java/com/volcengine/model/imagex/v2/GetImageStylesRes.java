package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStylesRes
 */
@lombok.Data
public final class GetImageStylesRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageStylesResResponseMetadata responseMetadata;

    /**
     * <p>title</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageStylesResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
