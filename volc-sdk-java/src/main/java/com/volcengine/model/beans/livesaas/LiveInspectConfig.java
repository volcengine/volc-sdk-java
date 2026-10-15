package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LiveInspectConfig {
    @JSONField(name = "AutoInspectionEnabled")
    Boolean AutoInspectionEnabled;
    @JSONField(name = "TaskConfig")
    LiveInspectTaskConfig TaskConfig;
}
