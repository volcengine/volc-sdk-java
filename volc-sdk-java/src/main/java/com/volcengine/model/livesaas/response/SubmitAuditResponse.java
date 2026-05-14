package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class SubmitAuditResponse {

    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @JSONField(name = "Result")
    private SubmitAuditResult result;

    @Data
    public static class SubmitAuditResult {
        /**
         * 审核记录 ID
         */
        @JSONField(name = "AuditId")
        private Long auditId;
    }
}
