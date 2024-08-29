package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushTaskResResultListItem
 */
@lombok.Data
public final class ListPullToPushTaskResResultListItem  {

    /**
     * <p>拉流转推任务的名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>任务 ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务的开始时间，RFC3339 格式的 UTC 时间，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>任务的结束时间，RFC3339 格式的 UTC 时间，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>接收拉流转推任务状态回调的地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackURL")
    private String callbackURL;

    /**
     * <p>拉流来源类型，支持的取值及含义如下。</p>
     *
     * <p>- `0`：直播源；</p>
     *
     * <p>- `1`：点播视频。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>点播视频文件循环播放模式，当拉流来源类型为点播视频时配置生效，参数取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `-1`：无限次循环，至任务结束；</p>
     *
     * <p>- `0`：有限次循环，循环次数以 PlayTimes 取值为准；</p>
     *
     * <p>- `>0`：有限次循环，循环次数以 CycleMode 取值为准。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CycleMode")
    private Integer cycleMode;

    /**
     * <p>推流地址，即直播源或点播视频转推的目标地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddr")
    private String dstAddr;

    /**
     * <p>直播源的拉流地址，拉流来源类型为直播源时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddr")
    private String srcAddr;

    /**
     * <p>点播视频播放地址列表，拉流来源类型为点播视频时返回此值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    /**
     * <p>拉流转推任务的状态，支持如下取值。</p>
     *
     *
     *
     * <p>- `停用`；</p>
     *
     * <p>- `未开始`；</p>
     *
     * <p>- `生效中`；</p>
     *
     * <p>- `已结束`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>推流地址类型。</p>
     *
     *
     *
     * <p>- `1`：非第三方，即推流地址域名已添加到视频直播。</p>
     *
     * <p>- `2`：第三方，即推流地址域名未添加到视频直播。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddrType")
    private Integer dstAddrType;

    /**
     * <p>为拉流转推视频添加的水印配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Watermark")
    private ListPullToPushTaskResResultListItemWatermark watermark;

    /**
     * <p>续播策略，续播策略指转推点播视频进行直播时出现断流并恢复后，如何继续播放的策略，拉流来源类型为点播视频时参数生效，支持的取值及含义如下。</p>
     *
     *
     *
     * <p>- `0`：从断流处续播（默认值）；</p>
     *
     * <p>- `1`：从断流处+自然流逝时长处续播。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContinueStrategy")
    private Integer continueStrategy;

    /**
     * <p>点播文件启播时间偏移值，单位为秒，数量与拉流地址列表中地址数量相等，缺省情况下为空表示不进行偏移。拉流来源类型为点播视频时，参数生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OffsetS")
    private List<Float> offsetS;

    /**
     * <p>点播视频文件循环播放次数，当 CycleMode 取值为 0 时，PlayTimes 取值将作为循环播放次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayTimes")
    private Integer playTimes;

    /**
     * <p>是否开启点播预热，开启点播预热后，系统会自动将点播视频文件缓存到 CDN 节点上，当用户请求直播时，可以直播从 CDN 节点获取视频，从而提高直播流畅度。拉流来源类型为点播视频时，参数生效。</p>
     *
     * <p>- `0`：不开启；</p>
     *
     * <p>- `1`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreDownload")
    private Integer preDownload;

    /**
     * <p>点播文件地址和开始播放、结束播放的时间设置。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 Type 为点播类型时配置生效。</p>
     *
     * <p>- 与 SrcAddrS 和 OffsetS 字段不可同时填写。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodSrcAddrs")
    private List<ListPullToPushTaskResResultListItemVodSrcAddrsItem> vodSrcAddrs;

    /**
     * <p>任务所属的群组名称，您可以调用 [ListPullToPushGroup](https://www.volcengine.com/docs/6469/1327382) 获取可用的群组。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 使用主账号调用时，为非必填，默认为空表示查询所有群组的任务列表。</p>
     *
     * <p>- 使用子账号调用时，为必填。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupName")
    private String groupName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
