package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTranscodeInfoDataResResultTranscodeInfoDataListItem
 */
@lombok.Data
public final class DescribeLiveTranscodeInfoDataResResultTranscodeInfoDataListItem  {

    /**
     * <p>当前转码任务在查询时间范围内的转码时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>转码分辨率档位，以 720P 为例，表示转码配置的长边 x 短边计算而出的面积大于 480P（640 × 480）且小于等于 720P 档位（1280 x 720）。取值及含义如下所示。</p>
     *
     * <p>- `480P`：640 × 480； </p>
     *
     * <p>- `720P`：1280 × 720； </p>
     *
     * <p>- `1080P`：1936 × 1088； </p>
     *
     * <p>- `2K`：2560 × 1440； </p>
     *
     * <p>- `4K`：4096 × 2160； </p>
     *
     * <p>- `8K`：> 4096 x 2160</p>
     *
     * <p>- `0P`：纯音频转码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>视频转码格式，取值和含义如下所示。</p>
     *
     * <p>- `Normal_H264`：H.264 标准转码；</p>
     *
     * <p>- `Normal_H265`：H.265 标准转码；</p>
     *
     * <p>- `Normal_H266`：H.266 标准转码；</p>
     *
     * <p>- `ByteHD_H264`：H.264 极智超清；</p>
     *
     * <p>- `ByteHD_H265`：H.265 极智超清；</p>
     *
     * <p>- `ByteHD_H266`：H.266 极智超清；</p>
     *
     * <p>- `ByteQE`：画质增强；</p>
     *
     * <p>- `Audio`：纯音频流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeType")
    private String transcodeType;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>转码配置定义的转码后缀。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffix")
    private String transcodeSuffix;

    /**
     * <p>当前转码任务的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>当前转码任务的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>转码任务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
