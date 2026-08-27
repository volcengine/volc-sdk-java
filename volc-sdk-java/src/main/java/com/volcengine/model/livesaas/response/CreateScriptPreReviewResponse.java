package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateScriptPreReviewResponse {
    @JSONField(name = "ResponseMetadata")
    private ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    private CreateScriptPreReviewResult result;

    @Data
    public static class CreateScriptPreReviewResult {
        @JSONField(name = "TaskId")
        private Long taskId;
    }
}
