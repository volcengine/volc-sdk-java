package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateHighLightTaskBodyHLMixParam
 */
@lombok.Data
public final class CreateHighLightTaskBodyHLMixParam  {

    /**
     * <p>是否启用高光混剪功能。默认值为 `false`。</p>
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>高光混剪时长上限，单位为秒，缺省情况下默认值为 `210`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 该参数仅在算法模型为文娱短剧（即 `"Model":1`）时生效。</p>
     *
     * <p>- 当 `DurationMax` 和 `DurationMin` 取值相同时，则该时长为高光混剪的固定时长。</p>
     *
     * <p>- `DurationMax` 取值大于等于 `DurationMin` 取值。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationMax")
    private Integer durationMax;

    /**
     * <p>高光混剪时长下限，单位为秒，缺省情况下默认值为 `180`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 该参数仅在算法模型为文娱短剧（即 `"Model":1`）时生效。</p>
     *
     * <p>- 当 `DurationMax` 和 `DurationMin` 取值相同时，则该时长为高光混剪的固定时长。</p>
     *
     * <p>- `DurationMin` 取值小于等于 `DurationMax` 取值。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DurationMin")
    private Integer durationMin;

    /**
     * <p>累计生成高光混剪数量上限，默认值为 `1`，取值范围为 `[1,100]`。</p>
     *
     * <p>:::tip</p>
     *
     * <p>该参数仅在算法模型为文娱短剧（即 `"Model":1`）时生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NumLimit")
    private Integer numLimit;

    /**
     * <p>生成并返回高光混剪的时间点，支持设置多个时间节点。该时间相对于任务开始时间 `TaskStartTime` 计算，单位为分钟，取值范围为 [5,1440]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>该参数仅在数据源类型为直播（即 `"Type":0`）时生效，缺省情况下，默认在任务结束后生成并返回高光混剪。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimestamps")
    private List<Integer> createTimestamps;

    /**
     * <p>高光混剪的编码格式，默认值为 `0`。</p>
     *
     * <p>- `0`：H264；</p>
     *
     * <p>- `1`：H265。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncCodec")
    private Integer encCodec;

    /**
     * <p>是否开启卖点贴纸功能，默认值为 `false`。</p>
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SellPointSticker")
    private Boolean sellPointSticker;

    /**
     * <p>是否开启声音生成字幕，默认值为 `false`。</p>
     *
     * <p>- `true`：开启；</p>
     *
     * <p>- `false`：关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Subtitle")
    private Boolean subtitle;

    /**
     * <p>高光混剪的视频封装格式，默认值为 `0`。取值如下所示：</p>
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
