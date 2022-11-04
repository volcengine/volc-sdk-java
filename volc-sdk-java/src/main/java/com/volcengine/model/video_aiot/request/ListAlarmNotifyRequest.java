package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListAlarmNotifyRequest {
    @JSONField(name = "PageNumber")
    int pageNumber;
    @JSONField(name = "PageSize")
    int pageSize;

    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "ChannelID")
    String channelID;
    @JSONField(name = "StartTime")
    int startTime;
    @JSONField(name = "EndTime")
    int endTime;
    @JSONField(name = "Order")
    int order;
    @JSONField(name = "AlarmMethod")
    int[] alarmMethod;
    @JSONField(name = "AlarmPriority")
    int[] alarmPriority;
    @JSONField(name = "AlarmType2")
    int[] alarmType2;
    @JSONField(name = "AlarmType5")
    int[] alarmType5;
    @JSONField(name = "AlarmType6")
    int[] alarmType6;
}
