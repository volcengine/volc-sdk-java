package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateAudienceGroupConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "GroupType")
    Integer GroupType;
    @JSONField(name = "GroupEnableStatus")
    Integer GroupEnableStatus;
    @JSONField(name = "ViewPageShowGroupName")
    Integer ViewPageShowGroupName;
    @JSONField(name = "CannotWatchLiveWhenNotInGroup")
    Integer CannotWatchLiveWhenNotInGroup;
}