package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultAccessControlRefererLink
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlRefererLink  {

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
     * <p>- `true`：选择白名单</p>
     *
     * <p>- `false`：不选择白名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>根据是否为白名单，为对应的白/黑名单的值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    /**
     * <p>Referers 列表在匹配时是否是大小写敏感的。取值如下所示： </p>
     *
     * <p>- `true`: 表示大小写不敏感。 </p>
     *
     * <p>- `false`: 表示大小写敏感。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ignore_case")
    private Boolean ignoreCase;

    /**
     * <p>Referers 列表的 Referer 头部值是否必须以 HTTP 或者 HTTPS 开头。取值如下所示： </p>
     *
     * <p>- `true`: 表示不以 HTTP 或者 HTTPS 开头的 Referer 头部值是合法的。</p>
     *
     * <p>- `false`: 表示不以 HTTP 或者 HTTPS 开头 Referer 头部值是非法的。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ignore_scheme")
    private Boolean ignoreScheme;

    /**
     * <p>正则表达式规则列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "regex_values")
    private List<String> regexValues;

    /**
     * <p>是否允许空 Refer，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：允许空 Refer</p>
     *
     * <p>- `false`：不允许空 Refer</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty_refer")
    private Boolean allowEmptyRefer;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
