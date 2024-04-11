package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfig
 */
@lombok.Data
public final class ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfig  {

    /**
     * <p>转码流录制，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制全部转码流；</p>
     *
     * <p>- `2`：录制指定转码流，即通过转码后缀列表 `TranscodeSuffixList` 匹配转码流进行录制，如果转码流后缀列表为空仍表示录制全部转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private Integer transcodeRecord;

    /**
     * <p>转码流后缀列表，转码流录制配置为根据转码流列表匹配（`TranscodeRecord` 取值为 `2`）时生效，`TranscodeSuffixList` 配置为空时，效果等同于录制全部转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffixList")
    private List<String> transcodeSuffixList;

    /**
     * <p>- 是否源流录制，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private Integer originRecord;

    /**
     * <p>录制为 HLS 格式时，单个 TS 切片时长，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private Integer sliceDuration;

    /**
     * <p>录制为 FLV 格式时的录制参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FlvParam")
    private ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigFlvParam flvParam;

    /**
     * <p>录制为 HLS 格式时的录制参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HlsParam")
    private ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigHlsParam hlsParam;

    /**
     * <p>录制为 HLS 格式时的录制参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mp4Param")
    private ListVhostRecordPresetV2ResResultPresetListItemSlicePresetV2RecordPresetConfigMp4Param mp4Param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
