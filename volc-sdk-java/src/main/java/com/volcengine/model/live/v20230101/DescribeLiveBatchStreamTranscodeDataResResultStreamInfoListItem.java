package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveBatchStreamTranscodeDataResResultStreamInfoListItem
 */
@lombok.Data
public final class DescribeLiveBatchStreamTranscodeDataResResultStreamInfoListItem  {

    /**
     * <p>域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>当前流的分辨率，支持的取值如下所示。</p>
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
     * <p>- 0P：纯音频流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Resolution")
    private String resolution;

    /**
     * <p>当前流的转码总时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>视频编码格式，支持的取值和含义如下所示。</p>
     *
     * <p>- Normal_H264：H.264 标准转码； </p>
     *
     * <p>- Normal_H265：H.265 标准转码； </p>
     *
     * <p>- ByteHD_H264：H.264 极智超清； </p>
     *
     * <p>- ByteHD_H265：H.265 极智超清； </p>
     *
     * <p>- Audio：纯音频流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VCodec")
    private String vCodec;

    /**
     * <p>码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Coderate")
    private Integer coderate;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
