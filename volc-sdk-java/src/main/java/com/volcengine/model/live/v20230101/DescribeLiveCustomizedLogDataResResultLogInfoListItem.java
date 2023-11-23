package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCustomizedLogDataResResultLogInfoListItem
 */
@lombok.Data
public final class DescribeLiveCustomizedLogDataResResultLogInfoListItem  {

    /**
     * <p>日志文件名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogName")
    private String logName;

    /**
     * <p>日志文件大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogSize")
    private Integer logSize;

    /**
     * <p>日志文件下载链接链接。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    /**
     * <p>日志文件对应的小时区间，RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTime")
    private String dateTime;

    /**
     * <p>域名；查询拉流转推日志（Type=relay）时，该字段为空。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
