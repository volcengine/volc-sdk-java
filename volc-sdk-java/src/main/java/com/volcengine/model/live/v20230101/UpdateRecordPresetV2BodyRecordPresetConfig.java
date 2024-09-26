package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRecordPresetV2BodyRecordPresetConfig
 */
@lombok.Data
public final class UpdateRecordPresetV2BodyRecordPresetConfig  {

    /**
     * <p>是否录制转码流，默认值为 0。支持的取值如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制全部转码流；</p>
     *
     * <p>- `2`：录制指定转码流，即通过转码后缀列表 `TranscodeSuffixList` 匹配转码流进行录制，如果转码流后缀列表为空仍表示录制全部转码流。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>转码流和源流需至少选一个进行录制，即是否录制转码流（`TranscodeRecord`）和是否录制源流（`OriginRecord`）的取值至少一个不为 0。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private Integer transcodeRecord;

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
     * <p>转码流和源流需至少选一个进行录制，即是否录制转码流（`TranscodeRecord`）和是否录制源流（`OriginRecord`）的取值至少一个不为 0。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private Integer originRecord;

    /**
     * <p>录制为 HLS 格式时，单个 TS 切片时长，单位为秒，默认值为 `10`，取值范围为 [5,30]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private Integer sliceDuration;

    /**
     * <p>转码流后缀列表，是否录制转码设置为根据转码流列表匹配（`TranscodeRecord` 取值为 `2`）时生效，`TranscodeSuffixList` 默认配置为空，效果等同于录制全部转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffixList")
    private List<String> transcodeSuffixList;

    /**
     * <p>录制为 FLV 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一个录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FlvParam")
    private UpdateRecordPresetV2BodyRecordPresetConfigFlvParam flvParam;

    /**
     * <p>录制为 HLS 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一个录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HlsParam")
    private UpdateRecordPresetV2BodyRecordPresetConfigHlsParam hlsParam;

    /**
     * <p>录制为 MP4 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一个录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mp4Param")
    private UpdateRecordPresetV2BodyRecordPresetConfigMp4Param mp4Param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
