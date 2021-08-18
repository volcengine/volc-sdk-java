package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.*;
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
    String oS;  
    @JSONField(name = "Network")
    String network; 
}
