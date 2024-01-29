package com.volcengine.model.imagex;


import com.alibaba.fastjson.JSON;

/**
 * DescribeImageVolcCdnAccessLogResResultLogsItem
 */
@lombok.Data
public final class DescribeImageVolcCdnAccessLogResResultLogsItem  {

    /**
     * <p>日志起始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Long startTime;

    /**
     * <p>日志结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Long endTime;

    /**
     * <p>日志包名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogName")
    private String logName;

    /**
     * <p>日志包下载地址，下载链接有效时间为 10 分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogPath")
    private String logPath;

    /**
     * <p>日志包大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogSize")
    private Long logSize;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
