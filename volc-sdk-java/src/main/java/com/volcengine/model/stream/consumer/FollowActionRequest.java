package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FollowActionRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "ToUserID")
    String toUserId;
    @JSONField(name = "Source")
    int source;
    @JSONField(name = "FromGID")
    String fromGid;
}
