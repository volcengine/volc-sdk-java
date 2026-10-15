package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HighlightClipConfig {
    @JSONField(name = "DurationMin")
    Long DurationMin;
    @JSONField(name = "DurationMax")
    Long DurationMax;
    @JSONField(name = "Definition")
    String Definition;
    @JSONField(name = "SourceStartTime")
    Long SourceStartTime;
    @JSONField(name = "SourceEndTime")
    Long SourceEndTime;
    @JSONField(name = "AspectRatio")
    String AspectRatio;
}
