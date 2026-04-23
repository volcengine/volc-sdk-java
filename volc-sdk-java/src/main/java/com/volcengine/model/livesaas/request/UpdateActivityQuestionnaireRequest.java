package com.volcengine.model.livesaas.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.beans.livesaas.QuestionnaireUpdateAPI;
import lombok.Data;

@Data
public class UpdateActivityQuestionnaireRequest {
    @JSONField(name = "ActivityId")
    Long ActivityId;
    @JSONField(name = "Questionnaire")
    QuestionnaireUpdateAPI Questionnaire;
}