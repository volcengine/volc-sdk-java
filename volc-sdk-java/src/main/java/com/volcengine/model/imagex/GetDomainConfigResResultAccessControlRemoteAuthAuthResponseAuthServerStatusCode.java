package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthResponseAuthServerStatusCode
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthResponseAuthServerStatusCode  {

    /**
     * <p>鉴权失败时的鉴权状态码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fail_code")
    private String failCode;

    /**
     * <p>鉴权成功时的鉴权状态码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "success_code")
    private String successCode;

    /**
     * <p>如果鉴权状态码既不是 FailCode，又不是 SuccessCode 时，处理鉴权请求的方式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "default_action")
    private String defaultAction;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
