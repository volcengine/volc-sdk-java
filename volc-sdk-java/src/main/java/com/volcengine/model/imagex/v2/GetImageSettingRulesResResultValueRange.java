package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageSettingRulesResResultValueRange
 */
@lombok.Data
public final class GetImageSettingRulesResResultValueRange  {

    /**
     * <p>取值下限，该值的类型由 `Type` 决定。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Lower")
    private Map<String, Object> lower;

    /**
     * <p>取值上限，该值的类型由 `Type` 决定。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Upper")
    private Map<String, Object> upper;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
