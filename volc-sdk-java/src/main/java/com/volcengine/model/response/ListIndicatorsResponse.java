package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.*;
import lombok.Data;

@Data
public class ListIndicatorsResponse {  
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;  
    @JSONField(name = "Result")
    ResultBean result; 
     
    @Data
    public static class ResultBean {  
        @JSONField(name = "Indicators")
        Indicator[] indicators; 
    }  
    @Data
    public static class Indicator {  
        @JSONField(name = "Name")
        String name;  
        @JSONField(name = "Unit")
        String unit;  
        @JSONField(name = "Data")
        IndicatorData[] data; 
    }  
    @Data
    public static class IndicatorData {  
        @JSONField(name = "TimeStamp")
        String timeStamp;
        @JSONField(name = "Value")
        float value;
    } 
}
