package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParamTOSParam
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParamTOSParam  {

    /**
     * <p>截图是否使用 TOS 存储，取值及含义如下所示。</p>
     *
     * <p>- false：不使用；</p>
     *
     * <p>- true：使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>TOS 存储对应的 Bucket。</p>
     *
     * <p>例如，存储路径为 live-test-tos-example/live/liveapp 时，Bucket 取值为 live-test-tos-example。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>Bucket 目录。</p>
     *
     * <p>例如，存储路径为 live-test-tos-example/live/liveapp 时，StorageDir 取值为 live/liveapp。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>存储方式为实时截图时的存储规则，支持以 {Domain}/{App}/{Stream}/{UnixTimestamp} 样式设置存储规则，支持输入字母、数字、-、!、\_、.、\* 及占位符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    /**
     * <p>存储方式为覆盖截图时的存储规则，支持以 {Domain}/{App}/{Stream} 样式设置存储规则，支持输入字母、数字、-、!、\_、.、\* 及占位符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverwriteObject")
    private String overwriteObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
