package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetArticlesRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "GroupIds")
    String groupIds;
    @JSONField(name = "AccessToken")
    String accessToken;
}
