package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostRecordPresetV2ResResultPresetListItem
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResultPresetListItem  {

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>录制参数详细信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SlicePresetV2")
    private ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2 slicePresetV2;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
