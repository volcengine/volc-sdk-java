package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LoopVideoListReq;
import lombok.Data;

import java.util.List;

@Data
public class UpdateLoopVideosRequest {
    @JSONField(name = "LoopNumber")
    Integer LoopNumber;
    @JSONField(name = "LoopVideos")
    List<LoopVideoListReq> LoopVideos;
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "LineId")
    Long LineId;
    @JSONField(name = "ProgramName")
    String ProgramName;
    @JSONField(name = "IsShowProgram")
    Integer IsShowProgram;
    @JSONField(name = "PlayType")
    Integer PlayType;
    @JSONField(name = "AutoStartTime")
    Long AutoStartTime;
    @JSONField(name = "AutoEndTime")
    Long AutoEndTime;
}
