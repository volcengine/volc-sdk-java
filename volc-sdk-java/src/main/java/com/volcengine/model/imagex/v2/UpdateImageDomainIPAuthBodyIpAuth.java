package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainIPAuthBodyIpAuth
 */
@lombok.Data
public final class UpdateImageDomainIPAuthBodyIpAuth  {

    /**
     * <p>是否开启黑白名单配置，取值如下所示：</p>
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
     * <p>- `true`：配置白名单</p>
     *
     * <p>- `false`：配置黑名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>黑白名单 IP 地址，您可以指定一个或者多个 IP 地址（如 192.0.2.0）和 IP 地址网段（192.0.2.0/24）。IP 地址和网段可以是 IPv4 或 IPv6 格式，可混合填写，最多可输入 100 个地址。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>若您需要对名单内已配置的 `values` 地址进行增删处理，那么您需提供已配置的全量地址，并在此基础上添加或删除您期望变更的地址后，再重新传入 `values`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
