package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.*;
import lombok.Data;

@Data
public class ListRoomsRequest {  
    @JSONField(name = "AppId")
    String appId;  
    @JSONField(name = "RoomId")
    String roomId;  
    @JSONField(name = "Reverse")
    int reverse;  
    @JSONField(name = "Offset")
    String offset;  
    @JSONField(name = "Limit")
    int limit; 
}
