package com.volcengine.model.stream.log;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class PushLogRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "GroupId")
    String groupId;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "PushId")
    String pushId;
    @JSONField(name = "Category")
    String category;
    @JSONField(name = "EventTime")
    long eventTime;
    @JSONField(name = "EventName")
    String eventName;
    @JSONField(name = "ReqId")
    String reqId;
}
