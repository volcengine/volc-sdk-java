package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class BindTrafficDrivingParamsRequest {
    @JSONField(name = "secondTemplateId")
    private String secondTemplateId;
    @JSONField(name = "subContentId")
    private String subContentId;
    @JSONField(name = "templateTrafficDriving")
    private TemplateParamWithTrafficDriving templateTrafficDriving;

    @Data
    public static class TemplateParamWithTrafficDriving {
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "paramType")
        private Integer paramType;
        @JSONField(name = "content")
        private String content;
    }
}
