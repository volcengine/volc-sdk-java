package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateLoopVideoStatusRequest {
    @JSONField(name = "LineId")
    Long LineId;
    @JSONField(name = "IsStartLoopVideo")
    Integer IsStartLoopVideo;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "IsStartAllLine")
    Boolean IsStartAllLine;
}
