package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLivePadPresetDetailResResultPresetListItem
 */
@lombok.Data
public final class DescribeLivePadPresetDetailResResultPresetListItem  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>模板详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetDetail")
    private DescribeLivePadPresetDetailResResultPresetListItemPresetDetail presetDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
