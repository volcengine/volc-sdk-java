package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LiveInspectConfig;
import lombok.Data;

@Data
public class UpdateActivityLiveInspectConfigRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LiveInspectConfig")
    LiveInspectConfig LiveInspectConfig;
}
