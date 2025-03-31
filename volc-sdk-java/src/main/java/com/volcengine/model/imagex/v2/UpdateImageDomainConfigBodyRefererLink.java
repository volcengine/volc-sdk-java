package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyRefererLink
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyRefererLink  {

    /**
     * <p>是否开启 Referer 防盗链，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否选择白名单，取值如下所示：</p>
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
     * <p>黑白名单 Referer 规则，可输入域名或 IP 地址，最大限制为 1000 条。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    /**
     * <p>正则表达式规则列表，最大限制为 100 条。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "regex_values")
    private List<String> regexValues;

    /**
     * <p>是否允许空 Referer，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：允许空 Referer</p>
     *
     * <p>- `false`：不允许空 Referer</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty_refer")
    private Boolean allowEmptyRefer;

    /**
     * <p>是否忽略大小写。取值如下所示： </p>
     *
     * <p>- `true`: （默认）大小写不敏感。 </p>
     *
     * <p>- `false`: 大小写敏感。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ignore_case")
    private Boolean ignoreCase;

    /**
     * <p>Referer 头部值是否必须以 HTTP 或者 HTTPS 开头。取值如下所示： </p>
     *
     * <p>- `true`: 表示不以 HTTP 或者 HTTPS 开头的 Referer 头部值是合法的。在这个情况下，veImagex 会尝试将其与 Referers 列表匹配。 </p>
     *
     * <p>- `false`: （默认）表示不以 HTTP 或者 HTTPS 开头 Referer 头部值是非法的。在这个情况下，veImagex 判定为不匹配 CommonType 下的这个 Referers 列表。 </p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ignore_scheme")
    private Boolean ignoreScheme;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
