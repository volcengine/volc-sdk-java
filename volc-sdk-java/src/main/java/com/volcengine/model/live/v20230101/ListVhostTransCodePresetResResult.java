package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostTransCodePresetResResult
 */
@lombok.Data
public final class ListVhostTransCodePresetResResult  {

    /**
     * <p>使用内置参数的转码配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CommonPresetList")
    private List<ListVhostTransCodePresetResResultCommonPresetListItem> commonPresetList;

    /**
     * <p>使用自定义配置的转码配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CustomizePresetList")
    private List<ListVhostTransCodePresetResResultCustomizePresetListItem> customizePresetList;

    /**
     * <p>全部转码配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllPresetList")
    private List<ListVhostTransCodePresetResResultAllPresetListItem> allPresetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
