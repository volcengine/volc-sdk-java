package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreatePullToPushTaskBody
 */
@lombok.Data
public final class CreatePullToPushTaskBody  {

    /**
     * <p>拉流转推任务的名称，默认为空表示不配置任务名称。支持由中文、大小写字母（A - Z、a - z）和数字（0 - 9）组成，长度为 1 到 20 各字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>任务的开始时间，Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>拉流转推任务持续时间最长为 7 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>任务的结束时间，Unix 时间戳，单位为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>拉流转推任务持续时间最长为 7 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

    /**
     * <p>接收拉流转推任务状态回调的地址，最大长度为 2000 个字符，默认为空。</p>
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
     * <p>点播视频文件循环播放模式，当拉流来源类型为点播视频时为必选参数，参数取值及含义如下所示。</p>
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
     * <p>直播源的拉流地址，拉流来源类型为直播源时，为必传参数，最大长度为 1000 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddr")
    private String srcAddr;

    /**
     * <p>点播视频播放地址列表，拉流来源类型为点播视频时，为必传参数，最多支持传入 30 个点播视频播放地址，每个地址最大长度为 1000 个字符。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>此字段为旧版本配置，请使用 `VodSrcAddrs` 配置点播视频地址和播放偏移时间。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    /**
     * <p>点播视频文件循环播放次数，当 CycleMode 取值为 0 时，PlayTimes 取值将作为循环播放次数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>PlayTimes 为冗余参数，您可以将 PlayTimes 置 0 后直接使用 CycleMode 指定点播视频文件循环播放次数。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayTimes")
    private Integer playTimes;

    /**
     * <p>推流域名，推流地址（DstAddr）为空时必传；反之，则该参数不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>推流应用名称，推流地址（DstAddr）为空时必传；反之，则该参数不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>推流的流名称，推流地址（DstAddr）为空时必传；反之，则该参数不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>为拉流转推视频添加的水印配置信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Watermark")
    private CreatePullToPushTaskBodyWatermark watermark;

    /**
     * <p>是否开启点播预热，开启点播预热后，系统会自动将点播视频文件缓存到 CDN 节点上，当用户请求直播时，可以直播从 CDN 节点获取视频，从而提高直播流畅度。拉流来源类型为点播视频时，参数生效。</p>
     *
     * <p>- `0`：不开启；</p>
     *
     * <p>- `1`：开启（默认值）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreDownload")
    private Integer preDownload;

    /**
     * <p>点播文件启播时间偏移值，单位为秒，数量与拉流地址列表中地址数量相等，缺省情况下为空表示不进行偏移。拉流来源类型为点播视频时，参数生效。</p>
     *
     * <p>:::tip</p>
     *
     * <p>此字段为旧版本配置，请使用 `VodSrcAddrs` 配置点播视频地址和播放偏移时间。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OffsetS")
    private List<Float> offsetS;

    /**
     * <p>续播策略，续播策略指转推点播视频进行直播时出现断流并恢复后，如何继续播放的策略，拉流来源类型为点播视频（Type 为 1）时参数生效，支持的取值及含义如下。</p>
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
     * <p>点播文件启播时间偏移值，单位为秒，仅当点播视频播放地址列表（SrcAddrS）只有一个地址，且未配置 Offsets 时生效，缺省情况下为空表示不进行偏移。</p>
     *
     * <p>:::tip</p>
     *
     * <p>此字段为旧版本配置，请使用 `VodSrcAddrs` 配置点播视频地址和播放偏移时间。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Float offset;

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
    private List<CreatePullToPushTaskBodyVodSrcAddrsItem> vodSrcAddrs;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
