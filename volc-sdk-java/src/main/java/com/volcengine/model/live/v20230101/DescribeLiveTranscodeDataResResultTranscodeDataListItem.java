package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveTranscodeDataResResultTranscodeDataListItem
 */
@lombok.Data
public final class DescribeLiveTranscodeDataResResultTranscodeDataListItem  {

    /**
     * <p>当前数据聚合时间粒度内的转码时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>转码分辨率档位，以 720P 为例，表示转码配置的长边 x 短边计算而出的面积大于 480P（640 × 480）且小于等于 720P 档位（1280 x 720）。</p>
     *
     * <p>- 480P：640 × 480； </p>
     *
     * <p>- 720P：1280 × 720； </p>
     *
     * <p>- 1080P：1936 × 1088； </p>
     *
     * <p>- 2K：2560 × 1440； </p>
     *
     * <p>- 4K：4096 × 2160； </p>
     *
     * <p>- 8K：> 4096 x 2160</p>
     *
     * <p>- 0P：纯音频转码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>转码格式，支持的取值和含义如下所示。</p>
     *
     * <p>- Normal_H264：H.264 标准转码；</p>
     *
     * <p>- Normal_H265：H.265 标准转码；</p>
     *
     * <p>- Normal_H266：H.266 标准转码；</p>
     *
     * <p>- ByteHD_H264：H.264 极智超清；</p>
     *
     * <p>- ByteHD_H265：H.265 极智超清；</p>
     *
     * <p>- ByteHD_H266：H.266 极智超清；</p>
     *
     * <p>- ByteQE：画质增强；</p>
     *
     * <p>- Audio：纯音频流；</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeType")
    private String transcodeType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
