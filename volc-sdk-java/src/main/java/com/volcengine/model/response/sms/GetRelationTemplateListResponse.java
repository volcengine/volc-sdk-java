package com.volcengine.model.response.sms;


import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetRelationTemplateListResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetRelationTemplateListResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "total")
        private Integer total;

        @JSONField(name = "list")
        private List<TemplateV2> list;
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
        private List<String> signatures; // 对应 Go 的 []string

        @JSONField(name = "subAccounts")
        private List<String> subAccounts;

        @JSONField(name = "subAccountNames")
        private List<String> subAccountNames;

        @JSONField(name = "name")
        private String name;

        @JSONField(name = "templateParams")
        private List<TemplateParamsV2> templateParams;

        @JSONField(name = "createdAt")
        private Long createdAt;

        @JSONField(name = "status")
        private Integer status;

        @JSONField(name = "canDelete")
        private Boolean canDelete;

        @JSONField(name = "account")
        private String account;
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
