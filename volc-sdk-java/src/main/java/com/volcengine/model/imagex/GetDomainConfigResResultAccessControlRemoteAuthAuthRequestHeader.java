package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultAccessControlRemoteAuthAuthRequestHeader
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRemoteAuthAuthRequestHeader  {

    /**
     * <p>鉴权请求中 HOST 头部的值，固定为 `default`，即 HOST 头部的值与您的加速域名相同。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "host")
    private String host;

    /**
     * <p>鉴权请求头是否包含用户请求头，取值如下所示：</p>
     *
     *
     *
     * <p>- `exclude`：表示鉴权请求头中不包含任何用户请求头。</p>
     *
     * <p>- `include`：表示鉴权请求头中包含所有用户请求头。</p>
     *
     * <p>- `includePart`：表示鉴权请求头包含指定的用户请求头。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "action")
    private String action;

    /**
     * <p>Action 参数所对应的参数值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "value")
    private String value;

    /**
     * <p>额外请求头</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "header")
    private List<GetDomainConfigResResultAccessControlRemoteAuthAuthRequestHeaderHeaderItem> header;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
