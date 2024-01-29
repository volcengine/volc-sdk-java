package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetResponseHeaderValidateKeysRes
 */
@lombok.Data
public final class GetResponseHeaderValidateKeysRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetResponseHeaderValidateKeysResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetResponseHeaderValidateKeysResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
