package com.volcengine.model.video_aiot.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.video_aiot.common;
import lombok.Data;

@Data
public class UpdateTemplateRequest {
    @JSONField(name = "TemplateName")
    String templateName;
    @JSONField(name = "Record")
    Record record;

    @Data
    public static class Record {
        @JSONField(name = "RecordDuration")
        int recordDuration;
        @JSONField(name = "Format")
        String format;  //mp4/hls
        @JSONField(name = "TemplateTTLConfig")
        common.TemplateTTLConfig templateTTLConfig;
    }


}
