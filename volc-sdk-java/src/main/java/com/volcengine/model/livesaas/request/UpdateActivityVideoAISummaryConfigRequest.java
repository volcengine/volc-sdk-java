package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateActivityVideoAISummaryConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    
    @JSONField(name = "PublishMode")
    Integer PublishMode;

    @JSONField(name = "IsBilingualEnabled")
    Boolean IsBilingualEnabled;

    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
}
