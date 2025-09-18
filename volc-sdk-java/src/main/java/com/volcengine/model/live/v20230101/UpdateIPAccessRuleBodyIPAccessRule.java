package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateIPAccessRuleBodyIPAccessRule
 */
@lombok.Data
public final class UpdateIPAccessRuleBodyIPAccessRule  {

    /**
     * <p>IP 访问限制的类型。取值如下：</p>
     *
     * <p>- `allow`: 白名单。</p>
     *
     * <p>	- 如果 `Domain` 传入的是推流域名，则只有符合规则的 IP 地址才可以推流。</p>
     *
     * <p>	- 如果 `Domain` 传入的是拉流域名，则只有符合规则的 IP 地址才可以拉流。</p>
     *
     * <p>- `deny`: 黑名单。</p>
     *
     * <p>	- 如果 `Domain` 传入的是推流域名，则符合规则的 IP 地址无法推流。</p>
     *
     * <p>	- 如果 `Domain` 传入的是拉流域名，则符合规则的 IP 地址无法拉流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>是否开启当前限制。取值如下：</p>
     *
     * <p>- `true`: 开启。</p>
     *
     * <p>- `false`: 关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>名单中的 IP 信息。支持 IPv4 和 IPv6 格式的 IP 地址和 IP 网段。最多支持配置 500 个 IP 地址和网段。</p>
     *
     * <p>例如，`Type` 取值为 `deny`、`Domain` 传入的是推流域名、该参数取值为 `["192.168.1.100","192.168.1.0/24","2001:db8:85a3::8a2e:370:7334","2001:db8::/32"]` 时，则表示不允许以下 IP 地址推流：</p>
     *
     * <p>- IP 地址 `192.168.1.100`</p>
     *
     * <p>- IP 地址 `2001:db8:85a3::8a2e:370:7334`</p>
     *
     * <p>- `192.168.1.0` - `192.168.1.255`范围内的所有 IP 地址</p>
     *
     * <p>- `2001:db8:0000:0000:0000:0000:0000:0000`\- `2001:db8:ffff:ffff:ffff:ffff:ffff:ffff` 范围内的所有 IP 地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<String> iPList;

    /**
     * <p>对于黑名单中或非白名单中的 IP 地址，系统默认返回 403 错误，表示禁止访问。</p>
     *
     * <p>通过该参数，您可以自定义返回状态码，以便在查看日志时能快速区分禁止访问的原因，方便定位问题。</p>
     *
     * <p>参数取值范围为 [200,999]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyHTTPStatusCode")
    private Integer denyHTTPStatusCode;

    /**
     * <p>校验是否包含 TS 文件。默认值为 `false`。取值如下：</p>
     *
     * <p>- `true`: 包含。</p>
     *
     * <p>- `false`: 不包含。</p>
     *
     *
     *
     * <p>使用 HLS 协议拉流时，直播服务器会将完整的直播流切割成小的 TS（Transport Stream）文件。观众观看直播时，播放器会不断请求 TS 文件并拼接成连续的画面。参数取值为 `true` 时，直播服务器会严格验证请求 TS 文件的 IP 地址，防止黑名单中或不在白名单中的 IP 地址访问 TS 文件。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 该配置仅对拉流域名生效。</p>
     *
     * <p>- 如果无法确保能获取所有客户端请求 TS 文件的出口 IP 地址，建议将参数取值设置为 `false`，以免误拦截观众。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableTS")
    private Boolean enableTS;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
