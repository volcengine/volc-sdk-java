package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.*;
import lombok.Data;

@Data
public class ListRoomsResponse {  
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;  
    @JSONField(name = "Result")
    ResultBean result;  
    @JSONField(name = "Error")
    ResultError error; 
     
    @Data
    public static class ResultError {  
        @JSONField(name = "Code")
        String code;  
        @JSONField(name = "Message")
        String message; 
    }  
    @Data
    public static class ResultBean {  
        @JSONField(name = "Total")
        int total;  
        @JSONField(name = "ActiveNum")
        int activeNum;  
        @JSONField(name = "InactiveNum")
        int inactiveNum;  
        @JSONField(name = "Offset")
        int offset;  
        @JSONField(name = "Limit")
        int limit;  
        @JSONField(name = "Rooms")
        Room[] rooms; 
    } 
}
