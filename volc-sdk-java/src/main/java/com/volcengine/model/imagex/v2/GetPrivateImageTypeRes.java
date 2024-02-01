package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetPrivateImageTypeRes
 */
@lombok.Data
public final class GetPrivateImageTypeRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetPrivateImageTypeResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetPrivateImageTypeResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
