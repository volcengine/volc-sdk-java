package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetFollowingListRequest {
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
    @JSONField(name = "Cursor")
    int cursor;
    @JSONField(name = "OrderField")
    String orderField;
    @JSONField(name = "OrderType")
    String orderType;
}
