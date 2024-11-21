package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyRemoteAuth
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRemoteAuth  {

    /**
     * <p>是否开启远程鉴权，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>生效对象</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "match_rule")
    private List<UpdateImageDomainConfigBodyRemoteAuthMatchRuleItem> matchRule;

    /**
     * <p>鉴权服务器设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_server")
    private UpdateImageDomainConfigBodyRemoteAuthAuthServer authServer;

    /**
     * <p>鉴权请求参数设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_request_query")
    private UpdateImageDomainConfigBodyRemoteAuthAuthRequestQuery authRequestQuery;

    /**
     * <p>鉴权请求头设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_request_header")
    private UpdateImageDomainConfigBodyRemoteAuthAuthRequestHeader authRequestHeader;

    /**
     * <p>鉴权响应设置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "auth_response")
    private UpdateImageDomainConfigBodyRemoteAuthAuthResponse authResponse;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
