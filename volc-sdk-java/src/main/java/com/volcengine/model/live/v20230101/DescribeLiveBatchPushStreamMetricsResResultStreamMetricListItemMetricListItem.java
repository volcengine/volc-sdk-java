package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItemMetricListItem
 */
@lombok.Data
public final class DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItemMetricListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内的视频码率最大值，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bitrate")
    private Float bitrate;

    /**
     * <p>当前数据聚合时间粒度内的视频帧率最大值，单位为 fps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Framerate")
    private Float framerate;

    /**
     * <p>当前数据聚合时间粒度内的音频帧率最大值，单位为 fps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFramerate")
    private Float audioFramerate;

    /**
     * <p>当前数据聚合时间粒度内的音频码率最大值，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Float audioBitrate;

    /**
     * <p>当前数据聚合时间粒度内，最后一个音频帧的显示时间戳 PTS（Presentation Time Stamp），单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioPts")
    private Integer audioPts;

    /**
     * <p>当前数据聚合时间粒度内，最后一个视频帧的显示时间戳 PTS（Presentation Time Stamp），单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoPts")
    private Integer videoPts;

    /**
     * <p>当前数据聚合时间粒度内，所有音视频帧显示时间戳差值的最大值，即所有 AudioPts 与 VideoPts 差值的最大值，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PtsDelta")
    private Integer ptsDelta;

    /**
     * <p>当前数据聚合时间粒度内，相邻音频帧显示时间戳差值的最大值，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFrameGap")
    private Integer audioFrameGap;

    /**
     * <p>当前数据聚合时间粒度内，相邻视频帧显示时间戳差值的最大值，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoFrameGap")
    private Integer videoFrameGap;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
