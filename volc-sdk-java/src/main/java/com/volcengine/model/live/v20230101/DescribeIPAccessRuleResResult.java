package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeIPAccessRuleResResult
 */
@lombok.Data
public final class DescribeIPAccessRuleResResult  {

    /**
     * <p>IP 访问限制规则列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccessRuleLists")
    private List<DescribeIPAccessRuleResResultAccessRuleListsItem> accessRuleLists;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
