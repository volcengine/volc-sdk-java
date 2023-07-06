package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetRecordListV2Request {
    @JSONField(name = "DeviceNSID")
    String deviceNSID;
    @JSONField(name = "ChannelID")
    String channelID;
    @JSONField(name = "StartTime")
    int startTime;
    @JSONField(name = "EndTime")
    int endTime;
    @JSONField(name = "RecordType")
    String recordType;
    @JSONField(name = "TimeoutInSec")
    int timeoutInSec;
    @JSONField(name = "Order")
    boolean order;
}
