package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateHighLightTaskBodyHLClipsParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyHLClipsParam  {

    /**
     * <p>是否启用高光片段提取。默认值为 `false`。</p>
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>是否生成高光片段视频素材，仅当 `HLClipsParam.Enable` 为 `true` 时生效，默认值为 `false`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>若 `Enable` 为 `true`，且 `OutputHLClips` 为 `false`，则回调仅包含高光片段信息，您可以根据片段信息，自行剪辑视频素材。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputHLClips")
    private Boolean outputHLClips;

    /**
     * <p>针对算法检测出的高光片段前后分别增加的冗余时间，单位为秒，默认值为 `0`，取值范围为 `[0,60]`。适用于对算法检出的高光片段内容信任度不高，期望获取更多冗余素材，以便自行剪辑的场景。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BufferDuration")
    private Integer bufferDuration;

    /**
     * <p>是否禁止高光片段时间戳返回，默认为 `false`。</p>
     *
     * <p>- `true`：禁止返回时间戳；</p>
     *
     * <p>- `false`：允许返回时间戳。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DisableTimestamp")
    private Boolean disableTimestamp;

    /**
     * <p>高光片段的编码格式，默认值为 `0`。</p>
     *
     * <p>- `0`：H264；</p>
     *
     * <p>- `1`：H265。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncCodec")
    private Integer encCodec;

    /**
     * <p>累计生成高光片段数量上限，仅针对数据源类型为视频时生效。默认值为 `0`，表示不限制数量。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NumLimit")
    private Integer numLimit;

    /**
     * <p>高光片段的视频封装格式，默认值为 `0`。取值如下所示：</p>
     *
     * <p>- `0`：MP4 格式；</p>
     *
     * <p>- `1`：HLS 流媒体格式（包含 M3U8 索引文件和 TS 分片文件）；</p>
     *
     * <p>- `2`：FLV 流媒体格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoFormat")
    private Integer videoFormat;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
