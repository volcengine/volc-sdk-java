package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateRecordPresetV2BodyRecordPresetConfig
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfig  {

    /**
     * <p>是否录制转码流，默认值为 `0`，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制全部转码流；</p>
     *
     * <p>- `2`：录制指定转码流，根据转码后缀列表 `TranscodeSuffixList` 决定录制哪些转码流。如果这个列表为空，则效果和设置为 `1` 一样，即录制所有转码流。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>转码流和源流需至少选一个进行录制，即 `TranscodeRecord` 和 `OriginRecord` 的取值不能同时为 `0`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private Integer transcodeRecord;

    /**
     * <p>转码流后缀列表，用来指定需要录制哪些转码流。在 `TranscodeRecord` 取值为 `2` 时生效。如果该参数为空，那么录制的行为等同于 `TranscodeRecord = 1`，即录制所有转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffixList")
    private List<String> transcodeSuffixList;

    /**
     * <p>是否录制源流，默认值为 `0`，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>转码流和源流需至少选一个进行录制，即 `TranscodeRecord` 和 `OriginRecord` 的取值不能同时为 `0`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private Integer originRecord;

    /**
     * <p>录制为 HLS 格式时，单个 TS 切片时长，单位为秒，默认值为 `10`，取值范围为 [2,100]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private Integer sliceDuration;

    /**
     * <p>录制为 FLV 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一种录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FlvParam")
    private CreateRecordPresetV2BodyRecordPresetConfigFlvParam flvParam;

    /**
     * <p>录制为 HLS 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一种录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HlsParam")
    private CreateRecordPresetV2BodyRecordPresetConfigHlsParam hlsParam;

    /**
     * <p>录制为 MP4 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一种录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
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
