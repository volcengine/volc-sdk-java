package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class DeleteActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    DeleteActivityQuestionnaireResponseBody result;

    @Data
    public static class DeleteActivityQuestionnaireResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}