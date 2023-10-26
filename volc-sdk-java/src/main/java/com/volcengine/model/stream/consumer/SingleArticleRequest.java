package com.volcengine.model.stream.consumer;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SingleArticleRequest {
    @JSONField(name = "Timestamp")
    long timestamp;
    @JSONField(name = "Partner")
    String partner;
    @JSONField(name = "GroupID")
    String groupId;
    @JSONField(name = "AccessToken")
    String accessToken;
    @JSONField(name = "CustomVideoDefinition")
    String customVideoDefinition;
    @JSONField(name = "ApiVersion")
    int apiVersion;
}
