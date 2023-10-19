package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2BodyRecordPresetConfig
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfig  {

    /**
     * <p>转码流录制，默认值为 0。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- 0：不录制；</p>
     *
     * <p>- 1：录制。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`TranscodeRecord`和`OriginRecord`的取值至少一个为 1。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private Integer transcodeRecord;

    /**
     * <p>源流录制，默认值为 0。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- 0：不录制；</p>
     *
     * <p>- 1：录制。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>`TranscodeRecord`和`OriginRecord`的取值至少一个为 1。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private Integer originRecord;

    /**
     * <p>录制 HLS 格式时，单个 TS 切片时长，单位为 s，默认值为 5，取值范围为 [5,30]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private Integer sliceDuration;

    /**
     * <p>FLV 录制参数，开启 FLV 录制时设置</p>
     *
     * <p>:::tip</p>
     *
     * <p>`FlvParam`、`HlsParam`、`Mp4Param`至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FlvParam")
    private CreateRecordPresetV2BodyRecordPresetConfigFlvParam flvParam;

    /**
     * <p>HLS 录制参数，开启 HLS 录制时设置</p>
     *
     * <p>:::tip</p>
     *
     * <p>`FlvParam`、`HlsParam`、`Mp4Param`至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HlsParam")
    private CreateRecordPresetV2BodyRecordPresetConfigHlsParam hlsParam;

    /**
     * <p>MP4 录制参数，开启 MP4 录制时设置</p>
     *
     * <p>:::tip</p>
     *
     * <p>`FlvParam`、`HlsParam`、`Mp4Param`至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mp4Param")
    private CreateRecordPresetV2BodyRecordPresetConfigMp4Param mp4Param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
