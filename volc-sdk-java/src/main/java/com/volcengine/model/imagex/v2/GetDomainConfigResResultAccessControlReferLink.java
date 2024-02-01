package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetDomainConfigResResultAccessControlReferLink
 */
@lombok.Data
public final class GetDomainConfigResResultAccessControlReferLink  {

    /**
     * <p>是否开启 Referer 访问限制，取值如下所示：</p>
     *
     * <p>* `true`：开启 Referer 访问限制</p>
     *
     * <p>* `false`：关闭 Referer 访问限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>是否是 Referer 白名单模式，取值如下所示：</p>
     *
     * <p>* `true`：白名单模式</p>
     *
     * <p>* `false`：黑名单模式</p>
     *
     * <p>:::tip</p>
     *
     * <p>当`is_white_mode`为`false`时，即选用黑名单时，需确保`allow_empty_refer`为`true`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "is_white_mode")
    private Boolean isWhiteMode;

    /**
     * <p>是否允许空 Referer，取值如下所示：</p>
     *
     * <p>* `true`：允许空 Referer</p>
     *
     * <p>* `false`：禁止空 Referer</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty_refer")
    private Boolean allowEmptyRefer;

    /**
     * <p>Referer 列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "values")
    private List<String> values;

    /**
     * <p>正则规则列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "regex_values")
    private List<String> regexValues;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
