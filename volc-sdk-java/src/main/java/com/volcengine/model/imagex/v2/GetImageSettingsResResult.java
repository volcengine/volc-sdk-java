package com.volcengine.model.imagex.v2;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GetImageSettingsResResult
 */
@lombok.Data
public final class GetImageSettingsResResult  {

    /**
     * <p>配置项列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Settings")
    private List<GetImageSettingsResResultSettingsItem> settings;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
