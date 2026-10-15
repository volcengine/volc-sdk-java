package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HighlightClipSourceVideo {
    @JSONField(name = "VideoDesc")
    String VideoDesc;
    @JSONField(name = "StartTime")
    Integer StartTime;
    @JSONField(name = "EndTime")
    Integer EndTime;
}
