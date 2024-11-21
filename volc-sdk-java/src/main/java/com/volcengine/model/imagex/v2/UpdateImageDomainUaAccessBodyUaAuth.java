package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateImageDomainUaAccessBodyUaAuth
 */
@lombok.Data
public final class UpdateImageDomainUaAccessBodyUaAuth  {

    /**
     * <p>是否开启ua访问限制</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "enable")
    private Boolean enable;

    /**
     * <p>ua访问限制模式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "rule_type")
    private String ruleType;

    /**
     * <p>agent列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "user_agents")
    private List<String> userAgents;

    /**
     * <p>表示是否允许 UA 为空或者不包含 UA 字段的请求访问加速域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "allow_empty")
    private Boolean allowEmpty;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
