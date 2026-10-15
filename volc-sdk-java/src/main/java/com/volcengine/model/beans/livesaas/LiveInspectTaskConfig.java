package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LiveInspectTaskConfig {
    @JSONField(name = "ProjectName")
    String ProjectName;
    @JSONField(name = "ScenarioId")
    Long ScenarioId;
    @JSONField(name = "MuteEnabled")
    Boolean MuteEnabled;
}
