package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostWatermarkPresetResResult
 */
@lombok.Data
public final class ListVhostWatermarkPresetResResult  {

    /**
     * <p>统计消息，提供查询成功和失败的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StaticsMsg")
    private String staticsMsg;

    /**
     * <p>获取模板失败的列表，返回获取失败的模版及获取失败的原因。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkErrMsgList")
    private List<ListVhostWatermarkPresetResResultWatermarkErrMsgListItem> watermarkErrMsgList;

    /**
     * <p>水印模版列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkPresetList")
    private List<ListVhostWatermarkPresetResResultWatermarkPresetListItem> watermarkPresetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
