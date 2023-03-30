package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXClientTopDemotionURLReq {
    @JSONField(name = "Appid")
    private String appid;
    @JSONField(name = "OS")
    private String oS;
    @JSONField(name = "DemotionType")
    private String demotionType;
    @JSONField(name = "StartTime")
    private String startTime;
    @JSONField(name = "EndTime")
    private String endTime;
    @JSONField(name = "Top")
    private Integer top;
}
