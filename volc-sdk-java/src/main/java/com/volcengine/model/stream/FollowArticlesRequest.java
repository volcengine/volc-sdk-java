package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FollowArticlesRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Ouid")
    String ouid;
    @JSONField(name = "Count")
    int count;
    @JSONField(name = "Offset")
    int offset;
    @JSONField(name = "Source")
    String source;
    @JSONField(name = "StartCursor")
    String startCursor;
    @JSONField(name = "EndCursor")
    String endCursor;
}
