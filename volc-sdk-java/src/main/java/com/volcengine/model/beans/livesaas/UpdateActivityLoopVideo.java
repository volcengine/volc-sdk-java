package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateActivityLoopVideo {
    @JSONField(name = "Index")
    Long Index;
    @JSONField(name = "VideoName")
    String VideoName;
    @JSONField(name = "VideoVid")
    String VideoVid;
    @JSONField(name = "Offset")
    Integer Offset;
}
