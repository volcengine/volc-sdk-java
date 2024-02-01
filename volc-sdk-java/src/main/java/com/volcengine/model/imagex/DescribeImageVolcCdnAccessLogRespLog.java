package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageVolcCdnAccessLogRespLog {
    @JSONField(name = "StartTime")
    private Long startTime;
    @JSONField(name = "EndTime")
    private Long endTime;
    @JSONField(name = "LogName")
    private String logName;
    @JSONField(name = "LogPath")
    private String logPath;
    @JSONField(name = "LogSize")
    private Long logSize;
}
