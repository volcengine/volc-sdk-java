package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class DeleteLiveChannelConfigRequest {

    @JSONField(name = "ActivityId")
    Long ActivityId;

    @JSONField(name = "LineId")
    Long LineId;

    @JSONField(name = "LineIndex")
    Integer LineIndex;
}