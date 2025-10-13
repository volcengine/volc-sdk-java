package com.volcengine.model.response.sms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class BindSignaturesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "secondTemplates")
        List<SecondTemplateInfo> secondTemplates;
        @JSONField(name = "templateId")
        String templateId;
    }
}

@Data
class SecondTemplateInfo {
    @JSONField(name = "secondTemplateId")
    String secondTemplateId;
    @JSONField(name = "channelType")
    String channelType;
    @JSONField(name = "signature")
    String signature;
    @JSONField(name = "content")
    String content;
    @JSONField(name = "industry")
    String industry;
    @JSONField(name = "industryCn")
    String industryCn;
}
