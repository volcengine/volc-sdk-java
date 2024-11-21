package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainConfigBodyAdvanced
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyAdvanced  {

    /**
     * <p>是否开启 IPV6，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_ipv6")
    private Boolean enableIpv6;

    /**
     * <p>是否开启 Gzip 压缩，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_gzip")
    private Boolean enableGzip;

    /**
     * <p>是否开启 Brotli 压缩，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>支持同时配置 Gzip 压缩和 Brotli 压缩，详细内容请参考[智能压缩](https://www.volcengine.com/docs/508/75858)。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable_br")
    private Boolean enableBr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
