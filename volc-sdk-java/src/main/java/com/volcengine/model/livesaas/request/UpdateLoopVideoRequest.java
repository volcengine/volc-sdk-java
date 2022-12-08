package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LoopVideoList;
import lombok.Data;

import java.util.List;

@Data
public class UpdateLoopVideoRequest {
    @JSONField(name = "LoopNumber")
    Integer LoopNumber;
    @JSONField(name = "LoopVideo")
    List<LoopVideoList> LoopVideo;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LineId")
    Long LineId;
}