package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateMediaOnlineStatusAPIRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "MediaId")
    Long MediaId;
    @JSONField(name = "OnlineStatus")
    Integer OnlineStatus;
    @JSONField(name = "ForceReplayStatus")
    Boolean ForceReplayStatus;
}