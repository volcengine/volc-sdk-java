package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageSettingRulesResResultRulesItemCond
 */
@lombok.Data
public final class GetImageSettingRulesResResultRulesItemCond  {

    /**
     * <p>匹配条件，取值如下所示：</p>
     *
     * <p>- `AND`：表示与</p>
     *
     * <p>- `OR`：表示或</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>条件列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Conds")
    private List<GetImageSettingRulesResResultRulesItemCondCondsItem> conds;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
