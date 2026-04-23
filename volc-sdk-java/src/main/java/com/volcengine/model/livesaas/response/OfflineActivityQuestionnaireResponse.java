package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class OfflineActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    OfflineActivityQuestionnaireResponseBody result;

    @Data
    public static class OfflineActivityQuestionnaireResponseBody {
        @JSONField(name = "Status")
        Boolean Status;
    }
}