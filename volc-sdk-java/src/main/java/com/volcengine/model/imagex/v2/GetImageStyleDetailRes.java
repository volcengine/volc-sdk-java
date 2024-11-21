package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageStyleDetailRes
 */
@lombok.Data
public final class GetImageStyleDetailRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetImageStyleDetailResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetImageStyleDetailResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
