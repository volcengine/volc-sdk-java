package com.volcengine.model.acep;


import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * BindPortMappingRuleBody
 */
@lombok.Data
public final class BindPortMappingRuleBody  {

    /**
     * <p>云手机业务 ID，可在**云手机控制台 > 业务管理 > 业务详情**中获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProductId")
    private String productId;

    /**
     * <p>实例 ID 列表。可通过调用 [ListPod](https://www.volcengine.com/docs/6394/1221468) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PodIdList")
    private List<String> podIdList;

    /**
     * <p>端口映射规则 ID 列表，需确保规则 ID 全局唯一；可通过调用 [CreatePortMappingRule](https://www.volcengine.com/docs/6394/1185240) 接口获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PortMappingRuleIdList")
    private List<String> portMappingRuleIdList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
