package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageVolcCdnAccessLogReq {
    @JSONField(name = "ServiceId")
    private String serviceId;
    @JSONField(name = "Domain")
    private String domain;
    @JSONField(name = "Region")
    private String region;
    @JSONField(name = "StartTime")
    private Long startTime;
    @JSONField(name = "EndTime")
    private Long endTime;
    @JSONField(name = "PageNum")
    private Integer pageNum;
    @JSONField(name = "PageSize")
    private Integer pageSize;
}
