package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListWatermarkPresetDetailResResultWatermarkErrMsgListItem
 */
@lombok.Data
public final class ListWatermarkPresetDetailResResultWatermarkErrMsgListItem  {

    /**
     * <p>获取水印模板失败的具体错误信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>水印模板的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private Integer iD;

    /**
     * <p>水印模板的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
