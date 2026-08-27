package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DownloadScriptPreReviewReportResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private DownloadScriptPreReviewReportResult result;

    @Data
    public static class DownloadScriptPreReviewReportResult {
        @JSONField(name = "DownloadURL")
        private String downloadURL;
        @JSONField(name = "ExpireTime")
        private Long expireTime;
    }
}
