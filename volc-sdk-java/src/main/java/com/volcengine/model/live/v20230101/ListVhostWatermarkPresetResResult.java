package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostWatermarkPresetResResult
 */
@lombok.Data
public final class ListVhostWatermarkPresetResResult  {

    /**
     * <p>统计消息，提供可用配置和不可用配置的数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StaticsMsg")
    private String staticsMsg;

    /**
     * <p>不可正常使用的水印配置列表，如水印图片获取失败等原因导致的配置不可用。返回不可正常使用的水印配置信息及配置不可用的原因。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkErrMsgList")
    private List<ListVhostWatermarkPresetResResultWatermarkErrMsgListItem> watermarkErrMsgList;

    /**
     * <p>可正常使用的水印配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WatermarkPresetList")
    private List<ListVhostWatermarkPresetResResultWatermarkPresetListItem> watermarkPresetList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
