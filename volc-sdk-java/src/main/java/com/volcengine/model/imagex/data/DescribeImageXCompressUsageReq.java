package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXCompressUsageReq {
    @JSONField(name = "ServiceIds")
    private String serviceIds;  // 传入多个用英文逗号分隔
    @JSONField(name = "StartTime")
    private String startTime;  // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String endTime;  // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "Interval")
    private String interval;    // 时间粒度，单位秒。支持300,3600,86400。不传默认查询时间段全部数据
}
