package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FollowRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "UserId")
    String userId;
    @JSONField(name = "Source")
    int source;
    @JSONField(name = "Reason")
    int reason;
    @JSONField(name = "FromGid")
    String fromGid;
}
