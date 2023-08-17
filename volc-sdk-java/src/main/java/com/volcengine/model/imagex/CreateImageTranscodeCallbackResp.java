package com.volcengine.model.imagex;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateImageTranscodeCallbackResp {
    @JSONField(name = "CallbackMsg")
    String callbackMsg;

    @JSONField(name = "CallbackResp")
    String callbackResp;
}
