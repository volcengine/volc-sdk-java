package com.volcengine.model.response.sms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListSecondTemplateResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSecondTemplateResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<SecondTemplate> list;
    }

    @Data
    public static class SecondTemplate {

        @JSONField(name = "templateId")
        private String templateId;

        @JSONField(name = "secondTemplateId")
        private String secondTemplateId;

        @JSONField(name = "content")
        private String content;

        @JSONField(name = "channelType")
        private String channelType;

        @JSONField(name = "signature")
        private String signature;

        @JSONField(name = "templateParams")
        private List<TemplateParamsV2> templateParams;

        @JSONField(name = "fixTrafficDriving")
        private List<TemplateParamsV2> fixTrafficDriving;

        @JSONField(name = "reviewStatus")
        private Integer reviewStatus;

        @JSONField(name = "industry")
        private String industry;

        @JSONField(name = "industryCn")
        private String industryCn;
    }

    @Data
    public static class TemplateParamsV2 {
        @JSONField(name = "name")
        private String name;

        @JSONField(name = "paramType")
        private Integer paramType;

        @JSONField(name = "location")
        private String location;

        @JSONField(name = "content")
        private String content;
    }

}
