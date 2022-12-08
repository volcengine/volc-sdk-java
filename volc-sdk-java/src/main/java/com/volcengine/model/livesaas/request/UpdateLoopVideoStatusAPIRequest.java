package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UpdateLoopVideoStatusAPIRequest {
    @JSONField(name = "LineId")
    Long LineId;
    @JSONField(name = "IsStartLoopVideo")
    Integer IsStartLoopVideo;
    @JSONField(name = "ActivityId")
    Long ActivityId;
}