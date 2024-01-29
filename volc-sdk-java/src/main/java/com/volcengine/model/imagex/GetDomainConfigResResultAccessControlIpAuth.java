package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultAccessControlIpAuth
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlIpAuth  {

    /**
     * <p>是否开启 IP 访问控制，取值如下所示：</p>
     *
     * <p>* `true`：开启 IP 访问控制</p>
     *
     * <p>* `false`：关闭 IP 访问控制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否是白名单模式，取值如下所示：</p>
     *
     * <p>* `true`：白名单模式</p>
     *
     * <p>* `false`：黑名单模式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>IP 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
