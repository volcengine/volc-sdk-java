package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class SecuritySourceResponse {

    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SecuritySourceResult result;

    @Data
    public static class SecuritySourceResult {

        @JSONField(name = "RequestId")
        private String requestId;

        @JSONField(name = "Code")
        private Integer code;

        @JSONField(name = "Message")
        private String message;

        @JSONField(name = "Data")
        private SecuritySourceData data;

    }

    @Data
    public static class SecuritySourceData {

        @JSONField(name = "Content")
        private String content;

        @JSONField(name = "References")
        private List<SecuritySourceReference> references;

        @JSONField(name = "FinishReason")
        private String finishReason;

    }

    @Data
    public static class SecuritySourceReference {

        @JSONField(name = "Url")
        private String url;

        @JSONField(name = "Idx")
        private Integer idx;

        @JSONField(name = "LogoUrl")
        private String logoUrl;

        @JSONField(name = "SiteName")
        private String siteName;

    }

}
