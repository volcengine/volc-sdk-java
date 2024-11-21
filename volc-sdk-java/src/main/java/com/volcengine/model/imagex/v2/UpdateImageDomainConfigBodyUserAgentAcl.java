package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainConfigBodyUserAgentAcl
 */
@lombok.Data
public final class UpdateImageDomainConfigBodyUserAgentAcl  {

    /**
     * <p>是否开启 UA 访问限制，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：未开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enabled")
    private Boolean enabled;

    /**
     * <p>黑白名单设置类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `deny`：黑名单</p>
     *
     * <p>- `allow`：白名单</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "rule_type")
    private String ruleType;

    /**
     * <p>Agent 列表，最多可支持输入100个，支持通配符`*`匹配任意字符串。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "user_agents")
    private List<String> userAgents;

    /**
     * <p>表示是否允许 UA 为空或者不包含 UA 字段的请求访问加速域名。取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：允许</p>
     *
     * <p>- `false`：不允许</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty")
    private Boolean allowEmpty;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
