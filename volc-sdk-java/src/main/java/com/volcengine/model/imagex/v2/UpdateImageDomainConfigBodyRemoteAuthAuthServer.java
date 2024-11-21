package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyRemoteAuthAuthServer
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuthAuthServer  {

    /**
     * <p>鉴权服务器的主地址。主地址的格式是 \<scheme>://\<domain> 或 \<scheme>://\<ip>。该参数值的长度不能超过 100 个字符。</p>
     *
     * <p>- \<scheme> 的值是 http 或者 https。</p>
     *
     * <p>- \<domain> 的值不能是 localhost。</p>
     *
     * <p>- \<ip> 的值不能是 127.0.0.1。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "address")
    private String address;

    /**
     * <p>鉴权服务器的备地址。地址格式和要求与主地址 `address` 相同。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "backup_address")
    private String backupAddress;

    /**
     * <p>鉴权请求的路径。鉴权地址和请求路径组成了完整的鉴权 URL。veImageX 会把用户的请求转发到该鉴权 URL。取值如下所示： </p>
     *
     * <p>- `constant`：表示鉴权请求中的路径与用户请求中的路径相同。 </p>
     *
     * <p>- `variable`：表示您需要在 pathValue 参数中指定一个鉴权请求中的路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "path_type")
    private String pathType;

    /**
     * <p>表示一个鉴权请求的路径，长度不能超过 100 个字符。路径必须以斜杠（/）开头，可以包含除了以下字符的可打印 ASCII 字符： 连续斜杠（//）、百分号（%）、美元符号（$）、空格、问号（?）、Delete（ASCII code 127）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "path_value")
    private String pathValue;

    /**
     * <p>在发送鉴权请求时，veImageX 所使用的请求方法。取值如下所示： </p>
     *
     * <p>- `default`：鉴权请求所使用的方法与用户的请求相同。 </p>
     *
     * <p>- `get`：鉴权请求使用 GET 方法。 </p>
     *
     * <p>- `post`：鉴权请求使用 POST 方法。 </p>
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
