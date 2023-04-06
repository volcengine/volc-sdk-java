package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetRecordListRequest {
    @JSONField(name = "DeviceID")
    private String deviceNSID;
    @JSONField(name = "ChannelID")
    private String channelID;
    @JSONField(name = "StartTime")
    private int startTime;
    @JSONField(name = "EndTime")
    private int endTime;
    @JSONField(name = "RecordType")
    private String recordType;//all/alarm/time/manual
    @JSONField(name = "TimeoutInSec")
    private int timeoutSec;
    @JSONField(name = "Order")
    private boolean order;
}
