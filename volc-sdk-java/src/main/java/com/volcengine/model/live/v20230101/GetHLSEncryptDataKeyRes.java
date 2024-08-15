package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetHLSEncryptDataKeyRes
 */
@lombok.Data
public final class GetHLSEncryptDataKeyRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetHLSEncryptDataKeyResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetHLSEncryptDataKeyResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
