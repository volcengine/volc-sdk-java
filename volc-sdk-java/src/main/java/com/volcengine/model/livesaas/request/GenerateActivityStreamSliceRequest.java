package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GenerateActivityStreamSliceRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LineId")
    Long LineId;
    @JSONField(name = "IsBackup")
    Boolean IsBackup;
    @JSONField(name = "StartTime")
    Long StartTime;
    @JSONField(name = "EndTime")
    Long EndTime;
}