package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;

/**
 * GetImageMonitorRulesQuery
 */
@lombok.Data
public final class GetImageMonitorRulesQuery  {

    /**
     * <p>分页条数。默认值为 10，取值范围为（0，100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Limit")
    private Integer limit;

    /**
     * <p>分页偏移量。默认值为 0，表示从最新一个开始获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Integer offset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppId")
    private String appId;

    /**
     * <p>告警名称，以正则表达式进行筛选匹配。缺省时默认获取所有报警规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NamePtn")
    private String namePtn;

    /**
     * <p>报警规则 ID，按照指定 ID 返回对应报警规则。缺省时默认获取所有报警规则。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleId")
    private String ruleId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
