package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListAlarmNotifyResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListAlarmNotifyResult listAlarmNotifyResult;

    @Data
    public static class ListAlarmNotifyResult {
        @JSONField(name = "PageNumber")
        int pageNumber;
        @JSONField(name = "PageSize")
        int pageSize;
        @JSONField(name = "TotalCount")
        int totalCount;

        @JSONField(name = "AlarmNotifies")
        List<AlarmNotify> alarmNotifies;
    }

    @Data
    public static class AlarmNotify {
        @JSONField(name = "AccountID")
        String accountID;
        @JSONField(name = "SpaceID")
        String spaceID;
        @JSONField(name = "DeviceNSID")
        String deviceNSID;
        @JSONField(name = "CmdType")
        String cmdType;
        @JSONField(name = "SN")
        int sn;
        @JSONField(name = "ChannelID")
        String channelID;
        @JSONField(name = "AlarmPriority")
        int alarmPriority;
        @JSONField(name = "AlarmMethod")
        int alarmMethod;
        @JSONField(name = "AlarmTime")
        int alarmTime;
        @JSONField(name = "AlarmDescription")
        String alarmDescription;
        @JSONField(name = "Longitude")
        String longitude;
        @JSONField(name = "Latitude")
        String latitude;
        @JSONField(name = "AlarmInfo")
        String alarmInfo;
        @JSONField(name = "AlarmNotifyID")
        String alarmNotifyID;


        @JSONField(name = "Info")
        Info info;
    }

    @Data
    public static class Info {
        @JSONField(name = "AlarmType")
        int alarmType;
        @JSONField(name = "AlarmTypeParam")
        AlarmTypeParam alarmTypeParam;
    }
    @Data
    public static class AlarmTypeParam {
        @JSONField(name = "EventType")
        int eventType;
    }
}
