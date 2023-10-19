package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceStreamMetricsResResultMetricListItem
 */
@lombok.Data
public final class DescribeLiveSourceStreamMetricsResResultMetricListItem  {

    /**
     * <p>时间戳。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>视频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bitrate")
    private Float bitrate;

    /**
     * <p>视频帧率，单位为 fps</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Framerate")
    private Float framerate;

    /**
     * <p>音频帧率，单位为 fps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFramerate")
    private Float audioFramerate;

    /**
     * <p>音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Float audioBitrate;

    /**
     * <p>音频显示时间戳 PTS（Presentation Time Stamp），单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioPts")
    private Integer audioPts;

    /**
     * <p>视频显示时间戳 PTS（Presentation Time Stamp），单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoPts")
    private Integer videoPts;

    /**
     * <p>音视频时间戳差值，即 AudioPts 与 VideoPts 之间的差值，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PtsDelta")
    private Integer ptsDelta;

    /**
     * <p>音频帧间隔，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFrameGap")
    private Integer audioFrameGap;

    /**
     * <p>视频帧间隔，单位为 ms。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoFrameGap")
    private Integer videoFrameGap;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
