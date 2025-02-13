package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePadPresetDetailResResult
 */
@lombok.Data
public final class DescribeLivePadPresetDetailResResult  {

    /**
     * <p>模板列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetList")
    private List<DescribeLivePadPresetDetailResResultPresetListItem> presetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
