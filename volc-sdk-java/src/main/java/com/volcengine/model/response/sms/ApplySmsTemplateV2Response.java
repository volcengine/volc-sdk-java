package com.volcengine.model.response.sms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ApplySmsTemplateV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    BindSignaturesResponse.ResultBean result;

    public static class ResultBean {
        @JSONField(name = "secondTemplates")
        List<SecondTemplateInfo> secondTemplates;
        @JSONField(name = "templateId")
        String templateId;
    }
}
