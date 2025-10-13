package com.volcengine.model.response.sms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListSubContentResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListSubContentResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<SubContent> list;
        @JSONField(name = "total")
        Integer total;
    }

    @Data
    public static class SubContent {
        @JSONField(name = "content")
        private String content;

        @JSONField(name = "createdAt")
        private Long createdAt;

        @JSONField(name = "fixTrafficDriving")
        private List<TemplateParamsV2> fixTrafficDriving;

        @JSONField(name = "templateParams")
        private List<TemplateParamsV2> templateParams;

        @JSONField(name = "subContentId")
        private String subContentId;

        @JSONField(name = "signatures")
        private String signature;

        @JSONField(name = "templateId")
        private String templateId;

        @JSONField(name = "secondTemplateId")
        private String secondTemplateId;
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
