package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MultiArticlesRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "GroupIDs")
    List<String> groupIds;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "CustomVideoDefinition")
    String customVideoDefinition;
    @JSONField(name = "ApiVersion")
    int apiVersion;
}
