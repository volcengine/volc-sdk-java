package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListTimeShiftPresetV2ResResult
 */
@lombok.Data
public final class ListTimeShiftPresetV2ResResult  {

    /**
     * <p>时移配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "List")
    private List<ListTimeShiftPresetV2ResResultListItem> list;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
