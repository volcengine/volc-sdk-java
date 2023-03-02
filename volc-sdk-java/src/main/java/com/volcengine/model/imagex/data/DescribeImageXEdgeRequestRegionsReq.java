package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXEdgeRequestRegionsReq {
    @JSONField(name = "StartTime")
    private String startTime;    // YYYY-MM-DDThh:mm:ss±hh:mm
    @JSONField(name = "EndTime")
    private String endTime;      // YYYY-MM-DDThh:mm:ss±hh:mm
}
