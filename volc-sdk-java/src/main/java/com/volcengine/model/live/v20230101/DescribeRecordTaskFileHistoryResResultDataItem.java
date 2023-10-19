package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryResResultDataItem
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryResResultDataItem  {

    /**
     * <p>域名空间名称。由 1 到 60 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>ToS 存储空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>ToS 中的保存路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>录制时长。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>开始推流时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>录制文件存储格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>结束推流时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>录制文件的文件名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileName")
    private String fileName;

    /**
     * <p>录制文件保存在 VoD 时，录制视频的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vid")
    private String vid;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
