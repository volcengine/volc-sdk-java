package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetDomainConfigResResultAccessControlUrlAuth
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlUrlAuth  {

    /**
     * <p>是否开启 URL 鉴权 ，取值如下所示：</p>
     *
     * <p>* `true`：开启 URL 鉴权</p>
     *
     * <p>* `false`：关闭 URL 鉴权</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>A 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_a")
    private GetDomainConfigResResultAccessControlUrlAuthTypeA typeA;

    /**
     * <p>B 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_b")
    private GetDomainConfigResResultAccessControlUrlAuthTypeB typeB;

    /**
     * <p>C 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_c")
    private GetDomainConfigResResultAccessControlUrlAuthTypeC typeC;

    /**
     * <p>D 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_d")
    private GetDomainConfigResResultAccessControlUrlAuthTypeD typeD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
