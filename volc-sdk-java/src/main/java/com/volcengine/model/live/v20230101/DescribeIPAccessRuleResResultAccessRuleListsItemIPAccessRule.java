package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeIPAccessRuleResResultAccessRuleListsItemIPAccessRule
 */
@lombok.Data
public final class DescribeIPAccessRuleResResultAccessRuleListsItemIPAccessRule  {

    /**
     * <p>IP 访问限制的类型，取值及含义如下。</p>
     *
     * <p>- allow: 白名单；</p>
     *
     * <p>- deny: 黑名单。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>是否开启当前限制。</p>
     *
     * <p>- true: 开启；</p>
     *
     * <p>- false: 关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>名单中的 IP 信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IPList")
    private List<String> iPList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
