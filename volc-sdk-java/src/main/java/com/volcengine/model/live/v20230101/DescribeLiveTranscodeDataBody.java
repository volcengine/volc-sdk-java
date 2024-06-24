package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTranscodeDataBody
 */
@lombok.Data
public final class DescribeLiveTranscodeDataBody  {

    /**
     * <p>域名列表，默认为空，表示查询您视频直播产品下所有域名的转码用量数据。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，获取待查询的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     *
     * <p>:::tip</p>
     *
     * <p>单次查询最大时间跨度为 93 天，历史查询最大时间范围为 366 天。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒，当前接口默认且仅支持按 `86400` 秒进行数据聚合。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度数据时，需同时传入 `App` 和 `Stream`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询流粒度数据时，需同时传入 `App` 和 `Stream`。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>转码分辨率档位，默认为空表示不指定转码分辨率档位。以 720P 为例，表示转码配置的长边 x 短边计算而出的面积大于 480P（640 × 480）且小于等于 720P 档位（1280 x 720）。支持的取值及含义如下所示。</p>
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
     * <p>视频编码格式，默认为空表示不指定编码格式，支持的取值和含义如下所示。</p>
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
