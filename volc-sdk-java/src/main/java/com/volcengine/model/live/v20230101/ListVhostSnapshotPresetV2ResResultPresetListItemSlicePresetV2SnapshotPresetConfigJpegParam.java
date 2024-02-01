package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParam
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParam  {

    /**
     * <p>当前格式的截图是否开启，默认为 false，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- false：不开启；</p>
     *
     * <p>- true：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>截图存储到 TOS 时的配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>TOSParam 和 ImageXParam 配置且配置其中一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TOSParam")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParamTOSParam tOSParam;

    /**
     * <p>截图存储到 veImageX 时的配置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>TOSParam 和 ImageXParam 配置且配置其中一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ImageXParam")
    private ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParamImageXParam imageXParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
