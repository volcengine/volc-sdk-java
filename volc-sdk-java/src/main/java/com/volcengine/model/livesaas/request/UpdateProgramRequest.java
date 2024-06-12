package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LoopVideoListReq;
import lombok.Data;

import java.util.List;

@Data
public class UpdateProgramRequest {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "LoopVideos")
    List<LoopVideoListReq> LoopVideos;
    @JSONField(name = "ProgramName")
    String ProgramName;
}
