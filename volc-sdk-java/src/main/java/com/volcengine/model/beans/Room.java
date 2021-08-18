package com.volcengine.model.beans;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Room {  
    @JSONField(name = "RoomId")
    String roomId;  
    @JSONField(name = "AppId")
    String appId;  
    @JSONField(name = "UserNum")
    int userNum;  
    @JSONField(name = "StreamNum")
    int streamNum;  
    @JSONField(name = "State")
    int state;  
    @JSONField(name = "CreatedAt")
    String createdAt;  
    @JSONField(name = "UpdatedAt")
    String updatedAt; 
}
