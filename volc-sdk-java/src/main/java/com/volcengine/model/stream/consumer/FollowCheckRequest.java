package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FollowCheckRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "ToUserID")
    String toUserId;
}
