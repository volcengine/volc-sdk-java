package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthResponseResponse
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthResponseResponse  {

    /**
     * <p>鉴权失败时，响应用户的状态码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fail_code")
    private String failCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
