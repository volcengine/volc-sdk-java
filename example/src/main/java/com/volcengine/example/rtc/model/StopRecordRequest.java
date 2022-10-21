package com.volcengine.example.rtc.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StopRecordRequest {
    @JSONField(name = "AppId")
    String appId;
    @JSONField(name = "BusinessId")
    String businessId;
    @JSONField(name = "RoomId")
    String RoomId;
    @JSONField(name = "TaskId")
    String TaskId;
}

