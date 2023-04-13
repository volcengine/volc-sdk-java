package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXClientTopQualityURLReq {
    @JSONField(name = "Appid")
    private String appid;
    @JSONField(name = "OS")
    private String os;
    @JSONField(name = "QualityType")
    private String qualityType;
    @JSONField(name = "StartTime")
    private String startTime;
    @JSONField(name = "EndTime")
    private String endTime;
    @JSONField(name = "Top")
    private Integer top;
}
