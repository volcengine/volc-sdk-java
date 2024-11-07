package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import com.volcengine.model.response.ResponseMetadata;

import java.util.List;

@Data
public class GetAccountTemplateAPIResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetAccountTemplateAPIResponseBody result;

    @Data
    public static class GetAccountTemplateAPIResponseBody {
        @JSONField(name = "TotalItemCount")
        Integer TotalItemCount;
        @JSONField(name = "TemplateList")
        List<LiveTemplateAPI> TemplateList;
        @JSONField(name = "PageNo")
        Integer PageNo;
        @JSONField(name = "PageItemCount")
        Integer PageItemCount;
    }

    @Data
    public static class LiveTemplateAPI {
        @JSONField(name = "IsDefaultTemplate")
        Integer IsDefaultTemplate;
        @JSONField(name = "Status")
        Integer Status;
        @JSONField(name = "CoverImage")
        String CoverImage;
        @JSONField(name = "Describe")
        String Describe;
        @JSONField(name = "ModifyTime")
        Long ModifyTime;
        @JSONField(name = "IsSystemTemplate")
        Integer IsSystemTemplate;
        @JSONField(name = "TemplateId")
        Long TemplateId;
        @JSONField(name = "TemplateName")
        String TemplateName;
        @JSONField(name = "LiveLayout")
        Integer LiveLayout;
    }
}