package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthServer
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthServer  {

    /**
     * <p>鉴权服务器的主地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "address")
    private String address;

    /**
     * <p>鉴权服务器的备地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "backup_address")
    private String backupAddress;

    /**
     * <p>鉴权请求的路径，取值如下所示：</p>
     *
     *
     *
     * <p>- `constant`：表示鉴权请求中的路径与用户请求中的路径相同。</p>
     *
     * <p>- `variable`：表示您需要在 pathValue 参数中指定一个鉴权请求中的路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "path_type")
    private String pathType;

    /**
     * <p>一个鉴权请求的路径</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "path_value")
    private String pathValue;

    /**
     * <p>在发送鉴权请求时所使用的请求方法，取值如下所示：</p>
     *
     * <p>- `default`：鉴权请求所使用的方法与用户的请求相同。</p>
     *
     * <p>- `get`：鉴权请求使用 GET 方法。</p>
     *
     * <p>- `post`：鉴权请求使用 POST 方法。</p>
     *
     * <p>- `head`：鉴权请求使用 HEAD 方法。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "request_method")
    private String requestMethod;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
