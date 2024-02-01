package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetImageTranscodeDetailsRespExecInfoExecOutput {
    @JSONField(name = "Size")
    Integer size;

    @JSONField(name = "Format")
    String format;

    @JSONField(name = "Output")
    String output;

    @JSONField(name = "ErrCode")
    String errCode;

    @JSONField(name = "ErrMsg")
    String errMsg;
}
