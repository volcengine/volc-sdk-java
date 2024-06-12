package com.volcengine.model.beans.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Program {
    @JSONField(name = "Id")
    Long Id;
    @JSONField(name = "ProgramName")
    String ProgramName;
    @JSONField(name = "LoopVideos")
    List<LoopVideoListResp> LoopVideos;
}
