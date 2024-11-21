package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyUrlAuth
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyUrlAuth  {

    /**
     * <p>是否开启 URL 鉴权配置，取值如下所示：</p>
     *
     * <p>- `true`：是</p>
     *
     * <p>- `false`：否</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>A 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_a")
    private UpdateImageDomainConfigBodyUrlAuthTypeA typeA;

    /**
     * <p>B 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_b")
    private UpdateImageDomainConfigBodyUrlAuthTypeB typeB;

    /**
     * <p>C 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_c")
    private UpdateImageDomainConfigBodyUrlAuthTypeC typeC;

    /**
     * <p>D 鉴权配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "type_d")
    private UpdateImageDomainConfigBodyUrlAuthTypeD typeD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
