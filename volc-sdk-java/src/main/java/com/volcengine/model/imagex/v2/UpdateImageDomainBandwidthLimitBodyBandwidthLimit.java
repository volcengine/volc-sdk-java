package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * UpdateImageDomainBandwidthLimitBodyBandwidthLimit
 */
@lombok.Data
public final class UpdateImageDomainBandwidthLimitBodyBandwidthLimit  {

    /**
     * <p>是否开启带宽限制功能，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     *
     * <p>:::tip</p>
     *
     * <p>仅当 `enabled` 为 `true` 时，`threshold`、`limit_type` 等配置项有效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>全局带宽阈值，指定加速域名的带宽阈值。单位为 bps，取值范围为 [1, 1000000000000000]  的整数。</p>
     *
     * <p>单位换算：1 Gbps = 1000 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "threshold")
    private Integer threshold;

    /**
     * <p>全局带宽阈值，指定加速域名的带宽阈值。单位为 bps，取值范围为 [1, 1000000000000000]  的整数。</p>
     *
     * <p>单位换算：1 Gbps = 1000 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "limit_type")
    private String limitType;

    /**
     * <p>设置节点响应访问请求的速度下限，在 veImageX 逐步降低最大速度的过程中，最大速度不会低于该配置。</p>
     *
     * <p>单位：B/S，取值范围为 [1,1073741824000]的整数。</p>
     *
     * <p>单位换算：1 KB/S = 1024 B/S。</p>
     *
     * <p>- 当 `limit_type` 为 `downloadspeedlimit` 时，表示每个请求的最低速度。</p>
     *
     * <p>- 当 `limit_type` 为 `speedlimit` 时，表示每个 IP 地址的最低速度。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当 `limit_type` 为 `randomreject` 时，不支持自定义该配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "speed_limit_rate")
    private Integer speedLimitRate;

    /**
     * <p>初始速率，即初始最大速度。限速发生时， veImageX 会从该速度开始，逐步降低最大速度。</p>
     *
     * <p>单位：B/S，取值范围为[1,1073741824000]的整数。默认值为 `speed_limit_rate + 4096 KB/S`。</p>
     *
     * <p>单位换算：1 KB/S = 1024 B/S。</p>
     *
     * <p>- 当 `limit_type` 为 `downloadspeedlimit` 时，表示每个请求的初始最大速度。</p>
     *
     * <p>- 当 `limit_type` 为 `speedlimit` 时，表示每个 IP 地址的初始最大速度。</p>
     *
     * <p>:::tip</p>
     *
     * <p>当 `limit_type` 为 `randomreject` 时，不支持自定义该配置。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "speed_limit_rate_max")
    private Integer speedLimitRateMax;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
