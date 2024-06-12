package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class LoopVideoListReq {
    @JSONField(name = "Index")
    Long Index;
    @JSONField(name = "VideoVid")
    String VideoVid;
    @JSONField(name = "VideoName")
    String VideoName;
    @JSONField(name = "Offset")
    Long Offset;
}
