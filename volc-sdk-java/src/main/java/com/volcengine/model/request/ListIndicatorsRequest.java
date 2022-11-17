package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListIndicatorsRequest {  
    @JSONField(name = "AppId")
    String appId;
    @JSONField(name = "StartTime")
    String startTime;  
    @JSONField(name = "EndTime")
    String endTime;  
    @JSONField(name = "Indicator")
    String indicator;  
    @JSONField(name = "OS")
    String OS;
    @JSONField(name = "Network")
    String network; 
}
