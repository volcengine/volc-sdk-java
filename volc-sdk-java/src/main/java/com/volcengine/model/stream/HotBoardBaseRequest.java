package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotBoardBaseRequest {
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Offset")
    int offset;
    @JSONField(name = "Limit")
    int limit;
    @JSONField(name = "HotBoardGid")
    String hotBoardGid;
    @JSONField(name = "Biz")
    String biz;
}
