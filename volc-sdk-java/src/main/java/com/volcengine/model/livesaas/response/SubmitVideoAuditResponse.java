package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SubmitVideoAuditResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    SubmitVideoAuditResult result;

    @Data
    public static class SubmitVideoAuditResult {
        @JSONField(name = "AuditId")
        String AuditId;
    }
}
