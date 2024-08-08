package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetLoginLivesaasStsRequest {
    @JSONField(name = "FollowerUserName")
    String FollowerUserName;
    @JSONField(name = "DurationSeconds")
    Integer DurationSeconds;
}