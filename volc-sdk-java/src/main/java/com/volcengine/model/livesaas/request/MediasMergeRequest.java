package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MediasMergeRequest {
    @JSONField(name = "MediaName")
    String MediaName;
    @JSONField(name = "ForceReplayStatus")
    Boolean ForceReplayStatus;
    @JSONField(name = "Vids")
    List<String> Vids;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "OnlineStatus")
    Integer OnlineStatus;
}