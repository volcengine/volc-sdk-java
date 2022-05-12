package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HotBoardArticleRequest {
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
}
