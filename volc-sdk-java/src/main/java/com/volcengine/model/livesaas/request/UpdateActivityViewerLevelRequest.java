package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateActivityViewerLevelRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LevelId")
    Long LevelId;
    @JSONField(name = "UserId")
    Long UserId;
    @JSONField(name = "ExternalUserId")
    String ExternalUserId;
}
