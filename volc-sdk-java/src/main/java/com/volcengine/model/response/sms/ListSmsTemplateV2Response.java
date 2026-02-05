package com.volcengine.model.response.sms;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListSmsTemplateV2Response {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "list")
        List<TemplateV2> list;
        @JSONField(name = "total")
        Integer total;
    }

    @Data
    public static class TemplateV2 {
        @JSONField(name = "templateId")
        private String templateId;

        @JSONField(name = "content")
        private String content;

        @JSONField(name = "channelType")
        private String channelType;

        @JSONField(name = "signatures")
        private List<String> signatures;

        @JSONField(name = "name")
        private String name;

        @JSONField(name = "templateParams")
        private List<TemplateParamsV2> templateParams;

        @JSONField(name = "fixTrafficDriving")
        private List<TemplateParamsV2> fixTrafficDriving;

        @JSONField(name = "createdAt")
        private Long createdAt;

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
