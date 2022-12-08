package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdatePullToPushAPIRequest {
    @JSONField(name = "LineId")
    Long LineId;
    @JSONField(name = "PullStreamUrl")
    String PullStreamUrl;
    @JSONField(name = "PullStreamStatus")
    Integer PullStreamStatus;
    @JSONField(name = "PullStreamMode")
    Integer PullStreamMode;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}