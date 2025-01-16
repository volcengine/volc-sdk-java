package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ReplayPlayerConfig {
    @JSONField(name = "IsProgressBarEnable")
    Integer IsProgressBarEnable;
    @JSONField(name = "IsResolutionEnable")
    Integer IsResolutionEnable;
    @JSONField(name = "IsSpeedControlEnable")
    Integer IsSpeedControlEnable;
}
