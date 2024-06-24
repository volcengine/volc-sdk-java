package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTranscodeDataResResult
 */
@lombok.Data
public final class DescribeLiveTranscodeDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的起始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>查询时间范围内的转码总时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeDataList")
    private List<DescribeLiveTranscodeDataResResultTranscodeDataListItem> transcodeDataList;

    /**
     * <p>查询流粒度数据时的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询流粒度数据时的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>指定查询的转码分辨率档位，取值及含义如下所示。</p>
     *
     * <p>- `480P`：640 × 480；</p>
     *
     * <p>- `720P`：1280 × 720；</p>
     *
     * <p>- `1080P`：1920 × 1088；</p>
     *
     * <p>- `2K`：2560 × 1440；</p>
     *
     * <p>- `4K`：4096 × 2160；</p>
     *
     * <p>- `8K`：> 4096 x 2160；</p>
     *
     * <p>- `0P`：纯音频转码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private List<String> resolution;

    /**
     * <p>指定查询的视频编码格式，支持的取值和含义如下所示。</p>
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
    private List<String> transcodeType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
