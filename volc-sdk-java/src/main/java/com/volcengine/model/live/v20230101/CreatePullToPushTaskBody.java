package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreatePullToPushTaskBody
 */
@lombok.Data
public final class CreatePullToPushTaskBody  {

    /**
     * <p>标题，支持中英文字符、数字，最大长度为 10 个字符</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>开始时间，Unix 时间戳，单位为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>结束时间，Unix 时间戳（秒）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

    /**
     * <p>回调地址，最大长度为 2000 个字符</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackURL")
    private String callbackURL;

    /**
     * <p>拉流来源类型。支持以下 2 种取值。</p>
     *
     *
     *
     * <p>- 0：直播源；</p>
     *
     * <p>- 1：点播视频。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>循环模式。当 `"Type":1` 时，为必选参数。当 `"Type":0` 时，该参数无效。参数取值及含义如下所示。</p>
     *
     *
     *
     * <p>- \-1：默认值，表示无限循环，至任务结束；</p>
     *
     * <p>- 0：表示有限次循环，循环次数为 `PlayTimes` 的取值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CycleMode")
    private Integer cycleMode;

    /**
     * <p>推流地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddr")
    private String dstAddr;

    /**
     * <p>拉流地址，与 `SrcAddrS` 二选一<br></p>
     *
     * <p>最大长度为 1000 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddr")
    private String srcAddr;

    /**
     * <p>拉流地址列表，与 `SrcAddr` 二选一。最多支持传入 20 个拉流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    /**
     * <p>点播文件循环播放次数。当 `"CycleMode":0` 时，为必选参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayTimes")
    private Integer playTimes;

    /**
     * <p>推流域名，`DstAddr` 为空时必传；反之，则该参数不生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>推流 App 名称，`DstAddr` 为空时必传；反之，则该参数不生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>转推的推流流名，`DstAddr` 为空时必传；反之，则该参数不生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>水印信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Watermark")
    private CreatePullToPushTaskBodyWatermark watermark;

    /**
     * <p>是否开启点播预热，仅对点播地址生效。</p>
     *
     *
     *
     * <p>- 0：不开启；</p>
     *
     * <p>- 1: 开启（默认值）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreDownload")
    private Integer preDownload;

    /**
     * <p>点播文件启播时间偏移值, 单位秒；数量与 SrcAddrS 列表数量相等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OffsetS")
    private List<Float> offsetS;

    /**
     * <p>续播策略，支持以下配置项。</p>
     *
     *
     *
     * <p>- 0：从断流处续播（默认值）；</p>
     *
     * <p>- 1：从断流处+自然流逝时长处续播。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContinueStrategy")
    private Integer continueStrategy;

    /**
     * <p>点播文件启播时间偏移值，仅当 SrcAddr 不为空时生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Offset")
    private Float offset;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
