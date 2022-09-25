package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VideoOverLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "GroupId")
    String groupId;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Category")
    String category;
    @JSONField(name = "EventTime")
    String eventTime;
    @JSONField(name = "FromGid")
    String fromGid;
    @JSONField(name = "Position")
    String position;
    @JSONField(name = "Percent")
    String percent;
    @JSONField(name = "Duration")
    String duration;
    @JSONField(name = "Dt")
    String dt;
    @JSONField(name = "Os")
    String os;
    @JSONField(name = "OsVersion")
    String osVersion;
    @JSONField(name = "ClientVersion")
    String clientVersion;
    @JSONField(name = "DeviceBrand")
    String deviceBrand;
    @JSONField(name = "ReqId")
    String reqId;
}
