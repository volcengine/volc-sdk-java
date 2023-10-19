package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListCommonTransPresetDetailBody
 */
@lombok.Data
public final class ListCommonTransPresetDetailBody  {

    /**
     * <p>模板名称列表，缺省情况下，表示查询所有系统内置转码档位。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<String> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
