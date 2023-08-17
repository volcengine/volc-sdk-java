package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageTranscodeDetailsRespExecInfo {
    @JSONField(name = "EntryId")
    String entryId;

    @JSONField(name = "SubmitAt")
    String submitAt;

    @JSONField(name = "StartAt")
    String startAt;

    @JSONField(name = "EndAt")
    String endAt;

    @JSONField(name = "ExecInput")
    List<GetImageTranscodeDetailsRespExecInfoExecInput> execInput;

    @JSONField(name = "ExecOutput")
    List<GetImageTranscodeDetailsRespExecInfoExecOutput> execOutput;
}