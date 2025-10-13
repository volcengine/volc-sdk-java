package com.volcengine.model.request.sms;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ApplySmsTemplateV2Request {
    @JSONField(name = "subAccounts")
    private List<String> subAccounts;

    @JSONField(name = "templateId")
    private String templateId;

    @JSONField(name = "secondTemplateId")
    private String secondTemplateId;

    @JSONField(name = "content")
    private String content;

    @JSONField(name = "channelType")
    private String channelType;

    @JSONField(name = "area")
    private String area;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "openId")
    private String openId;

    @JSONField(name = "shortUrlConfig")
    private ShortUrlConfigReq shortUrlConfig;

    @JSONField(name = "caller")
    private String caller;

    @JSONField(name = "desc")
    private String desc;

    @JSONField(name = "signatures")
    private List<String> signatures;

    @JSONField(name = "templateParams")
    private List<TemplateParamsV2> templateParams;

    @JSONField(name = "templateTrafficDriving")
    private List<List<TemplateParamWithTrafficDriving>> templateTrafficDriving;

    @Data
    public static class ShortUrlConfigReq {
        @JSONField(name = "isEnabled")
        private String isEnabled;
        @JSONField(name = "isNeedClickDetails")
        private String isNeedClickDetails;
        @JSONField(name = "uaCheckStrategy")
        private Integer uaCheckStrategy;
    }

    @Data
    public static class TemplateParamWithTrafficDriving {
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "paramType")
        private Integer paramType;
        @JSONField(name = "content")
        private String content;
    }

    @Data
    public static class TemplateParamsV2 {
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "paramType")
        private Integer paramType;
        @JSONField(name = "location")
        private String location;
        @JSONField(name = "id")
        private Long id;
        @JSONField(name = "content")
        private String content;
    }
}
