package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class BindSignaturesRequest {
    @JSONField(name = "subAccounts")
    private List<String> subAccounts;

    @JSONField(name = "templateId")
    private String templateId;
    @JSONField(name = "signatures")
    private List<String> signatures;

    @JSONField(name = "templateTrafficDriving")
    private List<List<TemplateParamWithTrafficDriving>> templateTrafficDriving;

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
