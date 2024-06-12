package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.LoopVideoListResp;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;
@Data
public class ListLoopVideosResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListLoopVideosResponseBody result;

    @Data
    public static class ListLoopVideosResponseBody {
        @JSONField(name = "ActivityId")
        Long ActivityId;
        @JSONField(name = "LineId")
        Long LineId;
        @JSONField(name = "LoopVideoStatus")
        Integer LoopVideoStatus;
        @JSONField(name = "LoopNumber")
        Integer LoopNumber;
        @JSONField(name = "LoopVideos")
        List<LoopVideoListResp> LoopVideos;
        @JSONField(name = "IsShowProgram")
        Integer IsShowProgram;
        @JSONField(name = "ProgramName")
        String ProgramName;
        @JSONField(name = "PlayType")
        Integer PlayType;
        @JSONField(name = "AutoStartTime")
        Long AutoStartTime;
        @JSONField(name = "AutoEndTime")
        Long AutoEndTime;
    }
}