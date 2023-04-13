package com.volcengine.model.imagex.data;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DescribeImageXClientTopFileSizeReq {
    @JSONField(name = "Appid")
    private String appid;
    @JSONField(name = "OS")
    private String os;
    @JSONField(name = "StartTime")
    private String startTime;
    @JSONField(name = "EndTime")
    private String endTime;
    @JSONField(name = "Top")
    private Integer top;
}
