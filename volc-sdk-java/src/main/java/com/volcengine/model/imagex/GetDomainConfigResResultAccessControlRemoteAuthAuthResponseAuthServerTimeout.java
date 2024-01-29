package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthResponseAuthServerTimeout
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthResponseAuthServerTimeout  {

    /**
     * <p>鉴权超时的时间，单位是毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "time")
    private Integer time;

    /**
     * <p>鉴权超时后处理鉴权请求的策略，取值如下所示：</p>
     *
     *
     *
     * <p>- `reject`：veImageX 认为鉴权失败。</p>
     *
     * <p>- `pass`：veImageX 认为鉴权成功。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
