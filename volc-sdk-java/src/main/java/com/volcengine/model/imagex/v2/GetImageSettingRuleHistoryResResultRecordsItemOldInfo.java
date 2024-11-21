package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageSettingRuleHistoryResResultRecordsItemOldInfo
 */
@lombok.Data
public final class GetImageSettingRuleHistoryResResultRecordsItemOldInfo  {

    /**
     * <p>规则配置信息，即匹配条件。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Content")
    private String content;

    /**
     * <p>规则配置值，即配置内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Map<String, Object> value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
