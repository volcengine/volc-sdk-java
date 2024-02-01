package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveLogDataResResultLogInfoListItem
 */
@lombok.Data
public final class DescribeLiveLogDataResResultLogInfoListItem  {

    /**
     * <p>域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>查询拉流转推日志（Type=relay）时，该字段为空。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>日志文件名称，日志文件命名规则如下。</p>
     *
     * <p>- 与域名相关时：加速域名_年_月_日_时间开始_时间结束_文件拆分序号。例如，`www.example.com_2023_08_11_000000_010000_0.gz`；</p>
     *
     * <p>- 与域名无关时：年_月_日_时间开始_时间结束_文件拆分序号。例如，`2023_08_11_000000_010000_0.gz`；</p>
     *
     * <p>- 如果某个小时内，当前事件产生的日志大于 150 万条，则会生成为多个日志文件，用文件名最后的序号标注日志文件顺序，例如，`2023_08_11_000000_010000_0.gz`、`2023_08_11_000000_010000_1.gz`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogName")
    private String logName;

    /**
     * <p>日志文件大小，单位为 byte。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogSize")
    private Integer logSize;

    /**
     * <p>日志文件对应的小时区间，RFC3339 格式的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DateTime")
    private String dateTime;

    /**
     * <p>日志文件下载链接。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DownloadUrl")
    private String downloadUrl;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
