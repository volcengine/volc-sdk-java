package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListWatermarkPresetDetailResResult
 */
@lombok.Data
public final class ListWatermarkPresetDetailResResult  {

    /**
     * <p>统计消息，提供可用模板和不可用模板的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StaticsMsg")
    private String staticsMsg;

    /**
     * <p>不可正常使用的水印模板，如水印图片获取失败等原因导致的不可用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkErrMsgList")
    private List<ListWatermarkPresetDetailResResultWatermarkErrMsgListItem> watermarkErrMsgList;

    /**
     * <p>可正常使用的水印模板列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkPresetList")
    private List<ListWatermarkPresetDetailResResultWatermarkPresetListItem> watermarkPresetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
