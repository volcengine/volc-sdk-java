package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class GetImageTranscodeDetailsResp {
    @JSONField(name = "ExecInfo")
    List<GetImageTranscodeDetailsRespExecInfo> execInfo;

    @JSONField(name = "Total")
    Integer total;
}