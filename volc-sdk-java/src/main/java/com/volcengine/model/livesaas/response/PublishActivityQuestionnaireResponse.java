package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class PublishActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    PublishActivityQuestionnaireResponseBody result;

    @Data
    public static class PublishActivityQuestionnaireResponseBody {
        @JSONField(name = "QuestionnairePublishId")
        Long QuestionnairePublishId;
        @JSONField(name = "Status")
        Boolean Status;
    }
}