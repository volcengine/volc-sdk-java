package com.volcengine.model.livesaas.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuestionnaireInfoAPI;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;
import java.util.List;

@Data
public class ListActivityQuestionnaireResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListActivityQuestionnaireResponseBody result;

    @Data
    public static class ListActivityQuestionnaireResponseBody {
        @JSONField(name = "Questionnaires")
        List<QuestionnaireInfoAPI> Questionnaires;
        @JSONField(name = "Total")
        Long Total;
    }
}