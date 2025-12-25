package com.volcengine.model.tls.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * LogTimeConfig 定义从 ES 文档中解析日志时间的配置。
 */
@Data
@NoArgsConstructor
public class LogTimeConfig {

    @JSONField(name = "log_time_field")
    private String logTimeField;

    @JSONField(name = "log_time_format")
    private String logTimeFormat;

    @JSONField(name = "log_time_zone")
    private String logTimeZone;

    @JSONField(name = "query_end_time")
    private Integer queryEndTime;

    @JSONField(name = "query_start_time")
    private Integer queryStartTime;
}
