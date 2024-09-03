package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItemMetricListItem
 */
@lombok.Data
public final class DescribeLiveBatchPushStreamMetricsResResultStreamMetricListItemMetricListItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的视频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bitrate")
    private Float bitrate;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的视频帧率，单位为 fps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Framerate")
    private Float framerate;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的音频帧率（每秒传输的音频数据包个数）。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFramerate")
    private Float audioFramerate;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Float audioBitrate;

    /**
     * <p>数据聚合时间粒度内，最后一个音频帧的显示时间戳 PTS（Presentation Time Stamp），单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioPts")
    private Integer audioPts;

    /**
     * <p>数据聚合时间粒度内，最后一个视频帧的显示时间戳 PTS（Presentation Time Stamp），单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoPts")
    private Integer videoPts;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的音视频帧显示时间戳差值，即所有 AudioPts 与 VideoPts 差值的最大值，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PtsDelta")
    private Integer ptsDelta;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的相邻音频帧显示时间戳差值，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioFrameGap")
    private Integer audioFrameGap;

    /**
     * <p>数据聚合时间粒度内，按聚合算法得出的相邻视频帧显示时间戳差值，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoFrameGap")
    private Integer videoFrameGap;

    /**
     * <p>音频编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ACodec")
    private String aCodec;

    /**
     * <p>推流客户端的 IP 地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ClientIp")
    private String clientIp;

    /**
     * <p>收到首帧的时间，使用 Unix 时间戳表示，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FirstFrameTime")
    private Integer firstFrameTime;

    /**
     * <p>推流画面分辨率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>推流服务端 IP。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServerIp")
    private String serverIp;

    /**
     * <p>推流开始时间，使用 Unix 时间戳表示，单位为毫秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamBeginTime")
    private Long streamBeginTime;

    /**
     * <p>视频编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VCodec")
    private String vCodec;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
