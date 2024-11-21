package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * GetImageSettingsResResultSettingsItemValueRange
 */
@lombok.Data
public final class GetImageSettingsResResultSettingsItemValueRange  {

    /**
     * <p>取值下限</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Lower")
    private Map<String, Object> lower;

    /**
     * <p>取值上限</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Upper")
    private Map<String, Object> upper;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
