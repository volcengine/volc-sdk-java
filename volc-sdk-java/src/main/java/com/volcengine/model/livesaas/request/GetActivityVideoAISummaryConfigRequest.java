package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetActivityVideoAISummaryConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "VideoRoomId")
    Long VideoRoomId;
}
