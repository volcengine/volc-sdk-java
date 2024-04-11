package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordTaskFileHistoryResResultDataItem
 */
@lombok.Data
public final class DescribeRecordTaskFileHistoryResResultDataItem  {

    /**
     * <p>域名空间名称。</p>
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
     * <p> 存储位置为 TOS 时的 Bucket。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>存储位置为 TOS 时，在 Bucket 中的存储路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Path")
    private String path;

    /**
     * <p>录制时长。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>开始录制时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>录制文件存储格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>结束录制时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>录制文件的文件名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FileName")
    private String fileName;

    /**
     * <p>录制文件保存在 VOD 时，录制文件的 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vid")
    private String vid;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
