package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyIpAuth
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyIpAuth  {

    /**
     * <p>是否开启黑白名单配置，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启黑白名单配置</p>
     *
     * <p>- `false`：关闭黑白名单配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否是 IP 白名单，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：配置白名单</p>
     *
     * <p>- `false`：配置黑名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>黑白名单 IP 地址，最大限制为 1000。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
