package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainOwnerVerifyContentRes
 */
@lombok.Data
public final class GetDomainOwnerVerifyContentRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetDomainOwnerVerifyContentResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetDomainOwnerVerifyContentResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
