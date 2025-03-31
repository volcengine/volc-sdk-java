package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * ApplyVpcUploadInfoResResultPutURLHeadersItem
 */
@lombok.Data
public final class ApplyVpcUploadInfoResResultPutURLHeadersItem  {

    /**
     * <p>请求头的键（Header key）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>请求头的值（Header value）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
