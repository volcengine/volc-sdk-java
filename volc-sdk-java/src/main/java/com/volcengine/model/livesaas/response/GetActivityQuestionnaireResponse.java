package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuestionnaireInfoAPI;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetActivityQuestionnaireResponseBody result;

    @Data
    public static class GetActivityQuestionnaireResponseBody {
        @JSONField(name = "Questionnaire")
        QuestionnaireInfoAPI Questionnaire;
    }
}