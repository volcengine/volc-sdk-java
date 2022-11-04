package com.volcengine.model.video_aiot.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class StartVoiceTalkResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    StartVoiceTalkRes startVoiceTalkRes;

    @Data
    public static class StartVoiceTalkRes {
        @JSONField(name = "AudioSendUrl")
        String audioSendUrl;
    }
}
