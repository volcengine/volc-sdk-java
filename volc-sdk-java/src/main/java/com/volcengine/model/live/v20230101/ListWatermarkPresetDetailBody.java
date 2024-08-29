package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListWatermarkPresetDetailBody
 */
@lombok.Data
public final class ListWatermarkPresetDetailBody  {

    /**
     * <p>水印模板 ID 列表，默认为空，表示查询结果不对模板 ID 进行筛选。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetIDList")
    private List<Long> presetIDList;

    /**
     * <p>水印模板名称列表，默认为空，表示查询结果不对模板名称进行筛选。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetNameList")
    private List<String> presetNameList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
