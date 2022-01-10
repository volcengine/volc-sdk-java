package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetUnionProductRequest {
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "GroupId")
    String groupId;
}
