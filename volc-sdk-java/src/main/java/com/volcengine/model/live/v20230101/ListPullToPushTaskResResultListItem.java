package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushTaskResResultListItem
 */
@lombok.Data
public final class ListPullToPushTaskResResultListItem  {

    /**
     * <p>任务名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>任务 ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>任务开始时间，RFC3339 格式的 UTC 时间，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>任务结束时间，RFC3339 格式的 UTC 时间，单位为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>回调地址，用于接收回调消息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackURL")
    private String callbackURL;

    /**
     * <p>拉流来源类型。支持以下 2 种取值。</p>
     *
     *
     *
     * <p>- 0：直播；</p>
     *
     * <p>- 1：点播。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Integer type;

    /**
     * <p>循环模式。当 `"Type":0` 时，该参数无效，当 `"Type":1` 时，参数取值及含义如下所示。</p>
     *
     *
     *
     * <p>- \-1：表示无限循环，至任务结束；</p>
     *
     * <p>- ≥1：取值表示循环的次数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CycleMode")
    private Integer cycleMode;

    /**
     * <p>推流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddr")
    private String dstAddr;

    /**
     * <p>直播拉流地址。拉流来源类型 `type` 为直播 `0` 时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddr")
    private String srcAddr;

    /**
     * <p>点播播放地址列表。拉流来源类型 `type` 为点播 `1` 时返回。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrS")
    private List<String> srcAddrS;

    /**
     * <p>任务状态。支持以下取值。</p>
     *
     *
     *
     * <p>- 停用；</p>
     *
     * <p>- 未开始；</p>
     *
     * <p>- 生效中；</p>
     *
     * <p>- 已结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>推流地址类型。</p>
     *
     *
     *
     * <p>- 1：非第三方；</p>
     *
     * <p>- 2：第三方。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddrType")
    private Integer dstAddrType;

    /**
     * <p>水印信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Watermark")
    private ListPullToPushTaskResResultListItemWatermark watermark;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
