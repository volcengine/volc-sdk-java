package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateReferBodyReferLink
 */
@lombok.Data
public final class UpdateReferBodyReferLink  {

    /**
     * <p>是否开启 Referer 访问限制，取值如下所示：</p>
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否选择白名单模式，取值如下所示：</p>
     *
     * <p>- `true`：选择白名单</p>
     *
     * <p>- `false`：选择黑名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>Referer 通用规则列表，根据是否为白名单，为对应的白/黑名单的值。您可以指定一个或者多个 IP 地址，域名和泛域名。支持填写二级域名，支持混合输入。</p>
     *
     * <p>- IP 地址格式支持 IPv4 和 IPv6，最多可输入 100 个 IP 地址。</p>
     *
     * <p>- 域名无需包含`http://` 或 `https://`。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`values` 和 `regex_valses` 均存在时，两者同时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    /**
     * <p>Referer 的正则表达式的列表，仅支持填写 IPv4 和 IPv6 格式的 IP 地址，参数长度范围为（1，1024）。不支持域名、泛域名、CIDR 网段。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "regex_values")
    private List<String> regexValues;

    /**
     * <p>是否允许空 Referer 访问，取值如下所示：</p>
     *
     * <p>- `true`：允许</p>
     *
     * <p>- `false`：不允许</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty_refer")
    private Boolean allowEmptyRefer;

    /**
     * <p>是否启用正则表达列表，取值如下所示：</p>
     *
     * <p>- `true`：启用</p>
     *
     * <p>- `false`：不启用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "regex_values_enabled")
    private Boolean regexValuesEnabled;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
