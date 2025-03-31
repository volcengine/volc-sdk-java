package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainUaAccessBodyUaAuth
 */
@lombok.Data
public final class UpdateImageDomainUaAccessBodyUaAuth  {

    /**
     * <p>是否开启 UA 访问限制，取值如下所示：</p>
     *
     *
     *
     * <p>- `true`：开启</p>
     *
     * <p>- `false`：未开启（默认）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable")
    private Boolean enable;

    /**
     * <p>黑白名单设置类型，取值如下所示：</p>
     *
     *
     *
     * <p>- `deny`：黑名单</p>
     *
     * <p>- `allow`：白名单（默认）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "rule_type")
    private String ruleType;

    /**
     * <p>Agent 列表，最多可支持输入 1000 个，支持通配符 `*` 匹配任意字符串。输入多个时以 `|` 分割，或者一行仅输入一个。</p>
     *
     *
     *
     * <p>:::warning</p>
     *
     * <p>若您需要对同类型名单内已设定的 Agent 列表进行增删处理，那么您可调用 [获取域名配置](https://www.volcengine.com/docs/508/9366#ua-list) 接口获取已配置的全部列表后，在此基础上添加或删除您期望变更的值，最后重新传入 `user_agents`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "user_agents")
    private List<String> userAgents;

    /**
     * <p>是否允许 UA 为空或者不包含 UA 字段的请求访问加速域名。取值如下所示：</p>
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
