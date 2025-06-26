package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePadPresetDetailResResult
 */
@lombok.Data
public final class DescribeLivePadPresetDetailResResult  {

    /**
     * <p>模板列表，包含每个模板的详细信息，如域名空间、应用名称、流名称以及模板详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<DescribeLivePadPresetDetailResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
