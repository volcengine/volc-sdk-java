package com.volcengine.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @Author: chenhui
 * @Date: 2023/01/04
 * @Description:
 */
@Data
public class GetRelyConfigResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    RelyConfig result;

    @Data
    public static class RelyConfig {
        @JSONField(name = "MoUrl")
        private String moUrl;

        @JSONField(name = "ReportUrl")
        private String reportUrl;

        @JSONField(name = "SignatureUrl")
        private String signatureUrl;

        @JSONField(name = "TemplateUrl")
        private String templateUrl;

        @JSONField(name = "ClickUrl")
        private String clickUrl;
    }
}
