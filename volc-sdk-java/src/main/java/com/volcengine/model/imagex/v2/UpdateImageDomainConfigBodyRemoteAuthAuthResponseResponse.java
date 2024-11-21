package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthResponseResponse
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthResponseResponse  {

    /**
     * <p>鉴权失败时 veImageX 响应用户的状态码。取值范围为 [400,499] 。默认值是 403。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "fail_code")
    private String failCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
