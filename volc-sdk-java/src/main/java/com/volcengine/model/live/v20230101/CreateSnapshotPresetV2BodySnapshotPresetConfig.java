package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateSnapshotPresetV2BodySnapshotPresetConfig
 */
@lombok.Data
public final class CreateSnapshotPresetV2BodySnapshotPresetConfig  {

    /**
     * <p>图片格式为 JPEG 时的截图参数，开启 JPEG 截图时设置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>JPEG 截图和 JPG 截图必须开启且只能开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JpegParam")
    private CreateSnapshotPresetV2BodySnapshotPresetConfigJpegParam jpegParam;

    /**
     * <p>截图间隔时间，单位为秒，默认值为 10，取值范围为正整数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>截图格式为 JPG 时的截图参数，开启 JPG 截图时设置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>JPEG 截图和 JPG 截图必须开启且只能开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "JpgParam")
    private CreateSnapshotPresetV2BodySnapshotPresetConfigJpgParam jpgParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
