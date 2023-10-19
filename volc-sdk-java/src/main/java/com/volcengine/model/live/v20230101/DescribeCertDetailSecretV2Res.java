package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretV2Res
 */
@lombok.Data
public final class DescribeCertDetailSecretV2Res  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DescribeCertDetailSecretV2ResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DescribeCertDetailSecretV2ResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
