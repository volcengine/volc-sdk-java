package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateLiveStreamRecordIndexFilesResResult
 */
@lombok.Data
public final class CreateLiveStreamRecordIndexFilesResResult  {

    /**
     * <p>直播流使用的域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>直播流使用的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播流使用的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>录制流的高度，单位为 px。当 `NeedFFProbe` 配置为 `true` 时返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>录制流的宽度，单位为 px。当 `NeedFFProbe` 配置为 `true` 时返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>录制文件实际时长，单位为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>生成的录制索引文件网网络访问地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordURL")
    private String recordURL;

    /**
     * <p>Bucket 名称，存储到 TOS 时返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputBucket")
    private String outputBucket;

    /**
     * <p>根据存储规则生成的存储路径及文件名称，存储到 TOS 时返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OutputObject")
    private String outputObject;

    /**
     * <p>视频点播的空间名称，录制文件存储到视频点播时返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>视频点播文件 ID，录制文件存储到视频点播返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VID")
    private String vID;

    /**
     * <p>视频点播文件 URI，录制文件存储到视频点播时返回此参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "URI")
    private String uRI;

    /**
     * <p>创建录制索引文件任务的时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimeUTC")
    private String createTimeUTC;

    /**
     * <p>录制索引文件的结束时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTimeUTC")
    private String endTimeUTC;

    /**
     * <p>录制索引文件的开始时间，RFC3339 格式的 UTC 时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTimeUTC")
    private String startTimeUTC;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
